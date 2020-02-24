package paas.unit.task.fsm.duckTest.strategy.impl;


import paas.unit.task.fsm.duckTest.strategy.FlyingStragety;

public class FlyWithRocket implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("用火箭在太空遨游");
	}

}
