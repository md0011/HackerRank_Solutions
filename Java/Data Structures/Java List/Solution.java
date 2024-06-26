/* Java List
For this problem, we have  types of queries you can perform on a List:
Insert  at index :
Insert
x y
Delete the element at index :
Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, 
print the modified list as a single line of space-separated integers.

Input Format
The first line contains an integer,  (the initial number of elements in ). 
The second line contains  space-separated integers describing . 
The third line contains an integer,  (the number of queries). 
The  subsequent lines describe the queries, and each query is described over two lines:
If the first line of a query contains the String Insert, then the second line contains 
two space separated integers , and the value  must be inserted into  at index.
If the first line of a query contains the String Delete, then the second line contains index, 
whose element must be deleted from .

Output Format
Print the updated list  as a single line of space-separated integers.

Sample Input
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output
0 1 78 12 23
 
SOLUTION-> 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        int i, n, indx, value;
        String query;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ArrayList list = new ArrayList();
        for (i = 0; i < n; i++) {
            value = in.nextInt();
            list.add(value);
        }
        int queries = in.nextInt();
        while (queries-- != 0) {
            query = in.next();
            if (query.equals("Insert")) {
                indx = in.nextInt();
                value = in.nextInt();
                list.add(indx, value);
            } else if (query.equals("Delete")) {
                indx = in.nextInt();
                list.remove(indx);
            }
        }
        for (i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}