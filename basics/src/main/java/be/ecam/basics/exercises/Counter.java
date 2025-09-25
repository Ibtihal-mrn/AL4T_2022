package be.ecam.basics.exercises;

public class Counter {
    //public static byte count(int start, int steps) {
    public static int count(int start, int steps) {
        // Le bit ne peut pas dépasser 127 car on est sur 8 bits 
        // Compter au delà est impossible donc il faut changer le type. Int est codé sur sur 32 bits
        //byte c = (byte) start;
        int c = (int) start;
        for (int i = 0; i < steps; i++) {
            c++;
        }
        return c;
    }
}
