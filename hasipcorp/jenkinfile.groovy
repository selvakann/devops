pipeline{
     agent {
	     node{
		  label 'master'
	 }
 }
	  stages {
		    stage('terraform started'){
			  steps{
			      sh 'echo "terraform start....!"'
			  }
			}
			stage('change folder'){
			  steps{
			      sh 'cd /var/lib/jenkins/workspace/second'
				  sh 'echo "Changing folder....!"'
			  }
			}
			stage('Remove folder'){
			  steps{
			      sh 'cd /var/lib/jenkins/workspace/second'
			      sh 'rm -rf *'
				  sh 'echo "Remove folder....!"'
			  }
			}
			stage('Git clone'){
			  steps{
			      sh 'cd /var/lib/jenkins/workspace/second'
			      sh 'git clone https://github.com/selvakann/devops.git'
			  }
			}
			
		    stage('terraform init'){
			  steps{
			      sh '/var/lib/jenkins/workspace/second/devops/hasipcorp'
			      sh 'terraform init'
			  }
			}
		    stage('terraform plan'){
			  steps{
			      sh '/var/lib/jenkins/workspace/second/devops/hasipcorp'
			      sh 'terraform plan'
			  }
			}
		stage('terraform apply'){
			  steps{
			       sh '/var/lib/jenkins/workspace/second/devops/hasipcorp'
			      sh 'terraform apply'
			  }
			}
	
}	
}



