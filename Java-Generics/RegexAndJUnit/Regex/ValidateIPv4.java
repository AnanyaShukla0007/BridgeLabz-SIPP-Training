package regex;

public class ValidateIPv4 {
    public static void main(String[] args) {
        String[] testCases = {
            "192.168.1.1",
            "255.255.255.255",
            "256.100.50.25",
            "01.02.03.04",
            "192.168.1",
            "192.168.1.1.5",
            "abc.def.ghi.jkl"
        };

        for (String ip : testCases) {
            System.out.printf("%-20s : %s%n", ip, isValidIPv4(ip) ? "Valid" : "Invalid");
        }
    }

    public static boolean isValidIPv4(String ip) {
        String ipv4Pattern = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.|$)){4}$";
        return ip.matches(ipv4Pattern) && ip.chars().filter(ch -> ch == '.').count() == 3;
    }
}
