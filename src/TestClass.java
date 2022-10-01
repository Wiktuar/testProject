public class TestClass {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 13, 7, 6, 4};
        int size = 6;
        int sum = 0;
        int avg = 0;
        int index = 0;

        while(index < size){
            sum+=numbers[index];
            index++;
        }

        avg = sum/size;
        System.out.println(avg);
    }
}
