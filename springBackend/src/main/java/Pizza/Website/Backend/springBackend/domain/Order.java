package Pizza.Website.Backend.springBackend.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name ="pizzaorder")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="street")
    private String street;

    @Column(name = "userId")
    private String userID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="orderedFoodId", referencedColumnName = "orderedFoodId")
    private OrderedFood orderedFood;

}
