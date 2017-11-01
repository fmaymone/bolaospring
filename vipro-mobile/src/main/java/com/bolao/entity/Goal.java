package com.bolao.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Goal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private int minute;
	
	@Column
	private int offset;
	
	@Column
	private boolean penalty;
	
	@Column
	private boolean owngoal;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public boolean isPenalty() {
		return penalty;
	}

	public void setPenalty(boolean penalty) {
		this.penalty = penalty;
	}

	public boolean isOwngoal() {
		return owngoal;
	}

	public void setOwngoal(boolean owngoal) {
		this.owngoal = owngoal;
	}



}
