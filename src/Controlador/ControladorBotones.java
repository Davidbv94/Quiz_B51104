/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Calculadora;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author David
 */
public class ControladorBotones 
{
 private Calculadora calculadora;
    private VentanaPrincipal principal;
    public ControladorBotones(VentanaPrincipal principalCalculadora) {
        calculadora= new Calculadora();
        principal= principalCalculadora;
    }

   
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Calcular")){
            if(!calculadora.validarSuma(principal.fieldtext().getText()).equals(""));{
                principal.fieldArea().setText(calculadora.validarSuma(principal.fieldtext().getText()));
            }
        }
    }    
}
