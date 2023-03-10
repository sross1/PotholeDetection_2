// Generated by view binder compiler. Do not edit!
package com.dji.droneparking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dji.droneparking.R;
import com.ncorti.slidetoact.SlideToActView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTutorialBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout frameLayout;

  @NonNull
  public final SlideToActView getStartedButton;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  private FragmentTutorialBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout frameLayout, @NonNull SlideToActView getStartedButton,
      @NonNull TextView textView4, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.frameLayout = frameLayout;
    this.getStartedButton = getStartedButton;
    this.textView4 = textView4;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTutorialBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTutorialBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_tutorial, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTutorialBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout frameLayout = (ConstraintLayout) rootView;

      id = R.id.get_started_button;
      SlideToActView getStartedButton = ViewBindings.findChildViewById(rootView, id);
      if (getStartedButton == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new FragmentTutorialBinding((ConstraintLayout) rootView, frameLayout, getStartedButton,
          textView4, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
