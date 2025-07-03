import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n---Calculator---");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Divison");
            System.out.println("[5] Exit");
            int secim = scanner.nextInt();
            if (secim == 0) {
                System.out.println("Exit...");
                break;
            }

            System.out.print("1st number: ");
            double sayi1 = scanner.nextDouble();
            System.out.print("2nd number: ");
            double sayi2 = scanner.nextDouble();

            double sonuc = 0;

            switch (secim) {
                case 1:
                    sonuc = calc.add(sayi1, sayi2);
                    break;
                case 2:
                    sonuc = calc.subtract(sayi1, sayi2);
                    break;
                case 3:
                    sonuc = calc.multiply(sayi1, sayi2);
                    break;
                case 4:
                    sonuc = calc.divide(sayi1, sayi2);
                    break;
                default:
                    System.out.println("Unvalid choice!");
                    continue;
            }

            System.out.println("Result: " + sonuc);
        }

        scanner.close();
    }
}