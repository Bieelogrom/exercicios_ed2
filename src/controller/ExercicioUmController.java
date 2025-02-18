package controller;

public class ExercicioUmController {
    public ExercicioUmController(){
        super();
    }

    public int MultiplicaAB(int a, int b){
        if(a == 1){
            return b;
        }else{
            return b + MultiplicaAB(a - 1, b);
        }
    }
}