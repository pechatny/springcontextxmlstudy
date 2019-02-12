package ru.pechatny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Zoo zoo = (Zoo)context.getBean("zoo");
        zoo.zooSpeaks();
    }
}
