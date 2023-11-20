public class InputNilaiMataKuliah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Nama Mahasiswa dan Semester
        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Semester: ");
        int semester = scanner.nextInt();

        // Membuat ArrayList untuk menyimpan nilai mata kuliah
        ArrayList<MataKuliah> nilaiMataKuliah = new ArrayList<>();

        // Input mata kuliah, SKS, dan nilai menggunakan looping
        System.out.println("Masukkan data nilai mata kuliah:");
        boolean isInputting = true;

        while (isInputting) {
            scanner.nextLine(); // Membersihkan newline di buffer

            System.out.print("Mata Kuliah: ");
            String mataKuliah = scanner.nextLine();

            System.out.print("SKS: ");
            int sks = scanner.nextInt();

            System.out.print("Nilai: ");
            String nilai = scanner.next();

            // Menambahkan nilai mata kuliah ke ArrayList
            nilaiMataKuliah.add(new MataKuliah(mataKuliah, sks, nilai));

            // Cek apakah ingin memasukkan nilai mata kuliah lagi
            System.out.print("Masukkan nilai mata kuliah lagi? (y/n): ");
            String input = scanner.next();

            if (!input.equalsIgnoreCase("y")) {
                isInputting = false;
            }
        }

        // Menampilkan hasil input nilai mata kuliah
        System.out.println("\nData nilai mata kuliah untuk " + namaMahasiswa + " (Semester " + semester + "):");
        for (MataKuliah mk : nilaiMataKuliah) {
            System.out.println("Mata Kuliah: " + mk.getMataKuliah() + ", SKS: " + mk.getSks() + ", Nilai: " + mk.getNilai());
        }
    }
}

class MataKuliah {
    private String mataKuliah;
    private int sks;
    private String nilai;

    public MataKuliah(String mataKuliah, int sks, String nilai) {
        this.mataKuliah = mataKuliah;
        this.sks = sks;
        this.nilai = nilai;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public int getSks() {
        return sks;
    }

    public String getNilai() {
        return nilai;
    }
}
