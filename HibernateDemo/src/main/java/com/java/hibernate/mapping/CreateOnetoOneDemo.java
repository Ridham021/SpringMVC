package com.java.hibernate.mapping;

import com.java.hibernate.Entity.Instructor;
import com.java.hibernate.Entity.InstructorDetail;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;


public class CreateOnetoOneDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            System.out.println("creating new Instructor object");

            //create objects

//            Instructor tempInstructor = new Instructor("Ridham","Shingala","r@gmail.com");
//
//            InstructorDetail instructorDetail = new InstructorDetail("http://google.com","Read about startups");

            // associate objects
            Instructor tempInstructor = new Instructor("Raj","patel","r@gmail.com");
//
            InstructorDetail instructorDetail = new InstructorDetail("workX","series watching");


            tempInstructor.setInstructorDetail(instructorDetail);

            // start a transaction

            session.beginTransaction();

            //delete code

//
//            int theId = 3;
//            Instructor tempInstructor = session.get(Instructor.class,theId);
//
//            if(tempInstructor!=null){
//                System.out.println("Deleting : "+tempInstructor);
//                session.delete(tempInstructor);
//            }


            //save the instructor
            // This will save instructorDetails object because of CascadeType.ALL

            System.out.println("tempInstructor" + tempInstructor);

            session.save(tempInstructor);

            //commit transaction

            session.getTransaction().commit();

            System.out.println("done-----------------------------------------------");

        }
       finally {
            session.close();
        }
    }

}
