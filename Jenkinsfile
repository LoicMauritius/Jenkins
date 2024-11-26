pipeline {
    agent any

    // Ecoute le webhook ( en cours... )
    //triggers {
        // Polling pour écouter les événements du webhook
        //pollSCM('')
    //}

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
        stage('Run') {
            steps {
                echo "Démarrage de l'application..."
                bat "java -jar target/HelloWorld-1.0-SNAPSHOT.jar"
            }
        }
        //stage('Deploy') {
            //steps {
                //echo "Déploiement de l'application..."
                // Exemple de déploiement, ajustez selon vos besoins
                //bat "scp target/HelloWorld-1.0-SNAPSHOT.jar user@server:/chemin/vers/deploiement"
            //}
        //}
    }
}
