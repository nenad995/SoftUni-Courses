package rpg_lab;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DummyTest {

    private static final int HEALTH = 100;
    private static final int EXPERIENCE = 10;
    private static final int AXE_ATTACK_POINTS = 10;
    private Dummy dummy;
    private Dummy deadDummy;

    @Before
    public void setUp(){
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
        this.deadDummy = new Dummy(0, EXPERIENCE);
    }

    @Test
    public void testDummyShouldLooseHealthWhenAttacked(){
        dummy.takeAttack(AXE_ATTACK_POINTS);
        assertEquals(HEALTH - AXE_ATTACK_POINTS, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDummyShouldThrowExceptionIfAttackedWhenDead(){
        deadDummy.takeAttack(AXE_ATTACK_POINTS);
    }

    @Test
    public void testDummyShouldGiveExperienceWhenKilled() {
        int actual = deadDummy.giveExperience();
        assertEquals(EXPERIENCE, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void testDummyShouldThrowExceptionWhenGiveExperienceIsCalledOnAliveDummy(){
        dummy.giveExperience();
    }

}
