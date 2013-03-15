/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package despesas;

/**
 *
 * @author Márcio
 */
public class RegDespController {

    public RegDespController() {
    }
    
    public void createDespesa(float valor, String desString){
        Despesa d = new Despesa(valor,desString);
        
    }
    
}
