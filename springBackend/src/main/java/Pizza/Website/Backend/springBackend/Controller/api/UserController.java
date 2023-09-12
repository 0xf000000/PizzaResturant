package Pizza.Website.Backend.springBackend.Controller.api;

import Pizza.Website.Backend.springBackend.domain.User;
import Pizza.Website.Backend.springBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/v3/user")
public class UserController {

    @Autowired
    private UserService userService;


    @CrossOrigin("http://localhost:8081")
    @PostMapping(value = "/add/{cookieID}")
    public @ResponseBody String add(@PathVariable String cookieID){
       User user = new User(cookieID);
       userService.add(user);

        return "SUCCESS";

    }

    @GetMapping("/all")
    public @ResponseBody List<User> findAll(){

        return userService.findAll();
    }
}
