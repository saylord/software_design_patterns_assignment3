package entities.concreteDecorators.phaseBoots;

import entities.baseDecorator.AddDecoratorBootsOfSpeed;
import entities.component.IComponentBootsOfSpeed;
import entities.concreteComponents.ComponentBootsOfSpeed;

public class DecoratorChainmail extends AddDecoratorBootsOfSpeed {

    public DecoratorChainmail(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costChainmail() {
        return 550;
    }

    @Override
    public int cost(){
        return super.cost() + costChainmail();
    }
}
