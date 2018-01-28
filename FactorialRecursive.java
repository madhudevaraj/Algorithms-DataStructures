public class Main {

    public static void main(String[] args) {
        int n = 5;
        Main obj = new Main();
        int ans = obj.fact(n);
        System.out.println(ans);
    }

    int fact(int n)
    {
        if (n==1)
        {
            return 1;
        }
        
        return n*fact(n-1);

    }
}