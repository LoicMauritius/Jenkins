pipeline {
    agent any

    triggers {
        // Polling pour écouter les événements du webhook
        pollSCM('')
    }

    environment {
        MAVEN_HOME = "C:/apache-maven-3.9.9/bin"
    }

    stages {
        stage('Checkout') {
            steps {
                // Récupérer le code source de la branche cible
                git branch: 'main', url: 'https://github.com/LoicMauritius/Jenkins.git'
            }
        }
        stage('Build') {
            steps {
                echo "Lancement du build..."
                bat "${env.MAVEN_HOME}/mvn clean install"
            }
        }
        stage('Test') {
            steps {
                echo "Lancement des tests..."
                bat "${env.MAVEN_HOME}/mvn test"
            }
        }
    }
}
