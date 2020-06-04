pipeline {
  agent any
  stages {
    stage('Init') {
      steps {
        sleep 2
        echo 'Init Pipeline'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn install -DskipTests'
      }
    }

  }
}