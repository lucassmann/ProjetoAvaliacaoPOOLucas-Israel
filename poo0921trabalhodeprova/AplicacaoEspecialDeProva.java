/**
 * A classe AplicacaoEspecialDeProva se trata de uma aplicação de uma prova em que, a cada resposta errada, é descontado um ponto da nota final.
 */
public class AplicacaoEspecialDeProva extends AplicacaoDeProva{
    /**
     * Construtor de uma AplicacaoEspecialDeProva.
     */
    public AplicacaoEspecialDeProva(){
    }
    /**
     * Calcula e pega a nota de uma AplicacaoEspecialDeProva. A cada resposta errada, é descontado um ponto da nota final.
     * @return double countNota Nota final de uma AplicacaoEspecialDeProva
     */
    @Override
    public double returnNota (){
        double countNota = 0;
        for (int i=0; i<prova.getSize(); i++) {
            countNota += prova.getQuestion(i).getValue();  
            if (prova.getQuestion(i).checkAnswer(respostas.get(i)) == false){
                countNota = countNota - prova.getQuestion(i).getValue() -1;          
            }
        }
        if (countNota < 0){
            return 0;
        }
        else return countNota;
    }
}