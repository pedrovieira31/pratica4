/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica4;

/**
 *
 * @author dolva
 */
public class main {
    public static void main(String[] args) {
	Gerente g = new Gerente("1111","2000,00","30","Geraldo","123456780","masculino");
        Funcionario f = new Funcionario("1200,00","20","João","987654321", "masculino");
        g.mostrarinfo();
        f.mostrarinfo();
        
}
}
