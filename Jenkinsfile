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

        //stage('User Approval') {
          //  steps {
            //    script {
              //      org.example.UserApproval.requestApproval(this)
                //}
            //}
        //}
//
  //      stage('Execute Ansible') {
      //      steps {
    //            script {
        //            org.example.AnsibleExecutor.runAnsible(this)
            //    }
          //  }
        //}

        stage('Notify') {
            steps {
                script {
                    org.example.Notification.sendSlackNotification(this, "Deployment completed successfully")
                }
            }
        }
    }
}
