import java.util.Scanner;
import java.util.ArrayList;

public class Hitung{

    public static ArrayList<Integer> data = new ArrayList<>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String choice;
        /* Pekerjaan anda mulai dari sini */
        do {
            System.out.print("Masukkan angka (atau 'T' untuk selesai): ");
            choice = input.nextLine();

            if (!choice.equalsIgnoreCase("T")) {
                try {
                    int number = Integer.parseInt(choice);
                    data.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid, silakan masukkan angka.");
                }
            }
        } while (!choice.equalsIgnoreCase("T"));

        /* Pekerjaan anda berakhir sini */
        if (!data.isEmpty()) {
            System.out.println("Nilai minimal: " + getMin());
            System.out.println("Nilai maksimal: " + getMax());
            System.out.println("Nilai rata-rata: " + getAverage());
        } else {
            System.out.println("Tidak ada data yang dimasukkan.");
        }

        System.out.println(Hitung.class.getDeclaredMethods().length);
        System.out.println(Hitung.class.getDeclaredFields().length);
    }

    public static int getMin() {
        int min = data.get(0);
        for (int num : data) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Fungsi untuk menghitung nilai maksimal
    public static int getMax() {
        int max = data.get(0);
        for (int num : data) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Fungsi untuk menghitung nilai rata-rata
    public static double getAverage() {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.size();
    }
}
