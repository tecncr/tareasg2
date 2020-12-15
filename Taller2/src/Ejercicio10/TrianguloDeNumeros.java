/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author kev15122
 */
public class TrianguloDeNumeros {
    public static void main(String[] args) {
        int a, b, num;
        String triangulo = "";
	a = 0;
	b = 0;
	
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de filas", "Este programa muestra numeros en forma triangular", 1));
	for (a=1;a<=num;a++) {
		for (b=1;b<=a;b++) {
		  triangulo += b;
		}
                triangulo += "\n";
        } 
        JOptionPane.showMessageDialog(null,triangulo,"La fila es: ",1);
    }
}
