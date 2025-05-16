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
        String abecedarioUp= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String abecedarioLow= "abcdefghijklmnñopqrstuvwxyz";
        
        String texto_cifrado=" ";
        
       
        //Ingreso de frase inicial
        System.out.println("Ingrese una frase: ");
        String frase=lea.next();
       
        
        //Ingreso de indice de salto
        System.out.println("Ingrese el indice de salto: ");
        int indexSalto= lea.nextInt();
        
        int fraselength=frase.length();
        
        //Ciclo recorredor de frase
        int i;
        for(i=0; i<=(fraselength-1); i++){
            char letra=frase.charAt(i);
            
            //Letra en mayuscula para poder comparar con abecedario de referencia
            char letraUP= Character.toUpperCase(letra);
         
            //Variable que referencia la posicion en el abecedario
            int pos= abecedarioUp.indexOf(letraUP);
            
            //pos==-1 en caso que no coincida con ninguna de las letras del abecedario
            if(pos==-1){
                texto_cifrado+=letra;
            }else{
                //Pruebas ifs para comprobar si la letra es mayuscula o minuscula
                if(letra==letraUP){
                    texto_cifrado+=abecedarioUp.charAt((pos+indexSalto)%27);
                }else{
                    texto_cifrado+=abecedarioLow.charAt((pos+indexSalto)%27);
                }
                
            }
            
        }//fin for
        System.out.println("Texto Cifrado: "+texto_cifrado);
        
        
        
        
        
        
    }
    
}
