package Tests;

import Interface.Hero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    @Test
    public void testLife(){
        Hero hero = new Hero(100);
        assertEquals(hero.health,100);
    }
}