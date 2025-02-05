package org.example

class AnsibleExecutor {
    static void cloneRepo(script) {
        script.stage('Clone Repository') {
            script.echo "Cloning the repository..."
            script.git url: 'https://github.com/tharik-109/jenkins-ansible-shared-library.git', branch: 'main'
        }
    }
}

static void runAnsible(script) {
    script.stage('Run Ansible Playbook') {
        script.sh '''
        ansible-playbook playbooks/deploy.yml
        '''
    }
}
