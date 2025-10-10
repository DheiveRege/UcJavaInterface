
package Dia_07_10;
import java.util.Arrays;
import javax.xml.transform.Source;

public class App {


    public static void main(String[] args) {
        System.out.println("Inicializando esta classe");
      int[] numeros;
        //array tipo 1 usando SORT
        numeros = new int[5];
        
        numeros[0] = 1111;
        numeros[1] = 22;
        numeros[2] = 399;
        numeros[3] = 40;
        numeros[4] = 532;
 
        for(int i=0;i < numeros.length;i++){
            Arrays.sort(numeros);
            System.out.println("Dpois do SORT sendo um Numbers: "+numeros[i]);
        }

        
        //array tipo 2 usando SORT, toScring e so isso
        int[] numerosinhos = {100,20,30};
                String texto = Arrays.toString(numerosinhos);
                System.out.println("Virou um array de string" + texto);
                Arrays.sort(numerosinhos);
                for(int i = 0; i < numerosinhos.length;i++){
                    System.out.println(numerosinhos[i]);
                }
        
        // Pesquisa de array expecifica! usando (BinarySearch)
        
        int[] arrayNum = {10,8,2,20,50,5};
        //Primeiro tera que ser Ordenado:
        Arrays.sort(arrayNum);
        int verificar = Arrays.binarySearch(arrayNum,50);
        System.out.println("Indice da busca: " + verificar);
        
        //Equal === comparaçao de array (return TRUE e FALSE) TRUE se tiver extamentew igual se nao false!
       
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        boolean iguais = Arrays.equals(a, b);
        System.out.println("array igual e com cordens iguais === " +iguais); // true
        
        // metodo de subistituir TODOS! os indices de um array!
        
        int[] notas = {7,8,10};
        for(int i = 0; i < notas.length;i++){
            System.out.println("Antes do FILL: " + i + " :"+ notas[i]);
        }
        Arrays.fill(notas,5);
        String ver = Arrays.toString(notas);
        System.out.println("Depois do FILL" +ver);
        
        
        //metodo que copia um array kkk fodase ai e tambem aumenta o tamnho do array
        
        //diminuindo array😒
        int[] arraysCopiasNotas =  Arrays.copyOf(notas, 2);
        System.out.println("diminuido  array: " +Arrays.toString(arraysCopiasNotas));
        //Aumentando o array 
        int[] outraArraysCopiasNotas =  Arrays.copyOf(notas, 5);
        System.out.println("aumentando o array: " + Arrays.toString(outraArraysCopiasNotas));
        
        
        //copia um arrays porem so itens que voce deseja e isso falou adeus
        
        String[] brics = {"Brasil" ,"Russia", "India", "Chinas","Africa do sul"};
        String[] copiaBrics = Arrays.copyOfRange(brics,3,5);
        System.out.println("Array original: " +Arrays.toString(brics));
        System.out.println("Array copiado itens epecificos: " +Arrays.toString(copiaBrics));
        
        
        //Usando o metodo STREM para calcular a Media,Minima,Soma
        int[] meusNum = {1,2,3,4,5,6,7,8,9,10};
        
        
        
        System.out.println("Soma do array: " +Arrays.stream(meusNum).sum());
        
        System.out.println("Menor valor do array do array: "+Arrays.stream(meusNum).min());
        
        System.out.println("Media do array: "+ Arrays.stream(meusNum).average());
        
        
        
        
        //Usnado o filter kk isso muito humor
        
        //filtrando apenas numeros par no array (meusNum)
        Arrays.stream(meusNum)
                .filter(num -> num % 2 == 0)
                //metodo diferente de usar forEach
                .forEach(System.out::println);
        
          Arrays.stream(meusNum)
                .filter(num -> num % 2 == 0)
                  //metodo normal de usar forEach
                .forEach(num ->System.out.println(num));

        
    };
    
        
       
       
        
    
    
    
}
