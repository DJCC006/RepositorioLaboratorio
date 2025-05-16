/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package santos_carcamo_daniel_david_estructura;
 import java.util.Scanner;
/**
 *
 * @author David
 */
public class Santos_Carcamo_Daniel_David_Estructura {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lea= new Scanner(System.in);
        lea.useDelimiter("\n");
        
        
        //Parte de cifrado ceasar
        
        
        //Recurso de referencia
        String abecedario= "ABCDFGHIJKLMNÑOPQRSTUVWXYZ";
        String texto_cifrado=" ";
        
       
        //Ingreso de frase inicial
        System.out.println("Ingrese una frase: ");
        String frase=lea.next().toUpperCase();
        System.out.println(frase);
        
        //Ingreso de indice de salto
        System.out.println("Ingrese el indice de salto: ");
        int indexSalto= lea.nextInt();
        
        int fraselength=frase.length();
        
        //Ciclo recorredor de frase
        int i;
        for(i=0; i<=(fraselength-1); i++){
            char letra=frase.charAt(i);
            
            //Variable que referencia la posicion en el abecedario
            int pos= abecedario.indexOf(letra);
            
            //pos==-1 en caso que no coincida con ninguna de las letras del abecedario
            if(pos==-1){
                texto_cifrado+=letra;
            }else{
                texto_cifrado+=abecedario.charAt((pos+indexSalto)%fraselength);
            }
            
        }//fin for
        System.out.println("Texto Cifrado: "+texto_cifrado);
        
        
        
        
        
        
    }
    
}
