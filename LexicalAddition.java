import java.util.Scanner;

class LexicalAddition { 
    static Scanner in = new Scanner(System.in);
    static long n, a, b;    
    static boolean found = false;

    public static void main(String[] args){
        n = in.nextLong();
        a = in.nextLong();
        b = in.nextLong();

        for(long i = b; i >= a; i --){
            findProperAddition(i, i, " " + i);
        }

        if(!found){
            System.out.println("NO");
        }
    }

    public static void findProperAddition(long currentVal, long total, String toBePrint){
        if(!found){
            if(total == n){
                found = true;
                System.out.println("YES\n" + toBePrint.substring(1));
            } else if(total < n) {
                for(long i = currentVal; i >= a; i --){
                    findProperAddition(i, total + i, " " + i + toBePrint );
                }
            }
        }
    }
}