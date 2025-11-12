/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoFinal_1000;

/**
 *
 * @author DHEIVERODRIGUESFUCK
 */
public class Dados {

    public static int useDice() {
        int min = 1;
        int max = 6;
        int randomNum = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Numero do dado:" + randomNum);
        return randomNum;

    }

}
