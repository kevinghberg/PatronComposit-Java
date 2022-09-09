
public class CriterioCantMegusta extends Criterio {
	
	private int cantMegusta;
	

	public CriterioCantMegusta(int cantMegusta) {
		
		this.cantMegusta = cantMegusta;
	}


	@Override
	public boolean cumple(ElementoAbstracto e) {
	return e.getCantidadMeGusta()>this.cantMegusta;
	}

}
