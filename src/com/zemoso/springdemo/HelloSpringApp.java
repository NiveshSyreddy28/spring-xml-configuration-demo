package com.zemoso.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        //call getDailyWorkout method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call getDailyFortune method
        System.out.println(theCoach.getDailyFortune());

        // Setter Injection demo
        // retrieve bean from spring container
        CricketCoach myCricketCoach = context.getBean("myCricketCoach",CricketCoach.class);

        //call getDailyWorkout method
        System.out.println(myCricketCoach.getDailyWorkout());

        //call getDailyFortune method
        System.out.println(myCricketCoach.getDailyFortune());

        //Call get methods
        System.out.println(myCricketCoach.getEmailAddress());
        System.out.println(myCricketCoach.getTeam());

        //close the context
        context.close();
    }
}
