/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author kumar
 */
public class Healer extends Character {

    @Override
    public boolean attack() {
        double random = Math.random() * 10;
        if(random <= 8.5){
            return true;
        }
        return false;
    }

    void heal(){
        this.setHP(this.getHP()+25);
        System.out.println("### HEALING FOR EVERYONE ###");
    }

    @Override
    public void receiveDamage(Character karakter) {
        super.receiveDamage(karakter);
    }
    public Healer(int defense, int attack, int hP) {
        super(defense, attack, hP);
    }
    @Override
    public void info(){
        System.out.println("=========== PLAYER ===========");
        super.info();
    }
    
    
}
