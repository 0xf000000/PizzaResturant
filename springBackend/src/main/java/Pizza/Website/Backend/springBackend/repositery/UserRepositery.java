package Pizza.Website.Backend.springBackend.repositery;

import Pizza.Website.Backend.springBackend.domain.Order;
import Pizza.Website.Backend.springBackend.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepositery extends CrudRepository<User, Long> {



}
