package view;

import controller.ExercicioTresController;

import java.util.Scanner;

public class ExercicioTresView {
    public static void main(String[] args) {
        ExercicioTresController ec = new ExercicioTresController();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite o valor do índice "+(i+1));
            vetor[i] = sc.nextInt();
        };

        int resultado = ec.ValoresPares(vetor, vetor.length - 1);

        System.out.println(resultado);
    }
}
