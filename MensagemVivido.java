public class MensagemVivido {
    private int hp;

    public MensagemVivido(int hp) {
        this.hp = hp;
    }

    public String mensagem() {
        if (this.hp < 0) {
            return "menor que zero? oshe";
        }

        if (this.hp == 0) {
            return "morrido";
        }

        if (this.hp > 0) {
            return "vivo!";
        }

        return null;
    }
}
