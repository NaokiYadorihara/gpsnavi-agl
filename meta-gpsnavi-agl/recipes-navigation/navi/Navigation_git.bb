LICENSE="GPLv2"
LIC_FILES_CHKSUM="file://LICENSE;md5=3595e9c703a847d990664d2b396a9df0 \
                  file://COPYING;md5=947b2d60ca3872e172034438e9801200"

DEPENDS = " \
          glib-2.0 freetype sqlite3 wayland zlib expat openssl virtual/libgles2 virtual/libgl virtual/egl \
          wayland \
          "

RDEPENDS_${PN} = " flite openjtalk "

SRCREV="bcc6d15fd9149c7d7b0ea5554376aaaf84cc5587"
SRC_URI="git://github.com/AGLExport/gpsnavi.git"

# To avoid C++ library link failure
SECURITY_CFLAGS = ""

inherit autotools pkgconfig

S = "${WORKDIR}/git"

