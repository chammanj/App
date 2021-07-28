import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {
    public static void main(String[] args) {

        Student student = new Student("S001","Nimal","Colombo","011");
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.save(student);
    }
}
