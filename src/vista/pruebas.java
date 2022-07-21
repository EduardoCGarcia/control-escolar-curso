/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class pruebas {
    public static void main(String[] args) {
        ArrayList<Integer> p = new ArrayList<Integer>();
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(5);
        int i = 0;
        for (Integer o : p) {
            if (o==4) {
                o=200;
                p.set(i, 200);
            }
            i++;
        }
        
        for (Integer o : p) {
            System.out.println(o);
        }
        
    }
}
