/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author 20506
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String s1 = sc1.nextLine();
        System.out.print("Введите строку 2: ");
        String s2 = sc1.nextLine();
        System.out.print("Введите строку  3: ");
        String s3 = sc1.nextLine();
        System.out.print("Введите строку  4: ");
        String s4 = sc1.nextLine();
        System.out.print("Введите строку 5: ");
        String s5 = sc1.nextLine();


        if (s4.equalsIgnoreCase(s5) ) {
            System.out.println(s1 + " " + s2);
        } else {
            System.out.println(s1 + " " + s3);
        }
    }
    }
    

