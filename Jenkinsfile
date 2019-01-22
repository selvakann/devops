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
			      sh 'cd /var/lib/jenkins/workspace'
				  sh 'echo "Changing folder....!"'
			  }
			}
			stage('Remove folder'){
			  steps{
			      sh 'cd /var/lib/jenkins/workspace'
			      sh 'rm -rf *'
				  sh 'echo "Remove folder....!"'
			  }
			}
			stage('Git clone'){
			  steps{
			     sh 'git clone https://github.com/selvakann/devops.git'
		             sh 'cd /var/lib/jenkins/workspace/second-job/devops/hasipcorp'
			  }
			}
			
		    stage('terraform init'){
			  steps{
			      sh 'def userInput = input(id: 'confirm', message: 'Apply Terraform?', parameters: [ [defaultValue: false, description: 'Apply terraform', name: 'confirm'] ])
			      
			  }
			}
		    stage('terraform plan'){
			  steps{
			       sh 'terraform plan'
			  }
			}
		stage('terraform apply'){
			  steps{
			      sh 'terraform apply'
			  }
			}
	
}	
}
