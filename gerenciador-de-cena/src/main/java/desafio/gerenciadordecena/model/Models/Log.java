package desafio.gerenciadordecena.model.Models;

import java.time.LocalDateTime;

public class Log {
    public int Id;

    public int CenaId;

    public ActionEnum Action;

    public LocalDateTime Time;

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

	public LocalDateTime getTime() {
		return Time;
	}

	public void setTime(LocalDateTime time) {
		Time = time;
	}
}
