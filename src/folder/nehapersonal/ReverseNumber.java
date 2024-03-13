package folder.nehapersonal;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=12345;                  //12345
          while(n>0){                  //true  1234>0->true
              System.out.print(n%10);   // 54321
              n=n/10;                   //1234/10->123->12  ->1-?0
          }
        System.out.println();
        System.out.println(n+"  is n value after");

    }
}