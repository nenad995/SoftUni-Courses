package rpg_lab;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class HeroTest {

    private static final int TARGET_XP = 10;
    private static final String HERO_NAME = "Pesho";

    @Test
    public void attackGainsExperienceIfTargetIsDead() {

        Target mockedTarget = Mockito.mock(Target.class);
        Weapon mockedWeapon = Mockito.mock(Weapon.class);

        Mockito.when(mockedTarget.isDead()).thenReturn(true);
        Mockito.when(mockedTarget.giveExperience()).thenReturn(TARGET_XP);

        Hero hero = new Hero(HERO_NAME, mockedWeapon);
        hero.attack(mockedTarget);

        assertEquals(TARGET_XP, hero.getExperience());

    }

}
