public class bHistorico {

    void log() {
        /**
         * git log
         *      vai mostrar o histórico de todas as configurações.
         * 
         * git log --online
         */
    }

    void pretty() {
        /**
         * git log --pretty="format:%H"
         *      Vai mostrar apenas o hash completo de cada commit.
         * 
         * git log --pretty="format:%h %s"
         *      Vai mostrar o hash resumido e a descrição de cada commit.
         * 
         *      %H > hash completo; %s > hash resumido.
         * 
         * git log --pretty="format:%h %s %ae"
         *      %ae mostra o email do autor
         */
    }
    
}
