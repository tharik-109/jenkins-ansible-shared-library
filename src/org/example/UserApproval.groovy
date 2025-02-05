package org.example

class UserApproval {
    static void requestApproval(script) {
        script.stage('User Approval') {
            if (script.readYaml(file: 'vars/config.yaml').KEEP_APPROVAL_STAGE) {
                script.input message: 'Do you approve this deployment?', ok: 'Proceed'
            }
        }
    }
}
