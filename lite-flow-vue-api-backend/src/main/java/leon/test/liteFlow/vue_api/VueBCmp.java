package leon.test.liteFlow.vue_api;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@LiteflowComponent(id = "vue_b")
public class VueBCmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws Exception {
        log.info("vue_b 执行:{}", LocalDateTimeUtil.formatNormal(LocalDateTime.now()));
        Thread.sleep(1000L);
        return "vue_c";
    }
}
