package B18_Threads.BT3_TimSoNguyenTo;

public class TestRunable {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization=new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization=new OptimizedPrimeFactorization();
        optimizedPrimeFactorization.run();
        lazyPrimeFactorization.run();

    }
}
