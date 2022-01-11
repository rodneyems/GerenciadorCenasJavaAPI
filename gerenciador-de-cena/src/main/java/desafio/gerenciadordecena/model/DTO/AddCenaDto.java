package desafio.gerenciadordecena.model.DTO;

import java.time.LocalDateTime;

import desafio.gerenciadordecena.model.Models.Cena;

public class AddCenaDto {
	public String Title = "Sem Titulo";

	public LocalDateTime TimeLastChange;

	public AddCenaDto(Cena cena) {
		this.Title = cena.getTitle();
		this.TimeLastChange = cena.getTimeLastChange();
	}

	public String getTitle() {
		return Title;
	}

	public LocalDateTime getTimeLastChange() {
		return TimeLastChange;
	}
}
