package leon.test.liteFlow.component.condition_loop_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeWhileComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Leon.Zhao
 */
@Slf4j
@LiteflowComponent(id = "while_a")
public class WhileAComponent extends NodeWhileComponent {
    @Override
    public boolean processWhile() throws Exception {
        // 如果返回true,则表示会一直执行选择的组件
        log.info("do while_a component");
        return true;
    }
}
