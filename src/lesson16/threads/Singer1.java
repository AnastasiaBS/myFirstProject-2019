package lesson16.threads;

public class Singer1 extends Thread {
    private boolean isRun = true;


    @Override
    public void run() {
        int count = 0;
        while (isRun) {
            count++;
            for (int i = 0; i < 3; i++) {
                System.out.println("LA-------------");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MICROPHONE) {
                Monitors.MICROPHONE.notify();
            }
            synchronized (Monitors.MICROPHONE) {
                try {
                    Monitors.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (count == 4) {
                isRun = false;
            }

        }

    }
}
