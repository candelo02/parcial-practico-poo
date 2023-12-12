public class Main {
    public static void main(String[] args) {
        LibroFisico libroFisico1 = new LibroFisico("Programación en Java", "Juan Pérez", 2020, 300);
        LibroFisico libroFisico2 = new LibroFisico("Introducción a la POO", "Ana Gómez", 2018, 250);
        LibroFisico libroFisico3 = new LibroFisico("Algoritmos y Estructuras de Datos", "Carlos López", 2021, 400);
        LibroFisico libroFisico4 = new LibroFisico("Cien años de soledad", "Gabriel García Márquez", 1967, 500);

        LibroElectronico libroElectronico1 = new LibroElectronico("Python Avanzado", "María Rodríguez", 2019, "EPUB");
        LibroElectronico libroElectronico2 = new LibroElectronico("Machine Learning con TensorFlow", "Pedro Martínez", 2020, "PDF");
        LibroElectronico libroElectronico3 = new LibroElectronico("Desarrollo Web con React", "Luisa Fernández", 2022, "HTML");
        LibroElectronico libroElectronico4 = new LibroElectronico("1984", "George Orwell", 1949, "PDF");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libroFisico1);
        biblioteca.agregarLibro(libroFisico2);
        biblioteca.agregarLibro(libroFisico3);
        biblioteca.agregarLibro(libroFisico4);
        biblioteca.agregarLibro(libroElectronico1);
        biblioteca.agregarLibro(libroElectronico2);
        biblioteca.agregarLibro(libroElectronico3);
        biblioteca.agregarLibro(libroElectronico4);

        biblioteca.imprimirInformacionBiblioteca();
    }
}
