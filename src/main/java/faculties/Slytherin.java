package faculties;

import java.util.Objects;

/**
 * Слизерин
 */
public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name,
                     int powerOfMagic,
                     int transgression,
                     int trick,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int thirstForPower) {
        super(name, powerOfMagic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void bestStudentInFaculty(Slytherin slytherin) {
        int thisStudent = this.getTrick() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getThirstForPower();
        int student = slytherin.getTrick() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getThirstForPower();
        System.out.println((thisStudent > student) ?
                this.getName() + " лучший Слизеринец, чем " + slytherin.getName() :
                slytherin.getName() + " лучший Слизеринец, чем " + this.getName());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slytherin slytherin = (Slytherin) o;
        return trick == slytherin.trick && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trick, determination, ambition, resourcefulness, thirstForPower);
    }

    @Override
    public String toString() {
        return "Слизерин -> " +
                super.toString() +
                " хитрость = " + trick +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + thirstForPower;
    }
}