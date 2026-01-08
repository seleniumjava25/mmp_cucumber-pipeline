pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'mvn clean'
            }
        }
        stage('Test') {
            steps {
              
         bat 'mvn clean test'
        }}
      
stage('Deploy') {
            steps {
                echo 'Deploying....'
            
            }
        }
    }
}
