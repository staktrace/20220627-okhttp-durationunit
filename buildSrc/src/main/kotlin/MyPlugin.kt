import okhttp3.OkHttpClient
import okhttp3.Request
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("okhttp") {
            doLast {
                println("Attempting to use okhttp...")
                useOkHttp()
                println("... attempt appears to have been successful!")
            }
        }
    }

    private fun useOkHttp() {
        val client = OkHttpClient.Builder().build()
        val request = Request.Builder()
            .url("https://staktrace.com")
            .addHeader("Cache-Control", "max-age=10")
            .build()
        val response = client.newCall(request).execute()
        println("Got response: $response")
    }
}
