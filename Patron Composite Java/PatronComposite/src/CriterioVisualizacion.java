
public class CriterioVisualizacion extends Criterio {
	
	private int cantVisualizaciones;
	
	

	public CriterioVisualizacion(int cantVisualizaciones) {
		
		this.cantVisualizaciones = cantVisualizaciones;
	}



	@Override
	public boolean cumple(ElementoAbstracto e) {
		return e.getCantVisualizaciones()>cantVisualizaciones;
	}

}
