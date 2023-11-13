public class Owl extends Animal{
    /**Attributes */
    boolean awake;

    /** Constructor */
    public Owl(){
        super();
        awake= false;
    }

    /**Methods*/
    public void wakeUp(){
        awake= true;
    }

    public void hoot(){
        System.out.println(this.name + " Sais hoot hoot");
    }

}
