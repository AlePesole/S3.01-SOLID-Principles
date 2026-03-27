public class InstrumentPlayer {
    public void play(Instrument instrument) {
        instrument.play();
    }

    public static void main(String[] args) {
        InstrumentPlayer player = new InstrumentPlayer();
        player.play(new Guitar());
        player.play(new Drums());
        player.play(new Piano());
    }
}
