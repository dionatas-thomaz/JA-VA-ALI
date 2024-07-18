
import java.util.ArrayList;

public class Calculo {
    //atributos

    double notas;
    double media=0;
    double[] peso = {2,3,5};

    //construtor

    public  Calculo(ArrayList<Double> notas){
        for (int i = 0; i < 3; i++){
           media+=(notas.get(i)/10*peso[i]);
        }
    }
}
