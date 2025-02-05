package org.example

class AnsibleExecutor {
    static void cloneRepo(script) {
        script.stage('Clone Repository') {
            script.echo "Cloning the repository..."
            script.git url: 'https://github.com/your-repo.git', branch: 'main'
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
