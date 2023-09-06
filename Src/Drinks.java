import java.util.Arrays;
import java.util.Scanner;

public class Drinks {
    Scanner scanner = new Scanner(System.in);
    private final double COFFEE_PRICE = 23.0;
    private final double TEA_PRICE = 17.25;
    private final double LEMONADE_PRICE = 15.1;
    private final double MOJITO_PRICE = 30.7;
    private final double MINERAL_WATER_PRICE = 8.0;
    private final double COCA_COLA_PRICE = 13.11;

    static double generalPrice;

    private boolean isOn = true;
    private String drinksChoice;

    private final DrinksMachine[] drinksTypes = DrinksMachine.values();

    private int numberOfCoffee = 0;
    private int numberOfTea = 0;
    private int numberOfLemonade = 0;
    private int numberOfMojito = 0;
    private int numberOfMineralWater = 0;
    private int numberOfCocaCola = 0;

    public void machineMenu() {
        //dialogMenu();

        while (isOn) {
            //System.out.print("Do you want order something else? Yes or No: ");
            //drinksChoice = scanner.nextLine().toUpperCase();
            dialogMenu();
            /*if (drinksChoice.equals("EXIT")) {
                isOn = false;
                System.out.printf("Your purchase price is: %.2f", generalPrice);
                break;
            } else {*/
                DrinksMachine drinks = DrinksMachine.valueOf(drinksChoice);
                switch (drinks) {
                    case COFFEE:
                        System.out.print("How much cups of coffee do you want?: ");
                        numberOfCoffee = scanner.nextInt();
                        generalPrice = numberOfCoffee * COFFEE_PRICE;
                        DrinksMachine.COFFEE.preparingDrink();
                        System.out.println();
                        break;
                    case TEA:
                        System.out.print("How much cups of tea do you want?: ");
                        numberOfTea = scanner.nextInt();
                        generalPrice = numberOfTea * TEA_PRICE;
                        DrinksMachine.TEA.preparingDrink();
                        System.out.println();
                        break;
                    case LEMONADE:
                        System.out.print("How much cups of lemonade do you want?: ");
                        numberOfLemonade = scanner.nextInt();
                        generalPrice = numberOfLemonade * LEMONADE_PRICE;
                        DrinksMachine.LEMONADE.preparingDrink();
                        System.out.println();
                        break;
                    case MOJITO:
                        System.out.print("How much cups of mojito do you want?: ");
                        numberOfMojito = scanner.nextInt();
                        generalPrice = numberOfMojito * MOJITO_PRICE;
                        DrinksMachine.MOJITO.preparingDrink();
                        System.out.println();
                        break;
                    case MINERAL_WATER:
                        System.out.print("How much cups of mineral water do you want?: ");
                        numberOfMineralWater = scanner.nextInt();
                        generalPrice = numberOfMineralWater * MINERAL_WATER_PRICE;
                        DrinksMachine.MINERAL_WATER.preparingDrink();
                        System.out.println();
                        break;
                    case COCA_COLA:
                        System.out.print("How much cups of coca-cola do you want?: ");
                        numberOfCocaCola = scanner.nextInt();
                        generalPrice = numberOfCocaCola * COCA_COLA_PRICE;
                        DrinksMachine.COCA_COLA.preparingDrink();
                        System.out.println();
                        break;
                    default:
                        System.out.println("You choose the wrong type of drink! Try again!");
                        break;
                }
            /*}*/
        }
    }

    public void dialogMenu() {
        boolean isError = false;
        System.out.print("We have the next types of drinks: ");
        /*for (DrinksMachine a : drinksTypes) {
            System.out.print(a + ", ");
        }*/
        System.out.println(Arrays.toString(drinksTypes).replace("[", "").replace("]", ""));
        System.out.print("Please, choose what type of drink do you want or EXIT if you want to go proceed to checkout: ");
        drinksChoice = scanner.nextLine().toUpperCase();
        if (drinksChoice.equals("EXIT")) {
            isOn = false;
            System.out.printf("Your purchase price is: %.2f", generalPrice);
        } else {
            do{
                try {
                    DrinksMachine drinks = DrinksMachine.valueOf(drinksChoice);
                    isError = false;
                } catch ( IllegalArgumentException e ) {
                    isError = true;
                    System.err.println("Wrong input, try again!");
                }
            } while (isError);
        }
    }
}
