package android.scottk.crystal_ball;

import android.gesture.Prediction;

/**
 * Created by Student on 9/19/2014.
 */
public class Predictions {
    private static Predictions predictions;
    private String[] answers;

    private Predictions() {
        answers = new String[] {
                "your wish will come to pass.",
                "Your wishes will NEVER come true"

        };
    }
    private static Predictions get() {
        if(predictions == null){
          predictions = new Predictions();
        }
        return predictions;
    }
    public String getPrediction() {
        return answers[0];
    }
}
