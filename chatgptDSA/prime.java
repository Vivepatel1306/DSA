package chatgptDSA;

public class prime {
    public static void main(String[] args) {
       System.out.println(( primeNum(13)));
    }

    public static boolean primeNum(int n) {
        int b = 0;
        if(n<1){
            return false;
        }
        for (int i = 2; i <= (n / 2) + 1; i++) {
            if (n % i == 0) {
                b = 1;
              return false;
            }
        }
     return true;
    }
}
