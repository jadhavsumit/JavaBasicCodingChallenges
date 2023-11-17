public class fibonacciSeries {
    public static void main(String[] args) {
        int k =0,a=1,b=1;

        while(k<=50)
        {
            k = a + b;
            System.out.println(k + "");
            a=b;
            b=k;

        }
    }
}
