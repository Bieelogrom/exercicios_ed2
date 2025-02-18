package controller;

public class ExercicioCincoController {
    public ExercicioCincoController(){
        super();
    }

    public int CalcularMDC(int a, int b){
        if(b == 0){
            return a;
        }else{
            return CalcularMDC(b, a % b);
        }
    }
}
