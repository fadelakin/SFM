package com.fisheradelakin.interactivestory.model;

import com.fisheradelakin.interactivestory.R;

/**
 * Created by Fisher on 12/8/14.
 */
public class Story {
    private Page[] mPages;

    public Story() {
        mPages = new Page[7];

        mPages[0] = new Page();
        mPages[0].setImageId(R.drawable.page0);
        mPages[0].setText("test");
        mPages[0].setChoice1(new Choice());
        mPages[0].setChoice2(new Choice());
    }
}
