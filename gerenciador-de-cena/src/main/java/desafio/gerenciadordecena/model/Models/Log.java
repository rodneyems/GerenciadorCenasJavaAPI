package desafio.gerenciadordecena.model.Models;

import java.time.LocalDateTime;

public class Log {
	private int Id;

	private int CenaId;

	private ActionEnum Action;
    
	private StatusEnum De;
    
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
