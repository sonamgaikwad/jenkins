pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                echo 'Pull Done'
            }
        }
        stage('Build') {
            steps {
                echo 'Buld Done'
            }
        }
        stage('Test') {
            steps {
                echo 'Test Done'
            }
        }
        stage('Qulaity-Test') {
            steps {
                echo 'Quality-Check Done'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy Done'
            }
        }
    }
}