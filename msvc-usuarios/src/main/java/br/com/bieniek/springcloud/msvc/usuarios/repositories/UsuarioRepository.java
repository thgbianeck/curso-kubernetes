package br.com.bieniek.springcloud.msvc.usuarios.repositories;

import br.com.bieniek.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
