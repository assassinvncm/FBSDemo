pipeline{
    agent {
        label 'docker-slave'
    }
//     tools{
//         maven '3.9.5'
//         jdk 'jdk-17'
//     }
    stages{
        stage('Maven Build'){
            steps{
                sh 'mvn clean'
                sh 'mvn install'
            }
        }
        stage('Docker Build'){
            steps{
                sh 'docker --version'
                sh 'docker compose build'
                sh 'docker compose push'
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