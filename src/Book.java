import java.util.Objects;

public class Book {
    private String title;
    private String Autor;
    int age;
    public Book (String title, String Autor, int age) {
        this.title = title;
        this.Autor = Autor;
        this.age = age;
    }

    public String getTitle (){
        return this.title;
    }
    public String getAutor(){
        return this.Autor;
    }
    public int getAge (){
        return this.age;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public String toString() {
        return "Название книги: " + this.title + " Автор книги: " + this.Autor + " год издания: " +this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getAge() == book.getAge() && getTitle().equals(book.getTitle()) && getAutor().equals(book.getAutor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAutor(), getAge());
    }
}
