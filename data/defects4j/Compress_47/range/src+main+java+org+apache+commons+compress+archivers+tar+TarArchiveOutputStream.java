{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 54,
      "end_line": 697,
      "comment": "\n * The TarOutputStream writes a UNIX tar archive as an OutputStream. Methods are provided to put\n * entries, and then write their contents by writing to this stream using write().\n *\n * \u003cp\u003etar archives consist of a sequence of records of 512 bytes each\n * that are grouped into blocks. Prior to Apache Commons Compress 1.14\n * it has been possible to configure a record size different from 512\n * bytes and arbitrary block sizes. Starting with Compress 1.15 512 is\n * the only valid option for the record size and the block size must\n * be a multiple of 512. Also the default block size changed from\n * 10240 bytes prior to Compress 1.15 to 512 bytes with Compress\n * 1.15.\u003c/p\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_ERROR"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Fail if a long file name is required in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_TRUNCATE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Long paths will be truncated in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_GNU"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * GNU tar extensions are used to store long file names in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_POSIX"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * POSIX/PAX extensions are used to store long file names in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_ERROR"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Fail if a big number (e.g. size \u0026gt; 8GiB) is required in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_STAR"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * star/GNU tar/BSD tar extensions are used to store big number in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_POSIX"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * POSIX/PAX extensions are used to store big numbers in the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RECORD_SIZE"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currSize"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currName"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBytes"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordBuf"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longFileMode"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bigNumberMode"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordsWritten"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordsPerBlock"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Indicates if putArchiveEntry has been called without closeArchiveEntry\n     "
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * indicates if this archive is finished\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "countingOut"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "field",
      "varNames": [
        "addPaxHeadersForNonAsciiNames"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII"
      ],
      "begin_line": 122,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE_UNSPECIFIED"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Constructor for TarArchiveOutputStream.\n     *\n     * \u003cp\u003eUses a block size of 512 bytes.\u003c/p\u003e\n     *\n     * @param os the output stream to use\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Constructor for TarArchiveOutputStream.\n     *\n     * \u003cp\u003eUses a block size of 512 bytes.\u003c/p\u003e\n     *\n     * @param os the output stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Constructor for TarArchiveOutputStream.\n     *\n     * @param os the output stream to use\n     * @param blockSize the block size to use. Must be a multiple of 512 bytes.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int)",
      "begin_line": 171,
      "end_line": 175,
      "comment": "\n     * Constructor for TarArchiveOutputStream.\n     *\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use. Must be 512 bytes.\n     * @deprecated recordSize must always be 512 bytes. An IllegalArgumentException will be thrown\n     * if any other value is used\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int, java.lang.String)",
      "begin_line": 188,
      "end_line": 197,
      "comment": "\n     * Constructor for TarArchiveOutputStream.\n     *\n     * @param os the output stream to use\n     * @param blockSize the block size to use . Must be a multiple of 512 bytes.\n     * @param recordSize the record size to use. Must be 512 bytes.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     * @deprecated recordSize must always be 512 bytes. An IllegalArgumentException will be thrown\n     * if any other value is used.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 38)",
        "(line 192,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, java.lang.String)",
      "begin_line": 207,
      "end_line": 226,
      "comment": "\n     * Constructor for TarArchiveOutputStream.\n     *\n     * @param os the output stream to use\n     * @param blockSize the block size to use. Must be a multiple of 512 bytes.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 26)",
        "(line 210,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 220,col 60)",
        "(line 221,col 9)-(line 221,col 33)",
        "(line 222,col 9)-(line 222,col 70)",
        "(line 224,col 9)-(line 224,col 47)",
        "(line 225,col 9)-(line 225,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Set the long file mode. This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or\n     * LONGFILE_GNU(2). This specifies the treatment of long file names (names \u0026gt;\u003d\n     * TarConstants.NAMELEN). Default is LONGFILE_ERROR.\n     *\n     * @param longFileMode the mode to use\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setBigNumberMode(int)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Set the big number mode. This can be BIGNUMBER_ERROR(0), BIGNUMBER_POSIX(1) or\n     * BIGNUMBER_STAR(2). This specifies the treatment of big files (sizes \u0026gt;\n     * TarConstants.MAXSIZE) and other numeric values to big to fit into a traditional tar header.\n     * Default is BIGNUMBER_ERROR.\n     *\n     * @param bigNumberMode the mode to use\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setAddPaxHeadersForNonAsciiNames(boolean)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Whether to add a PAX extension header for non-ASCII file names.\n     *\n     * @param b whether to add a PAX extension header for non-ASCII file names.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getCount()",
      "begin_line": 262,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten()",
      "begin_line": 268,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish()",
      "begin_line": 282,
      "end_line": 296,
      "comment": "\n     * Ends the TAR archive without closing the underlying OutputStream.\n     *\n     * An archive consists of a series of file entries terminated by an\n     * end-of-archive entry, which consists of two 512 blocks of zero bytes.\n     * POSIX.1 requires two EOF records, like some other implementations.\n     *\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 25)",
        "(line 292,col 9)-(line 292,col 25)",
        "(line 293,col 9)-(line 293,col 22)",
        "(line 294,col 9)-(line 294,col 20)",
        "(line 295,col 9)-(line 295,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close()",
      "begin_line": 303,
      "end_line": 313,
      "comment": "\n     * Closes the underlying OutputStream.\n     *\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize()",
      "begin_line": 321,
      "end_line": 324,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 337,
      "end_line": 399,
      "comment": "\n     * Put an entry on the output stream. This writes the entry\u0027s header record and positions the\n     * output stream for writing the contents of the entry. Once this method is called, the stream\n     * is ready for calls to write() to write the entry\u0027s contents. Once the contents are written,\n     * closeArchiveEntry() \u003cB\u003eMUST\u003c/B\u003e be called to ensure that all buffered data is completely\n     * written to the output stream.\n     *\n     * @param archiveEntry The TarEntry to be written to the archive.\n     * @throws IOException on error\n     * @throws ClassCastException if archiveEntry is not an instance of TarArchiveEntry\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 69)",
        "(line 343,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 409,
      "end_line": 429,
      "comment": "\n     * Close an entry. This method MUST be called for all file entries that contain data. The reason\n     * is that we must buffer data written to the stream in order to satisfy the buffer\u0027s record\n     * based writes. Thus, there may be data fragments still being assembled that must be written to\n     * the output stream before this entry is closed and the next entry written.\n     *\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 25)",
        "(line 418,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 51)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 441,
      "end_line": 454,
      "comment": "\n     * Writes bytes to the current tar archive entry. This method is aware of the current entry and\n     * will throw an exception if you attempt to write bytes past the length specified for the\n     * current entry.\n     *\n     * @param wBuf The buffer to write to the archive.\n     * @param wOffset The offset in the buffer from which to get bytes.\n     * @param numToWrite The number of bytes to write.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 45)",
        "(line 453,col 9)-(line 453,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 461,
      "end_line": 477,
      "comment": "\n     * Writes a PAX extended header with the given map as contents.\n     *\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 66)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 469,col 52)",
        "(line 470,col 9)-(line 470,col 36)",
        "(line 472,col 9)-(line 472,col 70)",
        "(line 473,col 9)-(line 473,col 33)",
        "(line 474,col 9)-(line 474,col 29)",
        "(line 475,col 9)-(line 475,col 20)",
        "(line 476,col 9)-(line 476,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.encodeExtendedPaxHeadersContents(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 479,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 50)",
        "(line 482,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(java.lang.String)",
      "begin_line": 505,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 41)",
        "(line 507,col 9)-(line 507,col 63)",
        "(line 508,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.shouldBeReplaced(char)",
      "begin_line": 523,
      "end_line": 527,
      "comment": "\n     * @return true if the character could lead to problems when used inside a TarArchiveEntry name\n     * for a PAX header.\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 526,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord()",
      "begin_line": 533,
      "end_line": 536,
      "comment": "\n     * Write an EOF (end of archive) record to the tar archive. An EOF record consists of a record\n     * of all zeros.\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 41)",
        "(line 535,col 9)-(line 535,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush()",
      "begin_line": 538,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 543,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(byte[])",
      "begin_line": 558,
      "end_line": 568,
      "comment": "\n     * Write an archive record to the archive.\n     *\n     * @param record The record data to write to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 564,col 9)",
        "(line 566,col 9)-(line 566,col 26)",
        "(line 567,col 9)-(line 567,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded()",
      "begin_line": 570,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 59)",
        "(line 572,col 9)-(line 576,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 579,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 582,col 34)",
        "(line 583,col 9)-(line 584,col 32)",
        "(line 585,col 9)-(line 587,col 34)",
        "(line 588,col 9)-(line 589,col 32)",
        "(line 591,col 9)-(line 592,col 53)",
        "(line 593,col 9)-(line 594,col 53)",
        "(line 596,col 9)-(line 596,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, long, long)",
      "begin_line": 599,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 602,col 9)-(line 604,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 607,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 78)",
        "(line 609,col 9)-(line 609,col 97)",
        "(line 610,col 9)-(line 612,col 34)",
        "(line 613,col 9)-(line 613,col 79)",
        "(line 614,col 9)-(line 614,col 70)",
        "(line 615,col 9)-(line 616,col 32)",
        "(line 617,col 9)-(line 618,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long)",
      "begin_line": 621,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumberWithPosixMessage(java.lang.String, long, long)",
      "begin_line": 625,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 628,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long, java.lang.String)",
      "begin_line": 631,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 637,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.handleLongName(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, byte, java.lang.String)",
      "begin_line": 657,
      "end_line": 687,
      "comment": "\n     * Handles long file or link names according to the longFileMode setting.\n     *\n     * \u003cp\u003eI.e. if the given name is too long to be written to a plain tar header then \u003cul\u003e \u003cli\u003eit\n     * creates a pax header who\u0027s name is given by the paxHeaderName parameter if longFileMode is\n     * POSIX\u003c/li\u003e \u003cli\u003eit creates a GNU longlink entry who\u0027s type is given by the linkType parameter\n     * if longFileMode is GNU\u003c/li\u003e \u003cli\u003eit throws an exception if longFileMode is ERROR\u003c/li\u003e \u003cli\u003eit\n     * truncates the name if longFileMode is TRUNCATE\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param entry entry the name belongs to\n     * @param name the name to write\n     * @param paxHeaders current map of pax headers\n     * @param paxHeaderName name of the pax header to write\n     * @param linkType type of the GNU entry to write\n     * @param fieldName the name of the field\n     * @return whether a pax header has been written.\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 64)",
        "(line 662,col 9)-(line 662,col 69)",
        "(line 663,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 689,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 45)",
        "(line 691,col 9)-(line 691,col 69)",
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 35)"
      ]
    }
  ]
}