import javax.xml.namespace.QName;

public class Main {


    public static void main(String[] args) {

        Book warAndPeace = new Book("Война и мир","Л.Н.Толстой",1869 );
        System.out.println("warAndPeace.title = " + warAndPeace.getTitle());
        System.out.println("warAndPeace.Autor = " +warAndPeace.getTitle());
        System.out.println("warAndPeace.age = " +warAndPeace.getAge() );
        warAndPeace.setAge(1870);
        System.out.println("warAndPeace.getAge() = " + warAndPeace.getAge());
        System.out.println();
        Author author = new Author("Лев","Толстой");
        System.out.println ("author.name = "+ author.getName());
        System.out.println ("author.family = "+ author.getFamily());
    }

}