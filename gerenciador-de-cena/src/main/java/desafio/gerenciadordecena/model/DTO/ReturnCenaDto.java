package desafio.gerenciadordecena.model.DTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import desafio.gerenciadordecena.model.Models.Cena;
import desafio.gerenciadordecena.model.Models.StatusEnum;

public class ReturnCenaDto {
	public int Id;

	public String Title = "Sem Titulo";

	public StatusEnum Status = StatusEnum.Pendente;

	public StatusEnum PreviousStatus = StatusEnum.Pendente;

	public LocalDateTime TimeLastChange;

	public ReturnCenaDto(Cena cena) {
		this.Id = cena.Id;
		this.Title = cena.Title;
		this.Status = cena.Status;
		this.PreviousStatus = cena.PreviousStatus;
		this.TimeLastChange = cena.TimeLastChange;
	}
	
	public List<ReturnCenaDto> convert(List<Cena> cenas){
		return cenas.stream().map(ReturnCenaDto::new).collect(Collectors.toList());
	}

	public int getId() {
		return Id;
	}

	public String getTitle() {
		return Title;
	}

	public StatusEnum getStatus() {
		return Status;
	}

	public StatusEnum getPreviousStatus() {
		return PreviousStatus;
	}

	public LocalDateTime getTimeLastChange() {
		return TimeLastChange;
	}

}
