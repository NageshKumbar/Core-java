package com.xworkz.runner;

import com.xworkz.external.*;
import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {
        JDBC jdbc = new OracleJDBC();
        JDBC jdbc1 = new MysqlJDBC();
        RCBApp rcbApp = new RCBApp(jdbc1);
        rcbApp.saveTeamInfo();

        Upscaler simpleUpscaler = new SimpleUpscaler();
        Upscaler neuralUpscaler = new NeuralUpscaler();
        ImageUpscalerApp imageUpscaler = new ImageUpscalerApp(neuralUpscaler);
        imageUpscaler.upscaleImage();

        TextClean ocrCleaner = new OCRCleaner();
        TextClean manualTextRefiner = new ManualTextRefiner();
        TextRefinerApp textRefiner = new TextRefinerApp(ocrCleaner);
        textRefiner.refineText();

        FilterApp vintageFilter = new VintageFilter();
        FilterApp hdrFilter = new HDRFilter();
        FilterApplicatorApp filterApp = new FilterApplicatorApp(hdrFilter);
        filterApp.applyImageFilter();

        EdgeFix antiAliaser = new AntiAliaser();
        EdgeFix blurEdges = new BlurEdges();
        EdgeSmootherApp edgeSmoother = new EdgeSmootherApp(antiAliaser);
        edgeSmoother.smoothImageEdges();

        Brightner autoExposureFixer = new AutoExposureFixer();
        Brightner shadowHighlighter = new ShadowHighlighter();
        LightingCorrectorApp lightingCorrector = new LightingCorrectorApp(shadowHighlighter);
        lightingCorrector.correctLighting();
    }
}
