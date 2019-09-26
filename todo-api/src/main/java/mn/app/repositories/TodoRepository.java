package mn.app.repositories;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import mn.app.domains.TodoEntity;

@Repository
public interface TodoRepository extends CrudRepository<TodoEntity, Long> {
}
