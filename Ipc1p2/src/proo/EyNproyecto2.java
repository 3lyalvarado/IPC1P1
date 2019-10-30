package proo;

import javax.swing.JOptionPane;


public class EyNproyecto2 {

    public static void main(String[] args) { 
      // usuarios.lista_clientes.agregar(0);
       login ventana = new login();
       ventana.setVisible(true);
        /*
        while(true){
          funcionesRegistros fun = new funcionesRegistros();
            String elMenu =JOptionPane.showInputDialog("Menu \n"
            + "1. AGREGAR \n"
            + "2. IMPRIMIR \n"
            + "3. BUSCAR \n"      
            + "4. EDITAR \n" 
            + ". Salir \n"
                    + "");
            switch (elMenu){
            case "1":
        String nombre = JOptionPane.showInputDialog("ingrese su nombre");
        String correo = JOptionPane.showInputDialog("ingrese su correo");
        int tarjeta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una tarjeta"));
        String contraseña = JOptionPane.showInputDialog("ingrese una contraseña"); 
        String usuario = JOptionPane.showInputDialog("ingrese un nombre de usuario");
        
       
        nodoRegistros aux = new nodoRegistros();
        aux.nombre = nombre;
        aux.correo = correo;
        aux.usuario = usuario;
        aux.contraseña = contraseña;
        aux.tarjeta = tarjeta;
        
        
        fun.agregar(aux);
        break;
                case "2":
                    fun.imprimir();
                    break;
                case "3":
                    int tarjetabuscar = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese Tarjeta "));
                    if(fun.buscar(tarjetabuscar))
                        JOptionPane.showMessageDialog(null, " Resgistro existente");
                    else
                         JOptionPane.showMessageDialog(null, " Resgistro no e");
                    break;
                case "4":
                    
                    String logusuario = JOptionPane.showInputDialog("Ingrese usuario");
                    String logcontraseña = JOptionPane.showInputDialog("Ingrese contraseña");
                    if (fun.ingresar(logusuario,logcontraseña)){
                        
                    }
                  
                    
                    /*
                    int tarjetanueva = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese nueva Tarjeta "));
                    
                    if (fun.editar(logusuario , logcontraseña, tarjetanueva))
                    JOptionPane.showMessageDialog(null, "registro modificado");
                    else
                      JOptionPane.showMessageDialog(null, "registro no modificado");
                    break;
*/
                    //default:            
                  //  System.exit(0);
                   // break;
         //   }

            
        
       
        
        
       // }

       
        //Login nF = new Login();
       // nF.setVisible(true);
       //   nF.setResizable(false);
         
          
    }
    
}
