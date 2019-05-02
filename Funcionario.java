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
public class Funcionario extends Pessoa{
    float salario;

    public Funcionario(float salario, int idade, String nome, double cpf, String sexo) {
        super(idade, nome, cpf, sexo);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public int getIdade() {
        return idade;
    }
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public double getCpf() {
        return cpf;
    }
    @Override
    public String getSexo() {
        return sexo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public void mostrarinfo(){
        System.out.println("Informações do Funcionário:\nNome: %s\nIdade: %d\nCPF: %d\nSalário:%f"+getNome()+getIdade()+getCpf()+getSalario());
    }
}
