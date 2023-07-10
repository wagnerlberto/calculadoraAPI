package br.com.empresa.calculadoraAPI.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class ControladorPrincipal {
  
  @GetMapping
  public String somar(double valor1, double valor2) {
    double resultado = valor1 + valor2;
    return "Resultado: " + resultado;
  }

}
