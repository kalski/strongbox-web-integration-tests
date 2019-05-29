import groovy.transform.BaseScript
import org.carlspring.strongbox.artifact.generator.DockerArtifactGenerator
import java.nio.file.Paths
import java.nio.file.Files

def baseScript = new GroovyScriptEngine( "$project.basedir/src/it" ).with {
    loadScriptByName( 'BaseDockerRegistryWebIntegrationTest.groovy' )
  }
this.metaClass.mixin baseScript

println "Test test-docker-registry-common-flow.groovy" + "\n\n"

def targetPath = getTargetPath(project)
