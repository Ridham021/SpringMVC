package com.java.hibernate.basic;

import com.java.hibernate.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory factory = cfg.buildSessionFactory();

        System.out.println(factory);
        System.out.println(factory.isClosed());

        Student st = new Student();
        st.setFirstName("Raj");
        st.setLastName("patel");
        st.setEmail("raj@gmail.com");

        Session session = factory.getCurrentSession();

        Transaction tx=session.beginTransaction();
        session.save(st);
        tx.commit();
        session.close();



    }
}
