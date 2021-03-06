pipelineJob('theme-park-job'){
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/shwethaQS/spring-boot-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
      }
}
pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/shwethaQS/spring-boot-api-example.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}
