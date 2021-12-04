package com.rms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.criteria.Order;
import javax.validation.constraints.NotEmpty;

import org.checkerframework.checker.index.qual.NonNegative;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;

	@NonNull
	@NotEmpty(message = "'name' field was empty")
	@Column(name = "name", nullable = false)
	private String name;

	@NonNull
	@NotEmpty(message = "'description' field was empty")
	@Column(name = "description", nullable = false)
	private String description;

	@NonNull
	@NotEmpty(message = "'additional' field was empty")
	@Column(name = "additional", nullable = false)
	private String additional;

	@NonNull
	@NotEmpty(message = "'image' field was empty")
	@Column(name = "image", nullable = false)
	private String image;

	@NonNegative
	@Column(name = "price", nullable = false)
	private int price;
	
	
	@ManyToMany(mappedBy = "menu")
	private List<Orders> orders;

}