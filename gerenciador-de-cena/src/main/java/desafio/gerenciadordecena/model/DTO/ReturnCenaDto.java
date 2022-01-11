package desafio.gerenciadordecena.model.DTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import desafio.gerenciadordecena.model.Models.Cena;
import desafio.gerenciadordecena.model.Models.StatusEnum;

public class ReturnCenaDto {
	private int Id;

	private String Title = "Sem Titulo";

	private StatusEnum Status = StatusEnum.Pendente;

	private StatusEnum PreviousStatus = StatusEnum.Pendente;

	private LocalDateTime TimeLastChange;

	public ReturnCenaDto(Cena cena) {
		this.Id = cena.getId();
		this.Title = cena.getTitle();
		this.Status = cena.getStatus();
		this.PreviousStatus = cena.getPreviousStatus();
		this.TimeLastChange = cena.getTimeLastChange();
	}
	
	public static List<ReturnCenaDto> convert(List<Cena> cenas){
		System.out.println(cenas.get(1));
		System.out.println(cenas.stream().map(ReturnCenaDto::new).collect(Collectors.toList()).get(0));
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

	@Override
	public String toString() {
		return "ReturnCenaDto [Id=" + Id + ", Title=" + Title + ", Status=" + Status + ", PreviousStatus="
				+ PreviousStatus + ", TimeLastChange=" + TimeLastChange + "]";
	}

}
