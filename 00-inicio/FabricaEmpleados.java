public class FabricaEmpleados {
    public static Empleado crearEmpleado(String tipo, String nombre, double valorHora, double horasTrabajadas) {
        if (tipo == null) {
            return null;
        }
        switch (tipo.toLowerCase()) {
            case "fijo":
                return new EmpleadoFijo(nombre, valorHora);
            case "horas":
                return new EmpleadoPorHoras(nombre, horasTrabajadas, valorHora);
            case "comision":
                return new EmpleadoPorComision(nombre, valorHora, horasTrabajadas);
            case "contratista":
                return new Contratista(nombre, valorHora);
            case "practicante":
                return new Practicante(nombre, valorHora);
            default:
                throw new IllegalArgumentException("Tipo de empleado desconocido: " + tipo);
        }
    }
}
