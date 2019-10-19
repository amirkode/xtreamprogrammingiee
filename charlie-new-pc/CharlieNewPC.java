import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 

class CharlieNewPC {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{ 
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < t; i ++){
            int b = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int tc[][] = new int[n][];
            int totalIndex[] = new int[n];
            String p, pSplit[];

            for(int j = 0; j < n; j ++) {
                p = br.readLine();
                pSplit = p.split(" ");
                tc[j] = new int[pSplit.length];
                
                for(int k = 0; k < pSplit.length; k ++){
                    tc[j][k] = Integer.parseInt(pSplit[k]);
                }
                
                Arrays.sort(tc[j]);
                
                totalIndex[j] = tc[j].length - 1;
            } 
            /*
            for(int j = 0; j < n; j ++){
                for(int k = 0; k < tc[j].length; k ++){
                    System.out.print(tc[j][k] + " ");
                }

                System.out.println();
            }
            */

            int initCost = 0;

            for(int j = 0; j < n; j ++)
                initCost += tc[j][totalIndex[j]];

           // System.out.println("cost " + initCost);

            System.out.println(findHighestCost(b, tc, totalIndex, initCost));

        }
    }

    public static int findHighestCost(int b, int[][] tc, int[] total, int cost){
        int currentCost = cost;
        if(currentCost > b) {
            int testedCost = currentCost;
            int changedIndex = - 1;
            for(int i = 0; i < total.length; i ++) {
                if(total[i] - 1 >= 0) {
                    if(currentCost - tc[i][total[i] - 1] == b){
                        return b;
                    } else if(testedCost > currentCost - tc[i][total[i] - 1]){
                            testedCost = currentCost - tc[i][total[i] - 1];
                            changedIndex = i;
                    }
                }
            }

            int[] totalNew = total;

            if(changedIndex != -1)
                totalNew[changedIndex] = total[changedIndex] - 1;
            else 
                return 0;

            return findHighestCost(b, tc, totalNew, testedCost);
        }
        
        return currentCost;
    }
}