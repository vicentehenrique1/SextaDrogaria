package br.com.unialfa.Drogaria.Venda.domain;

import br.com.unialfa.Drogaria.Cliente.domain.Cliente;
import br.com.unialfa.Drogaria.Produto.domain.Produto;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Venda {
	@OneToOne
	private Cliente cliente;
	private Date dataVenda;
	private Double valorTotal;
    @OneToOne
	private Produto produto;
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

}
