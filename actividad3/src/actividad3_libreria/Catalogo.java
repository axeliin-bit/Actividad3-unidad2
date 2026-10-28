package actividad3_libreria;

public class Catalogo {
    private Libro[] listaLibros;
    private int contadorLibros;

    public Catalogo() {
        this.listaLibros = new Libro[100];
        this.contadorLibros = 0;
    }

    public void agregarLibro(Libro libro) {
        if (this.contadorLibros < this.listaLibros.length) {
            this.listaLibros[this.contadorLibros] = libro;
            this.contadorLibros++;
        } else {
            System.out.println("No se pueden agregar mas libros : Catalogo lleno");
        }
    }

    public void eliminarLibro(Libro libro) {
        boolean encontrado = false;
        for (int i = 0; i < this.contadorLibros && !encontrado; i++) {
            if (this.listaLibros[i] == libro) {
                this.listaLibros[i] = null;
                for (int j = i; j < this.contadorLibros - 1; j++) {
                    this.listaLibros[j] = this.listaLibros[j + 1];
                }
                this.listaLibros[this.contadorLibros - 1] = null;
                this.contadorLibros--;
                encontrado = true;
            }
        }
    }

    public void agregarEjemplares(Libro libro, int cantidad) {
        boolean encontrado = false;
        for (int i = 0; i < this.contadorLibros && !encontrado; i++) {
            if (this.listaLibros[i] == libro) {
                int nuevaCantidad = this.listaLibros[i].getCantidadEjemplares() + cantidad;
                this.listaLibros[i].setCantidadEjemplares(nuevaCantidad);
                encontrado = true;
            }
        }
    }

    public void retirarEjemplares(Libro libro, int cantidad) {
        boolean encontrado = false;
        for (int i = 0; i < this.contadorLibros && !encontrado; i++) {
            if (this.listaLibros[i] == libro) {
                int cantidadActual = this.listaLibros[i].getCantidadEjemplares();
                if (cantidadActual >= cantidad) {
                    this.listaLibros[i].setCantidadEjemplares(cantidadActual - cantidad);
                }
                encontrado = true;
            }
        }
    }
}