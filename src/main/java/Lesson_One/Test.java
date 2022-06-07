package Lesson_One;

import Lesson_One.Entity.Courses;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Courses.class)
                .buildSessionFactory();
        Session session = null;



        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            List<Courses> courses = session.createQuery("from Courses where name = 'Java-разработчик'")
                    .getResultList();

            for (Courses e : courses) {
                System.out.println("Имя курса: " + e.getName() + ", кол-во студентов: " + e.getStudents_count());
            }

            session.getTransaction().commit();
            System.out.println("Ваш запрос готов");

        } finally {
            factory.close();
        }
    }
}

