import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String vardas = "Rasa";
        String pavarde = "Palubinskaite";
        int gimimoMetai = 1992;
        int metai = 2024;

        System.out.println("=================== uzd1 ======================");
        //1.Sukurkite 4 kintamuosius, kurie saugotų jūsų vardą, pavardę, gimimo metus ir šiuos metus (nebūtinai tikrus).
        // Parašykite kodą, kuris pagal gimimo metus paskaičiuotų jūsų amžių ir naudodamas vardo ir pavardės kintamuosius atspausdintų tokį sakinį :
        //"Aš esu Vardenis Pavardenis. Man yra XX metai(ų)".

        System.out.println( "As esu " + vardas + " " + pavarde  + " Man yra " + ( metai - gimimoMetai) + " metai.");

        System.out.println("=================== uzd2 ======================");
        //2.Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 4.
        // Didesnę reikšmę padalinkite iš mažesnės. Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio.

        int num1 = (int) Math.round( Math.random() * 4);
        int num2 = (int) Math.round( Math.random() * 4);

        num1 = 4;
        num2 = 0;

        System.out.println( num1 + " " + num2);

        if ( num1 != 0 && num2 != 0) {
            if (num1 < num2) {
                System.out.println(Math.round((double) num1 / num2 * 100) / 100.0);
            } else {
                System.out.println(Math.round((double) num2 / num1 * 100) / 100.0);
            }
        }else{
            System.out.println("/ 0 no no");
        }

        System.out.println("=================== uzd3 ======================");
        //3.Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines
        // reikšmes nuo 0 iki 25. Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.

        int num01 = (int) Math.round( Math.random() * 25); // 5
        int num02 = (int) Math.round( Math.random() * 25); // 16
        int num03 = (int) Math.round( Math.random() * 25); // 17

        num01 = 5;
        num02 = 16;
        num03 = 17;

        System.out.println( num01 + " " + num02 + " " + num03);

        if ( (num01 > num02 && num02 > num03) ||  (num01 < num02 && num02 < num03)) {
            System.out.println(num02 + " yra vidurinis");
        }
        if ( (num02 > num01 && num01 > num03) ||  (num02 < num01 && num01 < num03)) {
            System.out.println(num01 + " yra vidurinis");
        }
        if ( (num01 > num03 && num03 > num02) ||  (num01 < num03 && num03 < num02)) {
            System.out.println(num03 + " yra vidurinis");
        }
        if ( num01 == num02 || num02 == num03 || num03 == num01 ) {
            System.out.println( " yra vienodi");
        }

        System.out.println("=================== uzd4 ======================");
        //4.	Įvedami skaičiai - a, b, c –kraštinių ilgiai, trys kintamieji (naudojame int) (naudokite Math.random() funkcija nuo 1 iki 10).
        // Parašykite Java programą, kuri nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų.

        int min = 1;
        int max = 10;

        int a = (int) Math.round( Math.random() * 10);
        int b = (int) Math.round( Math.random() * 10);
        int c = (int) Math.round( Math.random() * 10);

        if ( (a+b) > c && (a+c) > c && (b+c) > a) {
            System.out.println( "trikampis");
        } else {
            System.out.println( "ne trikampis");
        }

        System.out.println("=================== uzd5 ======================");
        //Sukurkite keturis kintamuosius ir Math.random funkcija sugeneruokite jiems
        //reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų. (sprendimui masyvo nenaudoti).

        int kint1 = (int) Math.round( Math.random() * 2);
        int kint2 = (int) Math.round( Math.random() * 2);
        int kint3 = (int) Math.round( Math.random() * 2);
        int kint4 = (int) Math.round( Math.random() * 2);

        System.out.println(kint1 + " " + kint2 + " " + kint3 + " " + kint4);

        int kort0 = 0;
        int kort1 = 0;
        int kort2 = 0;

        if ( kint1 == 0 ) {
            kort0 = kort0 + 1;
        }
        if ( kint2 == 0 ) {
            kort0 = kort0 + 1;
        }
        if ( kint3 == 0 ) {
            kort0 = kort0 + 1;
        }
        if ( kint4 == 0 ) {
        kort0 = kort0 + 1;
    }
        System.out.println("nuliu yra" + " " + kort0);

        if ( kint1 == 1 ) {
            kort1 = kort1 + 1;
        }
        if ( kint2 == 1 ) {
            kort1 = kort1 + 1;
        }
        if ( kint3 == 1 ) {
            kort1 = kort1 + 1;
        }
        if ( kint4 == 1 ) {
//            kort1 = kort1 + 1; arba taip
//            kort1 += 1; arba taip
            kort1++;
        }
        System.out.println("vienetu yra" + " " + kort1);

        if ( kint1 == 2 ) {
            kort2 = kort2 + 1;
        }
        if ( kint2 == 2 ) {
            kort2 = kort2 + 1;
        }
        if ( kint3 == 2 ) {
            kort2 = kort2 + 1;
        }
        if ( kint4 == 2 ) {
            kort2 = kort2 + 1;
        }
        System.out.println("dvejetu yra" + " " + kort2);

        System.out.println("=================== uzd6 ======================");
        //Naudokite funkcija Math.random(). Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10.
        // Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.   [-4],  (0)

        min = -10;
        max = 10;

        a = (int) (min + Math.round( Math.random() * (min - max)));

        System.out.println(a);

        if (a < 0 ) {
            System.out.println(" [ " + a + " ] ");
        }
        if (a == 0 ) {
            System.out.println(" lygu nulis ");
        }
        if (a > 0 ) {
            System.out.println(" { " + a + " } ");
        }

        System.out.println("=================== uzd7 ======================");
        //Įmonė parduoda žvakes po 1 EUR. Perkant daugiau kaip 1000 vienetų taikoma 3 % nuolaida, daugiau kaip 2000
        // vienetų- 4 % nuolaida.
        // Parašykite programą, kuri skaičiuos žvakių kainą ir atspausdintų atsakymą kiek žvakių ir kokia kaina perkama.
        // Žvakių kiekį generuokite Math.random() funkcija nuo 5 iki 3000.

        //1 variantas

        Random random = new Random();
        int zvakiuKiekis = random.nextInt(3000 - 5 + 1) + 5; // Generuojamas žvakių kiekis nuo 5 iki 3000

        double kaina = zvakiuKiekis;
        double nuolaida = 0;

        if (zvakiuKiekis > 2000) {
            kaina *= 0.96; // 4% nuolaida
        } else if (zvakiuKiekis > 1000) {
            kaina *= 0.97; // 3% nuolaida
        }

        System.out.println("Perkama " + zvakiuKiekis + " žvakių.");
        System.out.printf("Kaina: %.2f EUR\n", kaina);

        //2 variantas:

        min = 5;
        max = 3000;
        int zvakesKaina = 1;

        int zvakiuKiekis2 = (int) (min + Math.round(Math.random() * (max - min)));

        System.out.println(zvakiuKiekis2);

        if (zvakiuKiekis2 >= 1000 && zvakiuKiekis2 < 2000) {
            System.out.println((zvakesKaina * zvakiuKiekis2) * 0.97);
        }
        if (zvakiuKiekis2 >= 2000) {
            System.out.println((zvakesKaina * zvakiuKiekis2) * 0.96);
        }
        if (zvakiuKiekis2 < 1000) {
            System.out.println("Nuolaidos nera");
        }

        //3 variantas:
        min = 5;
        max = 3000;
        int zvakesKaina3 = 1;
        int nuolaida3 = 0;
        int zvakes = (int) (min + Math.random() * (max - min));

        if (zvakes > 1000 && zvakes <= 2000) {
            nuolaida = 3;
        }
        if (zvakes > 2000) {
            nuolaida = 4;
        }
        System.out.println("Perkamu zvakiu kiekis " + zvakes + ". Kaina:" + zvakes * zvakesKaina3 * ((100 - nuolaida) / 100.0));

        System.out.println("=================== uzd8 ======================");
        //8.Naudokite funkcija Math.random(). Sukurkite tris kintamuosius su atsitiktinėm reikšmėm nuo 0 iki 100.
        // Paskaičiuokite jų aritmetinį vidurkį. Ir aritmetinį vidurkį atmetus tas reikšmes, kurios yra mažesnės nei 10 arba didesnės nei 90.
        // Abu vidurkius atspausdinkite. Rezultatus apvalinkite iki sveiko skaičiaus.

        double skaicius1 = Math.random() * 100;
        double skaicius2 = Math.random() * 100;
        double skaicius3 = Math.random() * 100;

        // Visų trijų skaičių aritmetinis vidurkis
        double vidurkisVisu = (skaicius1 + skaicius2 + skaicius3) / 3;
        int vidurkisVisuApvalintas = (int) Math.round(vidurkisVisu);

        // Vidurkis be skaičių mažesnių nei 10 arba didesnių nei 90
        double suma = 0;
        int kiekis = 0;
        if (skaicius1 >= 10 && skaicius1 <= 90) {
            suma += skaicius1;
            kiekis++;
        }
        if (skaicius2 >= 10 && skaicius2 <= 90) {
            suma += skaicius2;
            kiekis++;
        }
        if (skaicius3 >= 10 && skaicius3 <= 90) {
            suma += skaicius3;
            kiekis++;
        }
        double vidurkisBeKrastutiniu = suma / kiekis;
        int vidurkisBeKrastutiniuApvalintas = (int) Math.round(vidurkisBeKrastutiniu);

        System.out.println("Visų trijų skaičių aritmetinis vidurkis: " + vidurkisVisuApvalintas);
        System.out.println("Vidurkis be skaičių mažesnių nei 10 arba didesnių nei 90: " + vidurkisBeKrastutiniuApvalintas);

        System.out.println("===================PAPILDOMA uzd9 ======================");
        //9.Padarykite skaitmeninį laikrodį, rodantį valandas, minutes ir sekundes.
        // Valandom, minutėm ir sekundėm sugeneruoti panaudokite funkciją Math.random().
        // Sugeneruokite skaičių nuo 0 iki 300. Tai papildomos sekundės. Skaičių pridėkite prie jau sugeneruoto laiko.
        // Atspausdinkite laikrodį prieš ir po sekundžių pridėjimo ir pridedamų sekundžių skaičių.

        System.out.println("1 variantas");

        int valandos = (int) (Math.random() * 24);
        int minutes = (int) (Math.random() * 60);
        int sekundes = (int) (Math.random() * 60);

        // Laiko formatavimas
        String laikasPries = String.format("%02d:%02d:%02d", valandos, minutes, sekundes);

        // Papildomos sekundės
        int papildomosSekundes = (int) (Math.random() * 300);

        // Laiko atnaujinimas
        sekundes += papildomosSekundes;
        if (sekundes >= 60) {
            sekundes -= 60;
            minutes++;
        }
        if (minutes >= 60) {
            minutes -= 60;
            valandos++;
        }

        // Laiko formatavimas
        String laikasPo = String.format("%02d:%02d:%02d", valandos, minutes, sekundes);

        System.out.println("Laikas prieš pridedant sekundžių: " + laikasPries);
        System.out.println("Papildomos sekundės: " + papildomosSekundes);
        System.out.println("Laikas po pridedant sekundžių: " + laikasPo);

        System.out.println("2 variantas");

        int min1 = 0;
        int max1 = 59;
        int valandos1 = (int) (min1 + Math.round(Math.random() * (max1 - min1)));
        int minutes1 = (int) (min1 + Math.round(Math.random() * (max1 - min1)));
        int sekundes1 = (int) (min1 + Math.round(Math.random() * (max1 - min1)));

        String valandos0 = String.format("%02d", valandos);
        String minutes0 = String.format("%02d", minutes);
        String sekundes0 = String.format("%02d", sekundes);

        System.out.println("Random time: " + valandos0 + ":" + minutes0 + ":" + sekundes0);

        //Generuoti papildomas sekundes
        int min2 = 0;
        int max2 = 300;
        int pSekundes = (int) (min2 + Math.round(Math.random() * (max2 - min2)));
        //Sekundes/minutes/valandos pridejus papildomas sekundes pSekundes
        int sekundes2 = (sekundes1 + pSekundes) % 60;
        int minutes2 = (minutes1 + ((sekundes1 + pSekundes) / 60)) % 60;
        int valandos2 = (valandos1 + ((minutes1 + ((sekundes1 + pSekundes) / 60)) / 60)) % 24;
        //Laikas pridejus papildomas sekundes
        String valandos02 = String.format("%02d", valandos2);
        String minutes02 = String.format("%02d", minutes2);
        String sekundes02 = String.format("%02d", sekundes2);

        System.out.println("Time after: " + pSekundes + " seconds: " + valandos02 + ":" + minutes02 + ":" + sekundes02);

        System.out.println("===================PAPILDOMA uzd10 ======================");
        //10.Naudokite funkcija Math.random(). Sugeneruokite 6 kintamuosius su atsitiktinem reikšmėm nuo 1000 iki 9999.
        // Atspausdinkite reikšmes viename strige, išrūšiuotas nuo didžiausios iki mažiausios, atskirtas tarpais.
        // Naudoti ciklų ir masyvų NEGALIMA.

        int skaiciusR1 = (int) (Math.random() * 9000) + 1000;
        int skaiciusR2 = (int) (Math.random() * 9000) + 1000;
        int skaiciusR3 = (int) (Math.random() * 9000) + 1000;
        int skaiciusR4 = (int) (Math.random() * 9000) + 1000;
        int skaiciusR5 = (int) (Math.random() * 9000) + 1000;
        int skaiciusR6 = (int) (Math.random() * 9000) + 1000;

        // Palyginimas ir sukeitimas
        if (skaiciusR1 < skaiciusR2) {
            int temp = skaiciusR1;
            skaiciusR1 = skaiciusR2;
            skaiciusR2 = temp;
        }
        if (skaiciusR2 < skaiciusR3) {
            int temp = skaiciusR2;
            skaiciusR2 = skaiciusR3;
            skaiciusR3 = temp;
        }
        if (skaiciusR3 < skaiciusR4) {
            int temp = skaiciusR3;
            skaiciusR3 = skaiciusR4;
            skaiciusR4 = temp;
        }
        if (skaiciusR4 < skaiciusR5) {
            int temp = skaiciusR4;
            skaiciusR4 = skaiciusR5;
            skaiciusR5 = temp;
        }
        if (skaiciusR5 < skaiciusR6) {
            int temp = skaiciusR5;
            skaiciusR5 = skaiciusR6;
            skaiciusR6 = temp;
        }

        System.out.println(skaiciusR6 + " " + skaiciusR5 + " " + skaiciusR4 + " " + skaiciusR3 + " " + skaiciusR2 + " " + skaiciusR1);
    }




        // git config --global user.name "kolibris111"
        // git config --global user.email "palubinskaitrasele1@gmail.com"






















}



















