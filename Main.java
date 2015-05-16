
package nauka;


import java.util.Scanner;



public class Main {

    private static int a,b;
    
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
       // System.out.println("Podaj ilosc iteracji : ");
       // int iteracji = in.nextInt();
        
        Mapa map= new Mapa(500,500);
        
        
        map.generuj(4, 0.65);
        //map.wypisz();
        map.wypisz("mapa.txt");
        
        
        
        
        
        
        
    }
    
}
