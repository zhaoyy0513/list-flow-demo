package leon.test.liteFlow.component.iterator_loop_component;

import cn.hutool.json.JSONUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeBreakComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "iterator_b")
public class IteratorBComponent extends NodeBreakComponent{

    @Override
    public boolean processBreak() throws Exception {
        Object currLoopObj = this.getCurrLoopObj();
        log.info("do iterator_b::{}", JSONUtil.toJsonStr(currLoopObj));
        log.info("do iterator_b::{}",  this.getLoopIndex());
        return this.getLoopIndex() == 1;
    }

}
