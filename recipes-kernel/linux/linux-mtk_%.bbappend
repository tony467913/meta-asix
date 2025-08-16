FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://disable-buildin-ax88179.cfg"

KERNEL_CONFIG_FRAGMENTS += "file://disable-buildin-ax88179.cfg"