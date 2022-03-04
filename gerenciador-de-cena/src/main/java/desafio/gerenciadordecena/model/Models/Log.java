package desafio.gerenciadordecena.model.Models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Log {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	private int CenaId;

	private ActionEnum Action;

	@Enumerated(EnumType.STRING)
	private StatusEnum De;

	@Enumerated(EnumType.STRING)
	private StatusEnum Para;

	private LocalDateTime Time;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCenaId() {
		return CenaId;
	}

	public void setCenaId(int cenaId) {
		CenaId = cenaId;
	}

	public ActionEnum getAction() {
		return Action;
	}

	public void setAction(ActionEnum action) {
		Action = action;
	}

	public StatusEnum getDe() {
		return De;
	}

	public void setDe(StatusEnum de) {
		De = de;
	}

	public StatusEnum getPara() {
		return Para;
	}

	public void setPara(StatusEnum para) {
		Para = para;
	}

	public LocalDateTime getTime() {
		return Time;
	}

	public void setTime(LocalDateTime time) {
		Time = time;
	}

}
