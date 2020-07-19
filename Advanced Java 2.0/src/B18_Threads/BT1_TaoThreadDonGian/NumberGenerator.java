package B18_Threads.BT1_TaoThreadDonGian;

public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(this.name + ": " + i + " " + this.hashCode());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
