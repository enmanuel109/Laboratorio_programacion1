/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercios_laboratorio_1;
import java.util.Scanner;
/**
 *
 * @author Cantarero
 */
public class Cantarero_salvadorPlanilla_de_Empleado {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String name = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        int age = sc.nextInt();

        System.out.print("Introduce tu altura (en metros): ");
        double height = sc.nextDouble();

        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Altura: " + height);
    }
}
