 import java.util.ArrayList;
import java.util.*;
/**
 * 
 */

/**
 * @author Tobias Bak
 *
 */
public class Swap {

	/**
	 * Klasse zur speicherung der Tauschdaten zwischen den Trainern
	 */
	private Trainer trainer1;
	private Trainer trainer2;
	private Pokemon pokemon1;
	private Pokemon pokemon2;
	private String id="";
	private Date date;
	private Swap swap;
	
	/**
	 * @return the swap
	 */
	public Swap getSwap() {
		return swap;
	}
	/**
	 * @param swap the swap to set
	 */
	public void setSwap(Swap swap) {
		this.swap = swap;
	}




	/**
	 * @param swaps the swaps to set
	 */
	public void setSwaps(ArrayList<Swap> swaps) {
		this.swaps = swaps;
	}

	public ArrayList<Swap> swaps = new ArrayList<Swap>(); //Tauschliste
	
	/**
		*	@matchTrainer Methode die ein Pokemon zu einen Trainer zu ordnet  
		 *  @return void Methode verändert den Listenparameter poks des Objekts Trainer (trainer.poks)  
		*/	
	
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Swap [trainer1=" + trainer1 + ", trainer2=" + trainer2 + ", pokemon1=" + pokemon1 + ", pokemon2="
				+ pokemon2 + ", id=" + id + ", date=" + date + ", swaps=" + swaps + "]";
	}


	private void makeID() {
		setId(toString());
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	


	/**
	 * @return the trainer1
	 */
	public Trainer getTrainer1() {
		return trainer1;
	}


	/**
	 * @param trainer1 the trainer1 to set
	 */
	public void setTrainer1(Trainer trainer1) {
		this.trainer1 = trainer1;
	}


	/**
	 * @return the trainer2
	 */
	public Trainer getTrainer2() {
		return trainer2;
	}


	/**
	 * @param trainer2 the trainer2 to set
	 */
	public void setTrainer2(Trainer trainer2) {
		this.trainer2 = trainer2;
	}


	
	/**
	 * @return the pokemon1
	 */
	public Pokemon getPokemon1() {
		return pokemon1;
	}


	/**
	 * @param pokemon1 the pokemon1 to set
	 */
	public void setPokemon1(Pokemon pokemon1) {
		this.pokemon1 = pokemon1;
	}


	/**
	 * @return the pokemon2
	 */
	public Pokemon getPokemon2() {
		return pokemon2;
	}


	/**
	 * @param pokemon2 the pokemon2 to set
	 */
	public void setPokemon2(Pokemon pokemon2) {
		this.pokemon2 = pokemon2;
	}


	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the swaps
	 */
	public ArrayList<Swap> getSwaps() {
		return swaps;
	}


	/**
	 * @param swaps the swaps to set
	 */
	public void addSwap() {
		this.swaps.add(this.swap);
	}
	public static void execute(Trainer trainer1,Trainer trainer2 , Pokemon pokemon1, Pokemon pokemon2) {
		if(trainer1 == trainer2  ) {
			System.out.println("Gleicher Trainer!");
		} else if(pokemon1.swapAllow==false || pokemon2.swapAllow == false  ){
			System.out.println("Pokemon " + pokemon1.getName()+" oder "+pokemon2.getName()+" ist untauschbar");		
			}else if(pokemon1.getType() == pokemon2.getType() ) {
				System.out.println("Pokemon Typen sind gleich: " + pokemon1.getType());
				}else {
					trainer1.poks.remove(pokemon1);
					trainer2.poks.remove(pokemon2);
					trainer1.poks.add(pokemon2);
					trainer2.poks.add(pokemon1);	
			}
	}
	public Swap(Trainer trainer1, Trainer trainer2, Pokemon pokemon1, Pokemon pokemon2) {
		// constructor
		
		execute( trainer1, trainer2 , pokemon1, pokemon2);
		makeID();
		addSwap();
				
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}