import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerificarSituacao extends JFrame{
    private JTextField textNota1;
    private JTextField textNota2;
    private JButton calcularMediaButton;
    private JTextField textMedia;
    private JTextField textSituacao;
    private JButton limparCamposButton;
    public JPanel panelMain;

    public void calcularMedia(){
        Double media =  (Double.valueOf(textNota1.getText()) + Double.valueOf(textNota2.getText()))/2;
        textMedia.setText(media.toString());

        if ((media >= 7) && (media <=10)){
            textSituacao.setText("Aprovado");

        } else if ((media >= 0) && (media <=6)) {
            textSituacao.setText("Reprovado");

        }else {
            textSituacao.setText("Situação Inesperada");
        }
    }

    public void limparCampos(){
        textNota1.setText("");
        textNota2.setText("");
        textMedia.setText("");
        textSituacao.setText("");
    }

    public VerificarSituacao() {
        calcularMediaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularMedia();
            }
        });
        limparCamposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });
    }
}
