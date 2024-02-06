package leon.test.liteFlow.component.if_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Leon.Zhao
 */
@Slf4j
@LiteflowComponent(id = "if_c")
public class IfcComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("if_c executed!");
    }
}
