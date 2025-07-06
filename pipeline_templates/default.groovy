pipeline {
    agent any

    stages {
        stage('Pre-Build Hook') {
            steps {
                pre_build()
            }
        }

        stage('Build') {
            steps {
                build()
            }
        }

        stage('Deploy') {
            steps {
                deploy()
            }
        }
    }
}
