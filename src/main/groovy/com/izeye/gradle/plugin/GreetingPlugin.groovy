package com.izeye.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by izeye on 16. 4. 18..
 */
class GreetingPlugin implements Plugin<Project> {
    
    @Override
    void apply(Project project) {
        project.task('hello', type: GreetingTask)
    }
    
}
