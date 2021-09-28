package com.udacity.catpoint.image.service;

import java.awt.image.BufferedImage;

public interface ImageInterface {
    boolean imageContainsCat(BufferedImage image, float confidenceThreshold);
}
