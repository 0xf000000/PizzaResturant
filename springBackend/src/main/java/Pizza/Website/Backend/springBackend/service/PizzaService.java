package Pizza.Website.Backend.springBackend.service;

import Pizza.Website.Backend.springBackend.domain.Order;
import Pizza.Website.Backend.springBackend.domain.Pizza;
import Pizza.Website.Backend.springBackend.repositery.OrderRepositery;
import Pizza.Website.Backend.springBackend.repositery.PizzaRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class PizzaService {

    @Autowired
    private PizzaRepositery pizzaRepositery;

    public List<Pizza> findall(){

        return  (List<Pizza>) pizzaRepositery.findAll();
    }

    public Optional<Pizza> findById(Long id){

        return pizzaRepositery.findById(id);
    }

}
