package soundsystem.mixedconfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/mixedconfig.xml")
public class SoundSystemTest {

    @Autowired
    private MyMediaPlayer player;

    @Test
    public void shouldNotBeNull() {
        assertNotNull(player);
        player.play();
    }
}
