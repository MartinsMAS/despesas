/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package despesas;

/**
 *
 * @author Márcio
 */
public class Despesa {
    //Atributos
    private float valor;
    private String descricao;
    
    //Construtores
    Despesa(float valor,String desString)
    {
      this.valor = valor;
      descricao = desString;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
