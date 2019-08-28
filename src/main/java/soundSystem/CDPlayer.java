package soundSystem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    @Autowired(required = false)
    private CompactDisc cd;

    @Autowired
    private Power power;

    private static final Logger logger = LogManager.getLogger();

    public CDPlayer() {
        super();
        logger.error("CDPlayer无参构造函数");
    }

//    @Autowired
//    public CDPlayer(CompactDisc cd, Power power) {
//        this.cd = cd;
//        this.power = power;
//        logger.error("CDPlayer有参构造函数");
//    }

    public void play() {
        power.supply();
        if (cd != null) cd.play();
    }

}
