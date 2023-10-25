pipeline{
    agent any
    tools{
        maven '3.9.5'
    }
    stages{
        stage('Build'){
            steps{
                sh 'echo $JAVA_HOME'
                sh 'mvn install'
            }
        }
    }
    post {
            always {
                echo 'One way or another, I have finished'
                deleteDir() /* clean up our workspace */
            }
            success {
                echo 'I succeeeded!'
            }
            unstable {
                echo 'I am unstable :/'
            }
            failure {
                echo 'I failed :('
            }
            changed {
                echo 'Things were different before...'
            }
        }
}