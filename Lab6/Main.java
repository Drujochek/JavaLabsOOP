package Lab6;
/*Визначити ієрархію тарифів мобільної компанії. Створити список тарифів компанії.*/
/*Порахувати загальну чисельність клієнтів.Провести сортування тарифів на основі розміру абонентської плати.
  Знайти тариф у компанії, що відповідає заданому діапазону вартості послуг.*/
public class Main {

    public static void main(String[] args) {
        TeleCompany listTarif = new TeleCompany(4,"Київстар");
        listTarif.createComunication("Спілкування без меж ", 150, 300, 10000, "Instagram,Facebook,Viber", 12000000);
        listTarif.createComunication("Спілкування за кордоном ", 350, 5000, 20000, "Instagram,Facebook,Viber,GoogleMaps,Telegram", 2000000);
        listTarif.createVideo("Безлім відео ", 300, 5000, 1000, "Netflix,AmazonTV,YouTube,AppleTV", 6000000);
        listTarif.createEntertainment("Розваги без меж", 200, 18000, 200, "Twitch,Spotify,TikTok,Instagram,YouTubeMusic,PUBG", 15000000);
        System.out.println(listTarif);
        System.out.println("\nКількість всіх користувачів тарифів: " + listTarif.AllUsers());
        System.out.println("\nВідсортований список тарифів за розміром абонентської плати");
        listTarif.SortedByPrice();
        System.out.println(listTarif);
        System.out.println("\nТарифи що відповідають заданому діапазону цін:");
        listTarif.FindTarifByPriceRange();
    }
}

