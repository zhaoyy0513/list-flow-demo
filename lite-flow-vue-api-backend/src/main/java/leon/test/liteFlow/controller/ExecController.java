package leon.test.liteFlow.controller;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.map.MapUtil;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import com.yomahub.liteflow.slot.DefaultContext;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import leon.test.liteFlow.dto.SwichParam;
import leon.test.liteFlow.dto.SwitchDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Leon.Zhao
 * <a href="https://www.cnblogs.com/manastudent/p/16224690.html">...</a>
 */
@Api(tags = "exec")
@Slf4j
@RestController
@RequestMapping("/exec")
@RequiredArgsConstructor
public class ExecController {

    private final FlowExecutor flowExecutor;

    @GetMapping("/do/{chain}")
    @ApiOperation(value = "do no param", notes = "do chain no param")
    public void doTargetRule(@PathVariable(value = "chain") String chain) {
        LiteflowResponse liteflowResponse = flowExecutor.execute2Resp(chain);
    }

    @PostMapping("/do")
    @ApiOperation(value = "do with param", notes = "do chain with param")
    public void execWithParam(@RequestBody SwitchDto param) {
        LiteflowResponse liteflowResponse = flowExecutor.execute2Resp(param.getChainName(),
                param.getParam(), SwichParam.class);
    }

    @GetMapping("/do/iterator/{chain}")
    @ApiOperation(value = "do iterator with param", notes = "do chain with param")
    public void doIteratorChain(@PathVariable(value = "chain") String chain) {
        if ("iteratorLoopChain1".equals(chain)) {
            // 最简单的情况,这里在出
            List<String> list = ListUtil.toList("a", "b", "c");
            LiteflowResponse response = flowExecutor.execute2Resp("iteratorLoopChain1", list);
            DefaultContext context = response.getFirstContextBean();
            String str = context.getData("test");
            log.info(str);
        } else if ("iteratorLoopChain2".equals(chain)) {
            Map<String, Object> map1 = MapUtil.of("age", 25);
            Map<String, Object> map2 = MapUtil.of("name", "leon");
            Map<String, Object> map3 = MapUtil.of("sex", "male");
            // 迭代器带break
            List<Map<String, Object>> list = ListUtil.toList(map1, map2, map3);
            LiteflowResponse response = flowExecutor.execute2Resp("iteratorLoopChain2", list);
            DefaultContext context = response.getFirstContextBean();
            log.info(context.getData("test")+"");
        } else if ("iteratorLoopChain3".equals(chain)) {
            // 多层迭代
            LiteflowResponse response = flowExecutor.execute2Resp("iteratorLoopChain3");
        }

    }


}
