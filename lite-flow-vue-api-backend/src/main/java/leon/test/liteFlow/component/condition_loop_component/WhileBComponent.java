package leon.test.liteFlow.component.condition_loop_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Leon.Zhao
 */
@Slf4j
@LiteflowComponent(id = "while_b")
public class WhileBComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        Integer loopIndex = this.getLoopIndex();
        log.info("do while_b component::{}", loopIndex);
        if (loopIndex == 10) {
            this.setIsEnd(true);
        }

    }


}
