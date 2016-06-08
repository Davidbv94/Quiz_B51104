/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author David
 */
public class Calculadora 
{
  ArrayList<Pattern> arregloVerificacion;
    Pattern numeros = Pattern.compile("");
    public Calculadora (){
        arregloVerificacion= new ArrayList<>();
        datosArreglo();
    }
    public void datosArreglo(){
         numeros = Pattern.compile("(\\d+\\,\\d+\\.\\d+)\\+(\\d+)");
        arregloVerificacion.add(numeros);
        numeros = Pattern.compile("(\\d+,\\d+,\\d+.\\d+)\\+(\\d+)");
        arregloVerificacion.add(numeros);
        numeros = Pattern.compile("\\d+,\\d{3}+(\\d+)");
        arregloVerificacion.add(numeros);
        numeros = Pattern.compile("\\d+,\\d{3}+(\\d+)");
        arregloVerificacion.add(numeros);
        
    }
    public String validarSuma(String text){
        double suma=0;
        String datos="";
        for(int i=0;i<arregloVerificacion.size();i++){
            Pattern expresion = arregloVerificacion.get(i);
            Matcher matcher = expresion.matcher(text);
            if( matcher.find()){
                System.out.println("Entro");
                
                
                
                
                
                
                System.out.println("grupo 1"+matcher.group(1));
                datos=matcher.group(1);
                datos=datos.replaceAll(",","");
                System.out.println("se cambio coma"+datos);
                suma=Double.parseDouble(datos)+Integer.parseInt(matcher.group(2));
                datos=datos +"+"+ Integer.parseInt(matcher.group(2))+"=" +suma;
            }
        }
        if(datos.equals("")){
            System.out.println("esta expresion es invalida ");
        }
        return datos;
    }  
}
