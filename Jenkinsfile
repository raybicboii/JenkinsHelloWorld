pipeline {
    agent any
    stages {
        stage("Cleaning Stage") {
            steps {
                sh "mvn clean"
            }
        }
        stage("Testing Stage") {
            steps {
                sh "mvn test"
            }
        }
        stage("Packaging Stage") {
            steps {
                sh "mvn package"
            }
        }
    }
}