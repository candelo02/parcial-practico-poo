import java.util.ArrayList;
import java.util.List;

// Clase para la biblioteca
class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void imprimirInformacionBiblioteca() {
        for (Libro libro : libros) {
            libro.imprimirInformacion();
            System.out.println("-------------");
        }
    }
}
