package org.example;

import org.example.config.SpringConfig;
import org.example.models.Music;
import org.example.models.Person;
import org.example.service.PersonService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//
//        try {
//            Session session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Person person = new Person("Danila Lobach", 39);
//            session.persist(person);
//
//            session.getTransaction().commit();
//
//        }finally {
//            sessionFactory.close();
//        }
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonService service = context.getBean(PersonService.class);


    }
}
