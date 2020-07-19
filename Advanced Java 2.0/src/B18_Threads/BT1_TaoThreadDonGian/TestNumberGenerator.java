package B18_Threads.BT1_TaoThreadDonGian;

public class TestNumberGenerator {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberGenerator("generator 1"));
        Thread thread2 = new Thread(new NumberGenerator("generator 2"));

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
