package com.example.android.miwok;

/**
 * Created by czw8 on 30/08/2017.
 */

public class Word {

    private String mDefaultTranlation;
    private String mMiwokTranslation;
    private int mImageResourceId = Word.NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word (String defaultTranlation, String miwokTranslation, int imageResourceId) {
        this.mDefaultTranlation = defaultTranlation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
    }

    public Word (String defaultTranlation, String miwokTranslation) {
        this.mDefaultTranlation = defaultTranlation;
        this.mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranlation() {
        return this.mDefaultTranlation;
    }

    public String getMiwokTranslation() {
        return this.mMiwokTranslation;
    }

    public int getImageResourceId() { return this.mImageResourceId; }

    public boolean hasImage() {
        return mImageResourceId != Word.NO_IMAGE_PROVIDED;
    }


}
