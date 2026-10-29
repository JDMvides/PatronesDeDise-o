public class ConfiguracionNomina {
    private static ConfiguracionNomina instancia;
    private double deducciones;

    // Constructor privado para evitar 'new ConfiguracionNomina()'
    private ConfiguracionNomina() {
        this.deducciones = 0.1; // Valor por defecto
    }

    // Método estático global para acceder a la instancia única
    public static ConfiguracionNomina getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionNomina();
        }
        return instancia;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }
}


