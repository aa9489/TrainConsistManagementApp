import java.util.regex.*;

public class uc11 {
public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        Pattern tPattern = Pattern.compile(trainPattern);
        Pattern cPattern = Pattern.compile(cargoPattern);

        Matcher tMatcher = tPattern.matcher(trainId);
        Matcher cMatcher = cPattern.matcher(cargoCode);

        if (tMatcher.matches()) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (cMatcher.matches()) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }
    }
}