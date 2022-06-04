/**
 * A classe Question se trata de uma questão simples, apenas com text e answer de tipo String.
 */
public class Question {
  private String text;
  private String answer;
  /**
   * O construtor Question() cria uma questão simples.
   * @param text O enunciado da questão.
   * @param answer O gabarito da questão.
   */
  public Question() {
    this.text = "";
    this.answer = "";
  }
  /**
   * Define o enunciado de uma questão.
   * @param questionText
   */
  public void setText(String questionText) {
    this.text = questionText;
  }
  /**
   * Define o gabarito de uma questão.
   * @param questionAnswer
   */
  public void setAnswer(String questionAnswer) {
    this.answer = questionAnswer;
  }
  /**
   * Checa se uma resposta é correta, comprando-a com o gabarito.
   * @param answer
   * @return boolean representando a correção da questão
   */
  public boolean checkAnswer(String resposta) {
    return this.answer.equals(answer);
  }
  /**
   * Pega o gabarito de uma questão.
   * @return a String com o gabarito da questão.
   */
  public String getAnswer() {
    return this.answer;
  }
  /**
   * Pega o valor da questão. Para uma questão simples, esse valor será 2. Para outros tipos de questão, esse método será herdado e sobreposto.
   * @return double que representa o valor da questão.
   */
  public double getValue() {
    return 2;
  }
  /**
   * Apresenta o enunciado da questão no terminal, através e printf.
   */
  public void display() {
    System.out.println(this.text);
  }
}