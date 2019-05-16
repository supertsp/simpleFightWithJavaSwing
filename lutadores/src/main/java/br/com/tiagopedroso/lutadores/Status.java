package br.com.tiagopedroso.lutadores;

/**
 *
 * @author Tiago Penha Pedroso, 2019-05-15
 */
public enum Status {
    
    Inicial("Vem Pro Pau!!"),
    DeBoa("Ainda de Boas!"),
    MeioBaqueado("Meio Baqueado..."),
    MuitoFraco("Muito Fraco :("),
    VaiCair("Vai Cair a Qualquer Momento :0"),
    JaEra("Já Era!!! RIP!");

    public String valor;

    Status(String valor) {
        this.valor = valor;
    }

}
