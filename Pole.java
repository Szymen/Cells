/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nauka;

/**
 *
 * @author szymon
 */
public class Pole {
    public boolean akt;
    public boolean przyszly; 

    
    @Override
    public String toString(){
        if (this.akt == true){
                 return "#";}
        else 
            return " ";
    }
    
    public Pole() {
        this.akt = false;
        this.przyszly = false;
    }
    
    
}
