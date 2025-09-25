package be.ecam.basics.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileLoader {
    public static String firstLine(Path path) throws IOException {
        BufferedReader br = null;
        try {
            br = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            return br.readLine();
        } catch (IOException e) {
            // Le problème vient du fait qu'on renvoie null au lieu d'une exception 
            //return null;
            throw e;
        } finally {
            if (br != null) {
                try { br.close(); } catch (IOException ignored) { }
            }
        }
    }
}
