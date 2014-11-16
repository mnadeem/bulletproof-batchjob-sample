package com.nadeem.app.batch.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemReadListener;

import com.nadeem.app.batch.domain.Product;

public class ProductReadListener implements ItemReadListener<Product> {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void beforeRead() {
		 LOG.debug("beforeRead ");		
	}

	@Override
	public void afterRead(Product item) {
		 LOG.debug("afterRead : {}", item);		
	}

	@Override
	public void onReadError(Exception ex) {
		LOG.error("Error Reading Product", ex);		
	}

}
