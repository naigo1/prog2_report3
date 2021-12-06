package jp.ac.uryukyu.ie.e215709;

public class Warrior extends Hero {

    public Warrior(String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);        
    }
    public void attackWithWeponSkill(LivingThing opponent){
        int damage;
        if(opponent.hitPoint > 0){
            damage = (int)(this.attack *1.5);
        }else{
            damage = 0;
        }
        
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage); 
    }
}
