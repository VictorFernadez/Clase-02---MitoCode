package com.hampcode.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import com.hampcode.business.IProductBusiness;
import com.hampcode.model.entity.Product;
import com.hampcode.model.repository.IProductRepository;

@Named
public class ProductBusiness implements IProductBusiness, Serializable {

	@Inject
	private IProductRepository productRepository;

	@Transactional
	@Override
	public Long insert(Product entity) throws Exception {
		return productRepository.insert(entity);
	}

	@Transactional
	@Override
	public Long update(Product entity) throws Exception {
		return productRepository.update(entity);
	}

	@Override
	public List<Product> getAll() throws Exception {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getOne(Product entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
