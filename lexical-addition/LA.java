import java.util.Scanner;

class LA { 
    static Scanner in = new Scanner(System.in);
    static long n, a, b;    
    static boolean found = false;

    public static void main(String[] args){
        n = in.nextLong();
        a = in.nextLong();
        b = in.nextLong();

        for(long i = b; i >= a; i --){
            long z = b - a + 1;
            long toBePrint[] = new long[z];
            findProperAddition(i, i, 0, toBePrint);
        }

        if(!found){
            System.out.println("NO");
        }
    }

    public static void findProperAddition(long currentVal, long total, long counter, long[] toBePrint){
        if(!found){
            if(total == n){
                found = true;
                System.out.println("YES\n");
                for(long i = 0; i < counter - (long)1; i ++ ){
                    System.out.print(toBePrint[i] + " ");
                }
                System.out.println(toBePrint[counter - (long)1]);
            } else if(total < n) {
                for(long i = currentVal; i >= a; i --){
                    findProperAddition(i, total + i, counter, countertoBePrint[counter]);
                }
            }
        }
    }
}