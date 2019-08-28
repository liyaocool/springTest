package HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {
    public static void main(String[] args) {
//        MessageService service = new MessageService();
//        Printer printer = new Printer();
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Printer printer = context.getBean(Printer.class);
        printer.printMessage();
    }
}
