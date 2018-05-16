import java.io.*;
import java.util.*;
public class Producto
{
    // instance variables - replace the example below with your own
    int codigo;    // Código del producto, se utiliza para buscar
    String nombre; // Nombre un texto
    int stock;    // existencia actuales
    int stock_min; // Número mínimo de existencias recomedadas
    float precio;  // Precio

    /**
     * Constructor for objects of class Producto
     * @param nombre 
     * @param codigo 
     */
    
    public Producto (){
        
    }
    
    public Producto(int codigo, String nombre) {
    	this.codigo=codigo;
    	this.nombre=nombre;
    }
    public Producto(int codigo, String nombre,int stock, int stock_min, float precio) {
    	this(codigo, nombre);
    	this.stock=stock;
    	this.stock_min=stock_min;
    	this.precio=precio;
    }

	public int getCodigo (){
        return codigo;
    }
	
	public String getNombre(){
	    return nombre;
	}
	 
	public void setCodigo(int codigo) {
	
		 
	}
	public void setNombre(String nombre) {
		
	}
    
    @Override
    public String toString(){
       return codigo +" : "+ nombre +" : "+ stock+" : "+precio;
    }
    
    public int getStock(){
        return stock;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public int getStock_min(){
        return stock_min;
    }
    
    public void setStock( int valor ){
        stock = valor;
    }
    
    public void setStock_min( int valor ){
        stock_min = valor;
    }
    
    public void setPrecio( float valor ){
        precio = valor;
    }

   
    
  
}
