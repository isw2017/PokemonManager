/**
 * 
 */

/**
 * @author Tobias Bak for git
 *
 */
public class Manager {

	/**
	 *	@makeTrainer Methode zur erstellung eines neues Trainers
	 *  @return gibt ein neues Objekt der Klasse Trainer zurück  
	 */

	 public static Trainer makeTrainer(String firstname, String lastname) { 
		return new Trainer(firstname,lastname);
	}
	/**
	 *	@makePokemon Methode zur erstellung eines neues Pokemons
	 *  @return gibt ein neues Objekt der Klasse Pokemon zurück  
	 */	
	 public static Pokemon makePokemon(String name, Type type) {
		return new Pokemon(name, type);
	}
	 /**
	 *	@matchTrainer Methode die ein Pokemon zu einen Trainer zu ordnet  
	 *  @return void Methode verändert den Listenparameter poks des Objekts Trainer (trainer.poks)  
	 */	
	 public static void matchTrainer(Trainer trainer, Pokemon pokemon) {
		trainer.addPokemon(pokemon);
	}
	 /**
		 *	@showPokemon Methode zur ausgabe Pokemons mit Nummer int number vom Objekt Trainer
		 *  @return void Methode liest den Listenparameter poks des Objekts Trainer (trainer.poks)  
		 */
	public static void showPokemon(Trainer trainer, int number) {
		trainer.poks.get(number-1).tostring(); // gibt das Pokemon an der 0ten stelle aus
	}
	
	 /**
	 *	@showAllPokemon Methode zur ausgabe aller Pokemons vom Objekt Trainer
	 *  @return void Methode liest den Listenparameter poks des Objekts Trainer (trainer.poks)  
	 */
	
	public static void showAllPokemon(Trainer trainer) {
		for(int i=0;i<trainer.poks.size();i++) { 
		trainer.poks.get(i).tostring(); 
		}
	}
	
	/**
	 *	@showAllTypePokemon Methode zur ausgabe Pokemons eines typs vom Objekt Trainer
	 *  @return void Methode liest den Listenparameter poks des Objekts Trainer (trainer.poks)  
	 */
	
	public static void showAllTypePokemon(Trainer trainer,Type type) {
		for(int i=0;i<trainer.poks.size();i++) {
			if (trainer.poks.get(i).getType() ==type) {
				trainer.poks.get(i).tostring(); 
				}
			}
		}
	
	/**
	 *	@main 
	 *   
	 */
	
	
	public static void main(String[] args) {
		System.out.println("Trainer werden erstellt");
		Trainer trainer=makeTrainer("Tobi","Bak");
		Trainer trainer2=makeTrainer("Nico","Champ");
		System.out.println("Tobis Pokemons werden hinzugefügt");
		//Tobis Pokemons
		Manager.matchTrainer(trainer,makePokemon("Pikachu",Type.electro));
		Manager.matchTrainer(trainer,makePokemon("Dragoran",Type.dragon));
		//Nicos Pokemons
		System.out.println("Nicos Pokemons werden hinzugefügt");
		Manager.matchTrainer(trainer2,makePokemon("Glurak",Type.fire));
		Manager.matchTrainer(trainer2,makePokemon("Zapdos",Type.electro));
		Manager.matchTrainer(trainer2,makePokemon("Mewtu",Type.psycho));
		// Ausgaben
		System.out.println("Nicos alle Pokemons:");
		showAllPokemon(trainer2);
		System.out.println("Tobis alle Pokemons:");
		showAllPokemon(trainer);
		System.out.println("Tobis alle Pokemons typ dragon:");
		showAllTypePokemon(trainer,Type.dragon);
		System.out.println("Nicos alle Pokemons typ fire:");
		showAllTypePokemon(trainer2,Type.fire);
		System.out.println("Tobis Pokemon nr 1 :  ");
		showPokemon(trainer,1);
		System.out.println("Nicos Pokemon Nr 3:");
		showPokemon(trainer2,1);
	}

}
