import java.util.Scanner;

public class SistemaGestionEmpleados {

    private Empleados empleados;

    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = new Empleados(empleados);
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente", 60000);

        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados(empleados);

        Empleados empleadosObj = sistema.getEmpleados();
        empleadosObj.addEmpleado(new Empleado("Jose", "Analista", 55000));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        empleadosObj.aumentarSalario(porcentaje);
        empleadosObj.mostrarEmpleados();

        scanner.close();
    }
}
