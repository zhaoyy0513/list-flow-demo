package leon.test.liteFlow.component.if_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeIfComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Leon.Zhao
 * <a href="https://liteflow.cc/pages/cb0b59/">...</a>
 */
@LiteflowComponent(id ="if_a")
@Slf4j
public class IfaComponent extends NodeIfComponent {

    @Override
    public boolean processIf() throws Exception {
        //  IF(if_a,if_b,if_c);
        // 返回true,执行表达式第一个if_b，false，执行第二个if_c
        return true;
    }
}
