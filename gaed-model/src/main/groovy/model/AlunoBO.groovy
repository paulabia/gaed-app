package model

import enums.Perfil
import enums.Sexo
import util.KeyGenerator

/**
 * Created by apq on 29/12/16.
 */
class AlunoBO {

    String chave = KeyGenerator.forClass(AlunoBO.class)
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

}
