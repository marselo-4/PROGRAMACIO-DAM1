package Practiques;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
       
        //una array es un conjunt de variables del mateix tipus.
        // new int [] per dir el numero de posicions de la array
        // si li fas un sysout + el nom de la array te impreix la poscio de memoria no el contingut
        // si vols ferho be li fas un sysout + nom de la array + [] + la posico que vols
        // Es pot modificar el contingut amb la seguent formula array2[0] = 5; aixi es modifica la posicio 0.
        // Quan declares el bucle for per imprimir tota la array posar i < array.length xq si li poses un = te dona error.
        // Per rellanar la array 1x1 fas un bucle for amb un scanner
       
        Scanner scan = new Scanner(System.in);
       
        /*int[] array_numeros = new int[10]; //Array amb 10 posicions buides. */
       
        int[] array2 = {10, 20, 30, 40, 50}; //Declarar una array amb els numeros, les posicions son les definides per els numeros (0-4).
       
        //Aixi es com es fa mprimir totes les posicions de la array es fa amb un bucle for.
       
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }
   

       
        int[] array3 = new int[5];
       
        for (int i = 0; i < array2.length; i++) {
            array3[i] = scan.nextInt();
        }
       
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array3[i]);
        }
       
    }

}