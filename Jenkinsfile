pipeline {
  agent any
  stages {
    stage('Init') {
      steps {
        sleep 2
        echo 'Init Pipeline'
        sh 'echo $M2_HOME'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn install -DskipTests'
      }
    }

  }
}