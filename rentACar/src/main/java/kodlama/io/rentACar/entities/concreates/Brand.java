package kodlama.io.rentACar.entities.concreates;

public class Brand {

	
	
	
	
	
	
	private int id;
	private String Name;
	
	
	
	

	public Brand() {
		super();
	}

	public Brand(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
