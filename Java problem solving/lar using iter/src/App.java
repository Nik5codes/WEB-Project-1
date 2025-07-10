public class App {
    public static void main(String[] args) throws Exception {
        int[] arr={1, 2, 3, 4, 5};
        int lar =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>lar)
            {
                lar=arr[i];
            }
        }
        System.out.println("largest is:"+lar);
    }
}
