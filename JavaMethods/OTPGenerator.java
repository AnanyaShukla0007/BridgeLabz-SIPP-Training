import java.util.HashSet;
import java.util.Random;
public class OTPGenerator {
    public static int generateOTP() {
        Random r = new Random();
        return 100000 + r.nextInt(900000);
    }

    public static boolean allUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }
        System.out.println("All OTPs Unique: " + allUnique(otps));
    }
}
