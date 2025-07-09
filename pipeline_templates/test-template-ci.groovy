pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        build.call()
      }
    }

    stage('Deploy') {
      steps {
        deploy.call()
      }
    }
  }
}
