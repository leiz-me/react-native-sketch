package com.stefannew.rnsketch;

import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class RNSketchViewManager extends SimpleViewManager<RNSketchView> {

    protected static final String REACT_CLASS = "RNSketch";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected RNSketchView createViewInstance(ThemedReactContext reactContext) {
        return new RNSketchView(reactContext);
    }

    @ReactProp(name = "strokeColor")
    public void setStrokeColor(RNSketchView view, String strokeColor) {
        view.setStrokeColor(strokeColor);
    }

    @ReactProp(name = "strokeThickness")
    public void setStrokeThickness(RNSketchView view, int strokeThickness) {
        view.setStrokeThickness(strokeThickness);
    }

    @ReactProp(name = "imageType")
    public void setImageType(RNSketchView view, String imageType) {
        view.setImageType(imageType);
    }
}
