package paas.unit.task.fsm.strategy.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import paas.unit.task.fsm.strategy.OrderStrategy;

/**
 * @author yiwen.chang
 * @date 2020/2/1
 */
@Slf4j
@Service
public class UnpaidState implements OrderStrategy {

    @Override
    public Object stateChange() {


        return null;
    }

}