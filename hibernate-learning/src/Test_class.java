import java.sql.Connection;
import java.sql.DriverManager;

public class Test_class {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
        String User = "hbstudent";
        String Pass = "hbstudent";

        try {

            System.out.println("Setting up connection");
            Connection myCon = DriverManager.getConnection(jdbcUrl,User,Pass);
            System.out.println("Connection Established");

            myCon.close();

        }catch (Exception e ) {
            e.printStackTrace();
        }

    }
}
