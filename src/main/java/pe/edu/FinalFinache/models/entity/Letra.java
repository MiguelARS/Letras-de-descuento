package pe.edu.FinalFinache.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "letras")
public class Letra 
{
	/*Datos de la letra */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "diasxanios")
	private Integer diasxanio;
	
	@Column(name = "plazoTasas")
	private Integer plazoTasa;

	@Column(name = "tasaEfectivas")
	private double tasaEfectiva;

	@Column(name = "fechaDescuentos")
	private Date fechaDescuento;

	@Column(name = "fechaGiros")
	private Date fechaGiro;

	@Column(name = "fechaVencimientos")
	private Date fechaVencimiento;

	@Column(name = "valorNominales")
	private Integer valorNominal;

	@Column(name = "retenciones")
	private Integer retencion;
	
	/*Costos y Gastos iniciales*/

	@Column(name = "motivosIni")
	private String motivoIni; //combo box de varios items
	
	@Column(name = "valorMotivosIni")
	private Integer valorMotivoIni;
	
	/*Costos y Gastos finales*/
	
	@Column(name = "motivosFin")
	private String motivoFin; //combo box de varios items

	@Column(name = "valorMotivosFin")
	private Integer valorMotivoFin;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	/*Getters y Setters*/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDiasxanio() {
		return diasxanio;
	}

	public void setDiasxanio(Integer diasxanio) {
		this.diasxanio = diasxanio;
	}

	public Integer getPlazoTasa() {
		return plazoTasa;
	}

	public void setPlazoTasa(Integer plazoTasa) {
		this.plazoTasa = plazoTasa;
	}

	public double getTasaEfectiva() {
		return tasaEfectiva;
	}

	public void setTasaEfectiva(double tasaEfectiva) {
		this.tasaEfectiva = tasaEfectiva;
	}

	public Date getFechaDescuento() {
		return fechaDescuento;
	}

	public void setFechaDescuento(Date fechaDescuento) {
		this.fechaDescuento = fechaDescuento;
	}

	public Date getFechaGiro() {
		return fechaGiro;
	}

	public void setFechaGiro(Date fechaGiro) {
		this.fechaGiro = fechaGiro;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Integer getValorNominal() {
		return valorNominal;
	}

	public void setValorNominal(Integer valorNominal) {
		this.valorNominal = valorNominal;
	}

	public Integer getRetencion() {
		return retencion;
	}

	public void setRetencion(Integer retencion) {
		this.retencion = retencion;
	}

	public String getMotivoIni() {
		return motivoIni;
	}

	public void setMotivoIni(String motivoIni) {
		this.motivoIni = motivoIni;
	}

	public Integer getValorMotivoIni() {
		return valorMotivoIni;
	}

	public void setValorMotivoIni(Integer valorMotivoIni) {
		this.valorMotivoIni = valorMotivoIni;
	}

	public String getMotivoFin() {
		return motivoFin;
	}

	public void setMotivoFin(String motivoFin) {
		this.motivoFin = motivoFin;
	}

	public Integer getValorMotivoFin() {
		return valorMotivoFin;
	}

	public void setValorMotivoFin(Integer valorMotivoFin) {
		this.valorMotivoFin = valorMotivoFin;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
