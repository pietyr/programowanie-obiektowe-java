// Zadanie 2.3
class Uczen{
    String imieINazwisko;
    int wiek;
    double srednia;

    public Uczen(){
        this.imieINazwisko = "Jan Kowalski";
        this.wiek = 25;
        this.srednia = 4.5d;
    }

    public Uczen(String imieINazwisko, int wiek, double srednia) {
        this.imieINazwisko = imieINazwisko;
        this.wiek = wiek;
        this.srednia = srednia;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imieINazwisko='" + imieINazwisko + '\'' +
                ", wiek=" + wiek +
                ", srednia=" + srednia +
                '}';
    }
}