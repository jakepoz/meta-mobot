SUMMARY = "A console-only image that fully supports the target device \
hardware."

IMAGE_FEATURES += "splash"

IMAGE_INSTALL = "packagegroup-base packagegroup-core-ssh-openssh packagegroup-core-buildessential packagegroup-core-tools-debug openssh-sftp example i2c-tools"

LICENSE = "JAKE"

inherit core-image
