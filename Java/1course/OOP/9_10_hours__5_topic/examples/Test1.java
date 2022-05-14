public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 9, 2, 8, 8, 7};

        // int mx = 0;
        int mn = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < mn) {
                mn = arr[i];
            }
        }

        System.out.println(mn);
    }    
}
