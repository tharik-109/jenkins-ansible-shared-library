package org.example

class Notification {
    static void sendSlackNotification(script, String message) {
        script.stage('Send Notification') {
            def slackChannel = script.readYaml(file: 'vars/config.yaml').SLACK_CHANNEL_NAME
            script.sh """
            curl -X POST --data-urlencode 'payload={"channel": "#${slackChannel}", "text": "${message}"}' \
            https://hooks.slack.com/services/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
            """
        }
    }
}
