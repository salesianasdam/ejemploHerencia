package comidaHerencia;

public class ProductoCongelado extends Producto {
    private double tempCongelacionRecomendada;
    
    public ProductoCongelado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        tempCongelacionRecomendada = 0;
    }
    
    public void setTemperaturaRecomendada(double temperatura){
        tempCongelacionRecomendada = temperatura;
    }
    
    public double getTemperaturaRecomendada(){
        return tempCongelacionRecomendada;
    }

	@Override
	public String toString() {
		return "ProductoCongelado [tempCongelacionRecomendada= " + tempCongelacionRecomendada + ", Fecha de caducidad "
				+ getFechaCaducidad() + ", Número de lote " + getNumeroLote();
	}
    
    
}