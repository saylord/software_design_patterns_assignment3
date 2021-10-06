package entities.concreteDecorators.arcaneBoots;

import entities.baseDecorator.AddDecoratorBootsOfSpeed;
import entities.component.IComponentBootsOfSpeed;

public class DecoratorEnergyBooster extends AddDecoratorBootsOfSpeed {

    public DecoratorEnergyBooster(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costEnergyBooster() {
        return 800;
    }

    @Override
    public int cost(){
        return super.cost() + costEnergyBooster();
    }

}
