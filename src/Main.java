public class Main {
    public static void main(String[] args) {
        lab2(8);

    }

    public static void lab2(int numerZadania){
        switch (numerZadania){
            case 1:
                // Zadanie 2.1
                Lab2 inicjalizacja = new Lab2();
                System.out.println("liczba = " + inicjalizacja.liczba);
                System.out.println("znak = " + inicjalizacja.znak);
                System.out.println("tekst = " + inicjalizacja.tekst);
                break;
            case 2:
                // Zadanie 2.2
                for(int i = 0; i <= 54; i++){
                    System.out.println(i);
                }
            case 3:
                Uczen[] uczniowie = {
                  new Uczen(),
                  new Uczen("Sławomir Nowak", 28, 5.0d),
                        new Uczen("Andrzej Kowalski", 40, 3.0d),
                };

                for(Uczen uczen : uczniowie){
                    System.out.println(uczen.toString());
                }
                break;
            case 6:
                // Równoboczne
                System.out.println(Lab2.sprawdzTrojkat(5,5,5));
                System.out.println(Lab2.sprawdzTrojkat(10,10,10));

                // Równoramienne
                System.out.println(Lab2.sprawdzTrojkat(7,7,5));
                System.out.println(Lab2.sprawdzTrojkat(9,5,9));

                // Różnoboczne
                System.out.println(Lab2.sprawdzTrojkat(6,7,8));
                System.out.println(Lab2.sprawdzTrojkat(9,10,11));

                // Nie istnieje
                System.out.println(Lab2.sprawdzTrojkat(1,2,3));
                System.out.println(Lab2.sprawdzTrojkat(4,10,5));
                break;
            case 7:
                int[] podzielne = Lab2.liczbyPodzielnePrzezX(13, 11,111);
                System.out.println("Liczby podzielne przez 13 z zakresu <11; 111>:");
                for(int liczba : podzielne){
                    System.out.println(liczba);
                }
                break;
            case 8:
                int[] fibo = Lab2.fibonacci(20);
                System.out.println("Pierwsze 20 elementów ciągu Fibonacciego:");
                String ciag = "";
                for(int liczba : fibo){
                    ciag += (" " + liczba);
                }
                System.out.println(ciag);
        }
    }
}