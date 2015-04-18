/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salman;

import java.util.ArrayList;
/**
 *
 * @author SBC4
 */
public class Salman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList c = new ArrayList () ;
        c.add("Salman Marbiyanto");
        c.add("Kelas B pagi");
        c.add("14621049");
        System.out.println(c);
                
        System.out.println("Yang akan muncul : "+c.get(2));
        
        c.set(0, "Obby");
        System.out.println(c);
        
        c.remove(1);
        System.out.println(c);
        
        c.set(1, "Al-Saffar");
        System.out.println(c);
        
        ArrayList Sangarr = (ArrayList)c.clone();
        System.out.println(c);
        
        System.out.println("Sembarang"+c.size());
        
        c.clear();
        System.out.println("Yang akan terjadi : "+c);
        
        for (int a=1; a<=3; a++){
            c.add(1);
                System.out.print(a);
                   
                }
            }
        }

        
        
    

