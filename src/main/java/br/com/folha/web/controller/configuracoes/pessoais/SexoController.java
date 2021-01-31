package br.com.folha.web.controller.configuracoes.pessoais;



import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.folha.FolhaWebApplication;






@Controller
@RequestMapping("/sexos")
public class SexoController {
	
		
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/configuracoes/rhPessoais/cadastroDeSexo/cadastroDeSexo.html";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/configuracoes/rhPessoais/cadastroDeSexo/listaCadastroDeSexo.html";
	}
	
	
		
	
	
	
}
