package partiu_alongar.eliashhneto.com.br.partiualongar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CardView cvAlongamento1;
    private CardView cvAlongamento2;
    private CardView cvAlongamento3;
    private CardView cvAlongamento4;
    private CardView cvAlongamento5;
    private CardView cvAlongamento6;
    private CardView cvAlongamento7;
    private CardView cvAlongamento8;
    private CardView cvAlongamento9;
    private CardView cvAlongamento10;
    private CardView cvAlongamento11;
    private CardView cvAlongamento12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();
        setActions();
    }

    private void setUI() {
        cvAlongamento1 = (CardView) findViewById(R.id.cv_alongamento1);
        cvAlongamento2 = (CardView) findViewById(R.id.cv_alongamento2);
        cvAlongamento3 = (CardView) findViewById(R.id.cv_alongamento3);
        cvAlongamento4 = (CardView) findViewById(R.id.cv_alongamento4);
        cvAlongamento5 = (CardView) findViewById(R.id.cv_alongamento5);
        cvAlongamento6 = (CardView) findViewById(R.id.cv_alongamento6);
        cvAlongamento7 = (CardView) findViewById(R.id.cv_alongamento7);
        cvAlongamento8 = (CardView) findViewById(R.id.cv_alongamento8);
        cvAlongamento9 = (CardView) findViewById(R.id.cv_alongamento9);
        cvAlongamento10 = (CardView) findViewById(R.id.cv_alongamento10);
        cvAlongamento11 = (CardView) findViewById(R.id.cv_alongamento11);
        cvAlongamento12 = (CardView) findViewById(R.id.cv_alongamento12);
    }

    private void setActions() {

        cvAlongamento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento1);
            }
        });

        cvAlongamento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento2);
            }
        });

        cvAlongamento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento3);
            }
        });

        cvAlongamento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento4);
            }
        });
        cvAlongamento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento5);
            }
        });

        cvAlongamento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento6);
            }
        });

        cvAlongamento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento7);
            }
        });

        cvAlongamento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento8);
            }
        });
        cvAlongamento9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento9);
            }
        });
        cvAlongamento10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento10);
            }
        });
        cvAlongamento11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento11);
            }
        });
        cvAlongamento12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acessarAlongamento(R.id.cv_alongamento12);
            }
        });

    }

    private void acessarAlongamento(int id) {
        Intent intent = new Intent(MainActivity.this, AlongamentoActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }

}
