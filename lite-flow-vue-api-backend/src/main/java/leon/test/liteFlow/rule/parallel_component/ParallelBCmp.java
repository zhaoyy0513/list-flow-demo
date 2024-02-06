package leon.test.liteFlow.rule.parallel_component;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "parallel_b")
public class ParallelBCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        Thread.sleep(200L);
        log.info("do parallel_b logic:::{}", LocalDateTimeUtil.now());
    }

}
