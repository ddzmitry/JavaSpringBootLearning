package crud_operations;

import com.ddzmitry.hiber_learniung.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class Create_Student_Demo_Factory {
    public static void main(String[] args) {

//        Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(StudentEntity.class)
                .buildSessionFactory();
//        Create Session
        Session session = factory.getCurrentSession();

        try{

            ArrayList<StudentEntity>  Students =  Read_csv.GetStudents();
            session.beginTransaction();
            for (StudentEntity Student : Students){
                session.save(Student);
                System.out.println(Student.getId());
            }
            session.getTransaction().commit();
//
//            //            Create Object
//            StudentEntity tempStudent = new StudentEntity("Peter","Parker","pp@email.com");
////            Start Transaction
//            session.beginTransaction();
////            save the student
//            session.save(tempStudent);
////            commit the transaction
//            session.getTransaction().commit();



        } finally {
            factory.close();
        }
    }
}
