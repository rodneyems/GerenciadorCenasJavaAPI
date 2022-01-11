package desafio.gerenciadordecena.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.gerenciadordecena.model.Models.Cena;
import desafio.gerenciadordecena.model.Models.StatusEnum;

@RestController
public class CenasController {
	@RequestMapping("/cenas")
	public List<Cena> GetCenas(){
		Cena cena = new Cena(1,"Teste",StatusEnum.Gravada, StatusEnum.Gravada);
		Cena cena1 = new Cena(2,"Teste 2",StatusEnum.Gravada, StatusEnum.Gravada);
		Cena cena2 = new Cena(3,"Teste 3",StatusEnum.Gravada, StatusEnum.Gravada);
		Cena cena3 = new Cena(4,"Teste 4",StatusEnum.Gravada, StatusEnum.Gravada);
		return Arrays.asList(cena, cena1, cena2, cena3);
	}
}
