
public class compareStrings {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        int result = s1.compareTo(s2);
        if (result < 0) System.out.println('"' + s1 + "" comes before "" + s2 + """);
        else if (result > 0) System.out.println('"' + s2 + "" comes before "" + s1 + """);
        else System.out.println("Both strings are equal");
    }
}
