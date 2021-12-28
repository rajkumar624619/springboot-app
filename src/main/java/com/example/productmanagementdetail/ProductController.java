package com.example.productmanagementdetail;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	// let create a map to store product detail
	public Map<String, ProductView> productmap = new HashMap<>();

	public ProductController() {
		productmap.put("P101", new ProductView("P101", "galaxy", 250));
		productmap.put("P102", new ProductView("P102", "redmi", 289));
		productmap.put("P103", new ProductView("P103", "samsung", 225));
		productmap.put("P104", new ProductView("P104", "galaxy", 235));
	}

	@GetMapping()
	public String getAllprodetails(Model model) {
		// put products in model object
		model.addAttribute("products", productmap.values());

		return "productlist";

	}

	@GetMapping("/product/add")
	public String getproductform() {
		return "productaddform";
	}

	@PostMapping("/product/adds")
	public String addProductdetail(@ModelAttribute("addProduct") ProductView product, Model model) {

		productmap.put(product.getProductid(), product);

		model.addAttribute("products", productmap.values());

		return "productlist";
	}

	@GetMapping("/product/edit/{productid}")
	public String editproduct(@PathVariable("productid") String pid, Model model) {
		model.addAttribute("editProduct", productmap.get(pid));
		return "producteditform";
	}

	@PostMapping("/product/update")
	public String updateproduct(@ModelAttribute("editProduct") ProductView product, Model model) {
		productmap.put(product.getProductid(), product);
		model.addAttribute("products", productmap.values());
		return "productlist";

	}

	@GetMapping("/product/delete/{productid}")
	public String deleteproduct(@PathVariable("productid") String pid, Model model) {
		productmap.remove(pid);
		model.addAttribute("products", productmap.values());
		return "productlist";
	}

	@GetMapping("/403")
	public String error403() {
		return "403";
	}

}