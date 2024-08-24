package ijse.lk;

import ijse.lk.config.FactoryConfiguration;
import ijse.lk.embed.FullName;
import ijse.lk.entity.Student;
import ijse.lk.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Session session=FactoryConfiguration.getInstance().getSession();
        FullName fullName = new FullName("Madhubashini","Samarakoon");
        Student student = new Student();
        student.setId(3);
        student.setName(fullName);
        student.setAddress("Panadura");

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("Udara San");
        teacher.setAddress("Panadura");

        Transaction transaction =session.beginTransaction();

        session.save(student);
        // session.update(student);
        //session.delete(student);
        //Student student1 = session.get(Student.class, 1);//get done
        session.save(teacher); // add another class and save data
        //System.out.println(student1);
        transaction.commit();
        session.close();
    }
}