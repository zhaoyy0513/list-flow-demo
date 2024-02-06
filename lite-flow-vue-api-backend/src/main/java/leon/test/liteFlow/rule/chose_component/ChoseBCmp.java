package leon.test.liteFlow.rule.chose_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "rule_chose_b")
public class ChoseBCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("do rule_chose_b logic.");
    }

}
