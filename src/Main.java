public class Main {
    public static void main(String[] args) {
        lab2(3);

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
        }
    }
}