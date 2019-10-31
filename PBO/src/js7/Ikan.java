package js7;

/**
 *
 * @author ardan
 */
public class Ikan {
    public static void main(String[] args) {
        Fish a = new Fish();
        Fish b = new Piranha();
        a.swim();
        b.swim();
    }
}

class Piranha extends Fish{
    @Override
    public void swim(){
        System.out.println("Piranha bisa makan daging");
    }
}

class Fish{
    public void swim(){
        System.out.println("Ikan bisa berenang");
}
}
