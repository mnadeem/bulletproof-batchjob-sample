/**
 * 
 */
package com.nadeem.app.batch.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.nadeem.app.batch.domain.Product;


public class ProductFieldSetMapper implements FieldSetMapper<Product> {
	
	/*
	 * (non-Javadoc)
	 * @see org.springframework.batch.item.file.mapping.FieldSetMapper#mapFieldSet(org.springframework.batch.item.file.transform.FieldSet)
	 */
	public Product mapFieldSet(FieldSet fieldSet) throws BindException {
		Product product = new Product(fieldSet.readString("NAME"), fieldSet.readBigDecimal("PRICE"), fieldSet.readString("DESCRIPTION"));

		return product;
	}
	
}
