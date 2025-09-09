public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Executing job step " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Job completed!");
        };

        Thread worker = new Thread(job);
        worker.start();
    }
}