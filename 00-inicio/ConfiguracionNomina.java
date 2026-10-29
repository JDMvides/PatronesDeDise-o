public class ConfiguracionNomina {
    private static ConfiguracionNomina instancia;
    private double valorImpuesto;

    // Constructor privado
    private ConfiguracionNomina() {
        this.valorImpuesto = 0.16;
    }

    // Método estático para obtener la única instancia
    public static ConfiguracionNomina getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionNomina();
        }
        return instancia;
    }

    public double getValorImpuesto() {
        return valorImpuesto;
    }

    public void setValorImpuesto(double valorImpuesto) {
        this.valorImpuesto = valorImpuesto;
    }
}

