public class Main {
    public static void main(String[] args) {
        // 1. Usando el Patrón Singleton para la configuración
        ConfiguracionNomina config = ConfiguracionNomina.getInstancia();
        System.out.println("Deducciones configuradas: " + config.getDeducciones());

        GestorNomina gestor = new GestorNomina();

        // 2. Usando el Patrón Factory Method para instanciar empleados
        Empleado emp1 = FabricaEmpleados.crearEmpleado("fijo", "Ana Pérez", 3000.0, 0);
        Empleado emp2 = FabricaEmpleados.crearEmpleado("horas", "Carlos Gómez", 20.0, 160);

        gestor.agregarEmpleado(emp1);
        gestor.agregarEmpleado(emp2);

        gestor.procesarNomina();
    }
}
