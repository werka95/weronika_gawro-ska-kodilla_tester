import java.util.Random;

public class LoopWhile2 {
    public static void main(String[]args) {
        LoopWhile2 obj = new LoopWhile2();
        int result = obj.getCountOfRandomNumbers(50);
        System.out.println(result);
    }
    public int getCountOfRandomNumbers(int max) {

        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}


