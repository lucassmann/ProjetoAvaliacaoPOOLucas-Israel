import java.util.ArrayList;
/**
 * A classe AplicacaoDeProva se trata da aplicação de uma Prova.
 */
public class AplicacaoDeProva {
    Prova prova;
    ArrayList<String> respostas;
    /**
     * Construtor de uma AplicacaoDeProva.
     * @param prova Prova a ser aplicada.
     * @param ArrayList<String>() respostas Lista de respostas de uma AplicacaoDeProva.
     */
    public AplicacaoDeProva(){
        Prova prova;
        respostas = new ArrayList<String>();
    }
    /**
     * Determina uma Prova a ser utilizada em uma AplicacaoDeProva
     * @param p Prova a ser utilizada.
     */
    public void setProva(Prova p){
        prova = p;
    }
    /**
     * Adiciona uma resposta a uma AplicacaoDeProva, ou seja, ao ArrayList respostas. Respostas adicionadas através do método addResposta(String resposta) serão adicionadas ao final do ArrayList respostas.
     * @param resposta String representando uma resposta de uma questão de uma prova.
     */
    public void addResposta(String resposta){
        respostas.add(resposta);
    }
    /**
     * Adiciona uma resposta a uma AplicacaoDeProva em uma posição específica no Arraylist respostas.
     * @param resposta String representando uma resposta de uma questão de uma prova.
     * @param questionIndex Posição específica no Arraylist respostas em que a resposta será adicionada.
     */
    public void addResposta(String resposta, int questionIndex){
        respostas.add(questionIndex, resposta);
    }
    /**
     * Pega uma resposta de uma AplicacaoDeProva, ou seja, do ArrayList respostas.
     * @param respostaIndex Index da resposta no ArrayList respostas.
     * @return  String resposta referente ao index.
     */
    public String getResposta(int respostaIndex){
        return respostas.get(respostaIndex);
    }
    /**
     * Pega a Prova de uma AplicacaoDeProva
     * @return  Prova, enquanto objeto prova, de uma AplicacaoDeProva.
     */
    public Prova getProva(){
        return prova;
    }
    /**
     * Calcula e pega a nota de uma AplicacaoDeProva, comprando as respostas ao gabarito.
     * @return double A nota de uma ApicacaoDeProva.
     */
    public double returnNota (){
        double countNota = 0;
        for (int i=0; i<prova.getSize(); i++) {
            if (prova.getQuestion(i).checkAnswer(respostas.get(i)) == true){
                countNota += prova.getQuestion(i).getValue();           
            }
        }
        return countNota;
    }
    /**
     * Apresenta o relatório de uma AplicacaoDeProva no terminal.
     * Apresenta para cada questão: o texto da questão, a resposta informada, a indicação de que a resposta está correta ou indicação de que está incorreta, seguida da resposta correta e indica a nota no final do relatório.
     */
    public void relatorioAplicacaoDeProva(){
        for (int i=0; i<prova.getSize(); i++) {
            //prova.getQuestion(i)
            System.out.println("Questao " +(i+1));
            prova.getQuestion(i).display();
            System.out.println(respostas.get(i));
            if (respostas.get(i).equals(prova.getQuestion(i).getAnswer()) == true){
                System.out.println("Resposta correta!");
            }
            else{
                System.out.println("Resposta incorreta");
                System.out.println("A resposta correta é " + prova.getQuestion(i).getAnswer());
            }
            System.out.println();
        }
        System.out.println("A nota final da prova é " + returnNota());
    }
}