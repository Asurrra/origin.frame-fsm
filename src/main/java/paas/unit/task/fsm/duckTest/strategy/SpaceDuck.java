package paas.unit.task.fsm.duckTest.strategy;

import paas.unit.task.fsm.duckTest.strategy.impl.FlyWithRocket;

public class SpaceDuck extends Duck {

	public SpaceDuck() {
		super.setFlyingStragety(new FlyWithRocket());
	}

	@Override
	public void display() {
		System.out.println("我头戴宇航头盔");
	}
	
	@Override
	public void quack(){
		System.out.println("我通过无线电与你通信");
	}

}
