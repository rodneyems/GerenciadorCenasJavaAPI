package desafio.gerenciadordecena.model.Models;

import java.time.LocalDateTime;

public class Cena {
    private int Id;

    private String Title = "Sem Titulo";

    private StatusEnum Status = StatusEnum.Pendente;

    private StatusEnum PreviousStatus = StatusEnum.Pendente;

    private LocalDateTime TimeLastChange;
    
    public Cena(int Id, String Title, StatusEnum Status, StatusEnum PreviousStatus) {
    	this.setId(Id);
    	this.setTitle(Title);
    	this.setStatus(PreviousStatus);
    	this.setTimeLastChange(TimeLastChange);
    }

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
