package Timus;

import java.util.Scanner;

public class example10_1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (b>=a){
            System.out.println(2);
        }
        else {
            if((a * 2) % b == 0){
                System.out.println((a * 2) / b);
            }
            else {
                System.out.println(((a * 2) / b) + 1);
            }
        }
    }
}
