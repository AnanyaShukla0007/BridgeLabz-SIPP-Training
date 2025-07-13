public class CompareBufferBuilder {
    public static void main(String[] args) {
        long start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 1000000; i++) sbf.append("hello");
        long bufferTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < 1000000; i++) sbd.append("hello");
        long builderTime = System.nanoTime() - start;

        System.out.println("StringBuffer time: " + bufferTime);
        System.out.println("StringBuilder time: " + builderTime);
    }
}