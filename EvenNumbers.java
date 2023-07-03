package EvenNumbers;
//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        enterArray( );
    }

    public static void enterArray() {
        int counter, num;
        int[] array;
        Scanner inp = new Scanner(System.in);
        System.out.println("введите количество элементов массива:  ");
        num = inp.nextInt();
        array = new int[num];
        System.out.println("введите " + num + " чисел");
        for (counter = 0; counter < num; counter++) {
            array[counter] = inp.nextInt();
        }
        inp.close();
        System.out.println("Ваш массив: " + Arrays.toString(array));

        List<Integer> nextArray = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (array[i] % 2 != 0) {
                nextArray.add(array[i]);
            }
        }
        String nextMass =  Arrays.toString(nextArray.stream().mapToInt(Integer::intValue).toArray());
        System.out.printf("Ваш массив без четных чисел :  "+ nextMass);
    }
}




