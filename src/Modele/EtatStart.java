package Modele;

public class EtatStart extends EtatTransaction{

	public EtatStart() {
		super(0, "En attente de transaction");
	}
	
	public EtatTransaction init(){
		return new EtatInit();
	}

}