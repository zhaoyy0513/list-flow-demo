package leon.test.liteFlow.rule;

import com.yomahub.liteflow.core.FlowExecutor;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api(tags = "rule control")
@RestController
@RequestMapping("/rule")
@RequiredArgsConstructor
public class RuleController {
    private final FlowExecutor flowExecutor;

    @GetMapping("/do/{chain}")
    public void doChain(@PathVariable(name = "chain") String chainName) {
        log.info("do chain:{}", chainName);
        flowExecutor.execute2Resp(chainName);
    }

}
