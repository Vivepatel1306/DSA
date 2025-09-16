package chatgptDSA;

public class pattern {
    public static void main(String []args){
        RAT(5);
    }
    public static void RAT(int n){
        int a=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n);j++){
   
                if(a<=n/2 && (i<=a||i<n-a)){
System.out.print(" ");

                }
                else{

                    System.out.print("*");
         }
                // if(j<=n-i||j>=n+i){
                //     System.out.print(" ");
                // }
                // else
                // System.out.print(++a +" ");
                // System.out.print("*");
            }
            System.out.println();
        }
    }
}
