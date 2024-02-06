package leon.test.liteFlow.component.for_loop_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeForComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "for_f")
public class ForFComponent extends NodeForComponent {
    @Override
    public int processFor() throws Exception {
        log.info("enter for_f component. loop 10 times");
        // 循环执行的次数
        return 10;
    }
}
