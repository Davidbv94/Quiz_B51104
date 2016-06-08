/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.ControladorBotones;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author David
 */
public class VentanaPrincipal extends javax.swing.JFrame 
{
    private Controlador.ControladorBotones manejador;
    
    public VentanaPrincipal() {
        initComponents();
        manejador=new ControladorBotones(this);
        panelCalculadora1.setManejador(manejador);
    }
    public JTextField fieldtext(){
        return panelCalculadora1.getjTextField1();
    }
    public JTextArea fieldArea(){
        return panelCalculadora1.getjTextArea1();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    private Vista.PanelC panelCalculadora1;
}