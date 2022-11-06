package trafficLights;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void changeColor(){
        switch (this.color){
            case RED:
                this.color = Color.GREEN;
                break;
            case YELLOW:
                this.color = Color.RED;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
        }
    }
}
