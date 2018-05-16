
import java.util.*;
import java.io.*;


public class ModeloArrayListFile extends ModeloArrayList
{
    static final String nombrefichero = "productos.csv";
    
    public ModeloArrayListFile()
    {
       super();
       cargarDesdeFichero();
       
    }
    
    private void salvarAfichero(){
        File fproductos =new File (nombrefichero);
       
        
        try {
       FileOutputStream bytes = new FileOutputStream(fproductos);
       ObjectOutputStream obytes = new ObjectOutputStream(bytes);
       for(Producto p:super.getlista()) {
    	   obytes.writeObject(p);
          }
       bytes.close();
       obytes.close();
        }
        catch ( IOException ex){
        	ex.printStackTrace();
        } 
        }
    
    
    private void cargarDesdeFichero() {
        File fproductos =new File (nombrefichero);
        if ( !fproductos.exists() ){
           return; // No hay datos
        }
        try {
       FileInputStream ficherob = new FileInputStream(fproductos);
       ObjectInputStream ficheroobj=new ObjectInputStream(ficherob);
         
       try {
    	   Producto p =(Producto) ficheroobj.readObject();
    	   while (true) {
    		   super.insertarProducto(p);
    		   p=(Producto) ficheroobj.readObject();
    	   }
       }
       catch(IOException ex) {
    	 ficherob.close();
    	 ficheroobj.close();
       }
       
        }
        catch(IOException ioe) {
        	ioe.printStackTrace();
       }
        catch(ClassNotFoundException ex){
        	ex.printStackTrace();
        }
    }

    public boolean insertarProducto ( Producto p){
      boolean resu = super.insertarProducto(p);
      if ( resu ){
          salvarAfichero();
      }
      return resu;
    }
 
    public boolean borrarProducto ( int codigo ){
      boolean resu = super.borrarProducto(codigo);
      if ( resu ){
          salvarAfichero();
        }
      return resu;
    }
    
    
    public boolean modificarProducto (Producto nuevo){
       boolean resu = super.modificarProducto(nuevo);
       if ( resu ){
           salvarAfichero();
        }
       return (resu);
    }
    
        
} 