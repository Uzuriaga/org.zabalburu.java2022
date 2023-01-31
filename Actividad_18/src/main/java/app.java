
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import modelo.Libro;
import servicio.LibroServicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Junior
 */
public class app {

    private static LibroServicio servicio = new LibroServicio();
    private static NumberFormat nfMoneda = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        int opc;
        do {
            String resp = JOptionPane.showInputDialog(
                    "Libreria Pepito\n"
                    + "1.Vender libro\n"
                    + "2.Buscar Tema \n"
                    + "3.Salir\n\n"
                    + "Opción[1-3]"
          );
            opc = Integer.parseInt(resp);
            switch (opc) {
                case 1:
                    venderLibro();
                    break;
                case 2:
                    buscarTema();
                    break;
            }
            
        } while (opc != 3);
    }

    private static void venderLibro() {
        do {
            String titulo = JOptionPane.showInputDialog("Título");
            Libro l = servicio.buscarLibro(titulo);
            if (l == null){
                JOptionPane.showMessageDialog(null, 
                    "No hay ningún libro con ese título",
                    "No Encontrado",
                    JOptionPane.WARNING_MESSAGE);
            } else {
                if (l.getUnidades() > 0){
                    String resp = JOptionPane.showInputDialog(
                        "Libro : " + l.getTitulo() + 
                        "\nTema : " + l.getTema() +
                        "\nPrecio : " + nfMoneda.format(l.getPrecio()) +
                        "\nUnidades : " + l.getUnidades() +
                        "\n\nCuántas unidades desea vender");
                    int unidades = Integer.parseInt(resp);
                    double importe = l.vender(unidades);
                    if (importe == 0){
                        JOptionPane.showMessageDialog(null, 
                        "No hay suficientes unidades",
                        "No Encontrado",
                        JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, 
                            "Importe de la Venta : " + nfMoneda.format(importe));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "Lo siento. No quedan unidades disponibles",
                        "No Stock",
                        JOptionPane.WARNING_MESSAGE);
                }
            }
        } while (JOptionPane.showConfirmDialog(null,
                "Desea Vender Otro Libro",
                "Más Ventas",
                JOptionPane.YES_NO_OPTION)
                ==
                JOptionPane.YES_OPTION);
    }

    private static void buscarTema() {
        do {
            String tema = JOptionPane.showInputDialog("Tema");
            Libro[] librosTema = servicio.getLibrosTema(tema);
            if (librosTema.length == 0){
                JOptionPane.showMessageDialog(null, 
                        "Lo siento. No existe ningún libro de " + tema,
                        "No Encontrado",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                String listado = "<html><h2>Tema : " + tema + "</h2>";
                listado += "<table bgcolor=white><tr><td>Título</td><td>Precio</td><td>Unidades</td></tr>";
                for(Libro l : librosTema){
                    listado += "<tr><td>" + l.getTitulo() + "</td><td>" +
                            nfMoneda.format(l.getPrecio()) + "</td><td>" +
                            l.getUnidades() + "</td></tr>";
                }
                listado +="</table><h3>Se han encontrado " + librosTema.length + " libros del tema</h3></html>";
                JOptionPane.showMessageDialog(null, 
                        listado,
                        "Libros de " + tema,
                        JOptionPane.PLAIN_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null,
                "Buscar Libros de Otro Tema",
                "Otro Tema",
                JOptionPane.YES_NO_OPTION)
                ==
                JOptionPane.YES_OPTION);
    }
}
