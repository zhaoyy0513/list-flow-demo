package leon.test.liteFlow.component.chose2_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "d_cmp",name = "dcmp")
public class Dcmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        log.info("dcmp executed");
    }
}
