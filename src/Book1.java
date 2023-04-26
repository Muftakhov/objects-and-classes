public class Book1 {
    private String title1;
    private String Autor1;
    int age1;
    public Book1 (String title1, String Autor1, int age1) {
        this.title1 = title1;
        this.Autor1 = Autor1;
        this.age1 = age1;
    }
    public String getTitle1 (){
        return this.title1;
    }
    public String getAutor1(){
        return this.Autor1;
    }
    public int getAge1 (){
        return this.age1;
    }
    public void setAge1 (int age1) {
        this.age1 = age1;
    }
}
