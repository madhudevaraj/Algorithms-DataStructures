class MyCode {

    public static void main(String[] args) {
        int n = 10;
        MyCode obj = new MyCode();
        obj.fibo(n);
    }

    void fibo(int n)
    {
        System.out.print("0 1 ");

        int fib = 0, fib1 =0, fib2 =1;
        while(fib <= n)
        {
          fib = fib1+fib2;
          fib1 = fib2;
          fib2= fib;
          if(fib <n)
          System.out.print(fib+" ");
          else
            return;
        }
    }
}