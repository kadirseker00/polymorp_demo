//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fish hamsi = new Fish(0,0);
        System.out.println(hamsi.toString());
        hamsi.speak();
        hamsi.move();
        System.out.println(hamsi.toString());

        Frog kurbaga = new Frog(5,5);
        System.out.println(kurbaga);
        kurbaga.speak();
        kurbaga.move();
        System.out.println(kurbaga);

        Bird karga = new Bird(0,20);

        System.out.println("FOR döngüsü");
        Animal []animals = {hamsi,kurbaga,karga};

        for (Animal animal : animals){
            animal.move();
            System.out.println(animal.toString());
        }

        //Object [] objs = {3, 3.4, "sadfa"};


        //down casting
        System.out.println("upcasting & downcasting");

        Cat siyam = new Cat(4,5);
        Animal hayvan = siyam; // // Upcasting
        hayvan.speak();
        //hayvan.tirmala();
        Animal yeniHayvan = new Cat(6,7); // Upcasting
        Cat yeniKedi = (Cat) yeniHayvan; // Downcasting
        //Cat yenihayvan ...
        double sayi = 2.3;
        int x  = (int) sayi; //type casting

        yeniKedi.speak(); // Çıktı: Miyav
        yeniKedi.tirmala(); // Çıktı: Kedi tırmalıyor

    }
}