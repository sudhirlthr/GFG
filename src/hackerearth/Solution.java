package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            int Q = Integer.parseInt(br.readLine().trim());
            String[] arr_queries = br.readLine().split(" ");
            int[] queries = new int[Q];
            for(int i_queries = 0; i_queries < arr_queries.length; i_queries++)
            {
                queries[i_queries] = Integer.parseInt(arr_queries[i_queries]);
            }

            int[] out_ = prefix_queries(N, A, Q, queries);
            StringBuilder sb=new StringBuilder();
            for(int a:out_)
            {
                sb.append(a+" ");
            }

            System.out.println(sb);


        }

        wr.close();
        br.close();
    }
    static int[] prefix_queries(int N, int[] A, int Q, int[] queries){
        // Write your code here
        List<Integer> list = new ArrayList<>();
        // iterate through queries
        // if type 1: then rotate the array
        // else type 2: then check length of prefix 1's and find maximum default would be zero
        // finally return the result

        for (int i = 0; i < queries.length; i++) {
            if(queries[i] == 1){
                A = rotateTheArray(A);
            }else {
                Integer max = findMaximumPrefix(A);
                list.add(max);
            }
        }

        return list.stream().mapToInt(val ->  val).toArray();

    }
    private static int[] rotateTheArray(int[] A){
        for (int i = A.length-1; i > 0; i--) {
            A[i] = A[i-1];
        }
        A[0] = 1;
        return A;
    }
    private static Integer findMaximumPrefix(int[] A){
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == 1) count++;
            else break;
        }
        return count;
    }
}