import java.util.Scanner;

public class Animal {
    /** atribute */
    String name;
    int age= 0;
    String gender;
    String sound;

    /** COnstructor */
    public Animal(){ //Default constructor
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        this.name= scan.nextLine();
        System.out.print("Sound: ");
        this.sound= scan.nextLine();
    }

    public Animal(String name, String sound){
        this.name= name;
        this.sound = sound;
    }

    /** Methods */
    public void ageUp(){
        this.age++;
    }

    public void speak(){

        System.out.println("The Animal sais " + sound);
    }
}
