FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PR := "${PR}.1"

COMPATIBLE_MACHINE_mobot = "beaglebone"



SRC_URI += "file://mobot-user-config.cfg \
            file://mobot-user-patches.scc \
            file://mobot-user-features.scc \
            file://leds.cfg \
            file://pwm.cfg \
            file://pruss.cfg \
           "

# uncomment and replace these SRCREVs with the real commit ids once you've had
# the appropriate changes committed to the upstream linux-yocto repo
#SRCREV_machine_pn-linux-yocto_mobot ?= "840bb8c059418c4753415df56c9aff1c0d5354c8"
#SRCREV_meta_pn-linux-yocto_mobot ?= "4fd76cc4f33e0afd8f906b1e8f231b6d13b6c993"
#LINUX_VERSION = "3.14"
