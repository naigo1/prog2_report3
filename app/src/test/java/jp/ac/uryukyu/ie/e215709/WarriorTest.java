package jp.ac.uryukyu.ie.e215709;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


 class WarriorTest {
    @Test
    void waarriorTest(){
        int defaultHeroHp = 100;
        Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 10);
        Enemy slime = new Enemy("スライムもどき", defaultHeroHp, 100);   
        
        demoHero.attackWithWeponSkill(slime);
        assertEquals(slime.getHitPoint(), 100 - (int)(10*1.5));  
        demoHero.attackWithWeponSkill(slime);
        assertEquals(slime.getHitPoint(), 85 - (int)(10*1.5));
        demoHero.attackWithWeponSkill(slime);
        assertEquals(slime.getHitPoint(), 70 - (int)(10*1.5));
    }

}
