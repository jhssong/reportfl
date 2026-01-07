{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.cpio.CpioConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 143,
      "end_line": 751,
      "comment": "\n * A cpio archive consists of a sequence of files. There are several types of\n * headers defided in two categories of new and old format. The headers are\n * recognized by magic numbers:\n * \n * \u003cul\u003e\n * \u003cli\u003e\"070701\" ASCII for new portable format\u003c/li\u003e\n * \u003cli\u003e\"070702\" ASCII for new portable format with CRC format\u003c/li\u003e\n * \u003cli\u003e\"070707\" ASCII for old ascii (also known as Portable ASCII, odc or old\n * character format\u003c/li\u003e\n * \u003cli\u003e070707 binary for old binary\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eThe old binary format is limited to 16 bits for user id, group\n * id, device, and inode numbers. It is limited to 4 gigabyte file\n * sizes.\n * \n * The old ASCII format is limited to 18 bits for the user id, group\n * id, device, and inode numbers. It is limited to 8 gigabyte file\n * sizes.\n * \n * The new ASCII format is limited to 4 gigabyte file sizes.\n * \n * CPIO 2.5 knows also about tar, but it is not recognized here.\u003c/p\u003e\n * \n * \n * \u003ch3\u003eOLD FORMAT\u003c/h3\u003e\n * \n * \u003cp\u003eEach file has a 76 (ascii) / 26 (binary) byte header, a variable\n * length, NUL terminated filename, and variable length file data. A\n * header for a filename \"TRAILER!!!\" indicates the end of the\n * archive.\u003c/p\u003e\n * \n * \u003cp\u003eAll the fields in the header are ISO 646 (approximately ASCII)\n * strings of octal numbers, left padded, not NUL terminated.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * FIELDNAME        NOTES \n * c_magic          The integer value octal 070707.  This value can be used to deter-\n *                  mine whether this archive is written with little-endian or big-\n *                  endian integers.\n * c_dev            Device that contains a directory entry for this file \n * c_ino            I-node number that identifies the input file to the file system \n * c_mode           The mode specifies both the regular permissions and the file type.\n * c_uid            Numeric User ID of the owner of the input file \n * c_gid            Numeric Group ID of the owner of the input file \n * c_nlink          Number of links that are connected to the input file \n * c_rdev           For block special and character special entries, this field \n *                  contains the associated device number.  For all other entry types,\n *                  it should be set to zero by writers and ignored by readers.\n * c_mtime[2]       Modification time of the file, indicated as the number of seconds\n *                  since the start of the epoch, 00:00:00 UTC January 1, 1970.  The\n *                  four-byte integer is stored with the most-significant 16 bits\n *                  first followed by the least-significant 16 bits.  Each of the two\n *                  16 bit values are stored in machine-native byte order.\n * c_namesize       Length of the path name, including the terminating null byte \n * c_filesize[2]    Length of the file in bytes. This is the length of the data \n *                  section that follows the header structure. Must be 0 for \n *                  FIFOs and directories\n *               \n * All fields are unsigned short fields with 16-bit integer values\n * apart from c_mtime and c_filesize which are 32-bit integer values\n * \u003c/pre\u003e\n * \n * \u003cp\u003eIf necessary, the filename and file data are padded with a NUL byte to an even length\u003c/p\u003e\n * \n * \u003cp\u003eSpecial files, directories, and the trailer are recorded with\n * the h_filesize field equal to 0.\u003c/p\u003e\n * \n * \u003cp\u003eIn the ASCII version of this format, the 16-bit entries are represented as 6-byte octal numbers,\n * and the 32-bit entries are represented as 11-byte octal numbers. No padding is added.\u003c/p\u003e\n * \n * \u003ch3\u003eNEW FORMAT\u003c/h3\u003e\n * \n * \u003cp\u003eEach file has a 110 byte header, a variable length, NUL\n * terminated filename, and variable length file data. A header for a\n * filename \"TRAILER!!!\" indicates the end of the archive. All the\n * fields in the header are ISO 646 (approximately ASCII) strings of\n * hexadecimal numbers, left padded, not NUL terminated.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * FIELDNAME        NOTES \n * c_magic[6]       The string 070701 for new ASCII, the string 070702 for new ASCII with CRC\n * c_ino[8]\n * c_mode[8]\n * c_uid[8]\n * c_gid[8]\n * c_nlink[8]\n * c_mtim[8]\n * c_filesize[8]    must be 0 for FIFOs and directories \n * c_maj[8]\n * c_min[8] \n * c_rmaj[8]        only valid for chr and blk special files \n * c_rmin[8]        only valid for chr and blk special files \n * c_namesize[8]    count includes terminating NUL in pathname \n * c_check[8]       0 for \"new\" portable format; for CRC format\n *                  the sum of all the bytes in the file\n * \u003c/pre\u003e\n * \n * \u003cp\u003eNew ASCII Format The \"new\" ASCII format uses 8-byte hexadecimal\n * fields for all numbers and separates device numbers into separate\n * fields for major and minor numbers.\u003c/p\u003e\n * \n * \u003cp\u003eThe pathname is followed by NUL bytes so that the total size of\n * the fixed header plus pathname is a multiple of four. Likewise, the\n * file data is padded to a multiple of four bytes.\u003c/p\u003e\n * \n * \u003cp\u003eThis class uses mutable fields and is not considered to be\n * threadsafe.\u003c/p\u003e\n * \n * \u003cp\u003eBased on code from the jRPM project (http://jrpm.sourceforge.net).\n *\n * \u003cp\u003eThe MAGIC numbers and other constants are defined in {@link CpioConstants}\n * @see \"http://people.freebsd.org/~kientzle/libarchive/man/cpio.5.txt\"\n * \n * \u003cp\u003e\n * N.B. does not handle the cpio \"tar\" format\n * \u003c/p\u003e\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "fileFormat"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     * See {@link CpioArchiveEntry#setFormat(short)} for possible values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "headerSize"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The number of bytes in each header record; depends on the file format "
    },
    {
      "type": "field",
      "varNames": [
        "alignmentBoundary"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The boundary to which the header and data elements are aligned: 0, 2 or 4 bytes "
    },
    {
      "type": "field",
      "varNames": [
        "chksum"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filesize"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " Number of bytes in the file "
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inode"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maj"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mtime"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nlink"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rmaj"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rmin"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(short)",
      "begin_line": 201,
      "end_line": 223,
      "comment": "\n     * Ceates a CPIOArchiveEntry with a specified format.\n     * \n     * @param format\n     *            The cpio format for this entry.\n     * \u003cbr/\u003e\n     * Possible format values are:\n     * \u003cp\u003e\n     * CpioConstants.FORMAT_NEW\u003cbr/\u003e\n     * CpioConstants.FORMAT_NEW_CRC\u003cbr/\u003e\n     * CpioConstants.FORMAT_OLD_BINARY\u003cbr/\u003e\n     * CpioConstants.FORMAT_OLD_ASCII\u003cbr/\u003e\n     * \n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(java.lang.String)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * Ceates a CPIOArchiveEntry with a specified name. The format of this entry\n     * will be the new format.\n     * \n     * @param name\n     *            The name of this entry.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 25)",
        "(line 234,col 9)-(line 234,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(java.lang.String, long)",
      "begin_line": 246,
      "end_line": 250,
      "comment": "\n     * Creates a CPIOArchiveEntry with a specified name. The format of this entry\n     * will be the new format.\n     * \n     * @param name\n     *            The name of this entry.\n     * @param size\n     *            The size of this entry\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 25)",
        "(line 248,col 9)-(line 248,col 25)",
        "(line 249,col 9)-(line 249,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.checkNewFormat()",
      "begin_line": 255,
      "end_line": 259,
      "comment": "\n     * Check if the method is allowed for the defined format.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.checkOldFormat()",
      "begin_line": 264,
      "end_line": 268,
      "comment": "\n     * Check if the method is allowed for the defined format.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getChksum()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * Get the checksum.\n     * Only supported for the new formats.\n     * \n     * @return Returns the checksum.\n     * @throws UnsupportedOperationException if the format is not a new format\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 25)",
        "(line 279,col 9)-(line 279,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDevice()",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n     * Get the device id.\n     * \n     * @return Returns the device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 25)",
        "(line 292,col 9)-(line 292,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDeviceMaj()",
      "begin_line": 303,
      "end_line": 306,
      "comment": "\n     * Get the major device id.\n     * \n     * @return Returns the major device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 25)",
        "(line 305,col 9)-(line 305,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDeviceMin()",
      "begin_line": 314,
      "end_line": 317,
      "comment": "\n     * Get the minor device id\n     * \n     * @return Returns the minor device id.\n     * @throws UnsupportedOperationException if format is not a new format\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 25)",
        "(line 316,col 9)-(line 316,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getSize()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * Get the filesize.\n     * \n     * @return Returns the filesize.\n     * @see org.apache.commons.compress.archivers.ArchiveEntry#getSize()\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getFormat()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Get the format for this entry.\n     * \n     * @return Returns the format.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getGID()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Get the group id.\n     * \n     * @return Returns the group id.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getHeaderSize()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * Get the header size for this CPIO format\n     * \n     * @return Returns the header size in bytes.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getAlignmentBoundary()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * Get the alignment boundary for this CPIO format\n     * \n     * @return Returns the aligment boundary (0, 2, 4) in bytes\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getHeaderPadCount()",
      "begin_line": 370,
      "end_line": 378,
      "comment": "\n     * Get the number of bytes needed to pad the header to the alignment boundary.\n     * \n     * @return the number of bytes needed to pad the header (0,1,2,3)\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 50)",
        "(line 372,col 9)-(line 372,col 56)",
        "(line 373,col 9)-(line 373,col 51)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDataPadCount()",
      "begin_line": 385,
      "end_line": 393,
      "comment": "\n     * Get the number of bytes needed to pad the data to the alignment boundary.\n     * \n     * @return the number of bytes needed to pad the data (0,1,2,3)\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 50)",
        "(line 387,col 9)-(line 387,col 34)",
        "(line 388,col 9)-(line 388,col 59)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getInode()",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Set the inode.\n     * \n     * @return Returns the inode.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getMode()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\n     * Get the mode of this entry (e.g. directory, regular file).\n     * \n     * @return Returns the mode.\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getName()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\n     * Get the name.\n     * \n     * @return Returns the name.\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getNumberOfLinks()",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Get the number of links.\n     * \n     * @return Returns the number of links.\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getRemoteDevice()",
      "begin_line": 439,
      "end_line": 442,
      "comment": "\n     * Get the remote device id.\n     * \n     * @return Returns the remote device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 25)",
        "(line 441,col 9)-(line 441,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getRemoteDeviceMaj()",
      "begin_line": 452,
      "end_line": 455,
      "comment": "\n     * Get the remote major device id.\n     * \n     * @return Returns the remote major device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 25)",
        "(line 454,col 9)-(line 454,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getRemoteDeviceMin()",
      "begin_line": 465,
      "end_line": 468,
      "comment": "\n     * Get the remote minor device id.\n     * \n     * @return Returns the remote minor device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 25)",
        "(line 467,col 9)-(line 467,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getTime()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Get the time in seconds.\n     * \n     * @return Returns the time.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getUID()",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * Get the user id.\n     * \n     * @return Returns the user id.\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isBlockDevice()",
      "begin_line": 493,
      "end_line": 495,
      "comment": "\n     * Check if this entry represents a block device.\n     * \n     * @return TRUE if this entry is a block device.\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isCharacterDevice()",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\n     * Check if this entry represents a character device.\n     * \n     * @return TRUE if this entry is a character device.\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isDirectory()",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\n     * Check if this entry represents a directory.\n     * \n     * @return TRUE if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isNetwork()",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * Check if this entry represents a network device.\n     * \n     * @return TRUE if this entry is a network device.\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isPipe()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n     * Check if this entry represents a pipe.\n     * \n     * @return TRUE if this entry is a pipe.\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isRegularFile()",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\n     * Check if this entry represents a regular file.\n     * \n     * @return TRUE if this entry is a regular file.\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isSocket()",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\n     * Check if this entry represents a socket.\n     * \n     * @return TRUE if this entry is a socket.\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isSymbolicLink()",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n     * Check if this entry represents a symbolic link.\n     * \n     * @return TRUE if this entry is a symbolic link.\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setChksum(long)",
      "begin_line": 567,
      "end_line": 570,
      "comment": "\n     * Set the checksum. The checksum is calculated by adding all bytes of a\n     * file to transfer (crc +\u003d buf[pos] \u0026 0xFF).\n     * \n     * @param chksum\n     *            The checksum to set.\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 25)",
        "(line 569,col 9)-(line 569,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setDevice(long)",
      "begin_line": 581,
      "end_line": 584,
      "comment": "\n     * Set the device id.\n     * \n     * @param device\n     *            The device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 25)",
        "(line 583,col 9)-(line 583,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setDeviceMaj(long)",
      "begin_line": 592,
      "end_line": 595,
      "comment": "\n     * Set major device id.\n     * \n     * @param maj\n     *            The major device id to set.\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 25)",
        "(line 594,col 9)-(line 594,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setDeviceMin(long)",
      "begin_line": 603,
      "end_line": 606,
      "comment": "\n     * Set the minor device id\n     * \n     * @param min\n     *            The minor device id to set.\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 25)",
        "(line 605,col 9)-(line 605,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setSize(long)",
      "begin_line": 614,
      "end_line": 620,
      "comment": "\n     * Set the filesize.\n     * \n     * @param size\n     *            The filesize to set.\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 619,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setGID(long)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * Set the group id.\n     * \n     * @param gid\n     *            The group id to set.\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setInode(long)",
      "begin_line": 638,
      "end_line": 640,
      "comment": "\n     * Set the inode.\n     * \n     * @param inode\n     *            The inode to set.\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setMode(long)",
      "begin_line": 648,
      "end_line": 668,
      "comment": "\n     * Set the mode of this entry (e.g. directory, regular file).\n     * \n     * @param mode\n     *            The mode to set.\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 46)",
        "(line 650,col 9)-(line 665,col 9)",
        "(line 667,col 9)-(line 667,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setName(java.lang.String)",
      "begin_line": 676,
      "end_line": 678,
      "comment": "\n     * Set the name.\n     * \n     * @param name\n     *            The name to set.\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setNumberOfLinks(long)",
      "begin_line": 686,
      "end_line": 688,
      "comment": "\n     * Set the number of links.\n     * \n     * @param nlink\n     *            The number of links to set.\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setRemoteDevice(long)",
      "begin_line": 699,
      "end_line": 702,
      "comment": "\n     * Set the remote device id.\n     * \n     * @param device\n     *            The remote device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 25)",
        "(line 701,col 9)-(line 701,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setRemoteDeviceMaj(long)",
      "begin_line": 713,
      "end_line": 716,
      "comment": "\n     * Set the remote major device id.\n     * \n     * @param rmaj\n     *            The remote major device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 25)",
        "(line 715,col 9)-(line 715,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setRemoteDeviceMin(long)",
      "begin_line": 727,
      "end_line": 730,
      "comment": "\n     * Set the remote minor device id.\n     * \n     * @param rmin\n     *            The remote minor device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 25)",
        "(line 729,col 9)-(line 729,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setTime(long)",
      "begin_line": 738,
      "end_line": 740,
      "comment": "\n     * Set the time in seconds.\n     * \n     * @param time\n     *            The time to set.\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setUID(long)",
      "begin_line": 748,
      "end_line": 750,
      "comment": "\n     * Set the user id.\n     * \n     * @param uid\n     *            The user id to set.\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 23)"
      ]
    }
  ]
}