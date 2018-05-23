package Games.AsteroidGame;

public class GameObject {

    private javafx.geometry.Point2D velocity = new javafx.geometry.Point2D(0,0);

    private boolean isAlive = true;


    private javafx.scene.Node view;

    public GameObject(javafx.scene.Node view) {
        this.view = view;
    }
    public void update(){
        view.setTranslateX(view.getTranslateX()+velocity.getX());
        view.setTranslateY(view.getTranslateY()+velocity.getY());
    }
    public double getRotate(){
        return view.getRotate();
    }
    public void rotateRight(){
        view.setRotate(getRotate()+10);
        setVelocity((new javafx.geometry.Point2D(Math.cos(Math.toRadians(getRotate())),Math.sin(Math.toRadians(getRotate())))));

}

    public void rotateLeft(){
        view.setRotate(getRotate()-10);
        setVelocity((new javafx.geometry.Point2D(Math.cos(Math.toRadians(getRotate())),Math.sin(Math.toRadians(getRotate())))));
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public javafx.geometry.Point2D getVelocit() {
        return velocity;
    }

    public void setVelocity(javafx.geometry.Point2D velocity) {
        this.velocity = velocity;
    }
    public boolean isDead(){
       return !isAlive;
    }

    public javafx.scene.Node getView() {
        return view;
    }
    public boolean isColliding(GameObject other){
        return getView().getBoundsInParent().intersects(other.getView().getBoundsInParent());
    }

}
