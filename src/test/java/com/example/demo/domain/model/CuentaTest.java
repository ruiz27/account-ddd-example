package com.example.demo.domain.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void whenSaldoEnCuentaEsIgualAlSaldoInicialThenSaldoOK(){
        Cuenta cuenta = new Cuenta(BigDecimal.ONE);
        assertEquals(BigDecimal.ONE,cuenta.saldo());
    }

    @Test
    void givenCuentaWhenRetirarThenOK(){
        // given
        Cuenta cuenta = new Cuenta(BigDecimal.valueOf(10));
        // when
        Cuenta newCuenta = cuenta.retirar(BigDecimal.valueOf(9));
        // then
        then(newCuenta.saldo()).isEqualTo(BigDecimal.ONE);
    }

    @Test
    void givenCuentaWhenRetirarKO(){
        // given
        Cuenta cuenta = new Cuenta(BigDecimal.valueOf(1));
        // when
        Cuenta newCuenta = cuenta.retirar(BigDecimal.valueOf(9));
        // then
        then(newCuenta.saldo()).isEqualTo(BigDecimal.ONE);

    }


}