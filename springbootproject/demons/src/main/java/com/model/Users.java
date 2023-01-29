package com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
//	@Nonnull
	private int uid;
	@Column(name = "Ename")
	private String name;
	@Max(30)
	private int age;
	@Min(20000)
	private double salary;
	private String dname;

}
