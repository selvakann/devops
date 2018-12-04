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
			stage('git clone'){
			  steps{
			      sh 'sudo git clone https://github.com/selvakann/devops.git'
			  }
			}
		    stage('terraform create'){
			  steps{
			      sh 'sudo cp /home/ec2-user/sg.tf terraform init  ./terrajenkins/'
			  }
			}
			stage('terraform init'){
			  steps{
			      sh 'sudo /home/ec2-user/terraform init  ./terrajenkins'
			  }
			}
		    stage('terraform plan'){
			  steps{
			      sh 'sudo /home/ec2-user/terraform plan  ./terrajenkins'
			  }
			}
		    stage('terraform end'){
			  steps{
			      sh 'echo "Ended......"'
			  }
			}
	}
}	