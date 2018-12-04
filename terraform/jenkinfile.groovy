pipeline{
     agent {
	     node{
		  label 'master'
	 }
 }
	  stages {
		    stage('terraform started'){
			  steps{
			      sh 'echo "terraform start"'
			  }
			}
			stage('git clone'){
			  steps{
			      sh 'git clone https://github.com/selvakann/devops.git'
			  }
			}
		    stage('terraform create'){
			  steps{
			      sh 'cp /home/ec2-user/terrajenkins/sg.tf terraform init'
			  }
			}
			stage('terraform init'){
			  steps{
			      sh '/home/ec2-user/terrajenkins/terraform init'
			  }
			}
		    stage('terraform plan'){
			  steps{
			      sh '/home/ec2-user/terrajenkins/terraform plan'
			  }
			}
		    stage('terraform end'){
			  steps{
			      sh 'echo "Ended......"'
			  }
			}
	}
}	
