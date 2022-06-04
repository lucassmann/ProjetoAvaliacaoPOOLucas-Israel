/**
Programação orientada a objetos - Exercício prático 1 - herança e polimorfismo - QuestionarioApp
@author Lucas Pereira Assmann
@author Israel Segalin
*/
/*
Enunciado do trabalho
1. Implemente uma classe chamada Prova cujas questões podem ser dos tipos exemplificadosem
aula. A classe deve ter métodos para:
a. Cadastrar questões (a primeira questão inserida corresponde a primeira questão da
prova, a segunda inserida a segunda questão da prova e assim sucessivamente);
b. Recuperar uma questão (pelo número da questão);
c. Remover uma questão (pelo número da questão);
d. Exibir a prova (exibindo todas as questões numeradas e em ordem).
2. Implemente uma classe chamada AplicacaoDeProva. Esta deve armazenar uma referência para
uma prova além de uma resposta para cada uma das questões da prova. A classe deve ter
métodos para:
a. Definir a prova;
b. Cadastrar uma resposta (informa a string com a resposta e o número da questão);
c. Retornar a nota prova (questões textuais ou numéricas valem 2 pontos, questões de
escolha simples 1 ponto e questões de escolha múltipla 1,5 pontos);
d. Imprimir um relatório indicando para cada questão:
i. O texto da questão;
ii. A resposta informada;
iii. Indicação de que a resposta está correta ou indicação de que está incorreta
seguida da resposta correta;
iv. Indicar a nota no final do relatório.
3. Derive uma classe AplicacaoEspecialDeProva derivada de AplicacaoDeProva onde cada questão
errada desconta 1 ponto da nota.
*/
/**
A classe App faz algumas demonstrações desse pequeno projeto de Questionário.
*/
public class App{
  public static void main(String[] args)
  {
    //Criando Questions
    Question q0 = new Question();
    q0.setText("1+1="); //ok
    q0.setAnswer("2"); //ok

    Question q1 = new Question();
    q1.setText("Who was the inventor of Java?");
    q1.setAnswer("James Gosling");

    ChoiceQuestion q2 = new ChoiceQuestion();
    q2.setText("In which country was the inventor of Java born?");
    q2.addChoice("Australia");
    q2.addChoice("Canada");
    q2.addChoice("Denmark");
    q2.addChoice("United States");
    q2.setAnswer("Canada");

    TrueFalseQuestion q3 = new TrueFalseQuestion();
    q3.setText("Is java a programming language?");
    q3.setAnswer("True");

    Question q4 = new Question();
    q4.setText("Qual é o sentido da vida?"); 
    q4.setAnswer("42"); 

    //Criando Prova e adicionando Questions na mesma.
    Prova p0 = new Prova();
    
    p0.addQuestion(q0);
    p0.addQuestion(q1);
    p0.addQuestion(q2);
    p0.addQuestion(q3);
    p0.addQuestion(q4);

    //Demonstração removeQuestion.
    System.out.println();
    System.out.println("Demonstração do método removeQuestion da classe Prova.\n");
    Question qRemocao = new Question();
    qRemocao.setText("Enunciado da questão para remoção");
    p0.addQuestion(qRemocao);
    System.out.println("Enunciado da ultima questão da prova, antes da remoção dessa questão:");
    p0.getQuestion(p0.getSize()-1).display();
    p0.removeQuestion(5);
    System.out.println("\nEnunciado da nova ultima questão da prova, depois da remoção da outra questão.");
    p0.getQuestion(p0.getSize()-1).display();

    System.out.println("\n");

    //Demonstração do método displayProva.
    System.out.println("Demonstração do método displayProva da classe Prova. Esse exibe todas as questões numeradas e em ordem.\n");
    p0.displayProva();

    AplicacaoDeProva ap0 = new AplicacaoDeProva();
    ap0.setProva(p0); 
    ap0.addResposta("2"); 
    ap0.addResposta("James Gosling");
    ap0.addResposta("Canada");
    ap0.addResposta("true");
    ap0.addResposta("A vida nao tem sentido");

    AplicacaoEspecialDeProva ape0 = new AplicacaoEspecialDeProva();
    ape0.setProva(p0);
    ape0.addResposta("2");
    ape0.addResposta("James Gosling");
    ape0.addResposta("Canada");
    ape0.addResposta("true");
    ape0.addResposta("A vida nao tem sentido");

    //Demonstração do método relatorioAplicacaoDeProva.
    System.out.println("\n");
    System.out.println("Demonstração do método relatorioAplicacaoDeProva da classe AplicacaoDeProva. Esse se refere à uma prova normal.\n");
    ap0.relatorioAplicacaoDeProva();

    System.out.println("\n");

    //Demonstração do método relatorioAplicacaoEspecialDeProva.
    System.out.println("Demonstração do método relatorioAplicacaoDeProva em um objeto AplicacaoEspecialDeProva, descontando 1 ponto para cada erro.\n");
    ape0.relatorioAplicacaoDeProva();
  }
}