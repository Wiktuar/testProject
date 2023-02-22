package teachclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// StringBuilder использовать не стал, мне больше String.format() нравится.
public class ActsWithList {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(5);
       list.add(2);
       list.add(4);
       list.add(3);
       list.add(8);
       list.add(1);
//       getOdd(list).forEach(System.out::println);
//        System.out.println(getMin(list));
//        System.out.println(getMax(list));
        System.out.printf("%.3f", getAverage(list));
    }


//  получение спискас нечетными цифрами
    public static List<Integer> getOdd(List<Integer> list){
        return list.stream().filter(l -> l%2 != 0).collect(Collectors.toList());
    }

//  получение минимального значения
    public static int getMin(List<Integer> list){
        return list.stream().min(Integer::compareTo).get();
    }

//  получение максимального значения
    public static int getMax(List<Integer> list){
        return list.stream().max(Integer::compareTo).get();
    }

//  поиск среднего арифметического
    public static double getAverage(List<Integer> list){
        return list.stream().mapToInt(e -> e).average().getAsDouble();
    }
}
