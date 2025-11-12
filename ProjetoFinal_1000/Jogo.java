/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoFinal_1000;
import java.util.Scanner;
import java.util.ArrayList;

/**
 
 * @author DHEIVERODRIGUESFUCK
 */
public class Jogo {
    public static void main(String[] args) {
        
        Personagem personagem = new Personagem("heroi", 10, 5, 5, 5);
        Inimigo inimigo = new Inimigo("vilao", 10, 5, 5, 5);
        createPersona();
       
    }
    
    public static void createPersona(){
        Scanner sc = new Scanner(System.in);
        String classe = sc.nextLine().toLowerCase();
       
       
    }
    public static void setStatus(){
        
    }
    
    
    
    
    
    

    public static void luta(Personagem personagem, Inimigo inimigo) {
        System.out.println("Voce entrou em combate com: " + inimigo.name);
        while (personagem.estaVivo() && inimigo.estaVivo()) {
            personagem.attack(personagem, inimigo);
            inimigo.attack(personagem, inimigo);

            if (!inimigo.estaVivo()) {
                System.out.println("voce derrotou " + inimigo.getName());
                break;

            } else if (!personagem.estaVivo()) {
                System.out.println("Voce tomou capa de " + inimigo.getName() + " plaitina \nRAGEQUIT!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            }
            if (Jogo.escape(personagem, inimigo)) {
                break;
            }

        }

    }

    public static boolean escape(Personagem personagem, Inimigo inimigo) {
        int chanceFugir = 20 + (personagem.speed - inimigo.speed) * 5;
        int sorte = (int) (Math.random() * 100);
        if (sorte < chanceFugir) {
            System.out.println("Voce escapou da luta!!! \ncagado");
            return true;
        } else {
            return false;
        }
    }

}
