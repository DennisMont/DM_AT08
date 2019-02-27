pipeline {
    agent any

    stages {
        stage('Install') {
            sh 'bundle install'
        }

        stage('Build') {
            steps {
                echo 'Building..'
                sh 'git update-index --chmod=+x ./gradle-java-at08/gradlew'
                sh './gradle-java-at08/gradlew clean build -p gradle-java-at08'
                sh 'bundle exec rake build spec'
                archive includes: 'pkg/*.gem'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing..'
                sh './gradle-java-at08/gradlew test -p gradle-java-at08'

                publishHTML target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: true,
                    reportDir: 'coverage',
                    reportFiles: 'index.html',
                    reportName: 'RCov Report'
                ]
            }
        }
            
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh './gradle-java-at08/gradlew jar'
            }
        }

        post {
            always {
                archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
                junit 'build/reports/**/*.xml'
            }
        }
    }
}