# -*- mode: ruby -*-
# vi: set ft=ruby :


require 'vagrant-openstack-provider'

Vagrant.configure('2') do |config|
  config.ssh.username = 'ubuntu'
  config.ssh.private_key_path = "windv.pem"

  config.vm.provider :openstack do |os, override|
    os.identity_api_version = ENV['OS_IDENTITY_API_VERSION']
    os.openstack_auth_url = ENV['OS_AUTH_URL']
    os.domain_name        = ENV['OS_DOMAIN_NAME']
    os.username           = ENV['OS_USERNAME']
    os.password           = ENV['OS_PASSWORD']
    os.tenant_name        = ENV['OS_TENANT_NAME']
    os.project_name       = ENV['OS_PROJECT_NAME']
    os.keypair_name       = ENV['OS_KEY_PAIR_NAME']
    os.image              = ENV['OS_IMAGE']
  end

  config.vm.define 'lin-bionic-beaver' do |s|
    s.vm.provision "docker"
    s.vm.provision "docker_compose", compose_version: "1.23.2"
    s.vm.provision "shell", inline: "sudo apt install openjdk-11-jdk -y"
    s.vm.provision "shell", path: "install_jenkins.sh"
    s.vm.provider :openstack do |os, override|
      os.server_name = 'AT08-DMONTANOV-JENKINS'
      os.flavor = ENV['OS_FLAVOR']
      override.vm.synced_folder '.', '/vagrant', disabled:true
    end
  end
end
