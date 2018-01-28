public class Main {

    public static void main(String[] args) {
        int n = 5;
        Main obj = new Main();
        obj.fact(n);
    }

    void fact(int n)
    {
        int fact = 1;
        for(int i = 1; i<=n ; i++)
        {
            fact = fact * i;
            System.out.println(n);
        }

        System.out.println(fact);
    }
}