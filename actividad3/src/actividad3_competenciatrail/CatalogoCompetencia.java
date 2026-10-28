package actividad3_competenciatrail;

public class CatalogoCompetencia {
    private Categoria[] catalogoCategorias;
    private Competidor[] catalogoCompetidores;
    private int contadorCategorias;
    private int contadorCompetidores;
    private int numeroActualCorredor;

    public CatalogoCompetencia() {
        this.catalogoCategorias = new Categoria[20];
        this.catalogoCompetidores = new Competidor[1000];
        this.contadorCategorias = 0;
        this.contadorCompetidores = 0;
        this.numeroActualCorredor = 1;
    }

    public void agregarCategoria(Categoria categoria) {
        if (this.contadorCategorias < this.catalogoCategorias.length) {
            this.catalogoCategorias[this.contadorCategorias] = categoria;
            this.contadorCategorias++;
        }
    }

    public void eliminarCategoria(Categoria categoria) {
        boolean encontrado = false;
        for (int i = 0; i < this.contadorCategorias && !encontrado; i++) {
            if (this.catalogoCategorias[i] == categoria) {
                this.catalogoCategorias[i] = null;
                for (int j = i; j < this.contadorCategorias - 1; j++) {
                    this.catalogoCategorias[j] = this.catalogoCategorias[j + 1];
                }
                this.catalogoCategorias[this.contadorCategorias - 1] = null;
                this.contadorCategorias--;
                encontrado = true;
            }
        }
    }

    public void agregarCompetidor(Competidor competidor) {
        if (this.contadorCompetidores < this.catalogoCompetidores.length) {
            competidor.asignarNumero(this.numeroActualCorredor);
            this.numeroActualCorredor++;
            this.catalogoCompetidores[this.contadorCompetidores] = competidor;
            this.contadorCompetidores++;
        }
    }

    public void eliminarCompetidor(Competidor competidor) {
        boolean encontrado = false;
        for (int i = 0; i < this.contadorCompetidores && !encontrado; i++) {
            if (this.catalogoCompetidores[i] == competidor) {
                this.catalogoCompetidores[i] = null;
                for (int j = i; j < this.contadorCompetidores - 1; j++) {
                    this.catalogoCompetidores[j] = this.catalogoCompetidores[j + 1];
                }
                this.catalogoCompetidores[this.contadorCompetidores - 1] = null;
                this.contadorCompetidores--;
                encontrado = true;
            }
        }
    }
}