package enums

/**
 * Created by apq on 29/12/16.
 */
enum Perfil {

    ALUNO ("Aluno"),
    PROFESSOR ("Professor"),
    DIRETOR ("Diretor"),
    RESPONSAVEL ("Responsavel"),
    SECRETARIA ("Secretaria"),
    COORDENADOR("Coordenador")

    private final String nome

    Perfil(String pNome){
        nome = pNome
    }
}