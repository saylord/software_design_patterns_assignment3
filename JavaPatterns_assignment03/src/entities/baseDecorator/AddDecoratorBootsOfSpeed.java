package entities.baseDecorator;

import entities.component.IComponentBootsOfSpeed;
import entities.concreteComponents.ComponentBootsOfSpeed;

public class AddDecoratorBootsOfSpeed implements IComponentBootsOfSpeed {

    private IComponentBootsOfSpeed iComponentBootsOfSpeed;

    public AddDecoratorBootsOfSpeed(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        this.iComponentBootsOfSpeed = iComponentBootsOfSpeed;
    }

    @Override
    public int cost() {
        return iComponentBootsOfSpeed.cost();
    }

    @Override
    public String getNotification() {
        return iComponentBootsOfSpeed.getNotification();
    }
}
