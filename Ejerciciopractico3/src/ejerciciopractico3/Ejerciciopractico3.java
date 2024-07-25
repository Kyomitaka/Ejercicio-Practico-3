package ejerciciopractico3;

import javax.swing.JOptionPane;

public class Ejerciciopractico3 {

    public static void main(String[] args) {
        // Crear una instancia de Bodeguero
        Bodeguero bodeguero = new Bodeguero(0, "", 0, "", 0, "", 0, "", null, 0, "", 0, "");

        // Obtener los datos utilizando JOptionPane
        String lectura = JOptionPane.showInputDialog("Ingrese el codigo del producto: ");
        int codigo_producto = Integer.parseInt(lectura);
        bodeguero.setCodigo_producto(codigo_producto);

        String nombre_producto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
        bodeguero.setNombre_producto(nombre_producto);

        String nombre_empleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
        bodeguero.setNombre_empleado(nombre_empleado);

        String lectura1 = JOptionPane.showInputDialog("Ingrese la cedula del empleado: ");
        int cedula_empleado = Integer.parseInt(lectura1);
        bodeguero.setCedula_empleado(cedula_empleado);

        String lectura2 = JOptionPane.showInputDialog("Ingrese la cantidad de productos que desea ingresar: ");
        int cantidad_producto = Integer.parseInt(lectura2);
        bodeguero.setCantidad_producto(cantidad_producto);

        String lectura3 = JOptionPane.showInputDialog("Ingrese el precio del producto: ");
        int precio_producto = Integer.parseInt(lectura3);
        bodeguero.setPrecio_producto(precio_producto);

        // Ahora puedes utilizar el objeto bodeguero como lo necesites
        // Por ejemplo, imprimir los datos ingresados:
        System.out.println("Datos ingresados:");
        System.out.println("Código del producto: " + bodeguero.getCodigo_producto());
        System.out.println("Nombre del producto: " + bodeguero.getNombre_producto());
        System.out.println("Nombre del empleado: " + bodeguero.getNombre_empleado());
        System.out.println("Cédula del empleado: " + bodeguero.getCedula_empleado());
        System.out.println("Cantidad de productos: " + bodeguero.getCantidad_producto());
        System.out.println("Precio del producto: " + bodeguero.getPrecio_producto());
    }
}
