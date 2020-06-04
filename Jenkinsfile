pipeline {
  agent any
  stages {
    stage('Init') {
      steps {
        sleep 2
        echo 'Init Pipeline'
        sh '''

pwd'''
      }
    }

    stage('Build') {
      steps {
        sh 'mvn install -DskipTests'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

  }
}