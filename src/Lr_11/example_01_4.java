package Lr_11;

public class example_01_4 {
    public static void main(String[] args) {

        System.out.println(fact(5));
    }
    private static int fact(int n) {
        int result;
        if(n == 1){
            return 1;
        }
        else {
            result = fact(n-1) * n;
            return result;
        }

    }
}
