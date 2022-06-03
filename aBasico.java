class Um {

    void lembrar() {
        /**
         * Dou pull da master e mudo:
         *      Sempre que eu der pull da master, tenho que mudar de branch.
         *      Nunca fique dentro da master após dar um pull.
         * 
         * Se eu fizer errado (estou na master e não deveria):
         *      git stash (vai salvar meu trabalho)
         *      git checkout <branch>
         *      git stash apply (vai levar o trabalho junto.)
         */
    }

    void init() {
        /**
         * c:/Users/F7021995/MinhaPasta: git init
         *      git vai iniciar controle nessa pasta aí.
         *      Vai criar localmente, na minha máquina, o caminho.
         * 
         * git config: 
         *      git config --global user.name "F7021995 Matheus Ataides Reis"
         *      git config --global user.email "matheus.ataides@bb.com.br"
         */
    }

    void gitConfig() {
        /**
         * git config --list (no cmd):
         *      Mostra as configurações do meu git.
         * 
         * maven (cada três meses):
         *      Necessário baixar as settings toda vez que trocar a senha.
         *      Senha de homologação é usada.
         * 
         * git config --local:
         *      Configurar apenas para um projeto.
         *      Se eu quiser fazer uma configuração para um único projeto: use git config --local
         */
    }

    void gitAdd() {
        /**
         * git add index.html
         *      Vai monitorar apenas o index.html
         * 
         * git add .
         *      Vai monitorar todos os arquivos
         */
    }
}