import entities.baseDecorator.AddDecoratorBootsOfSpeed;
import entities.component.IComponentBootsOfSpeed;
import entities.concreteComponents.ComponentBootsOfSpeed;
import entities.concreteDecorators.phaseBoots.DecoratorBladesOfAttack;
import entities.concreteDecorators.phaseBoots.DecoratorChainmail;

public class Main {

    public static void main(String[] args) {
        MyApplication start = new MyApplication();

        start.start();
    }
}
