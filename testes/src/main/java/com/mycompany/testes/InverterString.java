
package com.mycompany.testes;

import java.util.Scanner;

public class InverterString {
    
    
    public String inverterString(String s){
        int n, i;
        String aux = "";
        n = s.length();
        
        for(i = (n-1); i >= 0; i--){
            aux = aux + s.charAt(i);            
        }
        return aux;
    }
    
    
    
}
