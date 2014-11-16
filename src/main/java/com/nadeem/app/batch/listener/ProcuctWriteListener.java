package com.nadeem.app.batch.listener;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemWriteListener;

import com.nadeem.app.batch.domain.Product;

public class ProcuctWriteListener implements ItemWriteListener<Product> {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Override
	public void beforeWrite(List<? extends Product> items) {
		 LOG.debug("beforeWrite : {}", items);			
	}

	@Override
	public void afterWrite(List<? extends Product> items) {
		 LOG.debug("afterWrite : {}", items);	
	}

	@Override
	public void onWriteError(Exception exception, List<? extends Product> items) {
		LOG.error("onWriteError", exception);			
	}

}
