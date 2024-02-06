package leon.test.liteFlow.rule.chose_combine_s_p_component;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@LiteflowComponent(id = "chose_combine_b")
public class ChoseCombineBCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("chose_combine_b 执行:{}", LocalDateTimeUtil.formatNormal(LocalDateTime.now()));
        Thread.sleep(1000L);
    }
}
