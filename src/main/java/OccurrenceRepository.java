import javax.persistence.EntityManager;
import java.util.List;

public class OccurrenceRepository {
    private final EntityManager entityManager;


    public OccurrenceRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Ndodhi findById(Integer id) {
        return entityManager.find(Ndodhi.class, id);

    }

    public Ndodhi findByName(String placeName) {
        return entityManager.createQuery("Select o from Ndodhi o where  vendi = : name ", Ndodhi.class)
                .setParameter("name", placeName)
                .getSingleResult();

    }

    private void serParameter(String name, String placeName) {

    }

    public Ndodhi findByViti(Integer placeName) {
        return entityManager.createQuery("Select o from Ndodhi o where  viti = : name ", Ndodhi.class)
                .setParameter("name", placeName)
                .getSingleResult();

    }

   public List<String> findByAffectedArea(Integer casualties){

    return entityManager.createQuery("select distinc(a.occurrenceEntity.vendi)"+"from AffectedAreasEntity a" +
            "where caualties >:casual" , String.class)
            .setParameter("casual", casualties)
                .getResultList();


    }
    

    }

