package chapter2.soundsystem2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by liyu on 2017/7/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = chapter2.soundsystem.CDPlayerConfig.class)
public class CDPlayerTest {
    private CDPlayerConfig config = new CDPlayerConfig();

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();//�赼��system-rules jar

    @Test
    public void play() {
        config.cdPlayer().play();
        assertEquals("title:Sgt.Pepper's lonely hearts club band; artist:the beatles\n", log.getLog());
    }
}