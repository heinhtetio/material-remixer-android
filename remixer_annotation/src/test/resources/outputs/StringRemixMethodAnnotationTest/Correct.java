/*
 * Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package somepackage;

import com.google.android.libraries.remixer.Callback;
import com.google.android.libraries.remixer.Remixer;
import com.google.android.libraries.remixer.Variable;
import com.google.android.libraries.remixer.annotation.RemixerBinder;
import java.lang.Override;
import java.lang.String;

/**
 * This class was generated by RemixerAnnotationProcessor */
public class Correct_RemixerBinder implements RemixerBinder.Binder<Correct> {
  @Override
  public void bindInstance(Correct activity) {
    Remixer remixer;
    if (activity.remixer == null) {
      remixer = new Remixer();
    } else {
      remixer = activity.remixer;
    }
    Generated_correct correct_callback = new Generated_correct(activity);
    Variable<String> correct_variable = new Variable<String>("correct", "correct", "", correct_callback, 0);
    correct_variable.init();
    remixer.addItem(correct_variable);
    activity.remixer = remixer;
  }

  static class Generated_correct implements Callback<String> {
    private final Correct activity;

    Generated_correct(Correct activity) {
      this.activity = activity;
    }

    @Override
    public void onValueSet(Variable<String> variable) {
      activity.correct(variable.getSelectedValue());
    }
  }
}
