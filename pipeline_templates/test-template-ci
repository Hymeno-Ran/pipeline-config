pipeline {
  agent any

  stages {
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
