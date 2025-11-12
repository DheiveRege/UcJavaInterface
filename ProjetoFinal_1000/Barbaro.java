/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoFinal_1000;

/**
 *
 * @author DHEIVERODRIGUESFUCK
 */
public class Barbaro extends Personagem {

    public Barbaro(String name, int life, int mana, int strength, int speed) {
        super(name, life, mana, strength, speed);
        this.strength = strength + 2;
    }

}
