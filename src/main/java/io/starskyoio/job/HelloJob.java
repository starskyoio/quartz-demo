package io.starskyoio.job;

import cn.hutool.core.date.DateUtil;
import io.starskyoio.job.base.BaseJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;

/**
 * <p>
 * Hello Job
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-26 13:22
 */
@Slf4j
@DisallowConcurrentExecution
public class HelloJob implements BaseJob {

    @Override
    public void execute(JobExecutionContext context) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.error("Hello Job 执行时间: {}", DateUtil.now());
    }
}
