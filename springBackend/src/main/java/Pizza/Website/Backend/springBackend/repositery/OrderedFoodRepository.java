package Pizza.Website.Backend.springBackend.repositery;

import Pizza.Website.Backend.springBackend.domain.OrderedFood;
import org.springframework.data.repository.CrudRepository;

public interface OrderedFoodRepository extends CrudRepository<OrderedFood,Long> {



}
