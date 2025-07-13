public class CountWord {
    public static int countWord(String filePath, String word) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            for (String w : line.split("\\s+")) {
                if (w.equals(word)) count++;
            }
        }
        br.close();
        return count;
    }
}