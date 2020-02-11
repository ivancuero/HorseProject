package manager;

import java.util.ArrayList;

import horse.Horse;
import operations.HorseOperations;

public class HorseManager {
	
	public static String getMainMenu() {
		return "\nEscoge una de las siguientes opciones:\n" + 
				  "1. Registrar un nuevo caballo\n" + 
				  "2. Mostrar todos los caballos\n" + 
				  "3. Eliminar un caballo de la lista\n" + 
				  "4. Actualizar la información de algún caballo\n" + 
				  "5. Generar vector mostrando el número mayor en cada columna\n" + 
				  "6. Mostrar el dato con la mayor suma de sus dígitos, junto a su posición\n" + 
				  "7. Mostrar la matriz con cada columna ordenada ascendentemente\n" + 
				  "8. Mostrar el promedio de los datos de la diagonal secundaria de la matriz\n" + 
				  "9. Mostrar la matriz ordenada descendentemente por sus columnas\n" + 
				  "10. Mostrar la matriz triangular superior derecha de la matriz original\n" + 
				  "11. Mostrar la matriz con la primera columna ordenada ascendentemente\n" + 
				  "12. Intercambiar dos columnas\n" + 
				  "13. Mostrar los datos que sean primos, junto a su posición\n" + 
				  "0. Salir\n";
	}
	
	public static String getUpdateMenu() {
		return "";
	}
	
	public static void registerHorse(ArrayList<Horse> horses, String name, String race, double weight, double price, String mainSickness, String mainMeal, int pricesWon, String fatherName, String bornCountry) {
		Horse horse = new Horse();
		horse.setName(name);
		horse.setRace(race);
		horse.setWeight(weight);
		horse.setPrice(price);
		horse.setMainSickness(mainSickness);
		horse.setMainMeal(mainMeal);
		horse.setPricesWon(pricesWon);
		horse.setFatherName(fatherName);
		horse.setBornCountry(bornCountry);
		HorseOperations.getInstance().registerHorse(horses, horse);
	}
	
	public static void removeHorse(ArrayList<Horse> horses, Horse horse) {
		HorseOperations.getInstance().removeHorse(horses, horse);
	}
	
	public static void printHorsesList(ArrayList<Horse> horses) {
		HorseOperations.getInstance().printHorsesList(horses);
	}
	
	public static void updateHorseInfo(Horse horse) {
		
	}
	
	public static double sellHorseStraw(ArrayList<Horse> horses, int index) {
		return HorseOperations.getInstance().sellHorseStraw(horses, index);
	}
}
