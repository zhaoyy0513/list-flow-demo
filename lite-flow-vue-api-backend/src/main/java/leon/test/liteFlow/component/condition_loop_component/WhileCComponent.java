package leon.test.liteFlow.component.condition_loop_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "while_c")
public class WhileCComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        Integer loopIndex = this.getLoopIndex();
        log.info("do while_c component::{}", loopIndex);
        if (loopIndex == 9) {
            this.setIsEnd(true);
        }
    }
}
