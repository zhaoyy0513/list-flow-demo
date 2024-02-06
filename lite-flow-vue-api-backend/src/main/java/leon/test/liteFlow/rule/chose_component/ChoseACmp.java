package leon.test.liteFlow.rule.chose_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Leon.Zhao
 */
@Slf4j
@LiteflowComponent(id = "rule_chose_a")
public class ChoseACmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws Exception {
        log.info("do rule_chose_a logic.");
        return "rule_chose_e";
    }
}
