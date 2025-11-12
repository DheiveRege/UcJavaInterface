/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoFinal_1000;

/**
 *
 * @author DHEIVERODRIGUESFUCK
 */
public class Inimigo {

    String name;
    int life;
    int mana;
    int strength;
    int speed;

    public Inimigo(String name, int life, int mana, int strength, int speed) {
        this.name = name;
        this.life = life;
        this.mana = mana;
        this.strength = strength;
        this.speed = speed;
    }

    public boolean estaVivo() {
        return life > 0;
    }

    public void displayStatus() {
        System.out.println(name + "\n vida: " + life + "\n mana: " + mana + "\n forca: " + strength + "\n agilidade: " + speed);
    }
    
    
    public void attack(Personagem personagem, Inimigo inimigo) {
        int chanceAtaque = 50 + (speed - personagem.speed) * 5;
        int sorte = (int) (Math.random() * 100);
        if (sorte < chanceAtaque) {
            personagem.life -= inimigo.strength;
            System.out.println("Inimigo causou: " + strength + " de dano no " + personagem.getName());
        } else {
            System.out.println("Inimigo errou ataque");
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
