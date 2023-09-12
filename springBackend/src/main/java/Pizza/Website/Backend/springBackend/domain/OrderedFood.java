package Pizza.Website.Backend.springBackend.domain;
import jakarta.persistence.*;
import java.util.List;

/**
 * this table might seem useless but i intend of using the pizza table as data storage for the pizze at the Frontend.
 */
@Entity
@Table(name="OrderedFood")
public class OrderedFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderedFoodId")
    private Long orderedFoodId;


    @OneToOne(mappedBy = "orderedFood")
    private Order order;


    @OneToMany(mappedBy = "orderedFood")
    List<Pizza> pizzas;



}
