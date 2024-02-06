package leon.test.liteFlow.rule.chose_combine_s_p_component;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@LiteflowComponent(id = "chose_combine_c")
public class ChoseCombineCCmp extends NodeSwitchComponent {

    @Override
    public String processSwitch() throws Exception {
        log.info("chose_combine_c 执行:{}", LocalDateTimeUtil.formatNormal(LocalDateTime.now()));;
        Thread.sleep(1000L);
        return "chose_combine_d";
    }
}
