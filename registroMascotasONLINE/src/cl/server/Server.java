package cl.server;

import cl.cliente.Mascota;
import cl.server.model.Data;
import cl.server.model.Registro;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XZeroMarx
 */
public class Server {

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException, IOException, SQLException {

        Registro rg = new Registro();
        JTable tblRegistro = rg.getTablaRegistros();
        rg.setTitle("Registro de Mascotas");
        rg.setLocationRelativeTo(null);
        rg.setVisible(true);
        Data d = new Data();
        
        
        
        ServerSocket server = new ServerSocket(5000);//se crea el server en el puerto 5000

        System.out.println("Server corriendo en puerto " + 5000);//cuando se conecta el server, queda esperando un cliente que se conecte.

        Socket cliente;
        ObjectInputStream input;
        
        
        while (true) {
            cliente = server.accept(); //queda esperando el ingreso de un cliente
            
            input = new ObjectInputStream(cliente.getInputStream()); //se usará para leer OBJETOS ENTRANTES
            
            
            Object objeto = (Object) input.readObject();;//se crea un objeto auxiliar para el objeto que viene llegando, para a ser un Objeto que pueda ser comparado
            
            if (objeto instanceof Mascota) {//si el Objeto que llega es una instancia de la clase Mascota
                Mascota m = (Mascota) objeto;//el objeto que llega se castea a Mascota
                
                
                    //LLENA DIRECTAMENTE LA TABLA CON VALORES TRAIDOS DEL CLIENTE
                
//                DefaultTableModel tabla = (DefaultTableModel) tblRegistro.getModel();
//                String[] datos = {String.valueOf(m.getNombre()),
//                    String.valueOf(m.getEdad()),
//                    String.valueOf(m.getIdrun()),
//                    String.valueOf(m.getRaza()),
//                    String.valueOf(m.getTamanio()),
//                    String.valueOf(m.getSexo()),
//                    String.valueOf(m.getNombreDuenio()),
//                    String.valueOf(m.getRutDuenio()),
//                    String.valueOf(m.getDireccion())};
//                
//                tabla.addRow(datos);

                    //INSERTA LOS DATOS RESCATADOS DE LA MASCOTA A LA BASE DE DATOS
                    
//                d = new Data();
//                d.crearMascota(m);
                
                //LLENA DIRECTAMENTE LA TABLA CON VALORES DE LA BD
                DefaultTableModel tabla = (DefaultTableModel) tblRegistro.getModel();
                String datos = d.datosMascota(m).toString();
                tabla.addRow(datos.split(","));
                
            }
            
        }

        

    }

}
