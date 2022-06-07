import com.zemoso.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        //Load Spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve bean from Spring Container
        Coach myCoach = context.getBean("myCoach",Coach.class);
        System.out.println(myCoach.getDailyWorkout());

        //close the context
        context.close();


    }
}
