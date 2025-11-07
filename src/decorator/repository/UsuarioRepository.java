package decorator.repository;

import java.util.Optional;

import decorator.entity.Usuario;

public interface UsuarioRepository {
    void salvar(Usuario usuario);
    Optional<Usuario> buscarPorId(Long id);
}
