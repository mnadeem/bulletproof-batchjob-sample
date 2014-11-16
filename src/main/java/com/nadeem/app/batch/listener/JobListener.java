package com.nadeem.app.batch.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class JobListener implements JobExecutionListener {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		 LOG.debug("beforeJob : {}", jobExecution);
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		LOG.debug("afterJob : {}", jobExecution);
	}

}
