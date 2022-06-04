/**
 * A classe TrueFalseQuestion trata de uma questão de verdadeiro ou falso.
 */
public class TrueFalseQuestion extends Question{
    /**
     * Construtor da questão de verdadeiro ou falso.
     */
    public TrueFalseQuestion(){
    }
    /**
     * Apresenta uma questão de verdadeiro ou falso no terminal. Esse médoto utiliza do método herdado da super classe.
     */
    public void display(){
        System.out.print("Answer True or False: ");
        super.display();
    }
    /**
     * Define o gabarito de uma questão de verdadeiro ou falso.
     * @param correctResponse String com o gabarito.
     * @param lowercaseAnswer String do gabario em caracteres minúsculos.
     */
    public void setAnswer(String correctResponse){
        String lowercaseAnswer = correctResponse.toLowerCase();
        super.setAnswer(lowercaseAnswer);
    }
    /**
     * Checa se uma resposta é correta, comparando-a com o gabarito.
     * @param String Answer resposta a uma questão de verdadeiro ou falso.
     * @return boolean representando a correção da questão de verdadeiro ou falso.
     */
    public boolean checkAnswer(String answer){
        String lowercaseAnswer = answer.toLowerCase();
        if (lowercaseAnswer.matches(String.valueOf('t')) || (lowercaseAnswer.matches("true")))
        {
            return super.checkAnswer("true");
        }
        else if (lowercaseAnswer.matches(String.valueOf('f')) || (lowercaseAnswer.matches("false")))
        {
            return super.checkAnswer("false");
        }
        return false;
    }
    /**
     * Pega o valor de uma questão de verdadeiro ou falso.
     * @return double 1 Representa o valor de uma questão de verdadeiro ou falso.
     */
    @Override
    public double getValue(){
        return 1;
    }
}