package faculties;

import java.util.Objects;

/**
 * Пуффендуй
 */
public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name,
                      int powerOfMagic,
                      int transgression,
                      int hardWork,
                      int loyalty,
                      int honesty) {
        super(name, powerOfMagic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void bestStudentInFaculty(Hufflepuff hufflepuff) {
        int thisStudent = this.getHardWork() + this.getLoyalty() + this.getHonesty();
        int student = hufflepuff.getHardWork() + hufflepuff.getLoyalty() + hufflepuff.getHonesty();
        System.out.println((thisStudent > student) ?
                this.getName() + " лучший Пуффендец, чем " + hufflepuff.getName() :
                hufflepuff.getName() + " лучший Пуффендец, чем " + this.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hufflepuff that = (Hufflepuff) o;
        return hardWork == that.hardWork && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hardWork, loyalty, honesty);
    }

    @Override
    public String toString() {
        return "Пуффендуй -> " +
                super.toString() +
                " трудолюбивость = " + hardWork +
                ", верность = " + loyalty +
                ", честность = " + honesty;
    }
}