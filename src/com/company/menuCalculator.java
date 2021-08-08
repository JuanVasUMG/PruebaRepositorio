package com.company;

import sun.font.TrueTypeFont;

import java.util.Scanner;

public class menuCalculator {

    public static void menu(){
        int option = 0;
        Scanner in = new Scanner(System.in);
        do{
        System.out.println("" +
                "   _____      _            _       _             \n" +
                "  / ____|    | |          | |     | |            \n" +
                " | |     __ _| | ___ _   _| | __ _| |_ ___  _ __ \n" +
                " | |    / _` | |/ __| | | | |/ _` | __/ _ \\| '__|\n" +
                " | |___| (_| | | (__| |_| | | (_| | || (_) | |   \n" +
                "  \\_____\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|   \n" +
                "                           @author: JuanVasUMG   ");
        System.out.println("\nBienvendo al Programa calculator\n");
        System.out.println("Calculos Basicos:\n" +
                " 1.Suma\n" +
                " 2.Resta\n" +
                " 3.Multiplicacion\n" +
                " 4.Division\n" +
                "Calculos Avanzados:\n" +
                " 5.Raiz Cuadrada\n" +
                " 6.Potencia\n" +
                " 7.Seno\n" +
                " 8.Coseno\n" +
                " 9.Tangente\n" +
                "10. Salir del Programa");
           System.out.println("Elije una de las Opciones : ");
           option = in.nextInt();

           switch(option){
               case 1 :
                   calculationsBasic.sum();
                   if(returnMenu.backMenu()){
                     break;
                   } else {
                       option = 10;
                       break;
                   }

               case 2 :
                   calculationsBasic.subtract();
                   if(returnMenu.backMenu()){
                    break;
                   } else {
                    option = 10;
                    break;
                   }
               case 3 :
                   calculationsBasic.multiply();
                   if(returnMenu.backMenu()){
                       break;
                   } else {
                       option = 10;
                       break;
                   }
               case 4 :
                   calculationsBasic.divide();
                   if(returnMenu.backMenu()){
                       break;
                   } else {
                       option = 10;
                       break;
                   }
               case 5 :
                   calculationsAdvacend.squareRoot();
                   if(returnMenu.backMenu()){
                       break;
                   } else {
                       option = 10;
                       break;
                   }
               case 6 :
                   calculationsAdvacend.power();
                   if(returnMenu.backMenu()){
                       break;
                   } else {
                       option = 10;
                       break;
                   }
               case 7 :
                   calculationsAdvacend.sen();
                   if(returnMenu.backMenu()){
                       break;
                   } else {
                       option = 10;
                       break;
                   }
               case 8 :
                   calculationsAdvacend.cosine();
                   if(returnMenu.backMenu()){
                       break;
                   } else {
                       option = 10;
                       break;
                   }
               case 9 :
                   calculationsAdvacend.tangent();
                   if(returnMenu.backMenu()){
                       break;
                   } else {
                       option = 10;
                       break;
                   }
               case 10 : System.out.println("Saliendo del programa..."); break;
               default: System.out.println("Esta opcion no existe");

           }
       }while (option!=10);
    }
}
