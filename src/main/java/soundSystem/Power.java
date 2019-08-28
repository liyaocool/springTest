package soundSystem;

import org.springframework.stereotype.Component;

/**
 * 电源系统
 */

@Component
public class Power {
    public Power() {
        super();
    }

    public void supply(){
        System.out.println("开启电源...");
    }
}
