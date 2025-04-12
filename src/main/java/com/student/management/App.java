package com.student.management;

import com.student.management.model.College;
import com.student.management.model.Student;
import com.student.management.service.CollegeService;
import com.student.management.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        ApplicationContext context = new ClassPathXmlApplicationContext ("spring.xml");

// get Student bean
        StudentService studentService = context.getBean ("studentService",StudentService.class);

        Student student = context.getBean("student", Student.class);

        // Call the printStudent method
        StudentService.printStudent(student);

        CollegeService collegeService= context.getBean ("collegeService", CollegeService.class);

        College college = context.getBean ("college",College.class);

                CollegeService.printCollege(college);



    }
}
