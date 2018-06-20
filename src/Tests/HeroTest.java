package Tests;

import Interface.Hero;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class HeroTest {

    @Test
    public void testLife(){
        Hero hero = new Hero(100);
        assertEquals(hero.health,100);
    }
}