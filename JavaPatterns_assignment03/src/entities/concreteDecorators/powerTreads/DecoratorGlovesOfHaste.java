package entities.concreteDecorators.powerTreads;

import entities.baseDecorator.AddDecoratorBootsOfSpeed;
import entities.component.IComponentBootsOfSpeed;

public class DecoratorGlovesOfHaste extends AddDecoratorBootsOfSpeed {

    public DecoratorGlovesOfHaste(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costGlovesOfHaste() {
        return 450;
    }

    @Override
    public int cost(){
        return super.cost() + costGlovesOfHaste();
    }
}
