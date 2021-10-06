package entities.concreteDecorators.bootsOfTravel;

import entities.baseDecorator.AddDecoratorBootsOfSpeed;
import entities.component.IComponentBootsOfSpeed;

public class DecoratorRecipeBootsOfTravel extends AddDecoratorBootsOfSpeed {
    public DecoratorRecipeBootsOfTravel(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costRecipeBootsOfTravel() {
        return 2000;
    }

    @Override
    public int cost(){
        return super.cost() + costRecipeBootsOfTravel();
    }
}
