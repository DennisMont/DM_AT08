# -*- mode: ruby -*-
# vi: set ft=ruby :


require 'vagrant-openstack-provider'

<<<<<<< HEAD
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
=======
Vagrant.configure("2") do |config|
config.ssh.username = 'ubuntu'
config.ssh.private_key_path = "must.be.set"

config.vm.provider :openstack do |os, override |
  os.identity_api_version = '3'
  os.openstack_auth_url = 'http://10.28.3.240:5000/v3'
  os.domain_name = 'fundacion-jala'
  os.username = 'DennisMontano'
  os.password = 'must.be.set'
  os.tenant_name = 'f5527e2bbb5d4bff9d302058f106a9f6'
  os.project_name  = 'fj_dennismontano_at08-desktop'
  os.keypair_name   = 'must.be.set'
  os.image = 'ubuntu-18.04-amd64-mate_desktop_18062018'
  os.flavor = 'f2.desktop.large'
  os.server_name = 'DMONTANOV-DH20'
  override.vm.synced_folder '.', '/vagrant', disabled: true
>>>>>>> 8e65891cf6c1b69e309a6b203f33932356ec1ead
  end
end
