public class Empleados {

        private Empleado[] lista;
    
        public Empleados(Empleado[] lista) {
            this.lista = lista;
        }
    
        public void aumentarSalario(double porcentaje) {
            for (Empleado empleado : lista) {
                double aumento = empleado.getSalario() * porcentaje / 100;
                empleado.setSalario(empleado.getSalario() + aumento);
            }
        }
    
        public void mostrarEmpleados() {
            System.out.println("Lista de Empleados:");
            for (Empleado empleado : lista) {
                System.out.println("Nombre: " + empleado.getNombre() +
                                   ", Cargo: " + empleado.getCargo() +
                                   ", Salario: " + empleado.getSalario());
            }
        }
    
        public void addEmpleado(Empleado empleado) {
            Empleado[] newLista = new Empleado[lista.length + 1];
            System.arraycopy(lista, 0, newLista, 0, lista.length);
            newLista[lista.length] = empleado;
            lista = newLista;
        }
    
}
