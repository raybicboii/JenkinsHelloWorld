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
            steps {
                input("Do you want to capture results?")
                junit '**/target/surefire-reports/TEST-*.xml'
                archive 'target/*.jar'
            }
        }
        stage("Email Build Status") {
            steps {
                mail body: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - ${currentBuild.currentResult}
                Check console output at ${env.BUILD_URL} to view the results",
                subject: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER}"
                to: 'rayboogie1224@gmail.com'
                "
            }
        }
    }
}