package view;

import controller.ExercicioSeisController;

import java.util.Scanner;

public class ExercicioSeisView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExercicioSeisController ec = new ExercicioSeisController();

        System.out.println("Digite o tamanho desse array");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite o valor do índice "+(i+1));
            vetor[i] = sc.nextInt();
        }

    }
}
