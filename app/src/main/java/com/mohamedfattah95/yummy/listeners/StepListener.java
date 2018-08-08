package com.mohamedfattah95.yummy.listeners;

import com.mohamedfattah95.yummy.models.Recipe;
import com.mohamedfattah95.yummy.models.Step;

public interface StepListener {

    void setSelectedStep(Step step, Recipe recipe, int position);
}
