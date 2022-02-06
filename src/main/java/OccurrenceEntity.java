import javax.persistence.*;

public class OccurrenceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "viti")
    private Integer viti;
    @Column(name = "vendi")
    private String vendi;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "katastrof_id")
    private DisasterEntity disasterEntity;



}
