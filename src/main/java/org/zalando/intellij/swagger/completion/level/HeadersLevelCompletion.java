package org.zalando.intellij.swagger.completion.level;

import com.intellij.codeInsight.completion.CompletionResultSet;
import org.zalando.intellij.swagger.completion.level.field.Fields;
import org.zalando.intellij.swagger.completion.traversal.PositionResolver;

class HeadersLevelCompletion extends LevelCompletion {

    HeadersLevelCompletion(final PositionResolver positionResolver, final CompletionResultSet completionResultSet) {
        super(positionResolver, completionResultSet);
    }

    @Override
    public void fill() {
        Fields.headers().forEach(this::addUnique);
    }
}
