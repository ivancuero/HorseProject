package operations;

import java.util.ArrayList;

import horse.Horse;

public class HorseOperations {
	private static HorseOperations horseOperation;
	public static HorseOperations getInstance() {
		if(horseOperation == null)
			horseOperation = new HorseOperations();
		return horseOperation;
	}
	
	public void registerHorse(ArrayList<Horse> horses, Horse horse) {
		horses.add(horse);
	}
	
	public void removeHorse(ArrayList<Horse> horses, Horse horse) {
		if(horses.size() == 0) {
			System.out.println("Error: No hay caballos en la lista.");
		} else {
			horses.remove(horse);
		}
	}
	
	public void printHorsesList(ArrayList<Horse> horses) {
		if(horses.size() == 0)
			System.out.println("No hay ningún caballo para mostrar.");
		else {
			for(Horse horse : horses) {
				System.out.println(horse.getName());
			}
		}
	}
	
	public void printHorsesFullInfo(ArrayList<Horse> horses) {
		if(horses.size() == 0)
			System.out.println("No hay ningún caballo para mostrar.");
		else {
			for(Horse horse : horses) {
				System.out.println(horse.toString());
			}
		}
	}
	
	public void getHorseInfo(ArrayList<Horse> horses, int index) {
		System.out.println(horses.get(index).toString());
	}
	
	public void getHorseInfoByName(ArrayList<Horse> horses, String name) {
		boolean horseExists = false;
		for(Horse horse : horses) {
			if(horse.getName().equals(name)) {
				System.out.println(horse.toString());
				horseExists = true;
			}
		}
		if(!horseExists) {
			System.out.println("No hay ningún caballo en la lista con el nombre ingresado.");
		}
	}
	
	public double sellHorseStraw(ArrayList<Horse> horses, int index) {
		Horse horse = horses.get(index);
		System.out.println("¿Está seguro que desea vender el producto del caballo " + horse.getName() +"?");
		String answer = "";
		if(!answer.equals("Y") && !answer.equals("N")) {
			System.out.println("Escoja una opción valida");
		} else if(answer.equals("Y")) {
			System.out.println("¡Producto vendido!");
			return horse.getPrice();
		} else {
			System.out.println("¡Venta cancelada!");
		}
		return 0;
	}
}
