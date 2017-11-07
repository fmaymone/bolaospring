package com.vipro.entity;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



@Entity
public class Processo {
	
	private static final long serialVersionUID = -4489195166399235779L;

	@Id
	@SequenceGenerator(name="processos_seq", sequenceName="processos_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="processos_seq")
	@Column(name="codigoprocesso",insertable=false,updatable=false)
	private Integer codigoProcesso;
	
	@Column(name="codigoorgao",updatable=false)
	private Integer codigoOrgao;
	
	@Column(name="status",updatable=false)
	private String status;
	
	@Column(name="codigoclassificacaopcttatual")
	private Integer codigoClassificacaoPCTTAtual;
	
	@Column(name="codigosituacao")
	private Integer codigoSituacao;

	@Column(name="codigonivelsigilo")
	private Integer codigoNivelSigilo;
	
	@Column(name="codigoarvoreassunto")
	private Integer codigoArvoreAssunto;
	
	@Column(name="codigolotacaoultimoremetente")
	private Integer codigoLotacaoUltimoRemetente;
	
	@Column(name="codigolotacaoatual")
	private Integer codigoLotacaoAtual;
	
	@Column(name="codigofaseatual")
	private Integer codigoFaseAtual;
	
	@Column(name="codigomovimentacaoatual")
	private Integer codigoMovimentacaoAtual;
	
	@Column(name="codigologinresponsavelatual")
	private Integer codigoLoginResponsavelAtual;

	@Column(name="numeroprocesso")
	private String numeroProcesso;
	
	@Column(name="anoprocesso")
	private Integer anoProcesso;

	@Column(name="datahoraautuacao")
	private Timestamp dataHoraAutuacao;

	@Column(name="fluxotramitacao")
	private Integer fluxoTramitacao;
	
	@Column(name="virtual")
	private String virtual;
	
	@Column(name="datahoraultimamovimentacao")
	private Timestamp dataHoraUltimaMovimentacao;
	
	@Column(name="observacoes")
	private String observacoes;
	
	@Column(name="servidorsi",updatable=false)
	private Integer servidorSI;
	
	@Column(name="datahoracadastro",insertable=false,updatable=false)
	private Timestamp dataHoraCadastro;
	
	@Column(name="sua")
	private Integer SUA;
	
	@Column(name="dhua",insertable=false,updatable=false)
	private Timestamp DHUA;
	
	@UpdateTimestamp
	@Column(name="LASTUPDATEDDATE")
	private Calendar lastUpdatedDate;
	
	@CreationTimestamp
	@Column(name="CREATEDDATE")
	private Calendar createdDate;
	
	protected Processo() {}

	public Processo(String status) {
		
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Integer getCodigoProcesso() {
		return codigoProcesso;
	}

	public void setCodigoProcesso(Integer codigoProcesso) {
		this.codigoProcesso = codigoProcesso;
	}

	public Integer getCodigoOrgao() {
		return codigoOrgao;
	}

	public void setCodigoOrgao(Integer codigoOrgao) {
		this.codigoOrgao = codigoOrgao;
	}

	public Integer getCodigoClassificacaoPCTTAtual() {
		return codigoClassificacaoPCTTAtual;
	}

	public void setCodigoClassificacaoPCTTAtual(Integer codigoClassificacaoPCTTAtual) {
		this.codigoClassificacaoPCTTAtual = codigoClassificacaoPCTTAtual;
	}

	public Integer getCodigoSituacao() {
		return codigoSituacao;
	}

	public void setCodigoSituacao(Integer codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public Integer getCodigoNivelSigilo() {
		return codigoNivelSigilo;
	}

	public void setCodigoNivelSigilo(Integer codigoNivelSigilo) {
		this.codigoNivelSigilo = codigoNivelSigilo;
	}

	public Integer getCodigoArvoreAssunto() {
		return codigoArvoreAssunto;
	}

	public void setCodigoArvoreAssunto(Integer codigoArvoreAssunto) {
		this.codigoArvoreAssunto = codigoArvoreAssunto;
	}

	public Integer getCodigoLotacaoUltimoRemetente() {
		return codigoLotacaoUltimoRemetente;
	}

	public void setCodigoLotacaoUltimoRemetente(Integer codigoLotacaoUltimoRemetente) {
		this.codigoLotacaoUltimoRemetente = codigoLotacaoUltimoRemetente;
	}

	public Integer getCodigoLotacaoAtual() {
		return codigoLotacaoAtual;
	}

	public void setCodigoLotacaoAtual(Integer codigoLotacaoAtual) {
		this.codigoLotacaoAtual = codigoLotacaoAtual;
	}

	public Integer getCodigoFaseAtual() {
		return codigoFaseAtual;
	}

	public void setCodigoFaseAtual(Integer codigoFaseAtual) {
		this.codigoFaseAtual = codigoFaseAtual;
	}

	public Integer getCodigoMovimentacaoAtual() {
		return codigoMovimentacaoAtual;
	}

	public void setCodigoMovimentacaoAtual(Integer codigoMovimentacaoAtual) {
		this.codigoMovimentacaoAtual = codigoMovimentacaoAtual;
	}

	public Integer getCodigoLoginResponsavelAtual() {
		return codigoLoginResponsavelAtual;
	}

	public void setCodigoLoginResponsavelAtual(Integer codigoLoginResponsavelAtual) {
		this.codigoLoginResponsavelAtual = codigoLoginResponsavelAtual;
	}

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public Integer getAnoProcesso() {
		return anoProcesso;
	}

	public void setAnoProcesso(Integer anoProcesso) {
		this.anoProcesso = anoProcesso;
	}

	public Timestamp getDataHoraAutuacao() {
		return dataHoraAutuacao;
	}

	public void setDataHoraAutuacao(Timestamp dataHoraAutuacao) {
		this.dataHoraAutuacao = dataHoraAutuacao;
	}

	public Integer getFluxoTramitacao() {
		return fluxoTramitacao;
	}

	public void setFluxoTramitacao(Integer fluxoTramitacao) {
		this.fluxoTramitacao = fluxoTramitacao;
	}

	public String getVirtual() {
		return virtual;
	}

	public void setVirtual(String virtual) {
		this.virtual = virtual;
	}

	public Timestamp getDataHoraUltimaMovimentacao() {
		return dataHoraUltimaMovimentacao;
	}

	public void setDataHoraUltimaMovimentacao(Timestamp dataHoraUltimaMovimentacao) {
		this.dataHoraUltimaMovimentacao = dataHoraUltimaMovimentacao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Integer getServidorSI() {
		return servidorSI;
	}

	public void setServidorSI(Integer servidorSI) {
		this.servidorSI = servidorSI;
	}

	public Timestamp getDataHoraCadastro() {
		return dataHoraCadastro;
	}

	public void setDataHoraCadastro(Timestamp dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}

	public Integer getSUA() {
		return SUA;
	}

	public void setSUA(Integer sUA) {
		SUA = sUA;
	}

	public Timestamp getDHUA() {
		return DHUA;
	}

	public void setDHUA(Timestamp dHUA) {
		DHUA = dHUA;
	}

	public Calendar getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Calendar lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Calendar getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		
		return String.format("Processo [status=%s]", status);
	}
	


}
