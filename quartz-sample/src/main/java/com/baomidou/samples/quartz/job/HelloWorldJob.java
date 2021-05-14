package com.baomidou.samples.quartz.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

@Slf4j
public class HelloWorldJob extends QuartzJobBean {

    private static int time = 0;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) {
        log.info("Hello world!:" + jobExecutionContext.getJobDetail().getKey() + "-" + (time++));
    }

}
