package chapter02;

public class StartRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StreetRacer streetRacer = new StreetRacer();
	    FormulaOne formulaOne = new FormulaOne();
	    Helicopter helicopter = new Helicopter();
	    Jet jet = new Jet();

	    streetRacer.go();
	    formulaOne.go();
	    helicopter.go();
	    jet.go();
	}

}
