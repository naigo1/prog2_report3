package jp.ac.uryukyu.ie.e215709;

public class LivingThing{
     String name;
     int hitPoint;
     int attack;
     boolean dead;
    public  LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public boolean isDead(){
        return this.dead;
    }
    public String getName(){
        return this.name;
    }
    public void attack(LivingThing opponent){
        int damage;
        if(this.hitPoint>0){
             damage = (int)(Math.random() * attack);
        }else{
             damage = 0;
        }
        
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);        
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);    
        }
    }
}
