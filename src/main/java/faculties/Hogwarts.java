package faculties;

public abstract class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgression;

    public Hogwarts(String name, int powerOfMagic, int transgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void bestStudentInHogwarts(Hogwarts hogwarts) {
        int thisStudent = this.getPowerOfMagic() + this.getTransgression();
        int student = hogwarts.getPowerOfMagic() + hogwarts.getTransgression();
        System.out.println((thisStudent > student) ?
                this.getName() + " обладает бОльшей мощностью магии, чем " + hogwarts.getName() :
                hogwarts.getName() + " обладает бОльшей мощностью магии, чем " + this.getName());
    }

    public String toString() {
        return "имя = " + name +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgression;
    }
}