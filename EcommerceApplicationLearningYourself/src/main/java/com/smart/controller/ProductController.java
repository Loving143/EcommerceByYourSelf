package com.smart.controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.smart.entity.Image;
import com.smart.entity.Product;
import com.smart.services.ProductService;

@RestController

public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping(value = { "/addNewProduct" }, consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
	@PreAuthorize("hasRole('Admin')")
	public Product addNewProduct(@RequestPart("product") Product product,
			@RequestPart("imageFile") MultipartFile[] file) {

		try
		{
			Set<Image>images=UploadImage(file);
			product.setImages(images);
			return productService.addNewProduct(product);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return null;
		}
		
		//return productService.addNewProduct(product);
	}

	// The file which we are recieving from the UI can not be saved as it is .We
	// need to Format it.

	public Set<Image> UploadImage(MultipartFile[] multipartFiles) throws IOException {

		Set<Image> imageModels = new HashSet<>();

		for (MultipartFile file : multipartFiles) {
			Image imageModel = new Image(

					file.getOriginalFilename(), file.getContentType(), file.getBytes());

			imageModels.add(imageModel);

		}
		return imageModels;

	}

}
