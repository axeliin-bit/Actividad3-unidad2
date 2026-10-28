package actividad3_libreria;

public class MainLibreria {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        String[] autores = {"Miguel de Cervantes"};
        Libro libro = new Libro("Don Quijote", autores, "1ra", "Editorial Z", 10, 1605);

        catalogo.agregarLibro(libro);
        catalogo.agregarEjemplares(libro, 5);
        catalogo.retirarEjemplares(libro, 2);
        catalogo.eliminarLibro(libro);
    }
}