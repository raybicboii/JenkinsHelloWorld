pipeline {
    agent any
    tools {
        maven 'Maven 3.9.9'
        jdk 'JDK 17 homebrew'
    }
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
        stage("Consolidate Results") {
            input("Do you want to capture results?")
            junit '**/target/surefire-reports/TEST-*.xml'
            archive 'target/*.jar'
        }
    }
}