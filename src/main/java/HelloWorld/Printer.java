package HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer {
    /**
     * 和MessageService建立联系
     */
    private MessageService service;

    public Printer() {
        super();
        System.out.println("Printer constructor");
    }

    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

    /**
     * 打印输出
     */
    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
