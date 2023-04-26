import java.util.Objects;

public class Author {
    private String name;
    private String family;
    public Author (String name, String family){
        this.name = name;
        this.family = family;
    }
    public String getName(){
        return this.name;
    }
    public String setFamily (){
        return this.family;
    }
    public String toString() {
        return "Имя " + this.name + " Фамилия " + this.family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return name.equals(author.name) && family.equals(author.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family);
    }
}
