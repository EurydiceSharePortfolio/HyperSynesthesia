package com.dakkra.hypersynesthesia;

import com.acromere.zerra.javafx.Fx;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HSLogo extends ImageView {

	public HSLogo() {
		super( new Image( "/hs-logo.png", 256, 256, true, true ) );
	}

	static void main( String[] ignore ) {
		Fx.startup();

		Fx.run( () -> {
			HSLogo logo = new HSLogo();

			BorderPane borderPane = new BorderPane( logo );
			Scene scene = new Scene( borderPane, 256, 256 );

			Stage stage = new Stage();
			stage.setScene( scene );
			stage.show();
		} );
	}

}
