package gaed.web

import br.com.gaed.Usuario

class UsuarioController {

    def index() {
        Usuario usuario = new Usuario()
        usuario.nome = params.nome
        usuario.save(flush: true)
    }


}
