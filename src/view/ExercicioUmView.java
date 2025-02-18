package view;

import controller.ExercicioUmController;

import java.util.Scanner;

public class ExercicioUmView {
    public static void main(String[] args) {
        ExercicioUmController ec = new ExercicioUmController();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = sc.nextInt();

        System.out.println("Digite o valor de b");
        int b = sc.nextInt();

        int resultado = ec.MultiplicaAB(a, b);

        System.out.println(resultado);
    }
}
