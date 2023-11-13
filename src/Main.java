public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Zoo!");
        /*
        Animal a= new Animal("Stefan", "hej");
        a.speak();
        Orangutang or= new Orangutang("Hanna", "Hello there", 40);


        Owl o= new Owl();
        System.out.println(o.awake);
        o.name= "Lars";
        System.out.println("The owls name is " + o.name);
        o.hoot();
        */


        Barn bo= new Barn();
        bo.hoot();
        bo.speak();
    }
}