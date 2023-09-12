package Pizza.Website.Backend.springBackend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name ="User")
@Getter @Setter @NoArgsConstructor
public class User {

    public User(String cookieID){
        setCookieID(cookieID);
    }

    @Column(name="id", nullable = false, updatable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "cookieID")
    private String cookieID;

}
