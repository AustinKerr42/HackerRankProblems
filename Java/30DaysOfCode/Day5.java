import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Same challenge as ../Introduction/Loops1.java
public class Day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        int sum=0;
        for(int i=1; i<=10; i++){
            sum = i*N;
            System.out.println(N +" x "+ i +" = " + sum);
        }
    }
}