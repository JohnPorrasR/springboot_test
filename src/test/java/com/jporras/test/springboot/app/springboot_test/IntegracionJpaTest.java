package com.jporras.test.springboot.app.springboot_test;

import com.jporras.test.springboot.app.springboot_test.models.Cuenta;
import com.jporras.test.springboot.app.springboot_test.repositories.CuentaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class IntegracionJpaTest {

  @Autowired
  CuentaRepository cuentaRepository;

  @Test
  void testFindById(){
    Optional<Cuenta> cuenta = cuentaRepository.findById(1L);
    assertTrue(cuenta.isPresent());
    assertEquals("Andrés", cuenta.orElseThrow().getPersona());
  }
}
