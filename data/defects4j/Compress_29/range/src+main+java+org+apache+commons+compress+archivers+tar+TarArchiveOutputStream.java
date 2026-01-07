{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 43,
      "end_line": 700,
      "comment": "\n * The TarOutputStream writes a UNIX tar archive as an OutputStream.\n * Methods are provided to put entries, and then write their contents\n * by writing to this stream using write().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_ERROR"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Fail if a long file name is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_TRUNCATE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Long paths will be truncated in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_GNU"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " GNU tar extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_POSIX"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " POSIX/PAX extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_ERROR"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Fail if a big number (e.g. size \u0026gt; 8GiB) is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_STAR"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " star/GNU tar/BSD tar extensions are used to store big number in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_POSIX"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " POSIX/PAX extensions are used to store big numbers in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "currSize"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currName"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBytes"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordBuf"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemLen"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemBuf"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longFileMode"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bigNumberMode"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordsWritten"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordsPerBlock"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSize"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Indicates if putArchiveEntry has been called without closeArchiveEntry "
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addPaxHeadersForNonAsciiNames"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII"
      ],
      "begin_line": 92,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 87)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, java.lang.String)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int, java.lang.String)",
      "begin_line": 152,
      "end_line": 162,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 43)",
        "(line 155,col 9)-(line 155,col 70)",
        "(line 157,col 9)-(line 157,col 26)",
        "(line 158,col 9)-(line 158,col 45)",
        "(line 159,col 9)-(line 159,col 46)",
        "(line 160,col 9)-(line 160,col 37)",
        "(line 161,col 9)-(line 161,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Set the long file mode.\n     * This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or LONGFILE_GNU(2).\n     * This specifies the treatment of long file names (names \u0026gt;\u003d TarConstants.NAMELEN).\n     * Default is LONGFILE_ERROR.\n     * @param longFileMode the mode to use\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setBigNumberMode(int)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Set the big number mode.\n     * This can be BIGNUMBER_ERROR(0), BIGNUMBER_POSIX(1) or BIGNUMBER_STAR(2).\n     * This specifies the treatment of big files (sizes \u0026gt; TarConstants.MAXSIZE) and other numeric values to big to fit into a traditional tar header.\n     * Default is BIGNUMBER_ERROR.\n     * @param bigNumberMode the mode to use\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setAddPaxHeadersForNonAsciiNames(boolean)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Whether to add a PAX extension header for non-ASCII file names.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getCount()",
      "begin_line": 195,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish()",
      "begin_line": 215,
      "end_line": 229,
      "comment": "\n     * Ends the TAR archive without closing the underlying OutputStream.\n     * \n     * An archive consists of a series of file entries terminated by an\n     * end-of-archive entry, which consists of two 512 blocks of zero bytes. \n     * POSIX.1 requires two EOF records, like some other implementations.\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 25)",
        "(line 225,col 9)-(line 225,col 25)",
        "(line 226,col 9)-(line 226,col 22)",
        "(line 227,col 9)-(line 227,col 20)",
        "(line 228,col 9)-(line 228,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close()",
      "begin_line": 235,
      "end_line": 245,
      "comment": "\n     * Closes the underlying OutputStream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 269,
      "end_line": 319,
      "comment": "\n     * Put an entry on the output stream. This writes the entry\u0027s\n     * header record and positions the output stream for writing\n     * the contents of the entry. Once this method is called, the\n     * stream is ready for calls to write() to write the entry\u0027s\n     * contents. Once the contents are written, closeArchiveEntry()\n     * \u003cB\u003eMUST\u003c/B\u003e be called to ensure that all buffered data\n     * is completely written to the output stream.\n     *\n     * @param archiveEntry The TarEntry to be written to the archive.\n     * @throws IOException on error\n     * @throws ClassCastException if archiveEntry is not an instance of TarArchiveEntry\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 63)",
        "(line 275,col 9)-(line 275,col 71)",
        "(line 276,col 9)-(line 276,col 49)",
        "(line 277,col 9)-(line 278,col 102)",
        "(line 280,col 9)-(line 280,col 52)",
        "(line 281,col 9)-(line 283,col 77)",
        "(line 285,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 307,col 64)",
        "(line 308,col 9)-(line 308,col 31)",
        "(line 310,col 9)-(line 310,col 22)",
        "(line 312,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 29)",
        "(line 318,col 9)-(line 318,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 331,
      "end_line": 357,
      "comment": "\n     * Close an entry. This method MUST be called for all file\n     * entries that contain data. The reason is that we must\n     * buffer data written to the stream in order to satisfy\n     * the buffer\u0027s record based writes. Thus, there may be\n     * data fragments still being assembled that must be written\n     * to the output stream before this entry is closed and the\n     * next entry written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 373,
      "end_line": 440,
      "comment": "\n     * Writes bytes to the current tar archive entry. This method\n     * is aware of the current entry and will throw an exception if\n     * you attempt to write bytes past the length specified for the\n     * current entry. The method is also (painfully) aware of the\n     * record buffering required by TarBuffer, and manages buffers\n     * that are not a multiple of recordsize in length, including\n     * assembling records from small buffers.\n     *\n     * @param wBuf The buffer to write to the archive.\n     * @param wOffset The offset in the buffer from which to get bytes.\n     * @param numToWrite The number of bytes to write.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 415,col 9)",
        "(line 422,col 9)-(line 439,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 446,
      "end_line": 483,
      "comment": "\n     * Writes a PAX extended header with the given map as contents.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 66)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 454,col 90)",
        "(line 455,col 9)-(line 455,col 36)",
        "(line 457,col 9)-(line 457,col 44)",
        "(line 458,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 64)",
        "(line 479,col 9)-(line 479,col 33)",
        "(line 480,col 9)-(line 480,col 29)",
        "(line 481,col 9)-(line 481,col 20)",
        "(line 482,col 9)-(line 482,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(java.lang.String)",
      "begin_line": 485,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 41)",
        "(line 487,col 9)-(line 487,col 57)",
        "(line 488,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.shouldBeReplaced(char)",
      "begin_line": 503,
      "end_line": 507,
      "comment": "\n     * @return true if the character could lead to problems when used\n     * inside a TarArchiveEntry name for a PAX header.\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord()",
      "begin_line": 513,
      "end_line": 516,
      "comment": "\n     * Write an EOF (end of archive) record to the tar archive.\n     * An EOF record consists of a record of all zeros.\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 41)",
        "(line 515,col 9)-(line 515,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush()",
      "begin_line": 518,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 523,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(byte[])",
      "begin_line": 538,
      "end_line": 548,
      "comment": "\n     * Write an archive record to the archive.\n     *\n     * @param record The record data to write to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 26)",
        "(line 547,col 9)-(line 547,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(byte[], int)",
      "begin_line": 559,
      "end_line": 570,
      "comment": "\n     * Write an archive record to the archive, where the record may be\n     * inside of a larger array buffer. The buffer must be \"offset plus\n     * record size\" long.\n     *\n     * @param buf The buffer containing the record data to write.\n     * @param offset The offset of the record data within buf.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 566,col 9)",
        "(line 568,col 9)-(line 568,col 43)",
        "(line 569,col 9)-(line 569,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded()",
      "begin_line": 572,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 53)",
        "(line 574,col 9)-(line 578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 581,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 583,col 9)-(line 584,col 55)",
        "(line 585,col 9)-(line 586,col 53)",
        "(line 587,col 9)-(line 589,col 55)",
        "(line 590,col 9)-(line 591,col 53)",
        "(line 593,col 9)-(line 594,col 74)",
        "(line 595,col 9)-(line 596,col 74)",
        "(line 598,col 9)-(line 598,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, long, long)",
      "begin_line": 601,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 604,col 9)-(line 606,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 609,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 78)",
        "(line 611,col 9)-(line 611,col 93)",
        "(line 612,col 9)-(line 614,col 47)",
        "(line 615,col 9)-(line 615,col 75)",
        "(line 616,col 9)-(line 616,col 70)",
        "(line 617,col 9)-(line 618,col 45)",
        "(line 619,col 9)-(line 620,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long)",
      "begin_line": 623,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumberWithPosixMessage(java.lang.String, long, long)",
      "begin_line": 627,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long, java.lang.String)",
      "begin_line": 631,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 632,col 9)-(line 636,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.handleLongName(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, byte, java.lang.String)",
      "begin_line": 661,
      "end_line": 690,
      "comment": "\n     * Handles long file or link names according to the longFileMode setting.\n     *\n     * \u003cp\u003eI.e. if the given name is too long to be written to a plain\n     * tar header then\n     * \u003cul\u003e\n     *   \u003cli\u003eit creates a pax header who\u0027s name is given by the\n     *   paxHeaderName parameter if longFileMode is POSIX\u003c/li\u003e\n     *   \u003cli\u003eit creates a GNU longlink entry who\u0027s type is given by\n     *   the linkType parameter if longFileMode is GNU\u003c/li\u003e\n     *   \u003cli\u003eit throws an exception if longFileMode is ERROR\u003c/li\u003e\n     *   \u003cli\u003eit truncates the name if longFileMode is TRUNCATE\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param entry entry the name belongs to\n     * @param name the name to write\n     * @param paxHeaders current map of pax headers\n     * @param paxHeaderName name of the pax header to write\n     * @param linkType type of the GNU entry to write\n     * @param fieldName the name of the field\n     * @return whether a pax header has been written.\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 64)",
        "(line 666,col 9)-(line 666,col 69)",
        "(line 667,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 689,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 692,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 45)",
        "(line 694,col 9)-(line 694,col 63)",
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 35)"
      ]
    }
  ]
}