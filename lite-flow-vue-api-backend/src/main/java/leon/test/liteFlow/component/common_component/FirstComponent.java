package leon.test.liteFlow.component.common_component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Leon.Zhao
 * 普通节点 NodeComponent 注解的value属性是组件的名称，name属性是组件的中文名称。
 * 组件的中文名称可以不写，如果不写，则默认使用value的值。
 * 可用于THEN和WHEN关键字中
 */
@Slf4j
@LiteflowComponent(value = "a", name = "firstComponent")
public class FirstComponent extends NodeComponent {


    /*
     *  可覆盖的方法参考
     *  https://liteflow.cc/pages/8486fb/
     *  下面的方法排序是按照顺序执行的
     *
     */



    AtomicInteger index=  new AtomicInteger(0);

    @Override
    public boolean isAccess() {
        // 表示是否进入该节点，可以用于业务参数的预先判断，如果下面注释打开，
        // 就会模拟跳过了a节点，继续执行b,c节点
        //        return 100 > 555;
        log.info("isAccess step:{}",index.getAndIncrement());
        return super.isAccess();
    }

    @Override
    public void beforeProcess() {
        // 流程的前置处理器
        // 在isAccess之后执行
        log.info("beforeProcess step:{}",index.getAndIncrement());
        super.beforeProcess();
    }

    @Override
    public void process() {
        log.warn("first step component has been execute ");
        log.info("process step:{}",index.getAndIncrement());
        log.info("nodeId:{},name:{},displayName:{},step:{}",this.getNodeId(),
                this.getName(),this.getDisplayName(),this.getLoopIndex());

    }

    @Override
    public void onSuccess() throws Exception {
        log.info("onSuccess step:{}",index.getAndIncrement());
        super.onSuccess();
    }

    @Override
    public void afterProcess() {
        log.info("afterProcess step:{}",index.getAndIncrement());
        super.afterProcess();
    }


    @Override
    public void rollback() throws Exception {
        log.info("rollback step:{}",index.getAndIncrement());
        super.rollback();
    }

    @Override
    public void onError(Exception e) throws Exception {
        log.info("onError step:{}",index.getAndIncrement());
        super.onError(e);
    }

    @Override
    public boolean isContinueOnError() {
        // 出错是否继续执行下一个组件，默认是false,假设在process中执行一段错误逻辑
        // 比如int a = 10/0; 如果设置的是false那么就不会执行后面的逻辑]
        // 如果设置的是true，则会执行后面的逻辑
        log.info("isContinueOnError step:{}",index.getAndIncrement());
        return super.isContinueOnError();
    }
}
