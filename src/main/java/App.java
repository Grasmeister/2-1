import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat bean3 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(bean3.getName());

        Cat bean4 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(bean4.getName() + "2");
        System.out.println(bean.equals(bean1));
        System.out.println(bean3.equals(bean4));
        System.out.println(bean1 == bean);
        System.out.println(bean3 == bean4);
    }
}