/* Prime Checker
You are given a class Solution and its main method in the editor. Your task is to create a 
class Prime which contains a single method checkPrime so that the code prints only prime numbers as the output.
Please do not use method overloading!
Note: You may get a compile time error in this problem due to the below statement:
  BufferedReader br=new BufferedReader(new InputStreamReader(in));
This was added intentionally, and you have to figure out a way to get rid of the error.
Input Format
There are only five lines of input, each containing one integer.
Output Format
There will be only four lines of output. Each line contains only prime numbers depending 
upon the parameters passed to checkPrime in the main method of the class Solution. In case there is 
no prime number, then a blank line should be printed.

Sample Input
  2
  1
  3
  4
  5
  
Sample Output
2 
2 
2 3 
2 3 5 

SOLUTION->
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime {
    public void checkPrime(int... numbers) {
        int i, flag;
        for (int n : numbers) {
            flag = 0;
            if (n == 1) {
                System.out.print("");
            }

            else {
                for (i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        flag = 1;
                        break;
                    } else
                        flag = 0;
                }
                if (flag == 0)
                    System.out.print(n + " ");
                else
                    System.out.print("");
            }

        }
        System.out.println();
    }
}

public class Solution {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}