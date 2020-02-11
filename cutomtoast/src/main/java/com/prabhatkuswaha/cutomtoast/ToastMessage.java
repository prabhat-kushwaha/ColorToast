package com.prabhatkuswaha.cutomtoast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class ToastMessage {

    @RequiresApi(api = Build.VERSION_CODES.M)
    public static void showSuccessMessage(Context mContext, String message, int mToastLength) {
        Toast toast = Toast.makeText(mContext, message, mToastLength);
        View toastView = toast.getView();
        ((TextView) toastView.findViewById(android.R.id.message)).setTextColor(mContext.getColor(R.color.textColor));
        toastView.setBackground(mContext.getDrawable(R.drawable.toast_success_message_bg));
        toast.show();
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    public static void showDoneMessage(Context mContext, String message, int mToastLength) {
        Toast toast = Toast.makeText(mContext, message, mToastLength);
        View toastView = toast.getView();
        TextView toastTextView = toastView.findViewById(android.R.id.message);
        toastTextView.setTextColor(mContext.getColor(R.color.textColor));
       toastTextView.setCompoundDrawablePadding(20);
        toastTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(mContext.getDrawable(R.drawable.ic_done_black_24dp), null, null, null);
        toastView.setBackground(mContext.getDrawable(R.drawable.toast_success_message_bg));
        toast.show();
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    public static void showErrorMessage(Context mContext, String message, int mToastLength) {
        Toast toast = Toast.makeText(mContext, message, mToastLength);
        View toastView = toast.getView();
        TextView toastTextView = toastView.findViewById(android.R.id.message);
        toastTextView.setTextColor(mContext.getColor(R.color.textColor));
        toastTextView.setCompoundDrawablePadding(20);
        toastTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(mContext.getDrawable(R.drawable.ic_error_outline_black_24dp), null, null, null);
        toastView.setBackground(mContext.getDrawable(R.drawable.toast_failure_message_bg));
        toast.show();
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    public static void showWarningMessage(Context mContext, String message, int mToastLength) {
        Toast toast = Toast.makeText(mContext, message, mToastLength);
        View toastView = toast.getView();
        TextView toastTextView = toastView.findViewById(android.R.id.message);
        toastTextView.setTextColor(mContext.getColor(R.color.textColor));
        toastTextView.setCompoundDrawablePadding(20);
        toastTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(mContext.getDrawable(R.drawable.ic_warning_black_24dp), null, null, null);
        toastView.setBackground(mContext.getDrawable(R.drawable.toast_failure_message_bg));
        toast.show();
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    public static void showFailureMessage(Context mContext, String message, int mToastLength) {
        Toast toast = Toast.makeText(mContext, message, mToastLength);
        View toastView = toast.getView();
        ((TextView) toastView.findViewById(android.R.id.message)).setTextColor(mContext.getColor(R.color.textColor));
        toastView.setBackground(mContext.getDrawable(R.drawable.toast_failure_message_bg));
        toast.show();
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    public static void showCustomMessage(Context mContext, String message, int mToastLength, int color, Drawable drawble, String drawableAlignment) {
        Toast toast = Toast.makeText(mContext, message, mToastLength);
        View toastView = toast.getView();
        TextView toastTextView = toastView.findViewById(android.R.id.message);
        toastTextView.setTextColor(mContext.getColor(R.color.textColor));
        toastTextView.setCompoundDrawablePadding(20);
        if (drawableAlignment.equals(Constants.TOP))
            toastTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, drawble, null, null);
        if (drawableAlignment.equals(Constants.LEFT))
            toastTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawble, null, null, null);
        if (drawableAlignment.equals(Constants.RIGHT))
            toastTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, drawble, null);
        if (drawableAlignment.equals(Constants.BOTTOM))
            toastTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, null, drawble);
        toastView.setBackgroundColor(color);
        toast.show();
    }

}
