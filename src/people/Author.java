package people;

import enums.Age;
import interfaces.Flying;
import landscapes.CrazyCliffs;

public class Author extends Human implements Flying {
    private final int id;

    public Author(int id) {
        this.id = id;
        this.setAge(Age.UNKNOWN);
    }

    public Author() {
        this.id = 1;
        this.setAge(Age.UNKNOWN);
    }

    @Override
    public void fly() {
        CrazyCliffs cf = new CrazyCliffs();
        System.out.println("Author flies above "+ cf);
    }

    @Override
    public void run(boolean isFast) {}

    @Override
    public boolean equals(Object o) {
        if (this.getClass() == o.getClass())
            return (this.hashCode() == ((Author) o).hashCode());
        return false;
    }

    @Override
    public int hashCode() {
        return  id;
    }

    @Override
    public String toString() {
        return "Author is Male, he can fly";
    }

    @Override
    public void see() {
        System.out.println("Author не смотрит вверх");
    }
}
