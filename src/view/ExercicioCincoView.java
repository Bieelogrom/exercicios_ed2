package view;

import controller.ExercicioCincoController;

import java.util.Scanner;

public class ExercicioCincoView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExercicioCincoController ec = new ExercicioCincoController();

        System.out.println("Digite o valor de A");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B");
        int b = sc.nextInt();

        int resultado = ec.CalcularMDC(a, b);

        System.out.println("Resultado: "+ resultado);
    }
}
