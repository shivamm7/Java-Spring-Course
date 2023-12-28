import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class MainClass{
    public static void main(String args[]) throws IOException{
        
        // 1
        // System.out.println("Enter a number: ");
        // int num = System.in.read();
        // System.out.println(num - '0');

        // 2
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // System.out.println("Enter a number: ");
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();

        // 3
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}