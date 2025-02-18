package controller;

public class ExercicioQuatroController {
   public ExercicioQuatroController(){
       super();
   }

   public int FatorialDuplo(int valor){
       if(valor == 1){
           return valor;
       }else{
           return valor * FatorialDuplo(valor - 2);
       }
   }
}
