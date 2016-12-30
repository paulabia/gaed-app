package br.com.gaed

import enums.Perfil
import enums.Sexo
import util.KeyGenerator

class Usuario {

    String chave = KeyGenerator.forClass(Usuario.class)
    String login
    String senha
    String nome
    String sobrenome
    String email
    String cpf
    String rg
    String numero
    String complemento
    String telefone
    Date datanascimento
    Date dataSaida
    Date dataIngresso
    Sexo sexo
    Perfil perfil
    //boolean status

    static constraints = {
        login nullable: true
        senha nullable: true
        dataSaida nullable: true
    }

}
