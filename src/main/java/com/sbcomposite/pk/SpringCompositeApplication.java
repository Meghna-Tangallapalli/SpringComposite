package com.sbcomposite.pk;

import java.util.List;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbcomposite.pk.Entity.ClientEntity;
import com.sbcomposite.pk.Repository.ClientRepository;

@SpringBootApplication
@RestController
@RequestMapping("/clients")
public class SpringCompositeApplication {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCompositeApplication.class, args);
	}

	@PostMapping("/save")
	public ClientEntity save(@RequestBody ClientEntity cliententity) {
		return clientRepository.save(cliententity);
	
	}
	
	@GetMapping("/getAll")
	public List<ClientEntity> getClients() {
		return clientRepository.findAll();
	}
	
}
