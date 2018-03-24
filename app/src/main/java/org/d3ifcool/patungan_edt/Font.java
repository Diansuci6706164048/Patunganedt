package org.d3ifcool.patungan_edt;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by Dian Suci Anggraeni on 3/15/2018.
 */

public class Font extends AppCompatActivity {
    private Typeface fontPathSource;
    private String fontName;

    private ArrayList<Font> fontList = new ArrayList<>();

    public Font(){}
    public Font(Typeface fontPathSource, String fontName) {
        this.fontPathSource = fontPathSource;
        this.fontName = fontName;
    }

    public void addFont(Font newFont) {
        fontList.add(newFont);
    }

    public Typeface getFont(String fontName) {
        Typeface font = null;
        for (int i = 0; i < fontList.size(); i++) {
            if(fontName.equals(fontList.get(i).fontName))
                font = fontList.get(i).fontPathSource;
        }
        return font;
    }
}

