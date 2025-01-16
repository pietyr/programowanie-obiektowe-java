public class Lab2 {
    int liczba;
    char znak;
    String tekst;

    public static void metodaStatyczna(){
        for(byte i = 0; i <= 54; i++){
            System.out.println(i);
        }
    }

    public static String sprawdzTrojkat(int bokA, int bokB, int bokC){
        boolean czyIstnieje = ((bokA + bokB) > bokC) && ((bokA + bokC) > bokB) && ((bokB + bokC) > bokA);
        String boki = bokA + "; " + bokB + "; " + bokC;

        if(!czyIstnieje){
            return "Trójkąt o bokach " + boki + " nie istnieje";
        }

        if(bokA == bokB ){
            if(bokB == bokC){
                return "Trójkąt o bokach " + boki + " jest równoboczny";
            }

            return "Trójkąt o bokach " + boki + " jest równoramienny";
        }

        if(bokB == bokC || bokA == bokC){
            return "Trójkąt o bokach " + boki + " jest równoramienny";
        }

        return "Trójkąt o bokach " + boki + " jest różnoboczny";


    }

    public static int[] liczbyPodzielnePrzezX(int x, int dolnyZakres, int gornyZakres){
        // Zakończ metodę, gdy zakres nieprawidłowy
        if(dolnyZakres >= gornyZakres){
            return new int[0];
        }

        // Ilość liczb podzielnych przez x z podanego zakresu w celu ustalenia długości zwracanej tablicy
        int ilosc = Math.floorDiv(gornyZakres, x) - Math.floorDiv((dolnyZakres - 1), x);
        if(ilosc <= 0){
            return new int[0];
        }
        int podzielne[] = new int[ilosc];

        // Znalezienie pierwszej liczby podzielnej
        int liczba = dolnyZakres;
        while(liczba % x != 0){
            liczba++;
        }

        // Wypełnienie tablicy wszystkimi liczbami podzielnymi
        int index = 0;
        while(liczba <= gornyZakres){
            podzielne[index] = liczba;
            liczba += x;
            index++;
        }

        return podzielne;
    }

    public static int[] fibonacci(int n){
        int[] output = new int[n];
        output[0] = 0;
        output[1] = 1;
        int c;
        for(int i = 2; i < n; i++){
            output[i] = output[i - 1] + output[i - 2];
        }
        return output;
    }
}

