package controller;
import javafx.stage.Stage;
import model.CatModel;
import view.CatSlide;
import view.CatVista;

public class CatController {
    private Stage stage;
    private CatModel model;
    private CatVista startView;
    private CatSlide catImageView;
    private int currentIndex;

    public CatController(Stage stage) {
        this.stage = stage;
        this.model = new CatModel();
        this.startView = new CatVista(stage, this); 
        this.currentIndex = 0;

        stage.setScene(startView.getScene());
    }

    public void handleStartButton() {
        this.catImageView = new CatSlide(stage, this);
        updateView();
    }

    public void handleNextButton() {
        if(currentIndex == model.getCatImages().size() - 1){
            currentIndex = 0;
            updateImage();
        }else if (currentIndex < model.getCatImages().size() - 1) {
            currentIndex++;
            updateImage();
        }
    }

    public void handleBackButton() {
        if(currentIndex == 0){
            currentIndex = model.getCatImages().size() - 1;
            updateImage();
        }else if(currentIndex > 0) {
            currentIndex--;
            updateImage();
        }
    }

    private void updateView() {
        stage.setScene(catImageView.getScene());
        String catImageUrl = model.getCatImages().get(currentIndex);
        catImageView.setCatImage(catImageUrl);
    }

    private void updateImage(){
        String catImageUrl = model.getCatImages().get(currentIndex);
        catImageView.setCatImage(catImageUrl);
    }
}
