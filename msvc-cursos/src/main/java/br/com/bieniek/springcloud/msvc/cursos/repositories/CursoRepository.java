package br.com.bieniek.springcloud.msvc.cursos.repositories;

import br.com.bieniek.springcloud.msvc.cursos.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
