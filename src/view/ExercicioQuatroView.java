package view;

import controller.ExercicioQuatroController;

import java.util.Scanner;

public class ExercicioQuatroView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExercicioQuatroController ec = new ExercicioQuatroController();

        int valor;

        do{
            System.out.println("Digite o valor");
            valor = sc.nextInt();
        }while(valor < 0 || valor % 2 == 0);

        int resultado = ec.FatorialDuplo(valor);

        System.out.println("Resultado: "+ resultado);
    }
}
