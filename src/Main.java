import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        sayHi();
        sayHi();
        Main.sayHi();
//        Math.random();
        sayHiTo("Jurgi");
        sayHiTo("Aurelija");
        Math.round(651.684);
        double pi = simplePI();
        System.out.println(pi);
        System.out.println(simplePI() * simplePI());
        double rnd = Math.random();
        multiplyInts(4,14);
        System.out.println(multiplyInts(94,645));
        System.out.println(multiplyInts(94,645,64));
        belekas("tekstas", 13);
        belekas(13, "tekstas");
        belekas("=)",4);

        drawSquare(5,20);
        drawSquare(4,6);
        drawSquare(20,3);
        int rndNum = rnd(3,10);
        sum(5, 10);

        System.out.println(PISq());*/



        System.out.println("-------------l1----------------");

        sumNr(2,7);

        System.out.println("-------------l2----------------");

        System.out.println(PISq());

        System.out.println("-------------l3----------------");

        System.out.println(funkc(7,4));

        System.out.println("-------------l4----------------");

        System.out.println(cycle(5)); //[] - klaida ar sąlyga masyvui?

        System.out.println("-------------l5----------------");
        random5Nr(1); // grąžina, bet nepavyko grąžinti neįrašant skaičiaus, kaip antroje užduotyje.
        //užduotis prašo return.








    }
    /*
    public static void sum (int a, int b){
        System.out.println(a+b);
    }
    public static int rnd (int min, int max){
        return min + (int) (Math.random() * (max - min + 1));
    }
    public static void drawSquare(int x, int y){
        for (int i = 0; i < y; i++) {
            for (int a = 0; a < x; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void belekas ( int num, String text){
        System.out.println(num + text);
    }
    public static void belekas (String text, int num){
        System.out.println(text + num);
    }

    public static int multiplyInts (int a, int b){
        return  a * b;
    }

    public static int multiplyInts (int a, int b, int c){
        return  a * b * c;
    }
    public static double simplePI(){
        return 3.14;
    }

    public static void sayHi(){
        System.out.println("alio valio!");
    }

    public static void sayHiTo(String name){
        System.out.println("labas, " + name);
    }*/


    //FUNKCIJOS------------------------------
    //l
    public static void sumNr (int a, int b){
        System.out.println(a+b);
    }
    //l2
    public static double PISq () {
        return 9.8596;
    }
    //l3
    public static int funkc (int a, int b){
        return a*b;
    }
    //l4
    public  static int cycle (int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
        return num;
    }
    //l5
    public static int random5Nr (int rnd) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.println(numbers[i]);
        }
        return rnd;
    }





















}