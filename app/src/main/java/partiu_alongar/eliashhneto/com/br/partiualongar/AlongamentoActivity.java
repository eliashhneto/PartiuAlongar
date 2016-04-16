package partiu_alongar.eliashhneto.com.br.partiualongar;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eliashhneto on 10/04/16.
 */
public class AlongamentoActivity extends AppCompatActivity {

    private ImageView imgAlongamento;
    private TextView txtAlongamento;
    private TextView txtCronometro;
    private MyCountDownTimer timer;
    private ImageButton btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alongamento);

        int id  = getIntent().getIntExtra("id", R.id.cv_alongamento1);
        setUI();
        setData(id);
    }

    private void setUI() {
        imgAlongamento = (ImageView) findViewById(R.id.img_alongamento);
        txtAlongamento = (TextView) findViewById(R.id.txt_alongamento);
        txtCronometro = (TextView) findViewById(R.id.txt_cronometro);
        btnIniciar = (ImageButton) findViewById(R.id.btnIniciar);
    }

    private void setData(int id) {
        int imageId = 0;
        String observacao = "";
        int cronometro = 0;

        switch (id){
            case R.id.cv_alongamento1:
                imageId = R.drawable.alongamento1;
                observacao = "Repetir 2 vezes. \r\n\r\n";
                observacao += "O alongamento reduz a tensão muscular, promovendo o relaxamento.";
                cronometro = 15;
                break;
            case R.id.cv_alongamento2:
                imageId = R.drawable.alongamento2;
                observacao += "O alongamento evita câimbras.";
                cronometro = 10;
                break;
            case R.id.cv_alongamento3:
                imageId = R.drawable.alongamento3;
                observacao = "Realizar o exercício 2 vezes (uma para cada lado).\r\n\r\n";
                observacao += "O alongamento evita lesões nos músculos e articulações.";
                cronometro = 10;
                break;
            case R.id.cv_alongamento4:
                imageId = R.drawable.alongamento4;
                observacao += "O alongamento promove movimentos amplos e soltos.";
                cronometro = 15;
                break;
            case R.id.cv_alongamento5:
                imageId = R.drawable.alongamento5;
                observacao = "Repetir 3 vezes.\r\n\r\n";
                observacao += "O alongamento melhora a circulação do sangue.";
                cronometro = 5;
                break;
            case R.id.cv_alongamento6:
                imageId = R.drawable.alongamento6;
                observacao = "Realizar o exercício 2 vezes (uma para cada braço). \r\n\r\n";
                observacao += "O alongamento aumenta a flexibilidade.";
                cronometro = 10;
                break;
            case R.id.cv_alongamento7:
                imageId = R.drawable.alongamento7;
                observacao = "O alongamento fortalece ligamentos e tendões.";
                cronometro = 10;
                break;
            case R.id.cv_alongamento8:
                imageId = R.drawable.alongamento8;
                observacao = "O alongamento auxilia no equilíbrio corporal, importante para o envelhecimento saudável.";
                cronometro = 10;
                break;
            case R.id.cv_alongamento9:
                imageId = R.drawable.alongamento9;
                observacao = "Realizar o exercício 2 vezes (uma para cada lado). \r\n\r\n";
                observacao += "Nunca é tarde para começar a fazer alongamentos.";
                cronometro = 10;
                break;
            case R.id.cv_alongamento10:
                imageId = R.drawable.alongamento10;
                observacao = "Realizar o exercício 2 vezes (uma para cada lado). \r\n\r\n";
                observacao += "Independente da idade, todas as pessoas devem fazer exercícios.";
                cronometro = 10;
                break;
            case R.id.cv_alongamento11:
                imageId = R.drawable.alongamento11;
                observacao = "Repetir 2 vezes. \r\n\r\n";
                observacao += "Não ultrapasse seu limite a ponto de sentir dores durante os exercícios.";
                cronometro = 15;
                break;
            case R.id.cv_alongamento12:
                imageId = R.drawable.alongamento12;
                observacao = "Relaxe as mãos.\r\n\r\n";
                observacao += "O conforto chega com o tempo, a melhoria é a longo prazo.";
                cronometro = 10;
                break;
        }

        imgAlongamento.setImageResource(imageId);
        txtAlongamento.setText(observacao);
        timer = new MyCountDownTimer(this, txtCronometro, cronometro*1000, 1000);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.start();
            }
        });
        //timer.start();
        //txtAlongamento.setText();
        //txtAlongamento.setText("O alongamento diário é importante porque... ");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        if(timer != null){
            timer.cancel();
        }
    }


}
