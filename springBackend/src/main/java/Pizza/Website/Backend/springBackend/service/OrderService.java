package Pizza.Website.Backend.springBackend.service;

import Pizza.Website.Backend.springBackend.domain.Order;
import Pizza.Website.Backend.springBackend.domain.Pizza;
import Pizza.Website.Backend.springBackend.repositery.OrderRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderService {

    @Autowired
    private OrderRepositery orderRepositery;

    public void add(Order order){
        orderRepositery.save(order);

    }

    public String getByPersonID(Order order){


        return  orderRepositery.getOrderByPersonID(order.getUserID());
    }

    public List<Order> findall(){

      return  (List<Order>) orderRepositery.findAll();
    }

    public Optional<Order> findById(Long id){

        return orderRepositery.findById(id);
    }

    public List<Pizza> getOrderedFoodOrder(Long id){
        return orderRepositery.getOrderedFoodByOrder(id);
    }


}
