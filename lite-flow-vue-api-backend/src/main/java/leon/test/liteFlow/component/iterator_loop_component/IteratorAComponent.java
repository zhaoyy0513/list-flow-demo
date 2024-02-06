package leon.test.liteFlow.component.iterator_loop_component;

import cn.hutool.json.JSONUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.slot.DefaultContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Leon.Zhao
 */
@Slf4j
@LiteflowComponent(id = "iterator_a")
public class IteratorAComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        log.info("enter iterator_a loop component.");
        String key = "test";
        DefaultContext context = this.getFirstContextBean();
        if (!context.hasData(key)) {
            // 获取迭代次数
            context.setData(key, this.getLoopIndex() + "");
        } else {
            // 获取当前迭代对象
            Object currLoopObj = this.getCurrLoopObj();
            log.info("obj:{}", JSONUtil.toJsonStr(currLoopObj));
            String str = context.getData(key);
            log.info("str:::{}", str);
            // this.getCurrLoopObj() 获得迭代循环的当前对象
            str += this.getLoopIndex() + "";
            context.setData(key, str);
        }

    }
}
