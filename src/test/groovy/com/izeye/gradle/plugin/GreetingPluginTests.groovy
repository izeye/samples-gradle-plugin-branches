package com.izeye.gradle.plugin

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.assertTrue

/**
 * Created by izeye on 16. 4. 18..
 */
class GreetingPluginTests {
    
    @Test
    public void greeterPluginAddsGreetingTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'com.izeye.gradle.plugin.greeting'
        
        assertTrue(project.tasks.hello instanceof GreetingTask)
    }
    
}
