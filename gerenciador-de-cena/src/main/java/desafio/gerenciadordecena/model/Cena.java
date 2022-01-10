package desafio.gerenciadordecena.model;

import java.time.LocalDateTime;

public class Cena {
    public int Id;

    public String Title = "Sem Titulo";

    public StatusEnum Status = StatusEnum.Pendente;

    public StatusEnum PreviousStatus = StatusEnum.Pendente;

    public LocalDateTime TimeLastChange;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public StatusEnum getStatus() {
		return Status;
	}

	public void setStatus(StatusEnum status) {
		Status = status;
	}

	public StatusEnum getPreviousStatus() {
		return PreviousStatus;
	}

	public void setPreviousStatus(StatusEnum previousStatus) {
		PreviousStatus = previousStatus;
	}

	public LocalDateTime getTimeLastChange() {
		return TimeLastChange;
	}

	public void setTimeLastChange(LocalDateTime timeLastChange) {
		TimeLastChange = timeLastChange;
	}
}
