package oraclegeneral;
import controllers.Productos;
import controllers.Usuarios;
import java.util.List;
import java.util.stream.Collectors;
import models.Producto;
import models.Usuario;
import views.Login;
/**
 * Clase que iniciara el sistema y verificara la existencia del usuario de la base de datos que se 
 * utilizara a lo largo de la ejecucion.
 * @author Erik David Zubia Hernandez.
 * @since 16/05/2015
 * @version 1.0
 */
public class InicioSistema {
    
    public static void main(String[] args) {
        if(Conexion.verificarUsuario()==true){
            Login frmLogin = new Login(); 
           frmLogin.setVisible(false);
        }else{
            if((Conexion.creacionUsuario() ==true) && (Conexion.creacionBase()==true)){
            Login frmLogin = new Login();
            frmLogin.setVisible(true);
            }
        }
            }

}
[feature/A3_nueva-funcionalidad 8672634] Validando cambios en InicioSistema.java
 1 file changed, 1 insertion(+), 1 deletion(-)
[feature/A3_nueva-funcionalidad 39dcd0d] Validando cambios en InicioSistema.java
 1 file changed, 2 insertions(+)
