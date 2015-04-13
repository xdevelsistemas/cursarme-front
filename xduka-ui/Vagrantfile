VAGRANTFILE_API_VERSION = "2"  
Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.define "mongodb-env" do |v|
    v.vm.provider "docker" do |d|
      d.vagrant_vagrantfile = ENV['VAGRANT_MAIN_FILE']
      d.vagrant_machine = "core-01"
      d.image = "xdevelsistemas/debian-env:mongodb-env"
      d.ports = ["27017:27017"]
      d.volumes = ["/home/core/data/mongo:/var/opt/mongodb"]
      d.name = "mongodb"
    end
  end
  config.vm.define "redis-env" do |v|
    v.vm.provider "docker" do |d|
      d.vagrant_vagrantfile = ENV['VAGRANT_MAIN_FILE']
      d.vagrant_machine = "core-01"
      d.image = "xdevelsistemas/debian-env:redis-env"
      d.ports = ["6379:6379"]
      d.name = "redis"
    end
  end
end