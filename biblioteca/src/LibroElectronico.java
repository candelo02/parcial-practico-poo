class LibroElectronico extends Libro {
    private String formato;

    public LibroElectronico(String titulo, String autor, int añoPublicacion, String formato) {
        super(titulo, autor, añoPublicacion);
        this.formato = formato;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Formato: " + formato);
        System.out.println("Tipo: Libro Electrónico");
    }
}