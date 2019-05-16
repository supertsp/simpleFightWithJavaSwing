package br.com.tiagopedroso.lutadores;

// <editor-fold defaultstate="collapsed" desc="imports...">
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
// </editor-fold>

/**
 *
 * @author Tiago Penha Pedroso, 2019-05-15
 */
public class Lutador {

    // <editor-fold defaultstate="collapsed" desc="Atributos Principais">
    protected String nome;
    protected int vida = 100;
    protected List<Icon> imagemStatus = new ArrayList<>();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Atributos Auxiliares">
    protected int resistencia = 1;
    protected int contRegenera;
    protected final int MAX_REGENERA = 3;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Construtores">
    public Lutador(String nome) {
        this.nome = nome;
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-01.png"));
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-02.png"));
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-03.png"));
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-04.png"));
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-05.png"));
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-06.png"));
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Métodos Auxiliares">
    protected Icon importarImagemBitmap(String url) {
        if (!url.equals("")) {
            try {
                Image imagem = ImageIO.read(this.getClass().getResource(url));
                ImageIcon icon = new ImageIcon(imagem);
                return icon;

            } catch (Exception e) {
                System.out.println(
                        "+------------------------------------+\n"
                        + "| Erro ao importar a ImagemBitmap! :(\n"
                        + "| URL: " + url + "\n"
                        + "+------------------------------------+\n"
                );
            }
        }

        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Métodos Principais">
    public void apanhar(int forca) {
        vida -= Math.abs(forca - resistencia);
        vida = vida < 0 ? 0 : vida;
    }

    public void regenerar() {
        if (contRegenera < MAX_REGENERA) {
            vida += (int) (Math.random() * 70) + 1;
            contRegenera++;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public boolean acabouRegeneracoes() {
        if (contRegenera >= MAX_REGENERA) {
            return true;
        }

        return false;
    }

    public String getStatusString() {
        switch (getStatus()) {
            case Inicial:
                return Status.Inicial.valor;

            case DeBoa:
                return Status.DeBoa.valor;

            case MeioBaqueado:
                return Status.MeioBaqueado.valor;

            case MuitoFraco:
                return Status.MuitoFraco.valor;

            case VaiCair:
                return Status.VaiCair.valor;

            case JaEra:
                return Status.JaEra.valor;

            default:
                return Status.Inicial.valor;
        }
    }

    public Status getStatus() {
        if (vida >= 95) {
            return Status.Inicial;
        } else if (vida >= 80) {
            return Status.DeBoa;
        } else if (vida >= 50) {
            return Status.MeioBaqueado;
        } else if (vida >= 20) {
            return Status.MuitoFraco;
        } else if (vida >= 1) {
            return Status.VaiCair;
        } else {
            return Status.JaEra;
        }
    }

    public Icon getImagemStatusAtual() {
        switch (getStatus()) {
            case Inicial:
                return imagemStatus.get(0);

            case DeBoa:
                return imagemStatus.get(1);

            case MeioBaqueado:
                return imagemStatus.get(2);

            case MuitoFraco:
                return imagemStatus.get(3);

            case VaiCair:
                return imagemStatus.get(4);

            case JaEra:
                return imagemStatus.get(5);

            default:
                return imagemStatus.get(0);
        }
    }
    // </editor-fold>

}
