/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica4;

public class Pessoa {
    int idade;
    String nome;
    double cpf;
    String sexo;

    public Pessoa(int idade, String nome, double cpf, String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void mostrarinfo();
}
