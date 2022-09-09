
public class CriterioNOT extends Criterio {

	private Criterio c1;
	
	
	public CriterioNOT(Criterio c1) {
		
		this.c1 = c1;
	}


	@Override
	public boolean cumple(ElementoAbstracto e) {
		// TODO Auto-generated method stub
		return !c1.cumple(e);
	}

}
