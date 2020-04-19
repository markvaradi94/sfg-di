package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println();
        System.out.println(myController.sayHello());
        System.out.println();

//        System.out.println("------------Primary Bean --------------");
//        System.out.println(myController.sayHello());
//
//        System.out.println("------------Property Based --------------");
//        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//        System.out.println(propertyInjectedController.sayHello());
//
//        System.out.println("------------Setter Based --------------");
//        SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");
//        System.out.println(setterBasedController.sayHello());
//
//        System.out.println("------------Constructor Injected --------------");
//        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//        System.out.println(constructorInjectedController.sayHello());
//        System.out.println();


        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());

        System.out.println();

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());
        System.out.println(fakeJmsBroker.getPassword());
        System.out.println(fakeJmsBroker.getUrl());

    }

}
