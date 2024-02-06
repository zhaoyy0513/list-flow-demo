package leon.test.liteFlow.component.chose_component;

import cn.hutool.json.JSONUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import leon.test.liteFlow.dto.SwichParam;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(value = "chose_b",name = "chose-b-component")
public class ChoseSecondComponent extends NodeComponent {

    @Override
    public void process() throws Exception {
        // 获取上下文传递的参数
        SwichParam requestData = this.getRequestData();
        this.getSlot().setPrivateDeliveryData("chose_c", 11111);
        log.warn("传递的参数是:::{}", JSONUtil.toJsonStr(requestData));
        log.warn("chose b component, bbbbbbbbbbbbb");
    }
}