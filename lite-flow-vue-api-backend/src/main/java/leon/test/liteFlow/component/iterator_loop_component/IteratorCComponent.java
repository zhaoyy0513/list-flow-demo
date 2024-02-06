package leon.test.liteFlow.component.iterator_loop_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@LiteflowComponent(id = "iterator_c")
public class IteratorCComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("do iterator_c:::,index:{},obj:{}",this.getLoopIndex(),
                this.getCurrLoopObj().toString());
    }
}
