package persistencia;

import dominio.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Acceso {

	public static Usuario leerUsuario(String nombre) {
            Usuario r=new Usuario("","","");
             try{
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream("usuarios/"+nombre));

                r =(Usuario) ois.readObject();

                ois.close();
            }
            catch (Exception e){
            }
            return r;
	}

	public static void guardarUsuario(Usuario u) {
             try{
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("usuarios/"+u.getNombre()));
                    oos.writeObject(u);
                oos.close();
            } catch (Exception e){
                e.printStackTrace();
            }
	}

}