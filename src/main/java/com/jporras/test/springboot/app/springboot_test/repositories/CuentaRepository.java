package com.jporras.test.springboot.app.springboot_test.repositories;

import com.jporras.test.springboot.app.springboot_test.models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
  @Query("select c from Cuenta c where c.persona=?1")
  Cuenta findByPersona(String persona);

  //List<Cuenta> findAll();

  //Cuenta findById(Long id);

  //void update(Cuenta cuenta);
}
