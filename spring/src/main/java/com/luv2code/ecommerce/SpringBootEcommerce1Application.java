package com.luv2code.ecommerce;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootEcommerce1Application 
//implements CommandLineRunner 
{

//	@Autowired
//    private JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEcommerce1Application.class, args);
    }


 //   @Override
//    public void run(String... args) throws Exception {
//        String sql = "INSERT INTO product (sku, name, description,unit_price, image_url, active, units_in_stock, category_id) VALUES ("+"'BOOK-TECH-1000', 'JavaScript - The Fun Parts', 'Learn JavaScript',100,'assets/images/products/placeholder.png',1,19.99,1)";
//        
//        int rows = jdbcTemplate.update(sql);
//        if (rows > 0) {
//            System.out.println("A new row has been inserted.");
//        }
    	
   // }
}