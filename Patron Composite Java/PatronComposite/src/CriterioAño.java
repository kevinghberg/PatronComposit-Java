

public class CriterioA�o extends Criterio {
	private int a�o;
	
	

	public CriterioA�o(int a�o) {
		this.a�o = a�o;
	}


	@Override
	public boolean cumple(ElementoAbstracto e) {
		return e.contieneVideoFecha(a�o);
	}

}
