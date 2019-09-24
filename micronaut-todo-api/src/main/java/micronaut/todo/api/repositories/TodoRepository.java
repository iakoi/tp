package micronaut.todo.api.repositories;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import micronaut.todo.api.domain.TodoEntity;

@Repository
public interface TodoRepository extends CrudRepository<TodoEntity, Long> {
}
