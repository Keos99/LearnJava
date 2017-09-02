package Chapter3;

import java.util.SortedMap;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java - наше все!";
        String str2 = new String(str1);
        String str3 = "Строки java эффективны.";

        int result;
        int idx;
        char ch;

        System.out.println("Длина str1: " + str1.length());

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
        System.out.println();

        if (str1.equals(str2)){
            System.out.println("str1 эквивалентна str2");
        }
        else {
            System.out.println("str1 не иквевалентна str2");
        }

        if (str1.equals(str3)){
            System.out.println("str1 эквивалентна str3");
        }
        else {
            System.out.println("str1 не эквивалентна str3");
        }

        result = str1.compareTo(str3);
        if (result == 0){
            System.out.println("str1 и str3 равны");
        }
        else if (result < 0){
            System.out.println("str1 меньще str3");
        }
        else {
            System.out.println("str1 больше str3");
        }

        str2 = "Onr Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Иедекс первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения One: " + idx);
    }
}
