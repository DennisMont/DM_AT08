# -*- mode: ruby -*-
# vi: set ft=ruby :


require 'vagrant-openstack-provider'

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
  end
end
