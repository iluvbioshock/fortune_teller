package android.scottk.crystal_ball;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class CrystalBall extends Activity {

    private TextView answerText;
    private SensorManage

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crystal_ball);

        answerText = (TextView) findViewById(R.id.answerText);
        answerText.setText(Predictions.get().getPrediction());
    }

}