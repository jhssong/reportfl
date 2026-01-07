{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.cpio.CpioConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 132,
      "end_line": 692,
      "comment": "\n * A cpio archive consists of a sequence of files. There are several types of\n * headers defided in two categories of new and old format. The headers are\n * recognized by magic numbers:\n * \n * \u003cul\u003e\n * \u003cli\u003e\"070701\" ASCII for new portable format\u003c/li\u003e\n * \u003cli\u003e\"070702\" ASCII for new portable format with CRC format\u003c/li\u003e\n * \u003cli\u003e\"070707\" ASCII for old ascii (also known as Portable ASCII, odc or old\n * character format\u003c/li\u003e\n * \u003cli\u003e\"070707\" ASCII for old binary\u003c/li\u003e\n * \u003c/ul\u003e\n * \n * \u003cp\u003eThe old binary format is limited to 16 bits for user id, group\n * id, device, and inode numbers. It is limited to 4 gigabyte file\n * sizes.\n * \n * The old ASCII format is limited to 18 bits for the user id, group\n * id, device, and inode numbers. It is limited to 8 gigabyte file\n * sizes.\n * \n * The new ASCII format is limited to 4 gigabyte file sizes.\n * \n * CPIO 2.5 knows also about tar, but it is not recognized here.\u003c/p\u003e\n * \n * \n * \u003ch3\u003eOLD FORMAT\u003c/h3\u003e\n * \n * \u003cp\u003eEach file has a 76 (ascii) / 26 (binary) byte header, a variable\n * length, NUL terminated filename, and variable length file data. A\n * header for a filename \"TRAILER!!!\" indicates the end of the\n * archive.\u003c/p\u003e\n * \n * \u003cp\u003eAll the fields in the header are ISO 646 (approximately ASCII)\n * strings of octal numbers, left padded, not NUL terminated.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * FIELDNAME        NOTES \n * c_magic          The integer value octal 070707.  This value can be used to deter-\n *                  mine whether this archive is written with little-endian or big-\n *                  endian integers.\n * c_dev            Device that contains a directory entry for this file \n * c_ino            I-node number that identifies the input file to the file system \n * c_mode           The mode specifies both the regular permissions and the file type.\n * c_uid            Numeric User ID of the owner of the input file \n * c_gid            Numeric Group ID of the owner of the input file \n * c_nlink          Number of links that are connected to the input file \n * c_rdev           For block special and character special entries, this field \n *                  contains the associated device number.  For all other entry types,\n *                  it should be set to zero by writers and ignored by readers.\n * c_mtime[2]       Modification time of the file, indicated as the number of seconds\n *                  since the start of the epoch, 00:00:00 UTC January 1, 1970.  The\n *                  four-byte integer is stored with the most-significant 16 bits\n *                  first followed by the least-significant 16 bits.  Each of the two\n *                  16 bit values are stored in machine-native byte order.\n * c_namesize       Length of the path name, including the terminating null byte \n * c_filesize[2]    Length of the file in bytes. This is the length of the data \n *                  section that follows the header structure. Must be 0 for \n *                  FIFOs and directories\n *               \n * All fields are unsigned short fields with 16-bit integer values\n * \u003c/pre\u003e\n * \n * \u003cp\u003eSpecial files, directories, and the trailer are recorded with\n * the h_filesize field equal to 0.\u003c/p\u003e\n * \n * \n * \u003ch3\u003eNEW FORMAT\u003c/h3\u003e\n * \n * \u003cp\u003eEach file has a 110 byte header, a variable length, NUL\n * terminated filename, and variable length file data. A header for a\n * filename \"TRAILER!!!\" indicates the end of the archive. All the\n * fields in the header are ISO 646 (approximately ASCII) strings of\n * hexadecimal numbers, left padded, not NUL terminated.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * FIELDNAME        NOTES \n * c_magic[6]       The string 070701 for new ASCII, the string 070702 for new ASCII with CRC\n * c_ino[8]\n * c_mode[8]\n * c_uid[8]\n * c_gid[8]\n * c_nlink[8]\n * c_mtim[8]\n * c_filesize[8]    must be 0 for FIFOs and directories \n * c_maj[8]\n * c_min[8] \n * c_rmaj[8]        only valid for chr and blk special files \n * c_rmin[8]        only valid for chr and blk special files \n * c_namesize[8]    count includes terminating NUL in pathname \n * c_check[8]       0 for \"new\" portable format; for CRC format\n *                  the sum of all the bytes in the file\n * \u003c/pre\u003e\n * \n * \u003cp\u003eNew ASCII Format The \"new\" ASCII format uses 8-byte hexadecimal\n * fields for all numbers and separates device numbers into separate\n * fields for major and minor numbers.\u003c/p\u003e\n * \n * \u003cp\u003eThe pathname is followed by NUL bytes so that the total size of\n * the fixed header plus pathname is a multiple of four. Likewise, the\n * file data is padded to a multiple of four bytes.\u003c/p\u003e\n * \n * \u003cp\u003eThis class uses mutable fields and is not considered to be\n * threadsafe.\u003c/p\u003e\n * \n * \u003cp\u003eBased on code from the jRPM project (http://jrpm.sourceforge.net).\n *\n * @see \"http://people.freebsd.org/~kientzle/libarchive/man/cpio.5.txt\"\n "
    },
    {
      "type": "field",
      "varNames": [
        "chksum"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileFormat"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filesize"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerSize"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inode"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maj"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mtime"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nlink"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rmaj"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rmin"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(short)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Ceates a CPIOArchiveEntry with a specified format.\n     * \n     * @param format\n     *            The cpio format for this entry.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(java.lang.String)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * Ceates a CPIOArchiveEntry with a specified name. The format of this entry\n     * will be the new format.\n     * \n     * @param name\n     *            The name of this entry.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 25)",
        "(line 183,col 9)-(line 183,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(java.lang.String, long)",
      "begin_line": 195,
      "end_line": 199,
      "comment": "\n     * Ceates a CPIOArchiveEntry with a specified name. The format of this entry\n     * will be the new format.\n     * \n     * @param name\n     *            The name of this entry.\n     * @param size\n     *            The size of this entry\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 25)",
        "(line 197,col 9)-(line 197,col 25)",
        "(line 198,col 9)-(line 198,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.checkNewFormat()",
      "begin_line": 204,
      "end_line": 208,
      "comment": "\n     * Check if the method is allowed for the defined format.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.checkOldFormat()",
      "begin_line": 213,
      "end_line": 217,
      "comment": "\n     * Check if the method is allowed for the defined format.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getChksum()",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * Get the checksum.\n     * \n     * @return Returns the checksum.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 25)",
        "(line 226,col 9)-(line 226,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDevice()",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * Get the device id.\n     * \n     * @return Returns the device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 25)",
        "(line 239,col 9)-(line 239,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDeviceMaj()",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * Get the major device id.\n     * \n     * @return Returns the major device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 25)",
        "(line 252,col 9)-(line 252,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDeviceMin()",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\n     * Get the minor device id\n     * \n     * @return Returns the minor device id.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 25)",
        "(line 262,col 9)-(line 262,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getSize()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see org.apache.commons.compress.archivers.ArchiveEntry#getSize()\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getFormat()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Get the format for this entry.\n     * \n     * @return Returns the format.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getGID()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Get the group id.\n     * \n     * @return Returns the group id.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getHeaderSize()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Get the size of this entry on the stream\n     * \n     * @return Returns the size.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getInode()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * Set the inode.\n     * \n     * @return Returns the inode.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getMode()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Get the mode of this entry (e.g. directory, regular file).\n     * \n     * @return Returns the mode.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getName()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * Get the name.\n     * \n     * @return Returns the name.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getNumberOfLinks()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n     * Get the number of links.\n     * \n     * @return Returns the number of links.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getRemoteDevice()",
      "begin_line": 350,
      "end_line": 353,
      "comment": "\n     * Get the remote device id.\n     * \n     * @return Returns the remote device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 25)",
        "(line 352,col 9)-(line 352,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getRemoteDeviceMaj()",
      "begin_line": 363,
      "end_line": 366,
      "comment": "\n     * Get the remote major device id.\n     * \n     * @return Returns the remote major device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 25)",
        "(line 365,col 9)-(line 365,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getRemoteDeviceMin()",
      "begin_line": 376,
      "end_line": 379,
      "comment": "\n     * Get the remote minor device id.\n     * \n     * @return Returns the remote minor device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 25)",
        "(line 378,col 9)-(line 378,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getTime()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * Get the time in seconds.\n     * \n     * @return Returns the time.\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getUID()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * Get the user id.\n     * \n     * @return Returns the user id.\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isBlockDevice()",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\n     * Check if this entry represents a block device.\n     * \n     * @return TRUE if this entry is a block device.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isCharacterDevice()",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * Check if this entry represents a character device.\n     * \n     * @return TRUE if this entry is a character device.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isDirectory()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\n     * Check if this entry represents a directory.\n     * \n     * @return TRUE if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isNetwork()",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * Check if this entry represents a network device.\n     * \n     * @return TRUE if this entry is a network device.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isPipe()",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\n     * Check if this entry represents a pipe.\n     * \n     * @return TRUE if this entry is a pipe.\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isRegularFile()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Check if this entry represents a regular file.\n     * \n     * @return TRUE if this entry is a regular file.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isSocket()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n     * Check if this entry represents a socket.\n     * \n     * @return TRUE if this entry is a socket.\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isSymbolicLink()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Check if this entry represents a symbolic link.\n     * \n     * @return TRUE if this entry is a symbolic link.\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setChksum(long)",
      "begin_line": 478,
      "end_line": 481,
      "comment": "\n     * Set the checksum. The checksum is calculated by adding all bytes of a\n     * file to transfer (crc +\u003d buf[pos] \u0026 0xFF).\n     * \n     * @param chksum\n     *            The checksum to set.\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 25)",
        "(line 480,col 9)-(line 480,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setDevice(long)",
      "begin_line": 492,
      "end_line": 495,
      "comment": "\n     * Set the device id.\n     * \n     * @param device\n     *            The device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 25)",
        "(line 494,col 9)-(line 494,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setDeviceMaj(long)",
      "begin_line": 503,
      "end_line": 506,
      "comment": "\n     * Set major device id.\n     * \n     * @param maj\n     *            The major device id to set.\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 25)",
        "(line 505,col 9)-(line 505,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setDeviceMin(long)",
      "begin_line": 514,
      "end_line": 517,
      "comment": "\n     * Set the minor device id\n     * \n     * @param min\n     *            The minor device id to set.\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 25)",
        "(line 516,col 9)-(line 516,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setSize(long)",
      "begin_line": 525,
      "end_line": 531,
      "comment": "\n     * Set the filesize.\n     * \n     * @param size\n     *            The filesize to set.\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setFormat(short)",
      "begin_line": 541,
      "end_line": 562,
      "comment": "\n     * Set the format for this entry. Possible values are:\n     * CPIOConstants.FORMAT_NEW, CPIOConstants.FORMAT_NEW_CRC,\n     * CPIOConstants.FORMAT_OLD_BINARY, CPIOConstants.FORMAT_OLD_ASCII\n     * \n     * @param format\n     *            The format to set.\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 561,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setGID(long)",
      "begin_line": 570,
      "end_line": 572,
      "comment": "\n     * Set the group id.\n     * \n     * @param gid\n     *            The group id to set.\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setInode(long)",
      "begin_line": 580,
      "end_line": 582,
      "comment": "\n     * Set the inode.\n     * \n     * @param inode\n     *            The inode to set.\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setMode(long)",
      "begin_line": 590,
      "end_line": 609,
      "comment": "\n     * Set the mode of this entry (e.g. directory, regular file).\n     * \n     * @param mode\n     *            The mode to set.\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 606,col 9)",
        "(line 608,col 9)-(line 608,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setName(java.lang.String)",
      "begin_line": 617,
      "end_line": 619,
      "comment": "\n     * Set the name.\n     * \n     * @param name\n     *            The name to set.\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setNumberOfLinks(long)",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\n     * Set the number of links.\n     * \n     * @param nlink\n     *            The number of links to set.\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setRemoteDevice(long)",
      "begin_line": 640,
      "end_line": 643,
      "comment": "\n     * Set the remote device id.\n     * \n     * @param device\n     *            The remote device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 25)",
        "(line 642,col 9)-(line 642,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setRemoteDeviceMaj(long)",
      "begin_line": 654,
      "end_line": 657,
      "comment": "\n     * Set the remote major device id.\n     * \n     * @param rmaj\n     *            The remote major device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 25)",
        "(line 656,col 9)-(line 656,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setRemoteDeviceMin(long)",
      "begin_line": 668,
      "end_line": 671,
      "comment": "\n     * Set the remote minor device id.\n     * \n     * @param rmin\n     *            The remote minor device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 25)",
        "(line 670,col 9)-(line 670,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setTime(long)",
      "begin_line": 679,
      "end_line": 681,
      "comment": "\n     * Set the time in seconds.\n     * \n     * @param time\n     *            The time to set.\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setUID(long)",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n     * Set the user id.\n     * \n     * @param uid\n     *            The user id to set.\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 23)"
      ]
    }
  ]
}