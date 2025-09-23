import java.util.Arrays;

public class OTPGenerator {

    public static int generateSixDigitOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areOtpsUnique(int[] otps) {
        for (int i = 0; i < otps.length - 1; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] otpNumbers = new int[10];

        for (int i = 0; i < otpNumbers.length; i++) {
            int newOtp;
            boolean isDuplicate;
            do {
                isDuplicate = false;
                newOtp = generateSixDigitOTP();
                for (int j = 0; j < i; j++) {
                    if (otpNumbers[j] == newOtp) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);
            otpNumbers[i] = newOtp;
        }
        
        System.out.println("Generated 10 Unique OTPs:");
        System.out.println(Arrays.toString(otpNumbers));

        boolean validationResult = areOtpsUnique(otpNumbers);
        System.out.println("\nValidation check: Are all generated OTPs unique? " + validationResult);
    }
}