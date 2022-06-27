public class Animals {
    private String name;
    private int weight;
    private int height;
    private String sound;
    private String habitat;

    public Animals(String name, int weight, int height, String sound, String habitat) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.sound = sound;
        this.habitat = habitat;
    }
    public void name(){
        System.out.println(getName());
    }
    public void sound(){
        System.out.println(getSound());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", sound='" + sound + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
