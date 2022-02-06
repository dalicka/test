
import javax.persistence.*;


@Entity
@Table(name= "Katastrofe")
public class Katastrofe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String tipi;


}

