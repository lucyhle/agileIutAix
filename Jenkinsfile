pipeline {
  agent any
  stages {
    stage('Init') {
      parallel {
        stage('Init') {
          steps {
            sleep 2
            echo 'Init Pipeline'
            sh '''

pwd'''
          }
        }

        stage('Init parralele ') {
          steps {
            echo 'message '
            sleep 5
            sh 'echo $PATH'
          }
        }

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