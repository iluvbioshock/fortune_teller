package android.scottk.crystal_ball;

public class Predictions{
    private static Predictions predictions;
    private String[] answers;

    private Predictions() {
        answers = new String[] {
                "your wish will come to pass.",
                "your wishes will NEVER come true."

        };
    }
    private static Predictions get() {
        if(predictions == null){
          predictions = new Predictions();
        }
        return predictions;
    }
    public String getPrediction() {
        return answers[1];
    }
}
