package org.example;

public class Conversor {

    public static double deCelciusAKelvin(double grados){
        return grados+273.15;
    }

    public static double deCelciusAFahrenheit(double grados){
        return grados*((double)9/5) + 32;
    }

    public static double deFahrenheitACelciusOKelvin(double grados, boolean aCelcius){
        double resultado;

        if(aCelcius){
            resultado = (grados-32)*((double)5/9);
        }else{
            resultado = (grados+459.67)*((double)5/9);
        }

        return resultado;
    }
}
