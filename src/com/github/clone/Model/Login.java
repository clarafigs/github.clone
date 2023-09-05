package com.github.clone.Model;

public class Login {
    // username, senha, entrar
    public String username;
    public String senha;
    public Login(String username, String senha) {
        this.username = username;
        this.senha = senha;

    }
    public boolean entrar() {
        if(this.username.equals("clara") && this.senha.equals("243526")) {
            return true;

        }

        return false;
    }
}
