package paas.unit.task.fsm.strategy;

/**
 * @author yiwen.chang
 * @date 2020/1/31
 */
public interface OrderStrategy {

    /**
     * 订单状态变更
     */
    Object stateChange();

}
