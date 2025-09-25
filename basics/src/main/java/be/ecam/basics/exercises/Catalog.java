package be.ecam.basics.exercises;

import java.util.Collections;
import java.util.List;

public class Catalog {
    public static class Product {
        private final String name;
        private final List<String> tags;

        public Product(String name, List<String> tags) {
            this.name = name;
            //this.tags = tags;
            // Si tags est null, on met une liste vide immuable
            this.tags = (tags == null) ? Collections.emptyList() : tags;
        }

        public String getName() { return name; }
        public List<String> getTags() { return tags; }
    }

    public static int countTags(Product p) {
        return p.getTags().size();
    }
}
