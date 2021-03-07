package com.lib.time_monitor


import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project


public class TimeMonitorPlugin implements Plugin<Project> {
    void apply(Project project) {
        System.out.println("========Register TimeMonitor Plugin=========")
        def android = project.extensions.getByType(AppExtension)
        System.out.println("========Register AutoTrackTransform=========")
        TimeMonitorTransform mTimeMonitorTransform = new TimeMonitorTransform()
        android.registerTransform(mTimeMonitorTransform)
    }
}