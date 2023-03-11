/*NIM   : 13020210263
Nama    : Nurul Aisya Alda
Hari/Tgl: Sabtu, 11 Maret 2023
Waktu   : 20:55 PM*/
package tugas9;

/* pembagian integer casting */
public class Ekspresi1 {

    /**
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        /* KAMUS */
        int x = 1; int y = 2; float fx; float fy;

        /* ALGORITMA */
        System.out.print ("x/y (format integer) = "+ x/y);
        System.out.print ("\nx/y (format float) = "+ x/y);
        /* Supaya hasilnya tidak nol */
        fx=x;
        fy=y;

        System.out.print ("\nx/y (format integer) = "+ fx/fy);
        System.out.print ("\nx/y (format float) = "+fx/fy);
        /* casting */

        System.out.print ("\nfloat(x)/float(y) (format integer) = "+(float)x/(float)y);
        System.out.print ("\nfloat(x)/float(y) (format float) = "+(float)x/(float)y);

        x = 10; y = 3;

        System.out.print ("\nx/y (format integer) = "+ x/y);
        System.out.print ("\nx/y (format float)   = "+ x/y);

    }
    
}