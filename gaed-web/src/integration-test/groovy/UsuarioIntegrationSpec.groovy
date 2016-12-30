

import br.com.gaed.Usuario
import enums.Perfil
import enums.Sexo
import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class UsuarioIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void 'test index'() {
        when:
            assert Usuario.all.size() == 0
            Usuario usuario = new Usuario()
            usuario.nome = "Ana"
            usuario.sobrenome = "siqueira"
            usuario.email = "ana@gmail.com"
            usuario.cpf = "354.606.565.20"
            usuario.rg  = "58.658.658-5"
            usuario.numero = 55
            usuario.complemento = "Rua 5"
            usuario.telefone = "19988556354"
            usuario.datanascimento = new Date().minus(50)
            usuario.dataIngresso = new Date()
            usuario.sexo = Sexo.FEMININO
            usuario.perfil = Perfil.ALUNO
            usuario.save(flush: true)
        then:
            assert Usuario.all.size() == 1
    }
}
