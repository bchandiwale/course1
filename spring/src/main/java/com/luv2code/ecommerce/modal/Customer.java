package com.luv2code.ecommerce.modal;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_Name")
    private String firstName;

    @Column(name = "last_Name")
    private String lastName;

    @Column(name = "email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    @OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
    private Set<Order> orders =new HashSet<>();
    
    public void add(Order order) {
    	
    	if(order!=null) {
    		
    		if(orders==null) {
    			orders=new HashSet<>();
    		}
    		
    		orders.add(order);
    		order.setCustomer(this);
    	}
    }
}
