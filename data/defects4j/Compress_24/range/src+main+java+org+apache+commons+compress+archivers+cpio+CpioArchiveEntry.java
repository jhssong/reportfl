{
  "filepath": "/tmp/Compress-24b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.cpio.CpioConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 146,
      "end_line": 892,
      "comment": "\n * A cpio archive consists of a sequence of files. There are several types of\n * headers defided in two categories of new and old format. The headers are\n * recognized by magic numbers:\n * \n * \u003cul\u003e\n * \u003cli\u003e\"070701\" ASCII for new portable format\u003c/li\u003e\n * \u003cli\u003e\"070702\" ASCII for new portable format with CRC\u003c/li\u003e\n * \u003cli\u003e\"070707\" ASCII for old ascii (also known as Portable ASCII, odc or old\n * character format\u003c/li\u003e\n * \u003cli\u003e070707 binary for old binary\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eThe old binary format is limited to 16 bits for user id, group\n * id, device, and inode numbers. It is limited to 4 gigabyte file\n * sizes.\n * \n * The old ASCII format is limited to 18 bits for the user id, group\n * id, device, and inode numbers. It is limited to 8 gigabyte file\n * sizes.\n * \n * The new ASCII format is limited to 4 gigabyte file sizes.\n * \n * CPIO 2.5 knows also about tar, but it is not recognized here.\u003c/p\u003e\n * \n * \n * \u003ch3\u003eOLD FORMAT\u003c/h3\u003e\n * \n * \u003cp\u003eEach file has a 76 (ascii) / 26 (binary) byte header, a variable\n * length, NUL terminated filename, and variable length file data. A\n * header for a filename \"TRAILER!!!\" indicates the end of the\n * archive.\u003c/p\u003e\n * \n * \u003cp\u003eAll the fields in the header are ISO 646 (approximately ASCII)\n * strings of octal numbers, left padded, not NUL terminated.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * FIELDNAME        NOTES \n * c_magic          The integer value octal 070707.  This value can be used to deter-\n *                  mine whether this archive is written with little-endian or big-\n *                  endian integers.\n * c_dev            Device that contains a directory entry for this file \n * c_ino            I-node number that identifies the input file to the file system \n * c_mode           The mode specifies both the regular permissions and the file type.\n * c_uid            Numeric User ID of the owner of the input file \n * c_gid            Numeric Group ID of the owner of the input file \n * c_nlink          Number of links that are connected to the input file \n * c_rdev           For block special and character special entries, this field \n *                  contains the associated device number.  For all other entry types,\n *                  it should be set to zero by writers and ignored by readers.\n * c_mtime[2]       Modification time of the file, indicated as the number of seconds\n *                  since the start of the epoch, 00:00:00 UTC January 1, 1970.  The\n *                  four-byte integer is stored with the most-significant 16 bits\n *                  first followed by the least-significant 16 bits.  Each of the two\n *                  16 bit values are stored in machine-native byte order.\n * c_namesize       Length of the path name, including the terminating null byte \n * c_filesize[2]    Length of the file in bytes. This is the length of the data \n *                  section that follows the header structure. Must be 0 for \n *                  FIFOs and directories\n *\n * All fields are unsigned short fields with 16-bit integer values\n * apart from c_mtime and c_filesize which are 32-bit integer values\n * \u003c/pre\u003e\n * \n * \u003cp\u003eIf necessary, the filename and file data are padded with a NUL byte to an even length\u003c/p\u003e\n * \n * \u003cp\u003eSpecial files, directories, and the trailer are recorded with\n * the h_filesize field equal to 0.\u003c/p\u003e\n * \n * \u003cp\u003eIn the ASCII version of this format, the 16-bit entries are represented as 6-byte octal numbers,\n * and the 32-bit entries are represented as 11-byte octal numbers. No padding is added.\u003c/p\u003e\n * \n * \u003ch3\u003eNEW FORMAT\u003c/h3\u003e\n * \n * \u003cp\u003eEach file has a 110 byte header, a variable length, NUL\n * terminated filename, and variable length file data. A header for a\n * filename \"TRAILER!!!\" indicates the end of the archive. All the\n * fields in the header are ISO 646 (approximately ASCII) strings of\n * hexadecimal numbers, left padded, not NUL terminated.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * FIELDNAME        NOTES \n * c_magic[6]       The string 070701 for new ASCII, the string 070702 for new ASCII with CRC\n * c_ino[8]\n * c_mode[8]\n * c_uid[8]\n * c_gid[8]\n * c_nlink[8]\n * c_mtim[8]\n * c_filesize[8]    must be 0 for FIFOs and directories \n * c_maj[8]\n * c_min[8] \n * c_rmaj[8]        only valid for chr and blk special files \n * c_rmin[8]        only valid for chr and blk special files \n * c_namesize[8]    count includes terminating NUL in pathname \n * c_check[8]       0 for \"new\" portable format; for CRC format\n *                  the sum of all the bytes in the file\n * \u003c/pre\u003e\n * \n * \u003cp\u003eNew ASCII Format The \"new\" ASCII format uses 8-byte hexadecimal\n * fields for all numbers and separates device numbers into separate\n * fields for major and minor numbers.\u003c/p\u003e\n * \n * \u003cp\u003eThe pathname is followed by NUL bytes so that the total size of\n * the fixed header plus pathname is a multiple of four. Likewise, the\n * file data is padded to a multiple of four bytes.\u003c/p\u003e\n * \n * \u003cp\u003eThis class uses mutable fields and is not considered to be\n * threadsafe.\u003c/p\u003e\n * \n * \u003cp\u003eBased on code from the jRPM project (http://jrpm.sourceforge.net).\u003c/p\u003e\n *\n * \u003cp\u003eThe MAGIC numbers and other constants are defined in {@link CpioConstants}\u003c/p\u003e\n * \n * \u003cp\u003e\n * N.B. does not handle the cpio \"tar\" format\n * \u003c/p\u003e\n * @NotThreadSafe\n * @see \u003ca href\u003d\"http://people.freebsd.org/~kientzle/libarchive/man/cpio.5.txt\"\u003ehttp://people.freebsd.org/~kientzle/libarchive/man/cpio.5.txt\u003c/a\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "fileFormat"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": "\n     * See constructor documenation for possible values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "headerSize"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The number of bytes in each header record; depends on the file format "
    },
    {
      "type": "field",
      "varNames": [
        "alignmentBoundary"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The boundary to which the header and data elements are aligned: 0, 2 or 4 bytes "
    },
    {
      "type": "field",
      "varNames": [
        "chksum"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filesize"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " Number of bytes in the file "
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inode"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maj"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mtime"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nlink"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rmaj"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rmin"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(short)",
      "begin_line": 204,
      "end_line": 226,
      "comment": "\n     * Creates a CPIOArchiveEntry with a specified format.\n     * \n     * @param format\n     *            The cpio format for this entry.\n     * \u003cp\u003e\n     * Possible format values are:\n     * \u003cpre\u003e\n     * CpioConstants.FORMAT_NEW\n     * CpioConstants.FORMAT_NEW_CRC\n     * CpioConstants.FORMAT_OLD_BINARY\n     * CpioConstants.FORMAT_OLD_ASCII\n     * \u003c/pre\u003e\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(java.lang.String)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Creates a CPIOArchiveEntry with a specified name. The format of\n     * this entry will be the new format.\n     * \n     * @param name\n     *            The name of this entry.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(short, java.lang.String)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * Creates a CPIOArchiveEntry with a specified name.\n     * \n     * @param format\n     *            The cpio format for this entry.\n     * @param name\n     *            The name of this entry.\n     * \u003cp\u003e\n     * Possible format values are:\n     * \u003cpre\u003e\n     * CpioConstants.FORMAT_NEW\n     * CpioConstants.FORMAT_NEW_CRC\n     * CpioConstants.FORMAT_OLD_BINARY\n     * CpioConstants.FORMAT_OLD_ASCII\n     * \u003c/pre\u003e\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 21)",
        "(line 259,col 9)-(line 259,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(java.lang.String, long)",
      "begin_line": 271,
      "end_line": 274,
      "comment": "\n     * Creates a CPIOArchiveEntry with a specified name. The format of\n     * this entry will be the new format.\n     * \n     * @param name\n     *            The name of this entry.\n     * @param size\n     *            The size of this entry\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 19)",
        "(line 273,col 9)-(line 273,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(short, java.lang.String, long)",
      "begin_line": 296,
      "end_line": 300,
      "comment": "\n     * Creates a CPIOArchiveEntry with a specified name.\n     * \n     * @param format\n     *            The cpio format for this entry.\n     * @param name\n     *            The name of this entry.\n     * @param size\n     *            The size of this entry\n     * \u003cp\u003e\n     * Possible format values are:\n     * \u003cpre\u003e\n     * CpioConstants.FORMAT_NEW\n     * CpioConstants.FORMAT_NEW_CRC\n     * CpioConstants.FORMAT_OLD_BINARY\n     * CpioConstants.FORMAT_OLD_ASCII\n     * \u003c/pre\u003e\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 27)",
        "(line 299,col 9)-(line 299,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Creates a CPIOArchiveEntry with a specified name for a\n     * specified file. The format of this entry will be the new\n     * format.\n     * \n     * @param inputFile\n     *            The file to gather information from.\n     * @param entryName\n     *            The name of this entry.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.CpioArchiveEntry(short, java.io.File, java.lang.String)",
      "begin_line": 337,
      "end_line": 352,
      "comment": "\n     * Creates a CPIOArchiveEntry with a specified name for a\n     * specified file.\n     * \n     * @param format\n     *            The cpio format for this entry.\n     * @param inputFile\n     *            The file to gather information from.\n     * @param entryName\n     *            The name of this entry.\n     * \u003cp\u003e\n     * Possible format values are:\n     * \u003cpre\u003e\n     * CpioConstants.FORMAT_NEW\n     * CpioConstants.FORMAT_NEW_CRC\n     * CpioConstants.FORMAT_OLD_BINARY\n     * CpioConstants.FORMAT_OLD_ASCII\n     * \u003c/pre\u003e\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 77)",
        "(line 340,col 9)-(line 340,col 20)",
        "(line 341,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 350,col 22)",
        "(line 351,col 9)-(line 351,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.checkNewFormat()",
      "begin_line": 357,
      "end_line": 361,
      "comment": "\n     * Check if the method is allowed for the defined format.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.checkOldFormat()",
      "begin_line": 366,
      "end_line": 370,
      "comment": "\n     * Check if the method is allowed for the defined format.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getChksum()",
      "begin_line": 379,
      "end_line": 382,
      "comment": "\n     * Get the checksum.\n     * Only supported for the new formats.\n     * \n     * @return Returns the checksum.\n     * @throws UnsupportedOperationException if the format is not a new format\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 25)",
        "(line 381,col 9)-(line 381,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDevice()",
      "begin_line": 392,
      "end_line": 395,
      "comment": "\n     * Get the device id.\n     * \n     * @return Returns the device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 25)",
        "(line 394,col 9)-(line 394,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDeviceMaj()",
      "begin_line": 405,
      "end_line": 408,
      "comment": "\n     * Get the major device id.\n     * \n     * @return Returns the major device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 25)",
        "(line 407,col 9)-(line 407,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDeviceMin()",
      "begin_line": 416,
      "end_line": 419,
      "comment": "\n     * Get the minor device id\n     * \n     * @return Returns the minor device id.\n     * @throws UnsupportedOperationException if format is not a new format\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 25)",
        "(line 418,col 9)-(line 418,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getSize()",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Get the filesize.\n     * \n     * @return Returns the filesize.\n     * @see org.apache.commons.compress.archivers.ArchiveEntry#getSize()\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getFormat()",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\n     * Get the format for this entry.\n     * \n     * @return Returns the format.\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getGID()",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n     * Get the group id.\n     * \n     * @return Returns the group id.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getHeaderSize()",
      "begin_line": 454,
      "end_line": 456,
      "comment": "\n     * Get the header size for this CPIO format\n     * \n     * @return Returns the header size in bytes.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getAlignmentBoundary()",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n     * Get the alignment boundary for this CPIO format\n     * \n     * @return Returns the aligment boundary (0, 2, 4) in bytes\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getHeaderPadCount()",
      "begin_line": 472,
      "end_line": 480,
      "comment": "\n     * Get the number of bytes needed to pad the header to the alignment boundary.\n     * \n     * @return the number of bytes needed to pad the header (0,1,2,3)\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 54)",
        "(line 474,col 9)-(line 474,col 56)",
        "(line 475,col 9)-(line 475,col 51)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getDataPadCount()",
      "begin_line": 487,
      "end_line": 495,
      "comment": "\n     * Get the number of bytes needed to pad the data to the alignment boundary.\n     * \n     * @return the number of bytes needed to pad the data (0,1,2,3)\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 54)",
        "(line 489,col 9)-(line 489,col 34)",
        "(line 490,col 9)-(line 490,col 59)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getInode()",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\n     * Set the inode.\n     * \n     * @return Returns the inode.\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getMode()",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\n     * Get the mode of this entry (e.g. directory, regular file).\n     * \n     * @return Returns the mode.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getName()",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * Get the name.\n     * \n     * @return Returns the name.\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getNumberOfLinks()",
      "begin_line": 529,
      "end_line": 533,
      "comment": "\n     * Get the number of links.\n     * \n     * @return Returns the number of links.\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 532,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getRemoteDevice()",
      "begin_line": 543,
      "end_line": 546,
      "comment": "\n     * Get the remote device id.\n     * \n     * @return Returns the remote device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 25)",
        "(line 545,col 9)-(line 545,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getRemoteDeviceMaj()",
      "begin_line": 556,
      "end_line": 559,
      "comment": "\n     * Get the remote major device id.\n     * \n     * @return Returns the remote major device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 25)",
        "(line 558,col 9)-(line 558,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getRemoteDeviceMin()",
      "begin_line": 569,
      "end_line": 572,
      "comment": "\n     * Get the remote minor device id.\n     * \n     * @return Returns the remote minor device id.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 25)",
        "(line 571,col 9)-(line 571,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getTime()",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * Get the time in seconds.\n     * \n     * @return Returns the time.\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getLastModifiedDate()",
      "begin_line": 583,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.getUID()",
      "begin_line": 592,
      "end_line": 594,
      "comment": "\n     * Get the user id.\n     * \n     * @return Returns the user id.\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isBlockDevice()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n     * Check if this entry represents a block device.\n     * \n     * @return TRUE if this entry is a block device.\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isCharacterDevice()",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n     * Check if this entry represents a character device.\n     * \n     * @return TRUE if this entry is a character device.\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isDirectory()",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\n     * Check if this entry represents a directory.\n     * \n     * @return TRUE if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isNetwork()",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * Check if this entry represents a network device.\n     * \n     * @return TRUE if this entry is a network device.\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isPipe()",
      "begin_line": 637,
      "end_line": 639,
      "comment": "\n     * Check if this entry represents a pipe.\n     * \n     * @return TRUE if this entry is a pipe.\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isRegularFile()",
      "begin_line": 646,
      "end_line": 648,
      "comment": "\n     * Check if this entry represents a regular file.\n     * \n     * @return TRUE if this entry is a regular file.\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isSocket()",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\n     * Check if this entry represents a socket.\n     * \n     * @return TRUE if this entry is a socket.\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.isSymbolicLink()",
      "begin_line": 664,
      "end_line": 666,
      "comment": "\n     * Check if this entry represents a symbolic link.\n     * \n     * @return TRUE if this entry is a symbolic link.\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setChksum(long)",
      "begin_line": 675,
      "end_line": 678,
      "comment": "\n     * Set the checksum. The checksum is calculated by adding all bytes of a\n     * file to transfer (crc +\u003d buf[pos] \u0026amp; 0xFF).\n     * \n     * @param chksum\n     *            The checksum to set.\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 25)",
        "(line 677,col 9)-(line 677,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setDevice(long)",
      "begin_line": 689,
      "end_line": 692,
      "comment": "\n     * Set the device id.\n     * \n     * @param device\n     *            The device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 25)",
        "(line 691,col 9)-(line 691,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setDeviceMaj(long)",
      "begin_line": 700,
      "end_line": 703,
      "comment": "\n     * Set major device id.\n     * \n     * @param maj\n     *            The major device id to set.\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 25)",
        "(line 702,col 9)-(line 702,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setDeviceMin(long)",
      "begin_line": 711,
      "end_line": 714,
      "comment": "\n     * Set the minor device id\n     * \n     * @param min\n     *            The minor device id to set.\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 25)",
        "(line 713,col 9)-(line 713,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setSize(long)",
      "begin_line": 722,
      "end_line": 728,
      "comment": "\n     * Set the filesize.\n     * \n     * @param size\n     *            The filesize to set.\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 727,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setGID(long)",
      "begin_line": 736,
      "end_line": 738,
      "comment": "\n     * Set the group id.\n     * \n     * @param gid\n     *            The group id to set.\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setInode(long)",
      "begin_line": 746,
      "end_line": 748,
      "comment": "\n     * Set the inode.\n     * \n     * @param inode\n     *            The inode to set.\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setMode(long)",
      "begin_line": 756,
      "end_line": 776,
      "comment": "\n     * Set the mode of this entry (e.g. directory, regular file).\n     * \n     * @param mode\n     *            The mode to set.\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 46)",
        "(line 758,col 9)-(line 773,col 9)",
        "(line 775,col 9)-(line 775,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setName(java.lang.String)",
      "begin_line": 784,
      "end_line": 786,
      "comment": "\n     * Set the name.\n     * \n     * @param name\n     *            The name to set.\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setNumberOfLinks(long)",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\n     * Set the number of links.\n     * \n     * @param nlink\n     *            The number of links to set.\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setRemoteDevice(long)",
      "begin_line": 807,
      "end_line": 810,
      "comment": "\n     * Set the remote device id.\n     * \n     * @param device\n     *            The remote device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with a new\n     *             format.\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 25)",
        "(line 809,col 9)-(line 809,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setRemoteDeviceMaj(long)",
      "begin_line": 821,
      "end_line": 824,
      "comment": "\n     * Set the remote major device id.\n     * \n     * @param rmaj\n     *            The remote major device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 25)",
        "(line 823,col 9)-(line 823,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setRemoteDeviceMin(long)",
      "begin_line": 835,
      "end_line": 838,
      "comment": "\n     * Set the remote minor device id.\n     * \n     * @param rmin\n     *            The remote minor device id to set.\n     * @throws UnsupportedOperationException\n     *             if this method is called for a CPIOArchiveEntry with an old\n     *             format.\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 25)",
        "(line 837,col 9)-(line 837,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setTime(long)",
      "begin_line": 846,
      "end_line": 848,
      "comment": "\n     * Set the time in seconds.\n     * \n     * @param time\n     *            The time to set.\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.setUID(long)",
      "begin_line": 856,
      "end_line": 858,
      "comment": "\n     * Set the user id.\n     * \n     * @param uid\n     *            The user id to set.\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.hashCode()",
      "begin_line": 863,
      "end_line": 869,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 29)",
        "(line 866,col 9)-(line 866,col 23)",
        "(line 867,col 9)-(line 867,col 71)",
        "(line 868,col 9)-(line 868,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry.equals(java.lang.Object)",
      "begin_line": 874,
      "end_line": 891,
      "comment": " (non-Javadoc)\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 56)",
        "(line 883,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 20)"
      ]
    }
  ]
}