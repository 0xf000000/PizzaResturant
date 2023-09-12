package Pizza.Website.Backend.springBackend.Controller.api;


import Pizza.Website.Backend.springBackend.domain.Order;
import Pizza.Website.Backend.springBackend.domain.Pizza;
import Pizza.Website.Backend.springBackend.service.OrderService;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping(value = "/Orders",produces = "application/json;charset=UTF-8")
    public @ResponseBody List<Order> findAll(){

        return orderService.findall();
    }

    @GetMapping("/Orders/{id}")
    public @ResponseBody Optional<Order> findById(@PathVariable  Long id ){

        return orderService.findById(id);
    }

    @GetMapping("/Orders/{id}/OrderedFood")
    public List<Pizza> findOrderedFoodByOrder(Long id){
        return orderService.getOrderedFoodOrder(id);


    }

@CrossOrigin("http://localhost:8081")
    @PostMapping(path = "/add", consumes = "application/json;charset=UTF-8")
    public @ResponseBody String postOrder(@RequestBody Order order){
        String orderID = orderService.getByPersonID(order);
        if( orderID == null) orderService.add(order);
        return "SUCCESS";
    }

    @CrossOrigin("http://localhost:8081")
    @PutMapping(path = "/put", consumes ="application/json;charset=UTF-8")
    public @ResponseBody String putIntoOrder( @RequestBody Pizza pizza){




        return "";
    }


}
