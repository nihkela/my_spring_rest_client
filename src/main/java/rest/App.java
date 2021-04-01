package rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rest.configuration.MyConfig;
import rest.entity.Employee;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);


    }
}
