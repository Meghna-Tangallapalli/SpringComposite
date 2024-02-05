package com.sbcomposite.pk.Entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class ClientPk implements Serializable{


	private Long id;

	private Long phoneNumber;

	private String email;
	
}
