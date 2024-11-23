package com.Kumar.Ecom.proj;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProduct() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageDate(imageFile.getBytes());
        return repo.save(product);
    }
//
//	public Product updateProduct(int id, Product product, MultipartFile imageFile) {
//		return null;
	

/*
 * 	public Product updateProduct(int id, Product product, MultipartFile imageFile) {
		product.setImageDate((imageFile);
		return repo.save(product);
 */
    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        product.setImageDate(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    /*
     * public List<Product> searchProducts(String keyword) {
        return repo.searchProducts(keyword);
    }
     */
}