package paas.unit.task.fsm.duckTest.strategy.impl;


import paas.unit.task.fsm.duckTest.strategy.FlyingStragety;

public class FlyNoWay implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("我不会飞行！");
	}

}
