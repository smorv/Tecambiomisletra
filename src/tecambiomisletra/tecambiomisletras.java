/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecambiomisletra;

import java.util.Scanner;

/**
 *
 * @author Soledad Moraga
 */
public class tecambiomisletras 
{
    public static void main(String[] args) 
    {
        String primeraCadena="";
        String segundaCadena="";
        String texto="";
        Scanner Lector = new Scanner(System.in);

        System.out.println("Ingrese primera secuencia: ");   
        primeraCadena=Lector.nextLine();
        System.out.println("Ingrese segunda secuencia: ");   
        segundaCadena=Lector.nextLine();
        System.out.println("Ingrese Texto: ");   
        texto=Lector.nextLine();
        Reemplazo(texto, primeraCadena, segundaCadena);
        
    }
    
    public boolean Contiene(String texto, String cadena1)
    {
        boolean contiene= false; 
        if(texto.contains(cadena1)){
            contiene= true;
        }
        return contiene;
    }
    
    public static void Reemplazo(String texto, String cadena1, String cadena2)
    {
        char caracter;
        char[] aCaracteres = cadena2.toCharArray();
        char[] aCadena1 = cadena1.toCharArray();
        char[] texto2=texto.toCharArray();
        String nuevaCadena="";
        
        for(int i=0; i<texto2.length;i++)
        {
            caracter=texto.charAt(i);
            if (caracter != ' ')
            {
                for(int x=0; x<aCadena1.length;x++)
                {
                    char a=aCadena1[x];
                    if(String.valueOf(caracter).equals(String.valueOf(a)))
                    {                   
                        caracter=aCaracteres[x];
                    }
                }
            } 
            nuevaCadena+=String.valueOf(caracter);
        }
        System.out.println(nuevaCadena);
    }
}
