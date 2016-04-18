package com.izeye.gradle.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by izeye on 16. 4. 18..
 */
class GreetingTask extends DefaultTask {
    
    String greeting = 'hello from GreetingTask'
    
    @TaskAction
    def greet() {
        println greeting
    }
    
}
