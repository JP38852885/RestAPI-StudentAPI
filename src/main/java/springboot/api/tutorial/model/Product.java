package springboot.api.tutorial.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@Entity
@Table(name = "products")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "created_at", "updated_at" }, allowGetters = true)
public class Product {

	@Id
	@NotNull
	@Size(min=1, message="Product Id should have at least 1 characters")
	@Size(max=5, message="Product Id should not more than 5 characters")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=2, message="Product Name should have at least 2 characters")
	@Size(max=10, message="Product Name should not more than 10 characters")
	@Column(name = "title")
	private String title;

	@Size(min=5, message="description should have atleast 5 characters")
	@Size(max=15, message="description should not more than 15 characters")
	@Column(name = "description")
	private String description;

	@NotNull
	@Size(min=1, message="Price should have atleast 1 characters")
	@Column(name = "price")
	private float price;
	
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date created_at;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updated_at;

	public Product() {
		
    }
 
    public Product(Long id, String title,  String description, float price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}
}
