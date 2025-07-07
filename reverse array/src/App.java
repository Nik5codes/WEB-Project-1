public class App {
    public static void main(String[] args) throws Exception {
        int [] numbers = {1, 2, 3, 4, 5};
        int [] rev;
        rev = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            rev[i] = numbers[numbers.length - 1 - i];
        }
        for(int r: rev) {
            System.out.print(r + " ");
        }
    }
}
