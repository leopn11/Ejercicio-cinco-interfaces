package ejercicio5;

public class Main {

    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCrud.findAll();

        cocheCrud.delete();

        cocheCrud.save();

    }
}
