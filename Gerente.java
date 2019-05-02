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
public class Gerente extends Pessoa{
    int codigo;
    float salario;

    public Gerente(int codigo, float salario, int idade, String nome, double cpf, String sexo) {
        super(idade, nome, cpf, sexo);
        this.codigo = codigo;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        System.out.println("Informações do Gerente:\nCódigo: %d\nNome: %s\nIdade: %d\nCPF: %d\nSalário:%f"+ getCodigo()+getNome()+getIdade()+getCpf()+getSalario());
    }
    
}
