package entities.concreteDecorators.powerTreads;

import entities.baseDecorator.AddDecoratorBootsOfSpeed;
import entities.component.IComponentBootsOfSpeed;

public class DecoratorBeltOfStrength extends AddDecoratorBootsOfSpeed {

    public DecoratorBeltOfStrength(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costBeltOfStrength() {
        return 450;
    }

    @Override
    public int cost(){
        return super.cost() + costBeltOfStrength();
    }
}
