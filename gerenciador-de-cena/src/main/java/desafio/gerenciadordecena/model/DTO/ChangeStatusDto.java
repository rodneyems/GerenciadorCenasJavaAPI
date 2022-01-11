package desafio.gerenciadordecena.model.DTO;

import java.time.LocalDateTime;

import desafio.gerenciadordecena.model.Models.StatusEnum;

public class ChangeStatusDto {
	public StatusEnum Status = StatusEnum.Pendente;
	
    public LocalDateTime TimeLastChange;

	public StatusEnum getStatus() {
		return Status;
	}

	public void setStatus(StatusEnum status) {
		Status = status;
	}

	public LocalDateTime getTimeLastChange() {
		return TimeLastChange;
	}

	public void setTimeLastChange(LocalDateTime timeLastChange) {
		TimeLastChange = timeLastChange;
	}
}
