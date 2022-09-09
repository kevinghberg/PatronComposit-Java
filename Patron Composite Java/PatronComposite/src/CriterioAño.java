

public class CriterioAño extends Criterio {
	private int año;
	
	

	public CriterioAño(int año) {
		this.año = año;
	}


	@Override
	public boolean cumple(ElementoAbstracto e) {
		return e.contieneVideoFecha(año);
	}

}
