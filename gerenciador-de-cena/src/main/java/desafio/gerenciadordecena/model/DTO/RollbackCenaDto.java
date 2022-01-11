package desafio.gerenciadordecena.model.DTO;

import java.time.LocalDateTime;

public class RollbackCenaDto {
	public LocalDateTime TimeLastChange;

	public LocalDateTime getTimeLastChange() {
		return TimeLastChange;
	}

	public void setTimeLastChange(LocalDateTime timeLastChange) {
		TimeLastChange = timeLastChange;
	}
}
