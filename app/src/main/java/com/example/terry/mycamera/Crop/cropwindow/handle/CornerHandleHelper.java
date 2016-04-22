package com.example.terry.mycamera.Crop.cropwindow.handle;

/**
 * Created by bthvi on 2016/3/4.
 */
import android.graphics.Rect;

import com.example.terry.mycamera.Crop.cropwindow.edge.Edge;
import com.example.terry.mycamera.Crop.cropwindow.edge.EdgePair;

/**
 * HandleHelper class to handle corner Handles (i.e. top-left, top-right,
 * bottom-left, and bottom-right handles).
 */
class CornerHandleHelper extends HandleHelper {

    // Constructor /////////////////////////////////////////////////////////////

    CornerHandleHelper(Edge horizontalEdge, Edge verticalEdge) {
        super(horizontalEdge, verticalEdge);
    }

    // HandleHelper Methods ////////////////////////////////////////////////////

    @Override
    void updateCropWindow(float x,
                          float y,
                          float targetAspectRatio,
                          Rect imageRect,
                          float snapRadius) {

        final EdgePair activeEdges = getActiveEdges(x, y, targetAspectRatio);
        final Edge primaryEdge = activeEdges.primary;
        final Edge secondaryEdge = activeEdges.secondary;

        primaryEdge.adjustCoordinate(x, y, imageRect, snapRadius, targetAspectRatio);
        secondaryEdge.adjustCoordinate(targetAspectRatio);

        if (secondaryEdge.isOutsideMargin(imageRect, snapRadius)) {
            secondaryEdge.snapToRect(imageRect);
            primaryEdge.adjustCoordinate(targetAspectRatio);
        }
    }
}
