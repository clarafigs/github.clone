package com.github.clone.Model;

public class Perfil {
    public String fotoDeUsuario;
    public String username;
    public String nomeCompleto;
    public String bio;
    public String[] redesSociais = new String[4];
    public static final int QUANTIDADE_LISTA= 4;
    public Perfil (String fotoDeUsuario, String username, String nomeCompleto, String bio){
        this.username = username;
        this.fotoDeUsuario = fotoDeUsuario;
        this.nomeCompleto = nomeCompleto;
        this.bio= bio;

    }

    public void adicionarRedeSocial(String rede) {
        // Adicionar novas redes sociais
        for (int i = 0; i < QUANTIDADE_LISTA; i++) {
            if (this.redesSociais[i] == null) {
                this.redesSociais[i] = rede;
                break;
            }
        }
    }

    public void removerRedeSocial(String rede) {
        for (int i = 0; i < QUANTIDADE_LISTA; i++) {
            if (this.redesSociais[i] != null && this.redesSociais[i].equals(rede)) {
                this.redesSociais[i] = null;
                break;
            }
        }
    }
}






