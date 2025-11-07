package decorator.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import decorator.entity.Usuario;

// Decorator que adiciona a funcionalidade de cache
public class UsuarioRepositoryCacheDecorator implements UsuarioRepository {
    private final UsuarioRepository repositoryDB;
    private final Map<Long, Usuario> cache = new HashMap<>();

    public UsuarioRepositoryCacheDecorator(UsuarioRepository repository) {
        this.repositoryDB = repository;
    }

    @Override
    public void salvar(Usuario usuario) {
        repositoryDB.salvar(usuario);
        
        System.out.println("[CACHE] Adicionando/Atualizando usuário no cache: " + usuario.getNome());
        cache.put(usuario.getId(), usuario);
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {

        if (cache.containsKey(id)) {
            System.out.println("[CACHE] Retornando usuário do cache para o ID: " + id);
            return Optional.of(cache.get(id));
        }

        System.out.println("[CACHE] Registro não encontrado na Cache! Buscando no repositório principal para o ID: " + id);
        Optional<Usuario> usuarioDoBanco = repositoryDB.buscarPorId(id);

        usuarioDoBanco.ifPresent(usuario -> {
            System.out.println("[CACHE] Usuário encontrado no repositório principal. Adicionando ao cache.");
            cache.put(id, usuario);
        });

        return usuarioDoBanco;
    }
}