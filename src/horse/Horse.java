package horse;

public class Horse {
	private String name;
	private String race;
	private double weight;
	private double price;
	private String mainSickness;
	private String mainMeal;
	private int pricesWon;
	private String fatherName;
	private String bornCountry;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMainSickness() {
		return mainSickness;
	}
	public void setMainSickness(String mainSickness) {
		this.mainSickness = mainSickness;
	}
	public String getMainMeal() {
		return mainMeal;
	}
	public void setMainMeal(String mainMeal) {
		this.mainMeal = mainMeal;
	}
	public int getPricesWon() {
		return pricesWon;
	}
	public void setPricesWon(int pricesWon) {
		this.pricesWon = pricesWon;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getBornCountry() {
		return bornCountry;
	}
	public void setBornCountry(String bornCountry) {
		this.bornCountry = bornCountry;
	}
	//Test
	public String toString() {
		return "Nombre: " + name + ", Raza: " + race + ", Peso: " + weight + ", Precio: $" + price + ", Enfermedad principal: " + mainSickness + "\nComida principal: " + mainMeal + ", Cantidad premios ganados: " + pricesWon + ", Nombre del padre: " + fatherName + ", País de Nacimiento: " + bornCountry;
	}
}
