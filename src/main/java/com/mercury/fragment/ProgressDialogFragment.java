/*
 * Mercury-SSH
 * Copyright (C) 2017 Skarafaz
 *
 * This file is part of Mercury-SSH.
 *
 * Mercury-SSH is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Mercury-SSH is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Mercury-SSH.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mercury.fragment;


public class ProgressDialogFragment {
    public static final String TAG = "PROGRESS_DIALOG";
    private static final String CONTENT_ARG = "CONTENT_ARG";


    protected String message;

    private String content;

    public static ProgressDialogFragment newInstance(String content) {
        ProgressDialogFragment fragment = new ProgressDialogFragment();
        //Bundle args = new Bundle();
        //args.putString(CONTENT_ARG, content);
        //fragment.setArguments(args);
        return fragment;
    }

    public void onCreate() {
        //super.onCreate(savedInstanceState);

        //setStyle(STYLE_NO_FRAME, R.style.DialogTransparent);
        //setCancelable(false);

        //content = getArguments() != null ? getArguments().getString(CONTENT_ARG) : null;
    }

    public void onCreateView() {
        //View view = inflater.inflate(R.layout.dialog_fragment_progress, container, false);
        //ButterKnife.bind(this, view);
        //message.setText(content);
        //return view;
    }
}
