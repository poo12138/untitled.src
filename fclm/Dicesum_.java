package fclm;

import java.util.*;

public class Dicesum_ {
    public List<Map.Entry<Integer, Double>> dicesSum(int n) {
    List<Map.Entry<Integer, Double>> results = new ArrayList<Map.Entry<Integer, Double>>();
    double[][] f = new double[n + 1][6 * n + 1];
        for (int i = 1; i <= 6; ++i)
             f[1][i] = 1.0 / 6;

        for (int i = 2; i <= n; i++)
            for (int j = i; j <= 6 * i; j++) {
                for (int k = 1; k <= 6; k++)
                    if (j > k)
                     f[i][j] += f[i - 1][j - k];

                 f[i][j] /= 6.0;
             }

        for (int i = n; i <= 6 * n; ++i)
            results.add(new AbstractMap.SimpleEntry<Integer, Double>(i, f[n][i]));

        return results;
    }
    public static void main(String[] args){
        Dicesum_ ds=new Dicesum_();
        List<Map.Entry<Integer, Double>> result= ds.dicesSum(2);
        System.out.println(result);
    }
}
