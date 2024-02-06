package leon.test.liteFlow.component.chose2_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "c_cmp",name ="ccmp")
public class CCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("ccmp executed!");
    }
}
