/*
 * Copyright (C) 2018 The Android Open Source Project
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

package com.wintmain.dialer.speeddial;

import android.view.View;
import android.view.View.OnClickListener;

import androidx.recyclerview.widget.RecyclerView;

/**
 * ViewHolder for headers in {@link SpeedDialFragment}.
 */
public class RemoveViewHolder extends RecyclerView.ViewHolder implements OnClickListener {

    private final View removeViewContent;

    RemoveViewHolder(View view) {
        super(view);
        removeViewContent = view;
    }

    void show() {
        removeViewContent.setVisibility(View.VISIBLE);
        removeViewContent.setAlpha(0);
        removeViewContent.animate().alpha(1).start();
    }

    void hide() {
        removeViewContent.setVisibility(View.INVISIBLE);
        removeViewContent.setAlpha(1);
        removeViewContent.animate().alpha(0).start();
    }

    @Override
    public void onClick(View v) {
        // Not clickable
    }
}
