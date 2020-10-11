pipeline {
    agent any

    stages {
        stage('Checkout') {
            git url: 'https://github.com/simouridi/jenkinsPipeline.git', branch: 'master'
        }

        stage('Verify Branch') {
            steps {
                echo "$GIT_BRANCH"
            }
        }
        stage('Docker Build') {
            steps {
                sh(script: 'docker images -a')
            }
        }
    }
}