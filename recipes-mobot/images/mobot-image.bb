SUMMARY = "A fully featured image for the mobot project"

#Standard image version
IMAGE_FEATURES += "splash"
IMAGE_INSTALL = "packagegroup-base packagegroup-core-ssh-openssh packagegroup-core-buildessential packagegroup-core-tools-debug openssh-sftp example i2c-tools am335x-pru am335x-pru-dev"
LICENSE = "JAKE"

inherit core-image

#Initramfs version
# Simple initramfs image. Mostly used for live images.
#PACKAGE_INSTALL = "initramfs-live-boot packagegroup-base packagegroup-core-ssh-openssh packagegroup-core-buildessential packagegroup-core-tools-debug openssh-sftp example i2c-tools am335x-pru ${ROOTFS_BOOTSTRAP_INSTALL}"

# Do not pollute the initrd image with rootfs features
#IMAGE_FEATURES = ""

#export IMAGE_BASENAME = "core-image-minimal-initramfs"
#IMAGE_LINGUAS = ""

#IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
#inherit core-image

#IMAGE_ROOTFS_SIZE = "8192"

#BAD_RECOMMENDATIONS += "busybox-syslog"
