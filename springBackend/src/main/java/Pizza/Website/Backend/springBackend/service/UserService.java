package Pizza.Website.Backend.springBackend.service;


import Pizza.Website.Backend.springBackend.domain.User;
import Pizza.Website.Backend.springBackend.repositery.UserRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserRepositery userRepositery;

    public void add(User user){
        userRepositery.save(user);
    }

    public List<User> findAll(){

       return (List<User>) userRepositery.findAll();
    }




}
