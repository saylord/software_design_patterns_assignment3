package entities.concreteDecorators.tranquilBoots;

import entities.baseDecorator.AddDecoratorBootsOfSpeed;
import entities.component.IComponentBootsOfSpeed;

public class DecoratorRingOfRegen extends AddDecoratorBootsOfSpeed {
    public DecoratorRingOfRegen(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costRingOfRegen() {
        return 175;
    }

    @Override
    public int cost(){
        return super.cost() + costRingOfRegen();
    }
}
