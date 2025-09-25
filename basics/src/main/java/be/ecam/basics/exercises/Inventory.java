package be.ecam.basics.exercises;

import java.util.List;

public class Inventory {
    public static class Item {
        private final String sku;
        public Item(String sku) { this.sku = sku; }
        public String getSku() { return sku; }
    }

    public static boolean hasSku(List<Item> items, String sku) {
        for (Item i : items) {

            // Les comparaisons en java se font de préférence avec equals pour éviter les erreurs
            //if (i.getSku() == sku) {
            if (i.getSku().equals(sku)) {
                return true;
            }
        }
        return false;
    }
}
