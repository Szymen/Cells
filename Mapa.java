
package nauka;

import java.util.Random;
import java.io.PrintWriter;
/*
 *
 * @author szymon
 */
public class Mapa {

    private int wierszy, kolumn;
    private Pole[][] pola;
    public Mapa(int foo, int bar) {
        wierszy = foo;
        kolumn = bar;
        pola = new Pole[wierszy][kolumn];
        int i,j;
        for(i=0;i<wierszy;i++){
            for(j=0;j<kolumn;j++){
                pola[i][j]=new Pole();
            }
        }
        
    }

    public void wypisz(String fileName){
    PrintWriter writer;
    try{
    writer = new PrintWriter (fileName, "UTF-8");
    for (Pole[] i : pola) {
        for (Pole j : i) {
            writer.print(j);
        }
        writer.println("");
    
    
    }
    writer.close();
    }
    catch(Exception e){
        System.out.println("Nie dziala!");
    }
   
    }

    
    
    public void wypisz() {
        for (Pole[] i : pola) {
            for (Pole j : i) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public void generuj(int iteracji, double zapelnienie) {
        int wstawionych=0;
        zapelnienie*=this.wierszy*this.kolumn; // teraz jest tu ile trzeba wstawic punktow
        int x,y;
        Random randGen = new Random();
        
        while(wstawionych<zapelnienie){
            x = randGen.nextInt(wierszy);
            y = randGen.nextInt(kolumn);
            
            if(pola[x][y].akt == false ){
                pola[x][y].akt = true;
                wstawionych++;
            }
        }

        
        while(iteracji-->0){
            
            for(x=1;x+1<wierszy;x++){
                for(y=1;y+1<kolumn;y++){ 
                    
                    if( this.sasiedzi(x,y) < 5) { // tzn 0 lub 1 lub 2
                        pola[x][y].przyszly=false;            // usun
                    }
                    else 
                        pola[x][y].przyszly=true;
                }
            }
            
            for(x=0;x<wierszy;x++){
                for(y=0;y<kolumn;y++){ 
                    pola[x][y].akt= pola[x][y].przyszly; // aktualizacja
                }
            }
        
        }
        
        
        
        
    }

    private int sasiedzi(int x,int y){
       int wynik=0;
       /*
       if(x == 0 || y == 0){wynik = 2;
       if(pola[x][y+1].akt == true){wynik++;}
       if(pola[x+1][y].akt == true){wynik++;}
       return wynik;
       } 
       if(x == this.wierszy-1 || y == this.kolumn-1){wynik = 2;
       if(pola[x-1][y].akt == true){wynik++;}
       if(pola[x][y-1].akt == true){wynik++;}
       return wynik;
       } 
       
       if(x == 0){
           wynik++;
           if(pola[x+1][y].akt == true){wynik++;}
           if(pola[x][y+1].akt == true){wynik++;}
           if(pola[x][y-1].akt == true){wynik++;}
           return wynik;
        }
        if( y == 0){
           wynik++;
           if(pola[x+1][y].akt == true){wynik++;}
           if(pola[x-1][y].akt == true){wynik++;}
           if(pola[x][y+1].akt == true){wynik++;}
           return wynik;
        }
        if(x == this.wierszy-1){
            wynik++;
           if(pola[x-1][y].akt == true){wynik++;}
           if(pola[x][y+1].akt == true){wynik++;}
           if(pola[x][y-1].akt == true){wynik++;}
           return wynik;
        }
         if(y == this.kolumn-1 ){
            wynik++;
           if(pola[x+1][y].akt == true){wynik++;}
           if(pola[x-1][y].akt == true){wynik++;}
           if(pola[x][y-1].akt == true){wynik++;}
           return wynik;
       } 
       else {*/
           if(pola[x+1][y].akt == true){wynik++;}
           if(pola[x-1][y].akt == true){wynik++;}
           if(pola[x][y+1].akt == true){wynik++;}
           if(pola[x][y-1].akt == true){wynik++;}
           if(pola[x+1][y+1].akt == true){wynik++;}
           if(pola[x-1][y-1].akt == true){wynik++;}
           if(pola[x-1][y+1].akt == true){wynik++;}
           if(pola[x+1][y-1].akt == true){wynik++;}
           
           
           
           return wynik;
         //}
    }
    
    
    
}
  
