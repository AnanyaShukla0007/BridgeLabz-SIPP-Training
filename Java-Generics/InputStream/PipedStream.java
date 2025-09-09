import java.io.*;


class WriterThread extends Thread {
    private final PipedOutputStream output;

    public WriterThread(PipedOutputStream output) {
        this.output = output;
    }

    public void run() {
        try {
            String[] messages = {
                "Hello from WriterThread!",
                "Java piped streams are useful.",
                "This is inter-thread communication.",
                "End"
            };

            for (String msg : messages) {
                output.write(msg.getBytes());
                output.write('\n'); 
                output.flush();
                Thread.sleep(500); 
            }
            output.close();
        } catch (IOException | InterruptedException e) {
            System.err.println("WriterThread Error: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private final PipedInputStream input;

    public ReaderThread(PipedInputStream input) {
        this.input = input;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Reader received: " + line);
            }
        } catch (IOException e) {
            System.err.println("ReaderThread Error: " + e.getMessage());
        }
    }
}


public class PipedStream {
    public static void main(String[] args) {
        try {
         
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

     
            Thread writer = new WriterThread(pos);
            Thread reader = new ReaderThread(pis);

    
            reader.start();
            writer.start();

   
            writer.join();
            reader.join();

        } catch (IOException | InterruptedException e) {
            System.err.println("Main Error: " + e.getMessage());
        }
    }
}
