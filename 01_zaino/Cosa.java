package week4.zaino;

/**
 * Created by mauro on 30/06/16.
 */
public class Cosa {
    private String nome;
    private String desc;

    public Cosa(String nome, String desc) {
        this.nome = nome;
        this.desc = desc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
