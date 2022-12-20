package Lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Makeup[] makeups = {
                new Makeup("MAC", "Hygiene", 5000, "Shampoo", "Head"),
                new Makeup("L`Oreal", "Decorative", 3000, "Pomade", "Lip"),
                new Makeup("Maybelline", "Protective", 7000, "Cream", "Hands"),
                new Makeup("NYX", "Healing", 2000, "Toothpaste", "Teeth"),
                new Makeup("Dior", "Special", 4000, "Depilatories", "Legs"),
        };
        for (Makeup makeup : makeups) {
            System.out.println("Brand:" + makeup.getBrand() + " Function:" + makeup.getFunction() + " Kind:" +
                    makeup.getKind() + " Price:" + makeup.getPrice() + " Place:" + makeup.getPlaceApplication());
        }
        Arrays.sort(makeups, Comparator.comparing(Makeup::getPrice).reversed());
        System.out.println("\n" + "SORTED PRICE REVERSED" + "\n");
        for (Makeup makeup : makeups) {
            System.out.println("Brand:" + makeup.getBrand() + " Function:" + makeup.getFunction() + " Kind:" +
                    makeup.getKind() + " Price:" + makeup.getPrice() + " Place:" + makeup.getPlaceApplication());
        }
        Arrays.sort(makeups, Comparator.comparing(Makeup::getFunction));
        System.out.println("\n" + "SORTED BRAND " + "\n");
        for (Makeup makeup : makeups) {
            System.out.println("Brand:" + makeup.getBrand() + " Function:" + makeup.getFunction() + " Kind:" +
                    makeup.getKind() + " Price:" + makeup.getPrice() + " Place:" + makeup.getPlaceApplication());
        }
    }
}
