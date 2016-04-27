/**
 * Copyright (C) 2016 Dominic Davies (domrdavies@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dominicdavies.filtertoarrow;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimatedVectorDrawable filterToArrow;
    private AnimatedVectorDrawable arrowToFilter;
    private ImageView iv;
    private boolean expanded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.search);

        filterToArrow = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim_filter_to_arrow);
        arrowToFilter = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim_filter_to_arrow_reverse);
    }

    public void animate(View view) {

        if (!expanded) {
            iv.setImageDrawable(filterToArrow);
            filterToArrow.start();
        } else {
            iv.setImageDrawable(arrowToFilter);
            arrowToFilter.start();
        }
        expanded = !expanded;

    }
}