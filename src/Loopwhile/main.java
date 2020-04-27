package Loopwhile;

public class main {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 220;

        System.out.println("isi gelas sekarang : " + isiGelas + "ml");
        System.out.println("isi gelas ketika penuh : " + penuh + "ml");

        while (isiGelas != penuh) {
            isiGelas++;
            System.out.println("sedang mengsi gelas...");
            System.out.println("isi gelas sekaran : " + isiGelas + "ml");
        }

        System.out.println("Finale: isi gelas sekarang :" + isiGelas + "ml");
    }
}