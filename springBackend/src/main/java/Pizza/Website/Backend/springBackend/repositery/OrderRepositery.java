package Pizza.Website.Backend.springBackend.repositery;

import Pizza.Website.Backend.springBackend.domain.Order;
import Pizza.Website.Backend.springBackend.domain.Pizza;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepositery extends CrudRepository<Order, Long> {

    @Query("SELECT orderedFood FROM Order o WHERE o.id = ?1")
    List<Pizza> getOrderedFoodByOrder(Long id);


    @Query("SELECT userID FROM Order o WHERE o.userID = ?1 ")
   String getOrderByPersonID(String personID);

    @Query("SELECT * FROM Order o WHERE o.userID = ?1")
    String get

}
