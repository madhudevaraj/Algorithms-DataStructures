// Fibonacci
public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        int n = 10;
        obj.fibonacci(n);
    }

    void fibonacci(int n)
    {
        int n1=0;
        int n2=1;

        if(n>2)
        {
            System.out.print(n1+" "+n2);
            for(int i=3; i<=n; i++)
            {
              int n3 = n1+n2;
              System.out.print(" "+n3);
              n1=n2;
              n2=n3;
            }
        }

        else{
            if(n==1)
            {
              System.out.println(n1);
            }
            else if(n==2)
            {
                System.out.print(n1+" "+n2);
            }
        }
    }
}
