public class Looping {
    public static void main(String[] args) {
        int baris = 4;
        int kolom = 4;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (i + j >= baris - 1) {
                    System.out.print("O");
                } else {
                    System.out.print("S");
                }
            }
            System.out.println();
        }
    }
}
