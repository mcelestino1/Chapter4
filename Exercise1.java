package Chapter4;

public class Exercise1 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner((System.in));
        boolean continueInput = true;
        do {
            try {
                System.out.print("Please enter the first Integer: ");
                int num1 = input.nextInt();
                System.out.print("Please enter the second Integer: ");
                int num2 = input.nextInt();
                continueInput = false;
                System.out.println("Your sum is " + (num1 + num2));

            } catch (Exception e) {
                System.out.println(e + " occurred. Please try it again " +
                        "and enter an integer. Not other characters.");
                input.nextLine();
            }
        }
        while(continueInput);

    }
}
