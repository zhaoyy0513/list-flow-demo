package leon.test.liteFlow.component.chose2_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import lombok.extern.slf4j.Slf4j;

@LiteflowComponent(id = "a_cmp",name = "acmp")
@Slf4j
public class ACmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws Exception {
        log.info("ACmp executed!");
        // 返回w1 表示表达式中id设置了为w1的分支都会执行，这里是c,d都执行
        // SWITCH(a_cmp).TO(b_cmp,WHEN(c_cmp,d_cmp).id("w1"));
        return "b_cmp";
    }
}
