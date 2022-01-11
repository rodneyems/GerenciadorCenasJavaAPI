package desafio.gerenciadordecena.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.gerenciadordecena.model.DTO.ReturnCenaDto;
import desafio.gerenciadordecena.model.Models.Cena;
import desafio.gerenciadordecena.model.Models.StatusEnum;

@RestController
public class CenasController {
	@RequestMapping("/cenas")
	public List<ReturnCenaDto> GetCenas(){
		Cena cena = new Cena(1,"Teste",StatusEnum.Gravada, StatusEnum.Gravada);
		return ReturnCenaDto.convert(Arrays.asList(cena, cena, cena));
	}
}
