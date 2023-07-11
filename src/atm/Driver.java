package atm;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Features features = new Features(100000l, "@data");
        System.out.println("WELCOME");
        System.out.println("1 - For Deposit Money.");
        System.out.println("2 - For Withdraw Money.");
        System.out.println("3 - To Change Password.");
        System.out.println("================================================");
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                creditAmount();
                break;
            case 2:
                withDraw();
                break;
            case 3:
                changePassword();
                break;
        }

    }

    public static void creditAmount() {
        Scanner sc = new Scanner(System.in);
        Features features = new Features(100000l, "@data");
        System.out.println("Enter the password...");
        String pass = sc.nextLine();
        for (int i = 1; i <= 3; i++) {
            if (pass.equals(features.getPassword())) {
                System.out.println("The password is valid!");
                System.out.println("Enter amount you want to add...");
                long amt = sc.nextLong();
                long amount = amt + features.getAmount();
                features.setAmount(amount);
                System.out.println(features);
                break;
            } else {
                System.out.println(" Incorrect password ! Enter valid password");
                pass = sc.nextLine();
                if (i == 3) {
                    System.out.println("To many attempts, try again latter!");
                }
            }
        }
    }

    public static void withDraw() {
        Scanner sc = new Scanner(System.in);
        Features features = new Features(100000l, "@data");
        System.out.println("Enter the password...");
        String pass = sc.nextLine();
        for (int i = 1; i <= 3; i++) {
            if (pass.equals(features.getPassword())) {
                System.out.println("The password is valid!");
                System.out.println("Enter amount you want to Withdraw...");
                long amt = sc.nextLong();

                if (amt < features.getAmount()) {
                    long amount = features.getAmount() - amt;
                    features.setAmount(amount);
                    System.out.println(features);
                    break;
                } else {
                    System.out.println("Insufficient balance!");
                    break;
                }
            } else {
                System.out.println(" Incorrect password ! Enter valid password");
                pass = sc.nextLine();
                if (i == 3) {
                    System.out.println("To many attempts, try again latter!");
                }
            }
        }

    }

    public static void changePassword() {
        Scanner sc = new Scanner(System.in);
        Features features = new Features(100000l, "@data");
        System.out.println("Enter the password...");
        String pass = sc.nextLine();
        for (int i = 1; i <= 3; i++) {
            if (pass.equals(features.getPassword())) {
                System.out.println("The password is valid!");
                System.out.println("Enter new password!");
                String newPass = sc.nextLine();
                features.setPassword(newPass);
                System.out.println("Successfully changed !");
                break;
            } else {
                System.out.println(" Incorrect password ! Enter valid password");
                pass = sc.nextLine();
                if (i == 3) {
                    System.out.println("To many attempts, try again latter!");
                }
            }
        }

    }
}
