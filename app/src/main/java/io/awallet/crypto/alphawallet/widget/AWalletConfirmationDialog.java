package io.awallet.crypto.alphawallet.widget;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import io.awallet.crypto.alphawallet.R;

public class AWalletConfirmationDialog extends Dialog {
    private TextView title;
    private TextView smallText;
    private TextView mediumText;
    private TextView bigText;
    private TextView extraText;
    private Button btnPrimary;
    private Button btnSecondary;
    private Context context;

    public AWalletConfirmationDialog(@NonNull Activity activity) {
        super(activity);
        this.context = activity;

        setContentView(R.layout.dialog_awallet_confirmation);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setCanceledOnTouchOutside(true);
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        title = findViewById(R.id.dialog_main_text);
        smallText = findViewById(R.id.dialog_small_text);
        mediumText = findViewById(R.id.dialog_medium_text);
        bigText = findViewById(R.id.dialog_big_text);
        extraText = findViewById(R.id.dialog_extra_text);
        btnPrimary = findViewById(R.id.dialog_button1);
        btnSecondary = findViewById(R.id.dialog_button2);

        extraText.setVisibility(View.GONE);
    }

    public void setTitle(int resId) {
        title.setText(context.getResources().getString(resId));
    }

    public void setPrimaryButtonText(int resId) {
        btnPrimary.setText(context.getResources().getString(resId));
    }

    public void setSecondaryButtonText(int resId) {
        btnSecondary.setText(context.getResources().getString(resId));
    }

    public void setPrimaryButtonListener(View.OnClickListener listener) {
        btnPrimary.setOnClickListener(listener);
    }

    public void setSecondaryButtonListener(View.OnClickListener listener) {
        btnSecondary.setOnClickListener(listener);
    }

    public void setBigText(CharSequence text) {
        bigText.setVisibility(View.VISIBLE);
        bigText.setText(text);
    }

    public void setBigText(int resId) {
        bigText.setVisibility(View.VISIBLE);
        bigText.setText(context.getResources().getString(resId));
    }

    public void setSmallText(int resId) {
        smallText.setVisibility(View.VISIBLE);
        smallText.setText(context.getResources().getString(resId));
    }

    public void setSmallText(CharSequence text) {
        smallText.setVisibility(View.VISIBLE);
        smallText.setText(text);
    }

    public void setMediumText(int resId) {
        mediumText.setVisibility(View.VISIBLE);
        mediumText.setText(context.getResources().getString(resId));
    }

    public void setMediumText(CharSequence text) {
        mediumText.setVisibility(View.VISIBLE);
        mediumText.setText(text);
    }

    public void setExtraText(int resId) {
        extraText.setVisibility(View.VISIBLE);
        extraText.setText(context.getResources().getString(resId));
    }

    public void showShareLink() {
        ImageView shareIcon = findViewById(R.id.image_share);
        shareIcon.setVisibility(View.VISIBLE);
    }
}
