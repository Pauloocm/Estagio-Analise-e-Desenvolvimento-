
package com.mycompany.testes;

public class Fibonacci {
    int a = 0, b = 1, auxiliar = 0, cont = 0;
    
    public boolean calcularFibonacci(int n){    
        while(auxiliar < n){
            auxiliar = a + b;
            a = b;
            b = auxiliar;      
            if(auxiliar == n){
                return true;
            }
        }
        return false;
    }
    
}
