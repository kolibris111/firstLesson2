
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String vardas = "Rasa";
        String pavarde = "Palubinskaite";
        int gimimoMetai = 1992;
        int metai = 2024;

        System.out.println("=================== uzd1 ======================");
        System.out.println( "As esu " + vardas + " " + pavarde  + " Man yra " + ( metai - gimimoMetai) + " metai.");
        System.out.println("=================== uzd2 ======================");

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

        //* Sukurkite keturis kintamuosius ir Math.random funkcija sugeneruokite jiems
        //reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų. (sprendimui masyvo nenaudoti).//*

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

        //* Naudokite funkcija Math.random(). Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10.
        // Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.   [-4],  (0) //*

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

        //* Įmonė parduoda žvakes po 1 EUR. Perkant daugiau kaip 1000 vienetų taikoma 3 % nuolaida, daugiau kaip 2000
        // vienetų- 4 % nuolaida.
        // Parašykite programą, kuri skaičiuos žvakių kainą ir atspausdintų atsakymą kiek žvakių ir kokia kaina perkama.
        // Žvakių kiekį generuokite ​Math.random()​ funkcija nuo 5 iki 3000. *//


        // git config --global user.name "kolibris111"
        // git config --global user.email "palubinskaitrasele1@gmail.com"






















    }
    }



















