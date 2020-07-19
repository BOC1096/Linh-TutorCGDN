package B18_Threads.BT2_HienThiSoChanLe;

public class EvenThread extends Thread {
    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("EvenThread: " + i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
