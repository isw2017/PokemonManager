import java.util.ArrayList;

/**
 * @author Tobias Bak
 *
 */

public class Pokemon {
	public ArrayList<Swap> swaps = new ArrayList<Swap>(); //Tauschliste
	private String name;//Variable die Pokemonname speichert
	private Type type;	//Variable die Pokemontyp speichert
	private int number; //Variable die Pokemonnummer speichert
	private static int nextnumber=1;//globale Variable die nächste Pokemonnummer statisch speichert
	private Trainer trainer;
	public boolean swapAllow;
	
	/**
	 * @return the swapAllow
	 */
	public boolean isSwapAllow() {
		return swapAllow;
	}

	/**
	 * @param swapAllow the swapAllow to set
	 */
	public void setSwapAllow(boolean swapAllow) {
		this.swapAllow = swapAllow;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name; //
		/**Effektiv nutzt man es für mehrere Dinge:
		 * sicherstellen, dass man ein ganzes Feld anspricht wenn es doppelt bennenung gibt
		 * bezug auf das aktuelle Objekt als Ganzes
		 * andere Konstruktoren in eigenem aufrufen
		 */
		}
	

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the trainer
	 */
	public Trainer getTrainer() {
		return trainer;
	}

	/**
	 * @param trainer the trainer to set
	 */
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	/**
	 * @param fortlaufende Nummer eines Pokemons
	 */
	public void setNumber() {
		this.number=nextnumber;
		nextnumber++;
	}


	public Pokemon(String name, Type type) {
		setName(name);
		setType(type);
		setNumber();
		setSwapAllow(true);
		//  Auto-generated constructor stub
	}

	/**
	 * @tostring() Gibt Nr, Name, Typ aufrufenden Pokemons
	 */
	public void tostring() {
		System.out.println("Nr: "+this.number+" Name: "+this.name+" Typ: "+this.type);
	}
	
	

	public static void main(String[] args) {
	
	}

	
}
