node {
    stage ("Pull Repo"){
        echo  "Hello"

    }
    stage ("Build Image"){
        sh "Packer version"
        
    }
    stage ("Send Notifications to Slack"){
        echo "Hello"
        
    }
    stage ("Send Email"){
        echo "Hello"
        
    }
}
