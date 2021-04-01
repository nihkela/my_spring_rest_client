package rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rest.configuration.MyConfig;
import rest.entity.Employee;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        Employee empById = communication.getEmployee(1);
//
//        System.out.println(empById);

        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1200);
        employee.setId(14);
        communication.saveEmployee(employee);


    }
}
