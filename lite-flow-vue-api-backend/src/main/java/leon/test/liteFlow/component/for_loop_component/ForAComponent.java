package leon.test.liteFlow.component.for_loop_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "for_a")
public class ForAComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("do for_a component:::{}",this.getLoopIndex());
    }
}
