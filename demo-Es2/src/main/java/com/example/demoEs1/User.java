package com.example.demoEs1;

public class User {
    public String nome;
    public String provincia;
    public String saluto;

    public User(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }
}
