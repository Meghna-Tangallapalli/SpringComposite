package com.sbcomposite.pk.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="clients")
@IdClass(ClientPk.class)
public class ClientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Id
	private Long phoneNumber;
	
	@Id
	private String email;
	
	@Column(name ="client_name")
	private String clientname;
		
	@Column(name ="address")
	private String address;
	
	@Column(name ="created_by")
	@CreatedBy
	private int createdBy;
	
	@Column(name ="modified_by")
	@LastModifiedBy
	private int modifiedBy;
	
	@Column(name ="created_date", updatable = false)
	@CreatedDate
	private LocalDateTime createdDate = LocalDateTime.now();
	
	@Column(name ="modified_date")
	@LastModifiedDate
	private LocalDateTime modifiedDate = LocalDateTime.now();
	
}
