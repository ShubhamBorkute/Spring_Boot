package temp;

public class Test {
	public static void main(String[] args) {
		System.out.println("Sum"+sumOfSeries(7));
	}
	static int sum=0;
   static long sumOfSeries(long n) {
        if(n<=0)return 0;
        float pow=(float)Math.pow(n,3);
        System.out.println(pow);
        sum+=pow;
        System.out.println(sum);
        sumOfSeries(n-1);
        return sum;
    }
}
