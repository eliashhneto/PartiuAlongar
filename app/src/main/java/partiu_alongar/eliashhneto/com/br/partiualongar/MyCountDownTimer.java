package partiu_alongar.eliashhneto.com.br.partiualongar;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by eliashhneto on 12/04/16.
 */
public class MyCountDownTimer extends CountDownTimer{
    private TextView tv;
    private Context context;
    private long timeInFuture;
    private Vibrator vibrator;

    public MyCountDownTimer(Context context, TextView tv, long timeInFuture, long interval) {
        super(timeInFuture, interval);
        interval = interval;
        this.tv = tv;
        this.context = context;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        timeInFuture = millisUntilFinished;
        tv.setText(getCorrectTimer(true, millisUntilFinished)+":"+getCorrectTimer(false, millisUntilFinished));
    }

    @Override
    public void onFinish() {
        timeInFuture -= 1000;
        tv.setText(getCorrectTimer(true, timeInFuture)+":"+getCorrectTimer(false, timeInFuture));
        //Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        //vibrator.vibrate(300);
        Toast.makeText(context, "Fim do alongamento", Toast.LENGTH_SHORT).show();
        //finalizar();
    }

    private void finalizar() {
        Toast.makeText(context, "Fim do alongamento", Toast.LENGTH_SHORT).show();
        //tv.setText("00:00");
    }

    private String getCorrectTimer(boolean isMinute, long millisUntilFinished){
        String aux;
        int constCalendar = isMinute ? Calendar.MINUTE : Calendar.SECOND;
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(millisUntilFinished);
        aux = c.get(constCalendar) < 10 ? "0"+c.get(constCalendar) : ""+c.get(constCalendar);
        return(aux);
    }
}
