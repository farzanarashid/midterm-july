package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
int count=40;
        int k1=0;int k2=1;int i=0;int k3=0;
        System.out.println(k1+" " +k2);

            for(i=2;i<count;++i)
            {
                k3=k1+k2;
                System.out.print(" "+k3);
                k1=k2;
                k2=k3;
            }


    }
}
