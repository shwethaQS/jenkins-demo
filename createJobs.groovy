pipelineJob('theme-park-job'){
    definition {
        cpsScm{
            scm {
                git{
                    remote {
                        url 'https://github.com/shwethaQS/jenkins-demo.git'
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
