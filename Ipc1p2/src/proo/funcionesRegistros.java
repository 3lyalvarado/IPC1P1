package proo;

import javax.swing.JOptionPane;

public class funcionesRegistros {
 public static nodoRegistros raiz;

    public void agregar(nodoRegistros elemento){
        if(raiz == null){
            raiz = new nodoRegistros();
            raiz = elemento;           
        }else{
            nodoRegistros aux = raiz;
            while(aux.sig !=null){
                aux =aux.sig;
                
            }
            aux.sig = elemento;
        }
    }
    public void imprimir(){
        nodoRegistros aux = raiz;
        while(aux!=null){
         //   String string = aux.nombre+","+aux.contraseña+","+aux.tarjeta+","+aux.correo+","+aux.usuario;
            System.out.println(aux.nombre+","+aux.contraseña+","+aux.tarjeta+","+aux.correo+","+aux.usuario);
            aux = aux.sig;       
        }
    }
    public boolean buscar(int tarjeta){
         nodoRegistros aux = raiz;
          while(aux!=null){
              if(aux.tarjeta == tarjeta){
                  return true;
              }
                      aux = aux.sig;
          }
        return false;
    }
    public boolean editar(String nuevonombre, String nuevocorreo, String nuevousuario, String nuevacontraseña,int nuevatarjeta){       
        nodoRegistros aux = raiz;
         while(aux!=null){
              if(aux.usuario.equals(nuevousuario)){
                  aux.tarjeta = nuevatarjeta;
                  aux.nombre = nuevonombre;
                  aux.correo = nuevocorreo;
                  aux.contraseña = nuevacontraseña;              
                  return true;
              }             
                      aux = aux.sig;
          }
         return false;   
    }
    public boolean ingresar(String logusuario, String logcontraseña){
         nodoRegistros aux = raiz;
         while(aux!=null){
              if(aux.usuario.equals(logusuario) && aux.contraseña.equals(logcontraseña)){
                  ishop crear = new ishop(aux.usuario);
                  JOptionPane.showMessageDialog(null,"Bienvenid"+aux.usuario);
                  crear.setVisible(true);
                  return true;
              }
                      aux = aux.sig;
          }
         return false; 
        
    }
        public boolean verificar(String verificarusuario){
         nodoRegistros aux = raiz;
         while(aux!=null){
              if(aux.usuario.equals(verificarusuario) ){
   
                  JOptionPane.showMessageDialog(null,"Nel el usuario "+aux.usuario+" ya existe");
   
                  return true;
              }
                      aux = aux.sig;
          }
         return false; 
        
    }


    
}
