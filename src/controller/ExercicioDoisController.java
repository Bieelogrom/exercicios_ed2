package controller;

public class ExercicioDoisController {
    public ExercicioDoisController(){
        super();
    }

    public int RestoDivisao(int dividendo, int divisor){
        if(dividendo < divisor){
            return dividendo;
        }else{
            return RestoDivisao(dividendo - divisor, divisor);
        }
    }
}
