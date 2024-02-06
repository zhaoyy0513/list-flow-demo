package leon.test.liteFlow.rule.serial_component;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "serial_a")
public class SerialACmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        Thread.sleep(200L);
        log.info("do serial_a logic:::{}", LocalDateTimeUtil.now());
    }

}
