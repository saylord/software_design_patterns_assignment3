import entities.component.IComponentBootsOfSpeed;
import entities.concreteComponents.ComponentBootsOfSpeed;
import entities.concreteDecorators.arcaneBoots.DecoratorEnergyBooster;
import entities.concreteDecorators.bootsOfTravel.DecoratorRecipeBootsOfTravel;
import entities.concreteDecorators.phaseBoots.DecoratorBladesOfAttack;
import entities.concreteDecorators.phaseBoots.DecoratorChainmail;
import entities.concreteDecorators.powerTreads.DecoratorBeltOfStrength;
import entities.concreteDecorators.powerTreads.DecoratorGlovesOfHaste;
import entities.concreteDecorators.tranquilBoots.DecoratorRingOfRegen;
import entities.concreteDecorators.tranquilBoots.DecoratorWindLace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {

    private Scanner sc = new Scanner(System.in);

    public void start() {

        System.out.println("Hello, welcome to the Aliya's assignment 3");

        while(true) {

            System.out.println("You can choose one of the given 3 items:");
            System.out.println("1. Phase Boots");
            System.out.println("2. Power Treads");
            System.out.println("3. Arcane Boots");
            System.out.println("4. Boots of Travel");
            System.out.println("5. Tranquil Boots");
            System.out.println("0. Exit");
            System.out.println();

            try {
                System.out.println("Enter option (1-5): ");
                int option = sc.nextInt();
                if (option == 1) {
                    getPhaseBoots();
                } else if (option == 2) {
                    getPowerTreads();
                } else if (option == 3) {
                    getArcaneBoots();
                } else if (option == 4) {
                    getBootsOfTravel();
                } else if (option == 5) {
                    getTranquilBoots();
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!!!");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("=======================================");
        }
    }

    public void getPhaseBoots() {

        IComponentBootsOfSpeed bootsOfSpeed = new DecoratorBladesOfAttack(new DecoratorChainmail(new ComponentBootsOfSpeed()));
        System.out.println("Name of an item: Phase Boots");
        System.out.println("Total cost of an item: " + bootsOfSpeed.cost());

    }

    public void getPowerTreads() {

        IComponentBootsOfSpeed powerTreads = new DecoratorBeltOfStrength(new DecoratorGlovesOfHaste(new ComponentBootsOfSpeed()));
        System.out.println("Name of an item: Power Treads");
        System.out.println("Total cost of an item: " + powerTreads.cost());

    }

    public void getArcaneBoots() {

        IComponentBootsOfSpeed arcaneBoots = new DecoratorEnergyBooster(new ComponentBootsOfSpeed());
        System.out.println("Name of an item: Arcane Boots");
        System.out.println("Total cost of an item: " + arcaneBoots.cost());

    }

    public void getBootsOfTravel() {

        IComponentBootsOfSpeed bootsOfTravel = new DecoratorRecipeBootsOfTravel(new ComponentBootsOfSpeed());
        System.out.println("Name of an item: Boots of Travel");
        System.out.println("Total cost of an item: " + bootsOfTravel.cost());

    }

    public void getTranquilBoots() {

        IComponentBootsOfSpeed tranquilBoots = new DecoratorRingOfRegen(new DecoratorWindLace(new ComponentBootsOfSpeed()));
        System.out.println("Name of an item: Boots of Travel");
        System.out.println("Total cost of an item: " + tranquilBoots.cost());

    }

}
