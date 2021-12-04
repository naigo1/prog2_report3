package jp.ac.uryukyu.ie.e215709;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{
    

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    
    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);        
    }
    
    /**
     * hitPointを参照するメソッド。
     * @return　hitPoint heroのHP.
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
    
    /**
     * attackを参照するメソッド。
     * @return　attack heroの攻撃力。
     */
    public int getAttack(){
        return this.attack;
    }

    

    /**
     * nameを設定するメソッド。
     * @param name　heroの名前
     */ 
    public void setName(String name){
         this.name = name;
    }

    /**
     * hitPOintを設定するメソッド。
     * @param hitPoint　heroのHP
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
     * attackを設定するメソッド
     * @param attack　heroの攻撃力
     */
     public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * deadを設定するメソッド
     * @param dead　heroの生存状況
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}