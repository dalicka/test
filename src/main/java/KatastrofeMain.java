import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;

public class KatastrofeMain {

    private static final String DATABASE = "hibernet3.xml";

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure(DATABASE)
                .buildSessionFactory();
        EntityManager entityManager = sessionFactory.createEntityManager();

        OccurrenceRepository occurrenceRepository = new OccurrenceRepository(entityManager);
        System.out.println(occurrenceRepository.findById(1));

      //  Ndodhi nameEntity=  occurrenceRepository.findByName("Texas");

       // System.out.println(" a kam te dhena me emrin Texas? - " + nameEntity.getClass());

      //  Ndodhi vitiEntity = occurrenceRepository.findByViti(2022);

    //    System.out.println("kerko me  viti: " + vitiEntity.getViti());

        DisasterRepository disasterRepository = new DisasterRepository(entityManager);

       OccurrenceEntity findByDisasterName = disasterRepository.findByDisasterName("Earthquake");

       System.out.println("Find disasters by name is: " + findByDisasterName.getVendi());

        AffectedAreasRepository affectedAreasRepository = new AffectedAreasRepository(entityManager);


       System.out.println(affectedAreasRepository.findDisasterVendi(1));


        getKatastrofe(sessionFactory);
    }

    private static void getKatastrofe(SessionFactory sessionFactory) {
    }

}

