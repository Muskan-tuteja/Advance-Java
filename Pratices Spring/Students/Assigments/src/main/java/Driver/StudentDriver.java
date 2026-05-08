package Driver;

import com.jsp.Students;
import config.config;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class StudentDriver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Students students = context.getBean(Students.class);
        System.out.println(students);

    }
}
