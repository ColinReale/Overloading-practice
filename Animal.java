public class Animal {
    private String animalName;
    private boolean isDog;

    public Animal(String animalName, boolean isDog) {
       this.animalName = animalName;
        this.isDog =   isDog;
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(boolean isDog) {
        this.isDog = isDog;
    }

    //    getters
    public String getName() {
        return animalName;
    }
    public boolean getIsDog() {
        return isDog;
    }
    public String toString(){
        return getName() + " is a dog = " + getIsDog();
    }
}
