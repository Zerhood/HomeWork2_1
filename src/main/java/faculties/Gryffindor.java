package faculties;

import java.util.Objects;

/**
 * Гриффиндор
 */
public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name,
                      int powerOfMagic,
                      int transgression,
                      int nobility,
                      int honor,
                      int bravery) {
        super(name, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void bestStudentInFaculty(Gryffindor gryffindor) {
        int thisStudent = this.getNobility() + this.getHonor() + this.getBravery();
        int student = gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery();
        System.out.println((thisStudent > student) ?
                this.getName() + " лучший Гриффиндорец, чем " + gryffindor.getName() :
                gryffindor.getName() + " лучший Гриффиндорец, чем " + this.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return "Гриффиндор -> " +
                super.toString() +
                " благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }
}