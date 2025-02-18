package controller;

public class ExercicioSeisController {
    public ExercicioSeisController(){
        super();
    }

    public int[] InverterVetor(int[] vetor, int i, int j){
        int aux;
        if(i < j){
            aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            return InverterVetor(vetor, i + 1, j - 1);
        };
        return vetor;
    }
}
