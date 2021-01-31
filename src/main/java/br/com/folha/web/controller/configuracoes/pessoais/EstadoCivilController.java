package br.com.folha.web.controller.configuracoes.pessoais;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping("/estadosCivis")
public class EstadoCivilController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/configuracoes/rhPessoais/cadastroDeEstadosCivis/cadastroDeEstadosCivis.html";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/configuracoes/rhPessoais/cadastroDeEstadosCivis/listaCadastroDeEstadosCivis.html";
	}
	
	
	
}
