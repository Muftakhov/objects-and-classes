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
}
