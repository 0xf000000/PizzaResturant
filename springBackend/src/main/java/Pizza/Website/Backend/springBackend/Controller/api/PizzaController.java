package Pizza.Website.Backend.springBackend.Controller.api;


import Pizza.Website.Backend.springBackend.domain.Pizza;
import Pizza.Website.Backend.springBackend.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/v2")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/pizzas")
    public @ResponseBody List<Pizza> findAll(){

        return pizzaService.findall();
    }








}
