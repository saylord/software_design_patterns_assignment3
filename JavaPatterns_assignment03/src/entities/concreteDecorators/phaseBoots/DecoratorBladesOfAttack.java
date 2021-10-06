package entities.concreteDecorators.phaseBoots;

import entities.baseDecorator.AddDecoratorBootsOfSpeed;
import entities.component.IComponentBootsOfSpeed;
import entities.concreteComponents.ComponentBootsOfSpeed;

public class DecoratorBladesOfAttack extends AddDecoratorBootsOfSpeed {

    public DecoratorBladesOfAttack(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costBladesOfAttack() {
        return 450;
    }

    @Override
    public int cost(){
        return super.cost() + costBladesOfAttack();
    }
}
