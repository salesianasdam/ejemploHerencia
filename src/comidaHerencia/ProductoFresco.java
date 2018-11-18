package comidaHerencia;

public class ProductoFresco extends Producto {
    private String fechaEnvasado, paisDeOrigen;
    
    public ProductoFresco(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        fechaEnvasado = "Desconocido";
        paisDeOrigen = "Desconocido";
    }
    
    public void setFechaEnvasado(String fecha){
        fechaEnvasado = fecha;
    }
    
    public void setPaisDeOrigen(String pais){
        paisDeOrigen = pais;
    }
    
    public String getFechaEnvasado(){
        return fechaEnvasado;
    }
    
    public String getPaisDeOrigen(){
        return paisDeOrigen; 
    }

	@Override
	public String toString() {
		return "ProductoFresco [fechaEnvasado= " + fechaEnvasado + ", paisDeOrigen= " + paisDeOrigen + ", fechaCaducidad= "
				+ fechaCaducidad + ", numeroLote= " + numeroLote + "]";
	}
    

}
