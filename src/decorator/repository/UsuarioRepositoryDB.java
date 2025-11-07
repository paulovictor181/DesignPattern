package decorator.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import decorator.entity.Usuario;

public class UsuarioRepositoryDB implements UsuarioRepository {
    List<Usuario> bancoDeDadosSimulado = new ArrayList<>();

    @Override
    public void salvar(Usuario usuario) {
        System.out.println("[BANCO DE DADOS] Salvando usuário: " + usuario.getNome());
        bancoDeDadosSimulado.add(usuario);
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        System.out.println("[BANCO DE DADOS] Buscando usuário com ID: " + id);
        try {
            Optional<Usuario> user = Optional.of(bancoDeDadosSimulado.get(id.intValue()));
            return user;

        } catch (Exception e) {
            System.out.println("[BANCO DE DADOS] Usuário não encontrado com ID: " + id);
            return Optional.empty();
        }

    }
}