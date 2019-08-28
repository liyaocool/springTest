package helloWorld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    private static final Logger logger = LogManager.getLogger("TRACE_ALL");

    public MessageService() {
        super();
        logger.error("MessageService constructor");
    }

    public String getMessage() {
        return "Hello world!";
    }
}
