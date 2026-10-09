import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==================================");
            System.out.println("   SISTEM PERHITUNGAN BENTUK OOP  ");
            System.out.println("==================================");
            System.out.println("1. Hitung Bujur Sangkar (Exercise 1)");
            System.out.println("2. Hitung Lingkaran     (Exercise 2)");
            System.out.println("3. Hitung Silinder      (Exercise 3)");
            System.out.println("4. Keluar");
            System.out.println("==================================");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- INPUT BUJUR SANGKAR ---");
                    System.out.print("Masukkan warna: ");
                    String warnaBujur = scanner.nextLine();
                    System.out.print("Masukkan panjang sisi: ");
                    double sisi = scanner.nextDouble();
                    scanner.nextLine();

                    BujurSangkar bs = new BujurSangkar(sisi, warnaBujur);
                    System.out.print("Hasil: ");
                    bs.printInfo();
                    break;

                case 2:
                    System.out.println("\n--- INPUT LINGKARAN ---");
                    System.out.print("Masukkan warna: ");
                    String warnaLingkaran = scanner.nextLine();
                    System.out.print("Masukkan radius (jari-jari): ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();

                    Lingkaran l = new Lingkaran(radius, warnaLingkaran);
                    System.out.print("Hasil: ");
                    l.printInfo();
                    break;

                case 3:
                    System.out.println("\n--- INPUT SILINDER ---");
                    System.out.print("Masukkan warna: ");
                    String warnaSilinder = scanner.nextLine();
                    System.out.print("Masukkan radius alas: ");
                    double radiusSilinder = scanner.nextDouble();
                    System.out.print("Masukkan tinggi silinder: ");
                    double tinggi = scanner.nextDouble();
                    scanner.nextLine();

                    Silinder s = new Silinder(tinggi, radiusSilinder, warnaSilinder);
                    System.out.print("Hasil: ");
                    s.printInfo();
                    break;

                case 4:
                    running = false;
                    System.out.println("\nTerima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid! Silakan pilih angka 1 - 4.");
                    break;
            }
        }

        scanner.close();
    }
}