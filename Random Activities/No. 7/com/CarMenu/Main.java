// @Package - Car Menu

package com.CarMenu;

import com.CarMenu.Car;

public class Main {
    
    public static void main(String[] args) {
        
        
        
        //new Car();
        
        
        Main m = new Main();
        m.generate_id();
    }
    
    
    public void generate_id() {
        int len = 4; // Length of an ID
        
        int index, rand;
        
        String sb = ""; // String Builder
        
        
        for(index = 0; index < len; index++) {
            rand = (int)Math.round(Math.random() * 9);
            
            sb = String.format("%s%d", sb, rand);
        }
        
        System.out.println(sb);
    }
}