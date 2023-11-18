import java.util.Scanner;



public class HitungGaji {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        // Input gaji bulanan
        System.out.print("Masukan gaji Bulanan: ");
        double gajiBulanan = input.nextDouble();

        // Input jam lembur
        System.out.print("Masukan jam lembur: ");
        int jamLembur = input.nextInt();

        // Hitung upah lembur per jam
        double upahLemburPerJam = Math.ceil(gajiBulanan / 173) - 50000;

        // Hitung gaji total
        double gajiTotal = gajiBulanan + (jamLembur > 4 ? 4 * upahLemburPerJam + (jamLembur - 4) * 2 * upahLemburPerJam : jamLembur * upahLemburPerJam);

        System.out.println("Gaji yang diberikan adalah: " + gajiTotal);

        input.close();
    }
}

    