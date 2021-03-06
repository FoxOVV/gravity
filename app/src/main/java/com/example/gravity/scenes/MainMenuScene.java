package com.example.gravity.scenes;

import android.graphics.Color;

import com.example.gravity.R;
import com.example.gravity.utilites.SettingsGame;
import com.example.gravity.utilites.UtilResource;
import com.example.my_framework.CoreFW;
import com.example.my_framework.SceneFW;

public class MainMenuScene extends SceneFW {

    public MainMenuScene(CoreFW coreFW) {
        super(coreFW);
    }

    @Override
    public void update() {
        //В диапазоне от 20 до 119 по X и от 251 до 300 по Y
        if (coreFW.getTouchListenerFW().getTouchUp(20,300,220,50)) {
            coreFW.setScene(new GameScene(coreFW));
            if (SettingsGame.sSoundOn) {
                UtilResource.sTouch.play(1);
            }
        }

        if (coreFW.getTouchListenerFW().getTouchUp(20,400,220,50)) {
            coreFW.setScene(new TopDistance(coreFW));
            if (SettingsGame.sSoundOn) {
                UtilResource.sTouch.play(1);
            }
        }

        if (coreFW.getTouchListenerFW().getTouchUp(20,350,220,50)) {
            coreFW.setScene(new SettingsScene(coreFW));
            if (SettingsGame.sSoundOn) {
                UtilResource.sTouch.play(1);
            }
        }

        if (coreFW.getTouchListenerFW().getTouchUp(20,450,280,50)) {
            coreFW.setScene(new ExitScene(coreFW));
        }
    }

    @Override
    public void drawing() {
        graphicsFW.clearScene(Color.BLACK);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_nameGame), 100, 100, Color.BLUE, 60, UtilResource.mainMenuFont);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_newGame), 20, 300, Color.BLUE, 40, UtilResource.mainMenuFont);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_settings), 20, 350, Color.BLUE, 40, UtilResource.mainMenuFont);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_results), 20, 400, Color.BLUE, 40, UtilResource.mainMenuFont);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_exitGame), 20, 450, Color.BLUE, 40, UtilResource.mainMenuFont);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
