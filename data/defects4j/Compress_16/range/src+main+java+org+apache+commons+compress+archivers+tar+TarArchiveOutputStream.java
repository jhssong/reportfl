{
  "filepath": "/tmp/Compress-16b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 40,
      "end_line": 577,
      "comment": "\n * The TarOutputStream writes a UNIX tar archive as an OutputStream.\n * Methods are provided to put entries, and then write their contents\n * by writing to this stream using write().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_ERROR"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Fail if a long file name is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_TRUNCATE"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Long paths will be truncated in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_GNU"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " GNU tar extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_POSIX"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " POSIX/PAX extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_ERROR"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Fail if a big number (e.g. size \u0026gt; 8GiB) is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_STAR"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " star/GNU tar/BSD tar extensions are used to store big number in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_POSIX"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " POSIX/PAX extensions are used to store big numbers in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "currSize"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currName"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBytes"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordBuf"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemLen"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemBuf"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longFileMode"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bigNumberMode"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Indicates if putArchiveEntry has been called without closeArchiveEntry "
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addPaxHeadersForNonAsciiNames"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII"
      ],
      "begin_line": 85,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, java.lang.String)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int, java.lang.String)",
      "begin_line": 145,
      "end_line": 154,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 43)",
        "(line 148,col 9)-(line 148,col 67)",
        "(line 150,col 9)-(line 150,col 64)",
        "(line 151,col 9)-(line 151,col 26)",
        "(line 152,col 9)-(line 152,col 45)",
        "(line 153,col 9)-(line 153,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Set the long file mode.\n     * This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or LONGFILE_GNU(2).\n     * This specifies the treatment of long file names (names \u003e\u003d TarConstants.NAMELEN).\n     * Default is LONGFILE_ERROR.\n     * @param longFileMode the mode to use\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setBigNumberMode(int)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Set the big number mode.\n     * This can be BIGNUMBER_ERROR(0), BIGNUMBER_POSIX(1) or BIGNUMBER_STAR(2).\n     * This specifies the treatment of big files (sizes \u0026gt; TarConstants.MAXSIZE) and other numeric values to big to fit into a traditional tar header.\n     * Default is BIGNUMBER_ERROR.\n     * @param bigNumberMode the mode to use\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setAddPaxHeadersForNonAsciiNames(boolean)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Whether to add a PAX extension header for non-ASCII file names.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getCount()",
      "begin_line": 187,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish()",
      "begin_line": 207,
      "end_line": 220,
      "comment": "\n     * Ends the TAR archive without closing the underlying OutputStream.\n     * \n     * An archive consists of a series of file entries terminated by an\n     * end-of-archive entry, which consists of two 512 blocks of zero bytes. \n     * POSIX.1 requires two EOF records, like some other implementations.\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 25)",
        "(line 217,col 9)-(line 217,col 25)",
        "(line 218,col 9)-(line 218,col 28)",
        "(line 219,col 9)-(line 219,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close()",
      "begin_line": 226,
      "end_line": 237,
      "comment": "\n     * Closes the underlying OutputStream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 261,
      "end_line": 328,
      "comment": "\n     * Put an entry on the output stream. This writes the entry\u0027s\n     * header record and positions the output stream for writing\n     * the contents of the entry. Once this method is called, the\n     * stream is ready for calls to write() to write the entry\u0027s\n     * contents. Once the contents are written, closeArchiveEntry()\n     * \u003cB\u003eMUST\u003c/B\u003e be called to ensure that all buffered data\n     * is completely written to the output stream.\n     *\n     * @param archiveEntry The TarEntry to be written to the archive.\n     * @throws IOException on error\n     * @throws ClassCastException if archiveEntry is not an instance of TarArchiveEntry\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 63)",
        "(line 267,col 9)-(line 267,col 71)",
        "(line 268,col 9)-(line 268,col 49)",
        "(line 269,col 9)-(line 269,col 68)",
        "(line 270,col 9)-(line 270,col 46)",
        "(line 271,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 316,col 64)",
        "(line 317,col 9)-(line 317,col 38)",
        "(line 319,col 9)-(line 319,col 22)",
        "(line 321,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 29)",
        "(line 327,col 9)-(line 327,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 340,
      "end_line": 366,
      "comment": "\n     * Close an entry. This method MUST be called for all file\n     * entries that contain data. The reason is that we must\n     * buffer data written to the stream in order to satisfy\n     * the buffer\u0027s record based writes. Thus, there may be\n     * data fragments still being assembled that must be written\n     * to the output stream before this entry is closed and the\n     * next entry written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 357,col 9)",
        "(line 359,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 382,
      "end_line": 446,
      "comment": "\n     * Writes bytes to the current tar archive entry. This method\n     * is aware of the current entry and will throw an exception if\n     * you attempt to write bytes past the length specified for the\n     * current entry. The method is also (painfully) aware of the\n     * record buffering required by TarBuffer, and manages buffers\n     * that are not a multiple of recordsize in length, including\n     * assembling records from small buffers.\n     *\n     * @param wBuf The buffer to write to the archive.\n     * @param wOffset The offset in the buffer from which to get bytes.\n     * @param numToWrite The number of bytes to write.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 421,col 9)",
        "(line 428,col 9)-(line 445,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 452,
      "end_line": 487,
      "comment": "\n     * Writes a PAX extended header with the given map as contents.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 66)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 459,col 90)",
        "(line 461,col 9)-(line 461,col 44)",
        "(line 462,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 64)",
        "(line 483,col 9)-(line 483,col 33)",
        "(line 484,col 9)-(line 484,col 29)",
        "(line 485,col 9)-(line 485,col 20)",
        "(line 486,col 9)-(line 486,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(java.lang.String)",
      "begin_line": 489,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 41)",
        "(line 491,col 9)-(line 491,col 55)",
        "(line 492,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord()",
      "begin_line": 505,
      "end_line": 511,
      "comment": "\n     * Write an EOF (end of archive) record to the tar archive.\n     * An EOF record consists of a record of all zeros.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 510,col 9)-(line 510,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush()",
      "begin_line": 513,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 519,
      "end_line": 526,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 528,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 530,col 9)-(line 531,col 55)",
        "(line 532,col 9)-(line 533,col 53)",
        "(line 534,col 9)-(line 536,col 55)",
        "(line 537,col 9)-(line 538,col 53)",
        "(line 540,col 9)-(line 541,col 74)",
        "(line 542,col 9)-(line 543,col 74)",
        "(line 545,col 9)-(line 545,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, long, long)",
      "begin_line": 548,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 556,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 78)",
        "(line 558,col 9)-(line 558,col 77)",
        "(line 559,col 9)-(line 561,col 47)",
        "(line 562,col 9)-(line 562,col 75)",
        "(line 563,col 9)-(line 563,col 70)",
        "(line 564,col 9)-(line 565,col 45)",
        "(line 566,col 9)-(line 567,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long)",
      "begin_line": 570,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 571,col 9)-(line 575,col 9)"
      ]
    }
  ]
}