@Library('jenkins-ansible-shared-library') _

pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                script {
                    org.example.AnsibleExecutor.cloneRepo(this)
                }
            }
        }

        stage('Notify') {
            steps {
                script {
                    org.example.Notification.sendSlackNotification(this, "Deployment completed successfully")
                }
            }
        }
    }
}
