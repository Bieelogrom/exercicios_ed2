package view;

import controller.ExercicioDoisController;

import java.util.Scanner;

public class ExercicioDoisView {
    public static void main(String[] args) {
        ExercicioDoisController ec = new ExercicioDoisController();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do dividendo");
        int dividendo = sc.nextInt();

        System.out.println("Digite o valor do divisor");
        int divisor = sc.nextInt();

        int resto = ec.RestoDivisao(dividendo, divisor);

        System.out.println("Resto: "+ resto);
    }
}
