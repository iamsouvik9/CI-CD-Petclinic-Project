pipeline {
  agent any
  
  tools{
        jdk 'jdk11'
        maven 'maven3'
        }
        
    environment{
        SCANNER_HOME=tool 'sonar-scanner'
    }
  
  stages {
    stage('Git Checkout') {
      steps {
        // Git checkout
        git branch: 'main', url: 'https://github.com/iamsouvik9/CI-CD-Petclinic-Project.git'
      }
    }
    
    stage('Maven Compile') {
      steps {
        // Maven compile
        sh 'mvn compile'
      }
    }
    
    stage('SonarQube Analysis') {
      steps {
          withSonarQubeEnv('sonar-server') {
                sh '''$SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Petclinic \
                -Dsonar.java.binaries=. \
                -Dsonar.projectKey=Petclinic '''
        }
      }
    }
    
    stage('Maven Package') {
      steps {
        // Maven package
        sh 'mvn package'
      }
    }
    
    stage('Deploy to Tomcat') {
      steps {
        // Deploy to Tomcat
        sh 'cp target/*.war /opt/apache-tomcat-9.0.65/webapps'
      }
    }
  }
}
