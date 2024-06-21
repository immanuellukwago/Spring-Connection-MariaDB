package com.immanuel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.immanuel.config.AppConfig;
import com.immanuel.connection.ConnectDB;
import com.immanuel.objects.College;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);

        College college = context.getBean("college", College.class);
        System.out.println(college.toString());

        ConnectDB connectDB = context.getBean("connectDB", ConnectDB.class);
        connectDB.connect();

        context.close();

        

    }
}
