import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name= "AffenctedAreaEntity")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AffectedAreaEntity {
    @Id
    @Column(name = "Id" , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int Id ;
    @Column
    private String name ;
    @Column
    private int viktimat ;
    @Column
    private String fatalities;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "occurrence_id")
    private OccurrenceEntity occurrenceEntity;

}
