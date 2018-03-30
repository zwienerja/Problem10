public class Problem10 {

    private static boolean primeTest(long n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        long sum = 0;
        long i = 3;
        System.out.println(sum);
        while (i < 2000000) {
            if (primeTest(i)) {
                sum += i;
            }
            i += 2;
        }
        System.out.println(sum + 2);
    }
}
