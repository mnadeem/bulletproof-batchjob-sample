package com.nadeem.app.batch.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class StepListener implements StepExecutionListener {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Override
    public void beforeStep(StepExecution stepExecution) {
        LOG.debug("beforeStep : {}", stepExecution);
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        LOG.debug("afterStep: {}", stepExecution);
        return stepExecution.getExitStatus();
    }
}