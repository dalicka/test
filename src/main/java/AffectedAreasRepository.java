import javax.persistence.EntityManager;
import java.util.List;

public class AffectedAreasRepository {
    private  final EntityManager entityManager ;

    public AffectedAreasRepository (EntityManager entityManager ){
        this.entityManager=entityManager;

        }
        private List<String> findDisasterPlace(Integer viktima){
        return entityManager.createQuery("SELECT o.vendi FROM OccurrenceEntity o INNER JOIN AffectedAreasEntity a ON " +
                "o.id = a.id WHERE a.viktima > :viktima ", String.class)
                .setParameter("viktima" , viktima)
                .getResultList();
    }

}
