package lab3;

/*
 * C3 = 1; StringBuffer
 * С13 = 8; Відсортувати слова заданого тексту за зростанням кількості в них заданої літери.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab3 {
    public static int function(String var, String n) {
        int len = var.length();
        int len2 = var.replace(n, "").length();
        return len - len2;
    }

    public static void main(String[] args) {
        StringBuffer sentens = new StringBuffer("Україна - це наша Батьківщина,тому ми маємо її оберігати та любити " +
                " Україна- це наш рідний край, де виросли наші батьки, діди і ми самі, тому ми маємо її любити.");
        String array = sentens.toString().replace("'","");
        array = array.replaceAll("[,.;:?!-]"," ");
        String[] array_sort = array.split(" ");
        Scanner itn = new Scanner(System.in);
        System.out.print("Введіть букву: ");
        String n = itn.nextLine().toLowerCase(Locale.ROOT);
        itn.close();
        for (int i = array_sort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (function(array_sort[j].toLowerCase(Locale.ROOT), n) > function(array_sort[j + 1].toLowerCase(Locale.ROOT), n)) {
                    String variable = array_sort[j];
                    array_sort[j] = array_sort[j + 1];
                    array_sort[j + 1] = variable;
                }
            }
        }
        System.out.print(sentens + "\n");
        for (String s : array_sort) {
            System.out.printf("%s ", s);
        }
    }
}

