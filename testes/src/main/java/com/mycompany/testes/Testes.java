
package com.mycompany.testes;

import javax.swing.JOptionPane;

public class Testes {

    public static void main(String[] args) {
        Fibonacci a1 = new Fibonacci();
        
        InverterString a2 = new InverterString();
        
        //JOptionPane.showMessageDialog(null, "" + fi.calcularFibonacci(20));
        
        System.out.println(a2.inverterString("Gabriel"));
    }
}
