package be.ecam.basics.exercises;

public class SensorWindow {
    public static int average(int[] values) {
        if (values == null || values.length == 0) throw new IllegalArgumentException("values");
        // int sum = 0;
        long sum = 0 ; 
        for (int v : values) {
            sum += v;
        }
        // Une division entière en Java retire la partie décimale 
        // Si la somme est trop grande, on risque de dépasser la capacité du int donc il vaut mieux utiliser un long 
        return (int)(sum / values.length);
    }
}
