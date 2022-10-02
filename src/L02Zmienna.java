public class L02Zmienna {
    public static void main(String[] args) {
//        Wynik programu 5 + 3 = 8
        int a = 5;
        int b = 2;
        int c = a + b;
        String name = "Hania";
        System.out.println("Start programu");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a + b)
//        System.out.println(a + " + " + b + " = " + (a + b) );
        System.out.println(a + " + " + b + " = " + c);
        System.out.println("Moje imię to " + name);
        name = "Karol";
        System.out.println("Moje imię to " + name);
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
//        c = a / b;
//        System.out.println(a + " / " + b + " = " + c);


        int x = 5;
        int y = 2;
        float z = (float)x / (float)y; // casting = rzutowanie
        System.out.println(x + " / " + y + " = " + z);


        //range int -> -2147483648 do 2147483647 (maksymalna wartość)
        int liczba = -2147483648;
        System.out.println(liczba);
        liczba = liczba + 1;
        System.out.println(liczba);

//      zmienna double

        float liczba1 = 1234.5123456789012345678901234567890f;
        double liczba2 = 123456.5123456789012345678901234567890d;
        System.out.println(liczba1);
        System.out.println(liczba2);

//      zmienna char

        char ch = 'c';
        System.out.println(ch);



        boolean bl = !false;
        System.out.println("Zmienna bl ma wartosc " + bl);

    }
}
