package Pizza.Website.Backend.springBackend.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="pizza")
@Entity
@Getter @Setter @NoArgsConstructor
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PizzaID")
    private Long PizzaId;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private String price;
    @Column(name="description")
    private String description;

    @ManyToOne( fetch = FetchType.LAZY)
    private OrderedFood orderedFood;

}
