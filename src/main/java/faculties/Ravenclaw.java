package faculties;

import java.util.Objects;

/**
 * Когтевран
 */
public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name,
                     int powerOfMagic,
                     int transgression,
                     int intellect,
                     int wisdom,
                     int wit,
                     int creativity) {
        super(name, powerOfMagic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void bestStudentInFaculty(Ravenclaw ravenclaw) {
        int thisStudent = this.getIntellect() + this.getWisdom() + this.getWit() + this.getCreativity();
        int student = ravenclaw.getIntellect() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreativity();
        System.out.println((thisStudent > student) ?
                this.getName() + " лучший Когтевранец, чем " + ravenclaw.getName() :
                ravenclaw.getName() + " лучший Когтевранец, чем " + this.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return intellect == ravenclaw.intellect && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intellect, wisdom, wit, creativity);
    }

    @Override
    public String toString() {
        return "Когтевран -> " +
                super.toString() +
                " ум = " + intellect +
                ", мудрость = " + wisdom +
                ", остроумие = " + wit +
                ", творчество = " + creativity;
    }
}