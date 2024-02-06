package leon.test.liteFlow.component.iterator_loop_component;


import com.yomahub.liteflow.core.NodeIteratorComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Slf4j
@Component("it")
public class ITCmp extends NodeIteratorComponent {

    @Override
    public Iterator<?> processIterator() throws Exception {
        List<String> list = this.getRequestData();
        return list.iterator();
    }

}