package blog.com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * User repository for CRUD operations.
 */
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
