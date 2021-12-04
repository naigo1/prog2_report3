package jp.ac.uryukyu.ie.e215709;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    
    public Enemy(String name, int maximumHP, int attack){
        super(name,maximumHP,attack);
    }
     /**
      * hitPointを参照するメソッド。
      * @return　hitPoint モンスターのHP.
      */
     public int getHitPoint(){
        return this.hitPoint;
    }
    /**
     * attackを参照するメソッド。
     * @return　attack モンスターの攻撃力。
     */
    public int getAttack(){
        return this.attack;
    }
    
    /**
     * nameを設定するメソッド。
     * @param name モンスターの名前。
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * hitPointを設定するメソッド。
     * @param hitPoint　モンスターのHP。
     */
    public void setHitPoint(int hitPoint){
         this.hitPoint = hitPoint;
    }
    /**
     * attackを設定するメソッド。
     * @param attack　モンスターの攻撃力。
     */
    public void setAttack(int attack){
         this.attack = attack;
    }
    /**
     * deadを設定するメソッド。
     * @param dead　モンスターの生存状況。
     */
    public void setDead(boolean dead){
         this.dead = dead;
    }

    @Override
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}