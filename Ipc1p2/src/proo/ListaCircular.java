package proo;
public class ListaCircular {
  

    nodo primero;
    nodo ultimo;
    
    public ListaCircular(){
        primero = null;
        ultimo = null;
        
    }
    public void ingresarNodo(Producto x){
        nodo nuevo = new nodo();
        nuevo.info = x;
        if (primero ==null){
            primero = nuevo;
            ultimo = primero;
            primero.siguiente = ultimo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo= nuevo;
        }
    }/*
    public void ingresarNodo(int x){
        nodo nuevo = new nodo();
        nuevo.dato = x;
        if (primero ==null){
            primero = nuevo;
            ultimo = primero;
            primero.siguiente = ultimo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo= nuevo;
        }
    }/**
        public void desplegarLista(){
        nodo actual = new nodo();
        actual = primero;
        do{
            System.out.println("Desplegar "+actual.dato);
            actual = actual.siguiente;
        }while(actual != primero);
        
    }**/
    public void desplegarListaVer2(){
        nodo actual = new nodo();
        actual = primero.siguiente;
        do{
      //string = actual.info.nombre+","+actual.info.descripcion+","+actual.info.Identificador+","+actual.info.precio+","+actual.info.existencia+","+actual.info.direccion;
      System.out.println(actual.info.nombre+","+actual.info.descripcion+","+actual.info.Identificador+","+actual.info.precio+","+actual.info.existencia+","+actual.info.direccion);
            actual = actual.siguiente;
        }while(actual != primero);
    }
    
   /* public Producto editar(int id){
        nodo actual = new nodo();
        actual = primero;
        do{
            if(actual.dato == id){
                System.out.println("Ingrese el nuevo dato para este nodo");
                actual.dato = teclado.nextInt();
            }
            actual =actual.siguiente;
        }while(actual!=primero);
        return null;
    }*/
    
    /*
    public Producto editar(int ident, int aplicaroferta){
        nodo actual = new nodo();
        actual = primero.siguiente;
        do{
            if(actual.info.Identificador == ident){
               actual.info.ofertas = aplicaroferta;
               return actual.info;
            }
            actual = actual.siguiente;
        }while(actual != primero);
        return null;
    }
    */
    
    public Producto editar(int nidentificador, String nnombre, String ndescripcion, String ndireccion, int nprecio, int nexistencia){
        nodo actual = new nodo();
        actual = primero.siguiente;
        do{
            if(actual.info.Identificador == nidentificador){
               actual.info.nombre = nnombre;
               actual.info.descripcion = ndescripcion;
               actual.info.direccion = ndireccion;
               actual.info.precio = nprecio;
               actual.info.existencia = nexistencia;   
                return actual.info;
            }
            actual = actual.siguiente;
        }while(actual != primero);
        return null;
    }
    
    
    
    public Producto buscar(int id){
        nodo actual = new nodo();
        actual = primero.siguiente;
        do{
            if(actual.info.Identificador == id){
                return actual.info;
            }
            actual = actual.siguiente;
        }while(actual != primero);
        return null;
    }
    
    /*public void desplegarlistausuariostabla(){
        String[] partes = string.split(",");
        String part1 = partes[0]; 
        String part2 = partes[1];
        String part3 = partes[2];
        String part4 = partes[3];
        String part5 = partes[4];
        System.out.println(part1+part2+part3+part4+part5);            
    }*/
}
