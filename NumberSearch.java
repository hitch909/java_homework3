//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.*;

public class NumberSearch {
    public static void main(String[] args) {
        List<Integer> mass = new ArrayList<>(Arrays.asList(45, 76, 14, 98, 42, 55, 12, 41, 74, 30));
        int longMass = mass.size();
        int min, max;
        System.out.println(Arrays.toString(mass.stream().mapToInt(Integer::intValue).toArray()));

        max = Collections.max(mass);
        System.out.println("Максимальное число : " + max);

        min = Collections.min(mass);
        System.out.println("Минимальное число: " + min);

        System.out.println("Среднее значение чисел массива : " + averageNamber(mass, longMass));
    }

    public static float averageNamber(List<Integer> mass, int longMass) {
        int summ = 0;
        longMass = mass.size();
        for (int value : mass) {
            summ += value;
        }
        System.out.println("Длинна массива : " + longMass);
        return (float) summ / longMass;
    }
}
