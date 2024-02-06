package leon.test.liteFlow.config;

import cn.hutool.core.thread.ThreadFactoryBuilder;
import com.yomahub.liteflow.thread.ExecutorBuilder;

import java.util.concurrent.*;

/**
 * @author Leon.Zhao
 */
public class DefineExecutor implements ExecutorBuilder {
    @Override
    public ExecutorService buildExecutor() {
        int coreSize = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        ThreadFactory threadFactory = ThreadFactoryBuilder.create().setNamePrefix("flow-").build();
        return new ThreadPoolExecutor(coreSize * 2,
                coreSize * 4, 60, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                threadFactory, callerRunsPolicy);
    }
}
