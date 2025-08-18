# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
SUMMARY = "ASIX AX88179 series USB to LAN driver"
LICENSE = "CLOSED"
# LICENSE = "GPL-2.0-only"
# LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "git://github.com/tony467913/asix-ax88179-driver.git;protocol=https;branch=main"

# Modify these as desired
PV = "1.0"
SRCREV = "ab68a7313f2261e823f387cf51a4db242544187d"

S = "${WORKDIR}/git"

inherit module

# EXTRA_OEMAKE += "KDIR=${STAGING_KERNEL_DIR}"

RPROVIDES:${PN} += "kernel-module-asix-ax88179-driver"
