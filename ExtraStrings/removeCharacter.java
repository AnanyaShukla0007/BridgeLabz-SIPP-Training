
public class removeCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char toRemove = 'l';
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != toRemove) result += str.charAt(i);
        }
        System.out.println("Modified String: " + result);
    }
}
