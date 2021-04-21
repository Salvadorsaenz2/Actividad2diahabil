/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg2.dia.habil_66136;

import java.util.Scanner;

/**
 *
 * @author salva
 */
public class ACTIVIDAD2DIAHABIL_66136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String text = null;
    String text2 = null; 
    
    Scanner sc = new Scanner(System.in);
        System.out.println("(1) Lunes" + "\n(2) Martes" + "\n(3) Miércoles" + "\n(4) Jueves" + "\n(5) Viernes" + "\n(6) Sábado" + "\n(7) Domingo");
    int dia = sc.nextInt();
                     
if (dia >= 1 && dia <=7) {
            switch (dia) {
                case 1:
                    System.out.println("Lunes es un día hábil.");
                    break;
                case 2:
                    System.out.println("Martes es un día hábil.");
                    break;
                case 3:
                    System.out.println("Miércoles es un día hábil.");
                    break;
                case 4:
                    System.out.println("Jueves es un día hábil.");
                    break;
                case 5:
                    System.out.println("Viernes es un día hábil.");
                    break;
                case 6:
                    System.out.println("Sábado es fin de semana.");
                    break;
                case 7:
                    System.out.println("Domingo es fin de semana.");
                    break;
            }   
            
        } else {
            System.out.println("Que dia desea selleccionar?.");
        } 
    }
}
