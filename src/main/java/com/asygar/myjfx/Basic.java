package com.asygar.myjfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Basic extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.LIGHTBLUE);
        Stage stage = new Stage();

        stage.setX(1000);
        stage.setY(30);
        stage.setResizable(false);

        Text text = new Text();
        text.setText("Asygar");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 20));
        text.setFill(Color.ORANGE);

        Line line = new Line();
        line.setStartX(50);
        line.setStartY(80);
        line.setEndX(120);
        line.setEndY(80);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.AQUA);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
        );
        triangle.setFill(Color.GREENYELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.BLUEVIOLET);

        Image image = new Image("D:\\Java\\myJFX\\src\\main\\java\\img\\bocchi.jpeg");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();
    }
}
