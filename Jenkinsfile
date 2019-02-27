pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'git update-index --chmod=+x gradlew'
                sh './gradle-java-at08/gradlew clean build -p gradle-java-at08'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh './gradle-java-at08/gradlew test -p gradle-java-at08'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}