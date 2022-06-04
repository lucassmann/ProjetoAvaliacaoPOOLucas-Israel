import java.util.ArrayList;
/**
 * A classe Prova se trata de uma prova, ou seja, uma lista de questões que podem posteriormente ser utilizadas para aplicação.
 */
public class Prova {
    ArrayList<Question> questoes;
    /**
     * O construtor Prova() cria uma prova.
     * @param ArrayList<Question>() questoes é uma lista de questões de uma prova.
     */
    public Prova(){
        questoes = new ArrayList<Question>();
    }
    /**
     * Adiciona uma questão, enquanto objeto, a uma prova.
     * @param q
     */
    public void addQuestion(Question q){
        questoes.add(q);
    }
    /**
     * Pega uma questão de uma prova.
     * @param questoesIndex Posição de uma questão no ArrayList questoes. Também equivalente ao número de uma questão em uma prova -1.
     * @return A questão referente a questoesIndex, enquanto objeto Question.
     */
    public Question getQuestion(int questoesIndex){
        return questoes.get(questoesIndex);
    }
    /**
     * Remove uma questão de uma prova.
     * @param questoesIndex index da questão a ser removida.
     */
    public void removeQuestion(int questoesIndex){
        questoes.remove(questoesIndex);
    }
    /**
     * Pega o tamanho atual de uma prova, ou seja, do ArrayList questions.
     * @return O número de objetos no ArrayList questoes.
     */
    public int getSize(){
        return questoes.size();
    }
    /**
     * Apresenta uma prova, ou seja, todas as questões de uma prova, no terminal.
     */
    public void displayProva(){
        for(Question q : questoes){
            System.out.println("Questão " + (questoes.indexOf(q) + 1));
            q.display();
            System.out.println();
        }
    }
}
