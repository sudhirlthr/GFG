package hackerearth;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DivisorFriend {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_F = br.readLine().split(" ");
        int[] F = new int[N];
        for(int i_F = 0; i_F < arr_F.length; i_F++)
        {
            F[i_F] = Integer.parseInt(arr_F[i_F]);
        }

        int out_ = MimimumGroup(N, F);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static int MimimumGroup(int N, int[] F){
        // Write the code here

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 2; i < N; i++) {
            List<Integer> list2 = new ArrayList<>();
            for (int j = 0; j < F.length; j++) {
                if(F[j] % i == 0 && !list.stream().flatMap(Collection::stream).collect(Collectors.toList()).contains(F[j])){
                    list2.add(F[j]);
                }
            }
            if (list2.size()>1) list.add(list2);
        }
        return list.size() > 0 ? list.size() : N;
    }
}