/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_presentacion;
import javax.swing.JOptionPane;
/**
 *
 * @author tecncr@NCR-ACER-E5
 */
public class Presentacion {
    public static void main(String[] args) {
        String mensaje = "Estimada profesora,\n"
                + "Los integrantes del grupo que presenta esta práctica son:\n"
                + "- Arribasplata Revilla Alexs Jhon.\n"
                + "- Carrera Yzquierdo Kevin André.\n"
                + "- Castillo Raggio Nícolas Alfredo.\n"
                + "- Huamanjulca Guerrero Diego Alejandro.\n"
                + "- Marchena Tantaleán Jordan.\n"
                + "- Mostacero Camacho Jonathan Smith.\n"
                + "Esperamos el desarrollo sea de su agrado.\n";
        JOptionPane.showMessageDialog(null, mensaje, "Integrantes del grupo", 1);
    }
}
