/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author kev15122
 */
public class Base10_a_Base2 {
    
    public static int ingresar_validar_positivo() {

	int num;

	do {
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desee convertir: ", "Recolectar datos",1));
		if (num<0) {
		   JOptionPane.showMessageDialog(null, "El valor ingresado no puede ser negativo. \nIntentelo nuevamente","Datos incorrectos",0);
		}
	} while (num<0);
	
	return num;
}
    
   public static int convertir_a_binario(int dec) {
	
	int bin, tmp, x;
	
	tmp = dec;
	x = 1;
	bin = 0;

	// Conversion de decimal a binario mediante "divisiones sucesivas"
	while (tmp>0) {
		if (tmp%2==1) {
			bin = bin+x;
		}
		tmp = tmp/2;
		x = x*10;
	}
	
	return bin;
}
    
    
    public static void main(String[] args) {
        int binario, decimal;

	JOptionPane.showMessageDialog(null, "Programa que convierte un numero en base 10 a binario.", "Titulo", 1 );

	decimal = ingresar_validar_positivo();
	binario = convertir_a_binario(decimal);

	JOptionPane.showMessageDialog(null, "El numero "+decimal+ " convertido a binario es: "+binario, "Resultado",1 );
    }
}
