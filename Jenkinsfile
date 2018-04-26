pipeline {
  agent any
  stages {
      stage('SonarQube analysis') {
          withSonarQubeEnv('Local Sonar Qube') {
            // requires SonarQube Scanner for Gradle 2.1+
            // It's important to add --info because of SONARJNKNS-281
            sh 'export PATH=$PATH:/home/jenkins/.sdkman/candidates/gradle/current/bin'
            sh 'gradle --info sonarqube'
          }
      }
  }
}
