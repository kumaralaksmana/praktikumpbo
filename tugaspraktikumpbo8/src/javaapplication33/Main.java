/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Magician magician = null;
        Healer healer = null;
        Warrior warrior = null;
        Titan titan = new Titan(0, 45, 200);
        int pilihanke = 0;
        System.out.println("WELCOME TO FILKOM DEFEND GAME !");
        System.out.print("CHOOSE YOUR NAME : ");
        String nama = scan.nextLine();
        
        boolean ulangiopsi = true; 
        do {
            System.out.println("CHOOSE YOUR ROLE :");
            System.out.println("1. Magician");
            System.out.println("2. Healer");
            System.out.println("3. Warrior");
            
            do {
                try {
                    System.out.print("Pilih: ");
                    pilihanke = scan.nextInt();
                    ulangiopsi = false;
                } catch (Exception e) {
                    ulangiopsi = true;
                    scan.next();
                    System.out.println("NUMBER ONLY!");
                }
            } while (ulangiopsi);
            ulangiopsi = true;

            System.out.println("WELCOME " + nama + " !");
            switch (pilihanke){
                case 1 :
                    System.out.println("1");
                    magician = new Magician(10, 60, 100);
                    magician.info();
                    ulangiopsi = true;
                    System.out.println("================================");
                    System.out.println("              READY             ");
                    System.out.println("================================");
                    for(int i = 0; ulangiopsi; i++){
                        if(titan.getHP() > 0 && magician.getHP()>0){
                            System.out.println("\n>======== TURN "+(i+1)+"==========<");
                            if(magician.attack()){
                                magician.receiveDamage(titan);
                            }
                            if(titan.attack()){
                                titan.receiveDamage(magician);
                            }
                            System.out.println(nama +"'s HP : "+ magician.getHP());
                            System.out.println("Enemy's HP : "+titan.getHP());
                        } else{
                            ulangiopsi=false;
                        }
                    }
                    ulangiopsi = true;
                    System.out.println("");
                        if(titan.getHP() == 0){
                            System.out.println("     "+ nama +"'s WIN THIS GAME     ");
                            System.out.println("           YOU WIN            ");
                        }else if(magician.getHP() == 0){
                            System.out.println("    Titan's WIN THIS GAME     ");
                            System.out.println("           YOU LOSE           ");
                        }
                        System.out.println("");

                        System.out.println("================================");
                        System.out.println("         SCORE HIGHLIGHT        ");
                        System.out.println("================================");
                        magician.info();
                        titan.info();
                        System.out.println("------------------------------");
                        System.out.println("");
                    
                    break;
                case 2 :
                    System.out.println("2");
                    healer = new Healer(10, 10, 70);
                    healer.info();
                    ulangiopsi = true;
                    System.out.println("\n==============================");
                    System.out.println("              READY             ");
                    System.out.println("==============================\n");
                    for(int i = 0; ulangiopsi; i++){
                        if(titan.getHP() > 0 && healer.getHP()>0){
                            System.out.println("\n>======== TURN "+(i+1)+"==========<");
                            if(i % 2 == 1){
                                healer.heal();
                            }
                            
                            if(healer.attack()){
                                healer.receiveDamage(titan);
                            }
                            if(titan.attack()){
                                titan.receiveDamage(healer);
                            }
                            System.out.println(nama +"'s HP : "+ healer.getHP());
                            System.out.println("Enemy's HP : "+titan.getHP());
                        } else{
                            ulangiopsi=false;
                        }
                    }
                    ulangiopsi = true;
                    System.out.println("");
                        if(titan.getHP() == 0){
                            System.out.println("     "+ nama +"'s WIN THIS GAME     ");
                            System.out.println("            YOU WIN           ");
                        }else if(healer.getHP() == 0){
                            System.out.println("    Titan's WIN THIS GAME     ");
                            System.out.println("           YOU LOSE           ");
                        }
                        System.out.println("");

                        System.out.println("================================");
                        System.out.println("         SCORE HIGHLIGHT        ");
                        System.out.println("================================");
                        healer.info();
                        titan.info();
                        System.out.println("------------------------------");
                        System.out.println("");
                    break;
                case 3 :
                    System.out.println("3");
                    warrior = new Warrior(30, 25, 80);
                    warrior.info();
                    ulangiopsi = true;
                    System.out.println("\n==============================");
                    System.out.println("              READY             ");
                    System.out.println("==============================\n");
                    for(int i = 0; ulangiopsi; i++){
                        if(titan.getHP() > 0 && warrior.getHP()>0){
                            System.out.println("\n>======== TURN "+(i+1)+"==========<");
                            if(warrior.attack()){
                                warrior.receiveDamage(titan);
                            }
                            if(titan.attack()){
                                titan.receiveDamage(warrior);
                            }
                            System.out.println(nama +"'s HP : "+ warrior.getHP());
                            System.out.println("Enemy's HP : "+titan.getHP());
                        } else{
                            ulangiopsi=false;
                        }
                    }
                    ulangiopsi = true;
                    System.out.println("");
                        if(titan.getHP() == 0){
                            System.out.println("     "+ nama +"'s WIN THIS GAME     ");
                            System.out.println("           YOU WIN            ");
                        }else if(warrior.getHP() == 0){
                            System.out.println("    Titan's WIN THIS GAME     ");
                            System.out.println("           YOU LOSE           ");
                        }
                        System.out.println("");

                        System.out.println("================================");
                        System.out.println("         SCORE HIGHLIGHT        ");
                        System.out.println("================================");
                        warrior.info();
                        titan.info();
                        System.out.println("------------------------------");
                        System.out.println("");
                    break;
                default :
                    System.out.println("THE INPUT YOU ENTERED DOES NOT MATCH");
                    break;
            }
         
        } while (ulangiopsi);
    }
}
