class LibroFisico extends Libro {
    private int numeroPaginas;

    public LibroFisico(String titulo, String autor, int añoPublicacion, int numeroPaginas) {
        super(titulo, autor, añoPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Tipo: Libro Físico");
    }
}
