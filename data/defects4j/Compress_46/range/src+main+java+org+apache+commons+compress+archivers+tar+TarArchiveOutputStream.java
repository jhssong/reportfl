{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 44,
      "end_line": 768,
      "comment": "\n * The TarOutputStream writes a UNIX tar archive as an OutputStream. Methods are provided to put\n * entries, and then write their contents by writing to this stream using write().\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_ERROR"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Fail if a long file name is required in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_TRUNCATE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Long paths will be truncated in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_GNU"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * GNU tar extensions are used to store long file names in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_POSIX"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * POSIX/PAX extensions are used to store long file names in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_ERROR"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Fail if a big number (e.g. size \u0026gt; 8GiB) is required in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_STAR"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * star/GNU tar/BSD tar extensions are used to store big number in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_POSIX"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * POSIX/PAX extensions are used to store big numbers in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RECORD_SIZE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currSize"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currName"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBytes"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordBuf"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemLen"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemBuf"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longFileMode"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bigNumberMode"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordsWritten"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordsPerBlock"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Indicates if putArchiveEntry has been called without closeArchiveEntry\n     "
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * indicates if this archive is finished\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "field",
      "varNames": [
        "addPaxHeadersForNonAsciiNames"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII"
      ],
      "begin_line": 113,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE_UNSPECIFIED"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Constructor for TarInputStream.\n     *\n     * @param os the output stream to use\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Constructor for TarInputStream.\n     *\n     * @param os the output stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Constructor for TarInputStream.\n     *\n     * @param os the output stream to use\n     * @param blockSize the block size to use. Must be a multiple of 512 bytes.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int)",
      "begin_line": 158,
      "end_line": 162,
      "comment": "\n     * Constructor for TarInputStream.\n     *\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use. Must be 512 bytes.\n     * @deprecated recordSize must always be 512 bytes. An IllegalArgumentException will be thrown\n     * if any other value is used\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int, java.lang.String)",
      "begin_line": 175,
      "end_line": 184,
      "comment": "\n     * Constructor for TarInputStream.\n     *\n     * @param os the output stream to use\n     * @param blockSize the block size to use . Must be a multiple of 512 bytes.\n     * @param recordSize the record size to use. Must be 512 bytes.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     * @deprecated recordSize must always be 512 bytes. An IllegalArgumentException will be thrown\n     * if any other value is used.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 38)",
        "(line 179,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, java.lang.String)",
      "begin_line": 194,
      "end_line": 214,
      "comment": "\n     * Constructor for TarInputStream.\n     *\n     * @param os the output stream to use\n     * @param blockSize the block size to use. Must be a multiple of 512 bytes.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 26)",
        "(line 197,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 43)",
        "(line 207,col 9)-(line 207,col 33)",
        "(line 208,col 9)-(line 208,col 70)",
        "(line 210,col 9)-(line 210,col 26)",
        "(line 211,col 9)-(line 211,col 46)",
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Set the long file mode. This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or\n     * LONGFILE_GNU(2). This specifies the treatment of long file names (names \u0026gt;\u003d\n     * TarConstants.NAMELEN). Default is LONGFILE_ERROR.\n     *\n     * @param longFileMode the mode to use\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setBigNumberMode(int)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Set the big number mode. This can be BIGNUMBER_ERROR(0), BIGNUMBER_POSIX(1) or\n     * BIGNUMBER_STAR(2). This specifies the treatment of big files (sizes \u0026gt;\n     * TarConstants.MAXSIZE) and other numeric values to big to fit into a traditional tar header.\n     * Default is BIGNUMBER_ERROR.\n     *\n     * @param bigNumberMode the mode to use\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setAddPaxHeadersForNonAsciiNames(boolean)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Whether to add a PAX extension header for non-ASCII file names.\n     *\n     * @param b whether to add a PAX extension header for non-ASCII file names.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getCount()",
      "begin_line": 250,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten()",
      "begin_line": 256,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish()",
      "begin_line": 270,
      "end_line": 284,
      "comment": "\n     * Ends the TAR archive without closing the underlying OutputStream.\n     *\n     * An archive consists of a series of file entries terminated by an\n     * end-of-archive entry, which consists of two 512 blocks of zero bytes.\n     * POSIX.1 requires two EOF records, like some other implementations.\n     *\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 25)",
        "(line 280,col 9)-(line 280,col 25)",
        "(line 281,col 9)-(line 281,col 22)",
        "(line 282,col 9)-(line 282,col 20)",
        "(line 283,col 9)-(line 283,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close()",
      "begin_line": 291,
      "end_line": 301,
      "comment": "\n     * Closes the underlying OutputStream.\n     *\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize()",
      "begin_line": 309,
      "end_line": 312,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 325,
      "end_line": 387,
      "comment": "\n     * Put an entry on the output stream. This writes the entry\u0027s header record and positions the\n     * output stream for writing the contents of the entry. Once this method is called, the stream\n     * is ready for calls to write() to write the entry\u0027s contents. Once the contents are written,\n     * closeArchiveEntry() \u003cB\u003eMUST\u003c/B\u003e be called to ensure that all buffered data is completely\n     * written to the output stream.\n     *\n     * @param archiveEntry The TarEntry to be written to the archive.\n     * @throws IOException on error\n     * @throws ClassCastException if archiveEntry is not an instance of TarArchiveEntry\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 69)",
        "(line 331,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 397,
      "end_line": 423,
      "comment": "\n     * Close an entry. This method MUST be called for all file entries that contain data. The reason\n     * is that we must buffer data written to the stream in order to satisfy the buffer\u0027s record\n     * based writes. Thus, there may be data fragments still being assembled that must be written to\n     * the output stream before this entry is closed and the next entry written.\n     *\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 437,
      "end_line": 504,
      "comment": "\n     * Writes bytes to the current tar archive entry. This method is aware of the current entry and\n     * will throw an exception if you attempt to write bytes past the length specified for the\n     * current entry. The method is also (painfully) aware of the record buffering required by\n     * TarBuffer, and manages buffers that are not a multiple of recordsize in length, including\n     * assembling records from small buffers.\n     *\n     * @param wBuf The buffer to write to the archive.\n     * @param wOffset The offset in the buffer from which to get bytes.\n     * @param numToWrite The number of bytes to write.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 479,col 9)",
        "(line 486,col 9)-(line 503,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 511,
      "end_line": 527,
      "comment": "\n     * Writes a PAX extended header with the given map as contents.\n     *\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 66)",
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 519,col 52)",
        "(line 520,col 9)-(line 520,col 36)",
        "(line 522,col 9)-(line 522,col 70)",
        "(line 523,col 9)-(line 523,col 33)",
        "(line 524,col 9)-(line 524,col 29)",
        "(line 525,col 9)-(line 525,col 20)",
        "(line 526,col 9)-(line 526,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.encodeExtendedPaxHeadersContents(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 529,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 50)",
        "(line 532,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(java.lang.String)",
      "begin_line": 555,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 41)",
        "(line 557,col 9)-(line 557,col 63)",
        "(line 558,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.shouldBeReplaced(char)",
      "begin_line": 573,
      "end_line": 577,
      "comment": "\n     * @return true if the character could lead to problems when used inside a TarArchiveEntry name\n     * for a PAX header.\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 576,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord()",
      "begin_line": 583,
      "end_line": 586,
      "comment": "\n     * Write an EOF (end of archive) record to the tar archive. An EOF record consists of a record\n     * of all zeros.\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 41)",
        "(line 585,col 9)-(line 585,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush()",
      "begin_line": 588,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 593,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(byte[])",
      "begin_line": 608,
      "end_line": 618,
      "comment": "\n     * Write an archive record to the archive.\n     *\n     * @param record The record data to write to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 614,col 9)",
        "(line 616,col 9)-(line 616,col 26)",
        "(line 617,col 9)-(line 617,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(byte[], int)",
      "begin_line": 628,
      "end_line": 639,
      "comment": "\n     * Write an archive record to the archive, where the record may be inside of a larger array\n     * buffer. The buffer must be \"offset plus record size\" long.\n     *\n     * @param buf The buffer containing the record data to write.\n     * @param offset The offset of the record data within buf.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 635,col 9)",
        "(line 637,col 9)-(line 637,col 44)",
        "(line 638,col 9)-(line 638,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded()",
      "begin_line": 641,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 59)",
        "(line 643,col 9)-(line 647,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 650,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 652,col 9)-(line 653,col 34)",
        "(line 654,col 9)-(line 655,col 32)",
        "(line 656,col 9)-(line 658,col 34)",
        "(line 659,col 9)-(line 660,col 32)",
        "(line 662,col 9)-(line 663,col 53)",
        "(line 664,col 9)-(line 665,col 53)",
        "(line 667,col 9)-(line 667,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, long, long)",
      "begin_line": 670,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 678,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 78)",
        "(line 680,col 9)-(line 680,col 97)",
        "(line 681,col 9)-(line 683,col 34)",
        "(line 684,col 9)-(line 684,col 79)",
        "(line 685,col 9)-(line 685,col 70)",
        "(line 686,col 9)-(line 687,col 32)",
        "(line 688,col 9)-(line 689,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long)",
      "begin_line": 692,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumberWithPosixMessage(java.lang.String, long, long)",
      "begin_line": 696,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 698,col 9)-(line 699,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long, java.lang.String)",
      "begin_line": 702,
      "end_line": 709,
      "comment": "",
      "child_ranges": [
        "(line 704,col 9)-(line 708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.handleLongName(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, byte, java.lang.String)",
      "begin_line": 728,
      "end_line": 758,
      "comment": "\n     * Handles long file or link names according to the longFileMode setting.\n     *\n     * \u003cp\u003eI.e. if the given name is too long to be written to a plain tar header then \u003cul\u003e \u003cli\u003eit\n     * creates a pax header who\u0027s name is given by the paxHeaderName parameter if longFileMode is\n     * POSIX\u003c/li\u003e \u003cli\u003eit creates a GNU longlink entry who\u0027s type is given by the linkType parameter\n     * if longFileMode is GNU\u003c/li\u003e \u003cli\u003eit throws an exception if longFileMode is ERROR\u003c/li\u003e \u003cli\u003eit\n     * truncates the name if longFileMode is TRUNCATE\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param entry entry the name belongs to\n     * @param name the name to write\n     * @param paxHeaders current map of pax headers\n     * @param paxHeaderName name of the pax header to write\n     * @param linkType type of the GNU entry to write\n     * @param fieldName the name of the field\n     * @return whether a pax header has been written.\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 64)",
        "(line 733,col 9)-(line 733,col 69)",
        "(line 734,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 760,
      "end_line": 767,
      "comment": "",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 45)",
        "(line 762,col 9)-(line 762,col 69)",
        "(line 763,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 35)"
      ]
    }
  ]
}