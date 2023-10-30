package Tugas2;

/**
 * Program Java sederhana untuk menghitung luas jajargenjang.
 * Luas jajargenjang dihitung dengan mengalikan panjang dan tinggi.
 */
public class JajargenjangCalculator {

    /**
     * Menghitung luas jajargenjang.
     *
     * @param panjang Sisi panjang jajargenjang.
     * @param tinggi  Tinggi jajargenjang.
     * @return Luas jajargenjang.
     */

    public static double hitungLuasJajargenjang(double panjang, double tinggi) {
        return panjang * tinggi;
    }

    public static void main(String[] args) {
        double panjang = 5.0;
        double tinggi = 8.0;

        double luas = hitungLuasJajargenjang(panjang, tinggi);

        System.out.println("Luas jajargenjang dengan panjang " + panjang + " dan tinggi " + tinggi + " adalah: " + luas);
    }
}
