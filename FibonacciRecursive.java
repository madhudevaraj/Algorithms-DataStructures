public class Main {

    public static void main(String[] args) {
        int n =4;
        Main obj = new Main();
        int ans = obj.fibo(n);
        System.out.println(ans);
    }

    int fibo(int n)
    {
        if (n==0 || n==1) // or (n<=1)
        {
          return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}
