package br.com.tiagopedroso.lutadores;

/**
 *
 * @author Tiago Penha Pedroso, 2019-05-15
 */
public class LutadorAlien extends Lutador {
    
    // <editor-fold defaultstate="collapsed" desc="Construtores">
    public LutadorAlien(String nome) {
        super(nome);
        
        resistencia = 3;
        
        //sobrescrevendo as imagens do lutador comum
        imagemStatus.clear();
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-green-01.png"));
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-green-02.png"));
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-green-03.png"));
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-green-04.png"));
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-green-05.png"));
        imagemStatus.add(importarImagemBitmap("/images/doomFaces-green-06.png"));
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos Sobrescritos">
    @Override
    public void regenerar() {
        if (contRegenera < MAX_REGENERA) {
            vida += (int) (Math.random() * 90) + 1;
            contRegenera++;
        }
    }
    // </editor-fold>

}
