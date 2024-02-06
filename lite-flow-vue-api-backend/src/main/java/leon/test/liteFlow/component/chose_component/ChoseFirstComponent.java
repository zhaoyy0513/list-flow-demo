package leon.test.liteFlow.component.chose_component;

import cn.hutool.json.JSONUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import leon.test.liteFlow.dto.SwichParam;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Leon.Zhao
 * <a href="https://www.cnblogs.com/manastudent/p/16224690.html">...</a>
 * <a href="https://liteflow.cc/pages/c0f5d7/#%E6%A0%B9%E6%8D%AEnodeid%E8%BF%9B%E8%A1%8C%E9%80%89%E6%8B%A9">...</a>
 * 选择节点需要继承NodeSwitchComponent
 */
@Slf4j
@LiteflowComponent(value = "chose_a", name = "chose-a-component")
public class ChoseFirstComponent extends NodeSwitchComponent {

    @Override
    public String processSwitch() throws Exception {
        // 获取上下文传递的参数
        SwichParam requestData = this.getRequestData();
        // 传递给下一个节点的参数
        this.getSlot().setPrivateDeliveryData("chose_c", 11111);
        log.warn("传递的参数是:::{}", JSONUtil.toJsonStr(requestData));
        log.info("chose a target component");
        return "chose_b";
    }
}
