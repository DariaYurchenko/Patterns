package challenges.memento;

public class Originator {
    private int state1;
    private int state2;

    public Memento save() {
        return new Memento(state1, state2);
    }

    public void restore(Memento memento) {
        this.state1 = memento.getState1();
        this.state2 = memento.getState2();
    }

    public static class  Memento {
        private int state1;
        private int state2;

        public Memento(int state1, int state2) {
            this.state1 = state1;
            this.state2 = state2;
        }

        public int getState1() {
            return state1;
        }

        public int getState2() {
            return state2;
        }
    }


}
