package com.luv2code.ecommerce.modal;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="product_category")

public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;


//	public ProductCategory() {
//
//    }

//    public ProductCategory(int id, String categoryName) {
//        super();
//        this.id = id;
//        this.categoryName = categoryName;
//        
//    }
//
//	public List<ProductCategory> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
