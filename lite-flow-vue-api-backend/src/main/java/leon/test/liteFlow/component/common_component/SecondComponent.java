package leon.test.liteFlow.component.common_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Leon.Zhao
 */
@Slf4j
@LiteflowComponent(value = "b", name = "secondComponent")
public class SecondComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.warn("second step component has been execute ");
    }
}
