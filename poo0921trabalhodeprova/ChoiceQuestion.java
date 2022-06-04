import java.util.ArrayList;
/**
 * A classe ChoiseQuestion se trata de uma questão de multipla escolha.
 */
public class ChoiceQuestion extends Question{
    private ArrayList<String> choices;
    /**
     * O construtor ChoiseQuestion cria uma questão de múltipla escolha.
     * @param choises um ArrayList<String> onde cada elemento representa uma escolha do enunciado da questão.
     */
    public ChoiceQuestion(){
        this.choices = new ArrayList<String>();
    }
    /**
     * Adiciona uma escolha ao enunciado de uma questão de múltipla escolha.
     * @param choice
     */
    public void addChoice(String choice){
        this.choices.add(choice);
    }
    /**
     * Apresenta uma quesão e múltipla escolha no terminal. Esse médoto utiliza do método herdado da super classe, além de apresentar as alternativas da questão de multipla escolha.
     */
    public void display(){
        // Display the question text
        super.display();
        // Display the answer choices
        for (int i = 0; i < choices.size(); i++){
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
    /**
     * Define a alternativa correta para o gabario da questão de múltipla escolha, em forma de String.
     * @param correctChoiceNumber int que representa a alternativa correta da questão.
     */
    public void setAnswer(int correctChoiceNumber){
        // Convert correctChoiceNumber to string
        String choiceString = "" + correctChoiceNumber;
        super.setAnswer(choiceString);
    }
    /**
     * Pega o valor da questão de múltipla escolha.
     * @return double 1.5 representando o valor de uma questão de múltipla escolha.
     */
    @Override
    public double getValue(){
        return 1.5;
    }
}
