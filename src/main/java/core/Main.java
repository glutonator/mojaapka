package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        KlasaA klasaA = (KlasaA) context.getBean("klasaA");
        klasaA.getPoleA();

//        KlasaB klasaB = (KlasaB)context.getBean("klasaB");
        KlasaB klasaB = context.getBean(KlasaB.class);
        klasaB.func();
        klasaB.funcObiektC();
//        KlasaC klasaC = (KlasaC) context.getBean("klasaC");
//        klasaC.func();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        KlasaD klasaD = (KlasaD) context.getBean("klasaD");
        klasaD.func();
    }
}
