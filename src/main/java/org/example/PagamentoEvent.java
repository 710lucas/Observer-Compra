package org.example;

public class PagamentoEvent {

    private boolean confirmado;

    private String mensagem;

    public PagamentoEvent(boolean confirmado, String mensagem){
        setMensagem(mensagem);
        setConfirmado(confirmado);
    }

    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return mensagem;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    public boolean isConfirmado() {
        return confirmado;
    }
}
