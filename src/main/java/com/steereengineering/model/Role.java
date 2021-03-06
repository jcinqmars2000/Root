package com.steereengineering.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
//@NoArgsConstructor
@Entity
@Table(name = "role")
public class Role {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="role_id")
	private Long id;
	@Column(name="role")
	
	private String role;
	
	public Role(String role) {
		super();
		this.role = role;
	}
}
