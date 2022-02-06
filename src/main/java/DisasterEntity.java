import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "disaster")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DisasterEntity {

    @Id
    @Column(name = "id ", nullable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private String type;
    @OneToOne(mappedBy = "disasterEntity")
    private OccurrenceEntity occurrenceEntity;
}


