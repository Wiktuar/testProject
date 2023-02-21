package teachclasses;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 3, 8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

// метод, сортирующий массив
    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j > i; j--){
                if(arr[j] < arr[j -1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j - 1] = temp;
                }
                fileWriter(Arrays.toString(arr));
            }
        }
        return arr;
    }

//  метод, пищущий массив в файл на каждой итерации цикла
    public static void fileWriter(String s){
        try(FileWriter fw = new FileWriter("file.txt", true)){
           fw.write(s);
           fw.write("\n");
        }catch (IOException e){
            System.out.println("Файл не может быть записан");
        }
    }
}
