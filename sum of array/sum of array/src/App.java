public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = {10,20,30,40,50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
