package Entities;

public class Herbalife {
	
	private String produto;
	private double vlVenda;
	private double vlCompra;
	private double estoque;
	
	public Herbalife() {
		
	}
	public Herbalife(String produto, double vlVenda, double vlCompra) {
		this.produto = produto;
		this.vlVenda = vlVenda;
		this.vlCompra = vlCompra;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getVlVenda() {
		return vlVenda;
	}
	public void setVlVenda(double vlVenda) {
		this.vlVenda = vlVenda;
	}
	public double getVlCompra() {
		return vlCompra;
	}
	public void setVlCompra(double vlCompra) {
		this.vlCompra = vlCompra;
	}
	public double getEstoque() {
		return estoque;
	}
	
	public void addEstoque(double estoque) {
		this.estoque += estoque;
	}
	public void removeEstoque(double estoque) {
		this.estoque -= estoque;
	}
	
	public double totalValor() {
		return getEstoque() * getVlVenda();
	}
	
	public double valorEstoque() {
		return getEstoque() * getVlCompra();
	}
	
	public String toString() {
		return "Produto: "
			 + this.getProduto()
			 + ", Valor Unitário Venda: R$ "
			 + String.format("%.2f", this.getVlVenda())
			 + ", Valor Unitário Compra: R$ "
			 + String.format("%.2f", this.getVlCompra())
			 + ", Qtde Estoque: "
			 + this.getEstoque()
			 + ", Total Venda: R$ "
			 + String.format("%.2f", totalValor())
			 + ", Custo: R$ "
			 + String.format("%.2f", valorEstoque());
	}

}
