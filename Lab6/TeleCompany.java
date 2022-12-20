package Lab6;

import java.util.Arrays;
import java.util.Comparator;

public class TeleCompany {
    private final String name;
    private Tarif[] tarifs;
    int counter = 0;

    public TeleCompany(int number, String name) {
        this.name = name;
        tarifs = new Tarif[number];
    }

    public String getName() {
        return name;
    }

    public void createComunication(String name, int price, int internet, int minutes, String program, int users) {
        tarifs[counter] = new Communication(name, price, internet, minutes, program, users);
        counter += 1;
    }

    public void createEntertainment(String name, int price, int internet, int minutes, String program, int users) {
        tarifs[counter] = new Entertainment(name, price, internet, minutes, program, users);
        counter += 1;
    }

    public void createVideo(String name, int price, int internet, int minutes, String program, int users) {
        tarifs[counter] = new Video(name, price, internet, minutes, program, users);
        counter += 1;
    }

    public int AllUsers() {
        int allUser = 0;
        for (Tarif tarif : tarifs) {
            allUser += tarif.getUsers();
        }
        return allUser;
    }

    public void SortedByPrice() {
        Arrays.sort(tarifs, Comparator.comparingInt(Tarif::getPrice));
    }

    public void FindTarifByPriceRange() {
        int max = 400;
        int min = 170;
        int contersortedbyrange = 0;
        Tarif[] SortedRange = new Tarif[tarifs.length];
        for (Tarif tarif : tarifs) {
            if (min <= tarif.getPrice() && max >= tarif.getPrice()) {
                SortedRange[contersortedbyrange] = tarif;
                contersortedbyrange += 1;
            }
        }
        for (Tarif tarif : SortedRange) {
            if (tarif != null) {
                System.out.println("Компанія " +this.getName()+" -- "+tarif);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder listTarifResult = new StringBuilder();
        for (Tarif tarif : tarifs) {
            listTarifResult.append("\nКомпанія ").append(this.getName()).append(" -- ").append(tarif);
        }
        return listTarifResult.toString();
    }
}
