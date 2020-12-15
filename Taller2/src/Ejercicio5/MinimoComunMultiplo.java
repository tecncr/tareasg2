package Ejercicio5;
import javax.swing.JOptionPane;

public class MinimoComunMultiplo {
    
    public static int ingresar_validar(String orden) {
	int numero_ingresado;
	do {
            numero_ingresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el "+orden+" número: ", "Ingreso de datos", 3));
            if (numero_ingresado<1) {
		JOptionPane.showMessageDialog(null, "El número ingresado no es válido.\nPor favor ingrese un número mayor o igual a 1.", "Número inválido", 2);
            }
	} while (numero_ingresado<1);
	return numero_ingresado;
    }
    
    public static int calcular_mcm(int num1, int num2, int num3){
        int tmp1 = num1;
        int tmp2 = num2;
        int tmp3 = num3;
        while (!(tmp1 == tmp2 && tmp2 == tmp3)){
            if(tmp1<tmp2 || tmp1<tmp3){
                tmp1 += num1;
            } else if(tmp2<tmp1 || tmp2<tmp3){
                tmp2 += num2;
            } else if(tmp3<tmp1 || tmp3<tmp2){
                tmp3 += num3;
            }
        }
        return tmp1;
    }

    public static void main(String[] args) {
	int a, b, c, div, min, mid, max, mcm_acum;
        min = 0; mid = 0; max = 0;
	mcm_acum = 1;
	JOptionPane.showMessageDialog(null, "Este es un programa que calcula el MCM de tres números.", "Bienvenido", 1);
	a = ingresar_validar("primer");
	b = ingresar_validar("segundo");
	c = ingresar_validar("tercer");
        
        JOptionPane.showMessageDialog(null, "El MCM de "+a+", "+b+" y "+c+" es: "+calcular_mcm(a, b, c), "Resultado de MCM", 1);
    }
}
