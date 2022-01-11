package desafio.gerenciadordecena.model.DTO;

import java.time.LocalDateTime;

public class AddCenaDto {
	public String Title = "Sem Titulo";
	
	public LocalDateTime TimeLastChange;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public LocalDateTime getTimeLastChange() {
		return TimeLastChange;
	}

	public void setTimeLastChange(LocalDateTime timeLastChange) {
		TimeLastChange = timeLastChange;
	}
	
}
