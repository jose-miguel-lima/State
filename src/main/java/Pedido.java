public class Pedido {

    private String nome;
    private PedidoEstado pedidoEstado;

    public Pedido(){
        this.pedidoEstado = PedidoFeito.getInstance();
    }

    public void setEstado(PedidoEstado pedidoEstado){
        this.pedidoEstado = pedidoEstado;
    }

    public boolean aceitar(){
        return pedidoEstado.aceitar(this);
    }

    public boolean cancelar(){
        return pedidoEstado.cancelar(this);
    }

    public boolean sairParaEntrega(){
        return pedidoEstado.sairParaEntrega(this);
    }

    public boolean entregue(){
        return pedidoEstado.entregue(this);
    }

    public String getNomeEstado(){
        return pedidoEstado.getEstado();
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
