package Atividades;
import java.util.ArrayList;

public class Atividade08 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        arrayList.add(6);
        arrayList.add(7);
        Integer[] arrayFinal = new Integer[arrayList.size()];
        arrayFinal = arrayList.toArray(arrayFinal);
        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.println(arrayFinal[i]);
        }
    }
}