package se.shoppa.suw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import se.shoppa.suw.models.CategoryRepository;
import se.shoppa.suw.models.ProductRepositoy;
import se.shoppa.suw.models.data.Category;
import se.shoppa.suw.models.data.Product;

@Controller
@RequestMapping("/admin/products")
public class AdminProductsContoller {

    @Autowired
    private ProductRepositoy productRepo;


    @Autowired
    private CategoryRepository categoryRepo;

    @GetMapping
	public String index(Model model) {
		List<Product> products = productRepo.findAll();
		// to pass all pages to admin/pages/index
		model.addAttribute("products", products);

		return "admin/products/index";
    }

    @GetMapping("/add")
	public String add(@ModelAttribute Product product, Model model) {
        List<Category> categories = categoryRepo.findAll();
        model.addAttribute("categories", categories);
		
		return "admin/products/add";
	}
    




    
}
