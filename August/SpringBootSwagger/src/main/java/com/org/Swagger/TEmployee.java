package com.org.Swagger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="T_Employee")
@Setter
@Getter
@NoArgsConstructor
public class TEmployee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  id;
	private String name;
	private String location;
	

}
