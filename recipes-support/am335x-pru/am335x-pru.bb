DESCRIPTION = "AM335x PRU PACKAGE"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../git/README.txt;md5=583f78c8af94f80afa1a73ac30f479f1"

PR = "r1"

SRC_URI = "git://github.com/beagleboard/am335x_pru_package.git;protocol=git \
file://0001-Jake-patches-to-work-with-yocto.patch"

SRCREV = "26799092b8f0378f75db728b589566615572969c"

S = "${WORKDIR}/git"

FILES_${PN} = "${bindir}/*"

FILES_${PN} += "${libdir}/libprussdrv.a"
FILES_${PN} += "${libdir}/libprussdrv.so"
FILES_${PN} += "${libdir}/libprussdrvd.a"
FILES_${PN} += "${libdir}/libprussdrvd.so"

FILES_${PN} += "${includedir}/pruss/*"

do_install () {
     mkdir -p ${D}${includedir}/pruss
     oe_runmake install PREFIX=/usr DESTDIR=${D} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}/pruss
}

