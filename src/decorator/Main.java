package decorator;

import java.util.Optional;

import decorator.entity.Usuario;
import decorator.repository.UsuarioRepository;
import decorator.repository.UsuarioRepositoryCacheDecorator;
import decorator.repository.UsuarioRepositoryDB;

public class Main {
    public static void main(String[] args) {

        UsuarioRepository repositorioPrincipal = new UsuarioRepositoryDB();

        UsuarioRepository repositorioComCache = new UsuarioRepositoryCacheDecorator(repositorioPrincipal);

        System.out.println("--- PRIMEIRA BUSCA (ESPERADO: ACESSO AO BANCO) ---");
        Optional<Usuario> user1 = repositorioComCache.buscarPorId(1L);

        System.out.println(user1.isPresent() ? "Usuário encontrado: " + user1.get().getNome() : "Usuário não encontrado.");

        System.out.println("\n--- SEGUNDA BUSCA (ESPERADO: ACESSO SOMENTE AO CACHE) ---");
        Optional<Usuario> user2 = repositorioComCache.buscarPorId(1L);

        System.out.println(user2.isPresent() ? "Usuário encontrado: " + user2.get().getNome() : "Usuário não encontrado.");

        System.out.println("\n--- SALVANDO UM NOVO USUÁRIO ---");
        Usuario novoUsuario = new Usuario(2L, "Ana");
        repositorioComCache.salvar(novoUsuario);

        System.out.println("\n--- BUSCANDO O USUÁRIO RECÉM-SALVO (JÁ ESTARÁ NO CACHE) ---");
        Optional<Usuario> user3 = repositorioComCache.buscarPorId(2L);    

        System.out.println(user3.isPresent() ? "Usuário encontrado: " + user3.get().getNome() : "Usuário não encontrado.");
    }
}
