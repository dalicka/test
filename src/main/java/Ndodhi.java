import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Ndodhi")
@Getter
@Setter
public class Ndodhi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private Integer viti;
    @Column
    private String vendi;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "katastrofe_id")
    private Katastrofe katastrofeEntity;


    }


