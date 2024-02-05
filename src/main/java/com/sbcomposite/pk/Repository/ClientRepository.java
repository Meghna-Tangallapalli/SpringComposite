package com.sbcomposite.pk.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbcomposite.pk.Entity.ClientEntity;
import com.sbcomposite.pk.Entity.ClientPk;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, ClientPk> {


}
