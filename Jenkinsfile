pipeline{
  agent any
  def mvnHome = 'C:\\apache-maven-3.9.9'

  stages{
    stage('Build'){
      steps{
        bat "\"${mvnHome}\\bin\\mvn\" clean install"
      }
    }
    stage('Test'){
      steps{
        bat "\"${mvnHome}\\bin\\mvn\" clean install"
      }
    }
  }
}
