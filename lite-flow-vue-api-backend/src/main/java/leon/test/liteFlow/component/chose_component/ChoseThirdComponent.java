package leon.test.liteFlow.component.chose_component;

import cn.hutool.json.JSONUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import leon.test.liteFlow.dto.SwichParam;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(value = "chose_c",name = "chose-c-component")
public class ChoseThirdComponent extends NodeComponent {

    @Override
    public void process() throws Exception {
        // 获取传递的参数
        SwichParam requestData = this.getRequestData();
        // 接收上个节点传递的数据
        Object choseC = this.getSlot().getPrivateDeliveryData("chose_c");
        log.info("chose_c result is:::{}", choseC);
        log.warn("传递的参数是:::{}", JSONUtil.toJsonStr(requestData));
        log.warn("chose c component , cccccccccccccc");
    }
}