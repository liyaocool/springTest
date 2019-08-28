package soundSystem;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 单元测试
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppTest {
    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void testPlay() {
        cdPlayer.play();
    }
}
