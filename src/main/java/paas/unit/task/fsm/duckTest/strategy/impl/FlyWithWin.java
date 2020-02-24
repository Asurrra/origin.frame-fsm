package paas.unit.task.fsm.duckTest.strategy.impl;


import paas.unit.task.fsm.duckTest.strategy.FlyingStragety;

public class FlyWithWin implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("振翅高飞");
	}

}
