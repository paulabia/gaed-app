package enums

/**
 * Created by apq on 29/12/16.
 */
enum Sexo {

    FEMININO ("Feminino"),
    MASCULINO ("Masculino"),

    private final String nome

    Sexo(String pNome) {
        this.nome = pNome
    }

}