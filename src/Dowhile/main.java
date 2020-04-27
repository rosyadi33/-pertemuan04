package Dowhile;

public class main {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 200;

        System.out.println("isi gelas sekarang : "  + isiGelas + "ml");
        System.out.println("isi gelas ketika penuh :" + penuh + "ml");

        do{
            isiGelas++;
            System.out.println("sedang mengisi...");
            System.out.println("Isi gelas ya sekarang : " + isiGelas + "ml");
        }while (isiGelas != penuh);

        System.out.println("Finale: isi gelas sekarang : " + isiGelas + "ml");
    }
}
