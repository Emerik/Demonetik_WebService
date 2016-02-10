package Modele;

public class EtatInit extends EtatTransaction{

	public EtatInit() {
		super(1, "Initiation de la transaction");
	}
	
	public EtatTransaction montant(int montant){
		return new EtatMontant(montant);
	}

}