public class App {
    public static void main(String[] args) throws Exception {
        int [] arr = {12 , 11, 13, 5, 6, 7};
        int n= arr.length;
        int avg = 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        avg = sum / n;
        System.out.println("Average of the array is: " + avg);
    }
}
