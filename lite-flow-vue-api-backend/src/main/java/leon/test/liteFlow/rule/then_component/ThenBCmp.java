package leon.test.liteFlow.rule.then_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "then_b")
public class ThenBCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("then_b 执行");
    }
}
