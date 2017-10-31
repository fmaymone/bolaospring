package com.bolao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lotacoes")
public class Lotacao {
	
	public int getLotacaoId() {
		return lotacaoId;
	}
	public void setLotacaoId(int lotacaoId) {
		this.lotacaoId = lotacaoId;
	}
	public String getNomeLotacao() {
		return nomeLotacao;
	}
	public void setNomeLotacao(String nomeLotacao) {
		this.nomeLotacao = nomeLotacao;
	}
	@Id
	@Column(name="codigolotacao")
        private int lotacaoId;
	@Column(name="lotacao")
		private String nomeLotacao;

}
