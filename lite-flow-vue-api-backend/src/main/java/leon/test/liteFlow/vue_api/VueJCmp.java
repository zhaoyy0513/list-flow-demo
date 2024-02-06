package leon.test.liteFlow.vue_api;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@LiteflowComponent(id = "vue_j")
public class VueJCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("vue_j 执行:{}", LocalDateTimeUtil.formatNormal(LocalDateTime.now()));
        Thread.sleep(1000L);
    }
}
