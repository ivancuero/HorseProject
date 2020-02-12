package menu;

import java.util.ArrayList;
import java.util.Scanner;

import horse.Horse;
import manager.HorseManager;

@SuppressWarnings("LossyEncoding")
public class MainMenu {
	public static void main(String[] args) {
		ArrayList<Horse> horses = new ArrayList<Horse>();
		double totalSold = 0d;
		int index = 0;
		String menu = HorseManager.getMainMenu();
		String updateMenu = HorseManager.getUpdateMenu();
		System.out.println(menu);
		Scanner entrada = new Scanner(System.in);
		int opcion = entrada.nextInt();
		while(true) {
			switch(opcion) {
			case 1:
				String name = "";
				String race = "";
				double weight = 0d;
				double price = 0d;
				String mainSickness = "";
				String mainMeal = "";
				int pricesWon = 0;
				String fatherName = "";
				String bornCountry = "";
				HorseManager.registerHorse(horses, name, race, weight, price, mainSickness, mainMeal, pricesWon, fatherName, bornCountry);
				break;
			case 2:
				HorseManager.printHorsesList(horses);
				break;
			case 3:
				if(horses.size() == 0) {
					System.out.println("Error: No hay caballos en la lista.");
					break;
				}
				Horse horse = horses.get(index);
				HorseManager.removeHorse(horses, horse);
				break;
			case 4:
				keepUpdating: while(true) {
					System.out.println(updateMenu);
					int selected = 0;
					if(selected == 0)
						break keepUpdating;
					switch(selected) {
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						default:
							break;
					}
				}
				System.out.println("Informacion actualizada con exito!");
				break;
			case 5:
				totalSold += HorseManager.sellHorseStraw(horses, index);
				break;
			case 6:
				if(totalSold > 0)
					System.out.println("Se ha vendido $" + totalSold + " en total.");	
				else
					System.out.println("No se ha vendido producto a�n.");
				break;
			case 0:
				System.out.println("Abandonando aplicacion");
				entrada.close();
				System.exit(0);
				break;
			default:
				System.out.println("Escoja una opcion entre 0 y 13\n");
				break;
			}
			System.out.println(menu);
			opcion = entrada.nextInt();
		}
	}
}
