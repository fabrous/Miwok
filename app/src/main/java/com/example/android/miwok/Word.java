package com.example.android.miwok;

/**
 * Created by czw8 on 30/08/2017.
 */

public class Word {

    private String mDefaultTranlation;
    private String mMiwokTranslation;

    public Word (String DefaultTranlation, String MiwokTranslation) {
        this.mDefaultTranlation = DefaultTranlation;
        this.mMiwokTranslation = MiwokTranslation;
    }

    public void setDefaultTranlation(String DefaultTranlation) {
        this.mDefaultTranlation = DefaultTranlation;
    }

    public void setMiwokTranslation(String MiwokTranslation) {
        this.mMiwokTranslation = MiwokTranslation;
    }

    public String getDefaultTranlation() {
        return this.mDefaultTranlation;
    }

    public String getMiwokTranslation() {
        return this.mMiwokTranslation;
    }

}
