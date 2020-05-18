/**
* Copyright (c) Facebook, Inc. and its affiliates.
*
* This source code is licensed under the MIT license found in the
* LICENSE file in the root directory of this source tree.
*
* @generated by codegen project: GeneratePropsJavaInterface.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;

public interface DatePickerManagerInterface<T extends View> {
  void setDate(T view, float value);
  void setInitialDate(T view, float value);
  void setLocale(T view, @Nullable String value);
  void setMaximumDate(T view, float value);
  void setMinimumDate(T view, float value);
  void setMinuteInterval(T view, @Nullable Integer value);
  void setMode(T view, @Nullable String value);
  void setTimeZoneOffsetInMinutes(T view, float value);
  void setNativeDate(T view, float date);
}