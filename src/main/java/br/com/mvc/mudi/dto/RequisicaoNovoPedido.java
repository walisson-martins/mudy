package br.com.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.mvc.mudi.model.Pedido;
import br.com.mvc.mudi.model.StatusPedido;

public class RequisicaoNovoPedido {

	@NotBlank
	private String nomeProduto;

	@NotBlank
	private String uriProduto;

	@NotBlank
	private String uriImagem;
	private String descricao;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getUriProduto() {
		return uriProduto;
	}

	public void setUriProduto(String uriProduto) {
		this.uriProduto = uriProduto;
	}

	public String getUriImagem() {
		return uriImagem;
	}

	public void setUriImagem(String uriImagem) {
		this.uriImagem = uriImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setDescricao(descricao);
		pedido.setNomeProduto(nomeProduto);
		pedido.setUriImagem(uriImagem);
		pedido.setUriProduto(uriProduto);
		pedido.setStatus(StatusPedido.AGUARDANDO);
		return pedido;
	}

}
