package com.github.clone.Main;

import com.github.clone.Model.Perfil;

public class Main {
    public static void main(String[] args) {
        Perfil perfil = new Perfil(
                "url-alguma-coisa",
                "erlonjr",
                "Erlon Dantas",
                "Sei nao"
        );

        perfil.adicionarRedeSocial("facebook");
        perfil.adicionarRedeSocial("X");
        perfil.adicionarRedeSocial("Instagram");
        perfil.adicionarRedeSocial("Privacy");
        perfil.adicionarRedeSocial("Inner Cycle");

        perfil.removerRedeSocial("facebook");
        perfil.removerRedeSocial("X");
        perfil.removerRedeSocial("Instagram");
        perfil.removerRedeSocial("Privacy");
        perfil.removerRedeSocial("Inner Cycle");

        System.out.println(perfil.redesSociais[0]);
        System.out.println(perfil.redesSociais[1]);
        System.out.println(perfil.redesSociais[2]);
        System.out.println(perfil.redesSociais[3]);

    }
}