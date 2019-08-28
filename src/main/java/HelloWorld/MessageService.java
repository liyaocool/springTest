package HelloWorld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    private static final Logger logger = LogManager.getLogger(MessageService.class);

    public MessageService() {
        super();
        logger.error("MessageService constructor");
    }

    public String getMessage() {
        return "Hello world!";
    }
}
