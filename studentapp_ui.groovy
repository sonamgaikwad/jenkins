pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/sonamgaikwad/studentapp.ui'
                echo 'pull is done'
            }
        }
                stage('Build') {
            steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'Here we are deploying the code'
            }
        }
                stage('Test') {
            steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn sonar:sonar -Dsonar.projectKey=studentapp-ui -Dsonar.host.url=http://13.232.183.216:9000 -Dsonar.login=2002ded99e7e12bffeb5216f0e8bf794db8cbd5e'
                echo 'Testing done'
            }
        }
                stage('Deploy') {
            steps {
                echo 'Deploy done'
            }
        }
    }
}