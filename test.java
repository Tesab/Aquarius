import java.util.Scanner;

public class SecurityAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        
        if (isValidPassword(password)) {
            System.out.println("Password is strong and secure.");
        } else {
            System.out.println("Password is weak. Please choose a stronger password.");
        }
    }
    
    private static boolean isValidPassword(String password) {
        // Minimum length requirement
        if (password.length() < 8) {
            return false;
        }
        
        // Contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        
        // Contains at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }
        
        // Contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        
        // Contains at least one special character
        if (!password.matches(".*[!@#$%^&*()].*")) {
            return false;
        }
        
        return true;
    }
}
