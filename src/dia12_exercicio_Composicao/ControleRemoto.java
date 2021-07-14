package dia12_exercicio_Composicao;

//Crie uma classe Televis�o e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televis�o. 
//O controle de volume permite:
//aumentar ou diminuir a pot�ncia do volume de som em uma unidade de cada vez;
//aumentar e diminuir o n�mero do canal em uma unidade
//trocar para um canal indicado;
//consultar o valor do volume de som e o canal selecionado.
//Uma Televis�o tem um ControleRemoto

public class ControleRemoto {

    private Televisao televisao;

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }

    public void aumentarVolume() {
        this.televisao.ajustarVolume(1);
    }

    public void diminuirVolume() {
        this.televisao.ajustarVolume(-1);
    }

    public void aumentarCanal() {
        this.televisao.aumentarCanal();
    }

    public void diminuirCanal() {
        this.televisao.diminuirCanal();
    }

    public void trocarParaUmCanalIndicado(Integer canal) {
        this.televisao.trocarParaUmCanalIndicado(canal);
    }

    public void informacoesDeSomEhDeCanal() {
        this.televisao.informacoesDeSomEhDeCanal();
    }


    public static void main(String[] args) {
        Televisao samsung = new Televisao();
        Televisao lg = new Televisao();

        ControleRemoto controleRemoto = new ControleRemoto();

        System.out.println("----------------SAMSUNG----------------");
        controleRemoto.setTelevisao(samsung);


        controleRemoto.aumentarVolume();
        controleRemoto.informacoesDeSomEhDeCanal();

        controleRemoto.diminuirCanal();
        controleRemoto.informacoesDeSomEhDeCanal();

        controleRemoto.trocarParaUmCanalIndicado(7);
        controleRemoto.informacoesDeSomEhDeCanal();

        System.out.println("----------------LG----------------");

        controleRemoto.setTelevisao(lg);
        controleRemoto.informacoesDeSomEhDeCanal();


        controleRemoto.diminuirVolume();
        controleRemoto.aumentarCanal();
        controleRemoto.informacoesDeSomEhDeCanal();

        System.out.println("---Vendo as informa��es pela pr�pria TV---");
        samsung.informacoesDeSomEhDeCanal();
        lg.informacoesDeSomEhDeCanal();

    }

}