public class Dogs extends Animals{
    private int legs;
    private String dname;
    private String brred;

    public Dogs(String name, int weight, int height, String sound, String habitat, int legs, String dname, String brred) {
        super(name, weight, height, sound, habitat);
        this.legs = legs;
        this.dname = dname;
        this.brred = brred;
    }

    @Override
    public void sound() {
        System.out.println(getSound());
        super.sound();
    }

    public static void main(String[] args) {
        Animals dog=new Animals("dog",65,5,"bark","terrestial");
        dog.sound();
        Dogs gSpheepheard=new Dogs("german shepheard",68,6,"bhooo","home",4,"kalu","german sheepheard");
        gSpheepheard.sound();
        Dogs chihaua = new Dogs("chi",56,3,"bhuu","home",4,"kuta","chihaua");
        chihaua.sound();
        Animals lab=new Dogs("dog",67,5,"oouuu","outside",4,"sheru","labrador");
        lab.sound();
    }
}
