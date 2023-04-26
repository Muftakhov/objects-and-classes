import javax.xml.namespace.QName;

public class Main{
    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и мир","Л.Н.Толстой",1869 );
        System.out.println("warAndPeace.title = " + warAndPeace.getTitle());
        System.out.println("warAndPeace.Autor = " +warAndPeace.getAutor());
        System.out.println("warAndPeace.age = " +warAndPeace.getAge() );
        warAndPeace.setAge(1870);
        System.out.println("warAndPeace.getAge() = " + warAndPeace.getAge());
        System.out.println();
        Author author = new Author("Лев","Толстой");
        System.out.println ("author.name = "+ author.getName());
        System.out.println ("author.family = "+ author.setFamily());
        System.out.println();
        Book1 Demons = new Book1("Бесы","Ф.М.Достаевский",1872 );
        System.out.println("Demons.getTitle1 = " + Demons.getTitle1());
        System.out.println("Demons.getAutor = " + Demons.getAutor1());
        System.out.println("Demons.getAge1 = " + Demons.getAge1());
        Demons.setAge1(1873);
        System.out.println("Demons.getAge1() = " + Demons.getAge1());;
        Author1 author1 = new Author1("Лев","Толстой");
        System.out.println ("author1.getName = "+ author1.getName1());
        System.out.println ("author1.setFamily1 = "+ author1.setFamily1());
    }






}