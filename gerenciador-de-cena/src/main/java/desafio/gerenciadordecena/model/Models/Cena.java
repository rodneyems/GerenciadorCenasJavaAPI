package desafio.gerenciadordecena.model.Models;

import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Cena {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	private String Title = "Sem Titulo";

	@Enumerated(EnumType.STRING)
	private StatusEnum Status = StatusEnum.Pendente;

	@Enumerated(EnumType.STRING)
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
