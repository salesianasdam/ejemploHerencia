package comidaHerencia;

public class ProductoRefrigerado extends Producto{
    private String codigoSupervisionAlimentaria;
    
    public ProductoRefrigerado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        codigoSupervisionAlimentaria = "Desconocido";
    }
    
    public void setCodigoSupervisionAlimentaria(String codigo){
        codigoSupervisionAlimentaria = codigo;
    }
    
    public String getCodigoSupervisionAlimentaria(){
        return codigoSupervisionAlimentaria;
    }

	@Override
	public String toString() {
		return "ProductoRefrigerado [codigoSupervisionAlimentaria=" + codigoSupervisionAlimentaria + ", fechaCaducidad="
				+ fechaCaducidad + ", numeroLote=" + numeroLote + "]";
	}
    

}