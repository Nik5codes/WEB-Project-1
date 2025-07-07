public class App {
    public static void main(String[] args) throws Exception {
        int [] numbers = {12, 45, 67, 23, 89, 34};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}
