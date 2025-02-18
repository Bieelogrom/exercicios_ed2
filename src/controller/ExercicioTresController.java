package controller;

public class ExercicioTresController {
    public ExercicioTresController(){
        super();
    }

    public int ValoresPares(int[] vetor, int tamanho){
        if(0 == tamanho){
            return 1;
        }else{
            if(vetor[tamanho] % 2 == 0){
               return 1 + ValoresPares(vetor, tamanho - 1);
            }else{
                return ValoresPares(vetor, tamanho - 1);
            }
        }
    }
}
