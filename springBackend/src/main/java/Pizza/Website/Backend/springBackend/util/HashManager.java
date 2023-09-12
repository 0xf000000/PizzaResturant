package Pizza.Website.Backend.springBackend.util;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class HashManager {


    public String HashTime (String timeInMiliSeconds){
        Integer hashedValue = timeInMiliSeconds.hashCode();

        return hashedValue.toString();

    }
}
