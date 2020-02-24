package paas.unit.task.fsm.duckTest.strategy;


import paas.unit.task.fsm.duckTest.strategy.impl.FlyWithWin;

public class MallardDuck extends Duck {

	public MallardDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("我的脖子是绿色的");
	}

}
