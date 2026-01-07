{
  "filepath": "/tmp/Compress-39b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 43,
      "end_line": 703,
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
        "encoding"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "field",
      "varNames": [
        "addPaxHeadersForNonAsciiNames"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII"
      ],
      "begin_line": 93,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 87)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, java.lang.String)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int, java.lang.String)",
      "begin_line": 153,
      "end_line": 164,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 43)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 157,col 70)",
        "(line 159,col 9)-(line 159,col 26)",
        "(line 160,col 9)-(line 160,col 45)",
        "(line 161,col 9)-(line 161,col 46)",
        "(line 162,col 9)-(line 162,col 37)",
        "(line 163,col 9)-(line 163,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Set the long file mode.\n     * This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or LONGFILE_GNU(2).\n     * This specifies the treatment of long file names (names \u0026gt;\u003d TarConstants.NAMELEN).\n     * Default is LONGFILE_ERROR.\n     * @param longFileMode the mode to use\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setBigNumberMode(int)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Set the big number mode.\n     * This can be BIGNUMBER_ERROR(0), BIGNUMBER_POSIX(1) or BIGNUMBER_STAR(2).\n     * This specifies the treatment of big files (sizes \u0026gt; TarConstants.MAXSIZE) and other numeric values to big to fit into a traditional tar header.\n     * Default is BIGNUMBER_ERROR.\n     * @param bigNumberMode the mode to use\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setAddPaxHeadersForNonAsciiNames(boolean)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Whether to add a PAX extension header for non-ASCII file names.\n     * @since 1.4\n     * @param b whether to add a PAX extension header for non-ASCII file names.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getCount()",
      "begin_line": 198,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten()",
      "begin_line": 204,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish()",
      "begin_line": 218,
      "end_line": 232,
      "comment": "\n     * Ends the TAR archive without closing the underlying OutputStream.\n     * \n     * An archive consists of a series of file entries terminated by an\n     * end-of-archive entry, which consists of two 512 blocks of zero bytes. \n     * POSIX.1 requires two EOF records, like some other implementations.\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 25)",
        "(line 228,col 9)-(line 228,col 25)",
        "(line 229,col 9)-(line 229,col 22)",
        "(line 230,col 9)-(line 230,col 20)",
        "(line 231,col 9)-(line 231,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close()",
      "begin_line": 238,
      "end_line": 248,
      "comment": "\n     * Closes the underlying OutputStream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 272,
      "end_line": 322,
      "comment": "\n     * Put an entry on the output stream. This writes the entry\u0027s\n     * header record and positions the output stream for writing\n     * the contents of the entry. Once this method is called, the\n     * stream is ready for calls to write() to write the entry\u0027s\n     * contents. Once the contents are written, closeArchiveEntry()\n     * \u003cB\u003eMUST\u003c/B\u003e be called to ensure that all buffered data\n     * is completely written to the output stream.\n     *\n     * @param archiveEntry The TarEntry to be written to the archive.\n     * @throws IOException on error\n     * @throws ClassCastException if archiveEntry is not an instance of TarArchiveEntry\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 69)",
        "(line 278,col 9)-(line 278,col 77)",
        "(line 279,col 9)-(line 279,col 49)",
        "(line 280,col 9)-(line 281,col 102)",
        "(line 283,col 9)-(line 283,col 52)",
        "(line 284,col 9)-(line 286,col 77)",
        "(line 288,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 310,col 64)",
        "(line 311,col 9)-(line 311,col 31)",
        "(line 313,col 9)-(line 313,col 22)",
        "(line 315,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 29)",
        "(line 321,col 9)-(line 321,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 334,
      "end_line": 360,
      "comment": "\n     * Close an entry. This method MUST be called for all file\n     * entries that contain data. The reason is that we must\n     * buffer data written to the stream in order to satisfy\n     * the buffer\u0027s record based writes. Thus, there may be\n     * data fragments still being assembled that must be written\n     * to the output stream before this entry is closed and the\n     * next entry written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 351,col 9)",
        "(line 353,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 376,
      "end_line": 443,
      "comment": "\n     * Writes bytes to the current tar archive entry. This method\n     * is aware of the current entry and will throw an exception if\n     * you attempt to write bytes past the length specified for the\n     * current entry. The method is also (painfully) aware of the\n     * record buffering required by TarBuffer, and manages buffers\n     * that are not a multiple of recordsize in length, including\n     * assembling records from small buffers.\n     *\n     * @param wBuf The buffer to write to the archive.\n     * @param wOffset The offset in the buffer from which to get bytes.\n     * @param numToWrite The number of bytes to write.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 418,col 9)",
        "(line 425,col 9)-(line 442,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 449,
      "end_line": 486,
      "comment": "\n     * Writes a PAX extended header with the given map as contents.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 66)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 457,col 90)",
        "(line 458,col 9)-(line 458,col 36)",
        "(line 460,col 9)-(line 460,col 50)",
        "(line 461,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 70)",
        "(line 482,col 9)-(line 482,col 33)",
        "(line 483,col 9)-(line 483,col 29)",
        "(line 484,col 9)-(line 484,col 20)",
        "(line 485,col 9)-(line 485,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(java.lang.String)",
      "begin_line": 488,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 41)",
        "(line 490,col 9)-(line 490,col 63)",
        "(line 491,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.shouldBeReplaced(char)",
      "begin_line": 506,
      "end_line": 510,
      "comment": "\n     * @return true if the character could lead to problems when used\n     * inside a TarArchiveEntry name for a PAX header.\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 509,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord()",
      "begin_line": 516,
      "end_line": 519,
      "comment": "\n     * Write an EOF (end of archive) record to the tar archive.\n     * An EOF record consists of a record of all zeros.\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 41)",
        "(line 518,col 9)-(line 518,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush()",
      "begin_line": 521,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 526,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(byte[])",
      "begin_line": 541,
      "end_line": 551,
      "comment": "\n     * Write an archive record to the archive.\n     *\n     * @param record The record data to write to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 547,col 9)",
        "(line 549,col 9)-(line 549,col 26)",
        "(line 550,col 9)-(line 550,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeRecord(byte[], int)",
      "begin_line": 562,
      "end_line": 573,
      "comment": "\n     * Write an archive record to the archive, where the record may be\n     * inside of a larger array buffer. The buffer must be \"offset plus\n     * record size\" long.\n     *\n     * @param buf The buffer containing the record data to write.\n     * @param offset The offset of the record data within buf.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 569,col 9)",
        "(line 571,col 9)-(line 571,col 43)",
        "(line 572,col 9)-(line 572,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.padAsNeeded()",
      "begin_line": 575,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 59)",
        "(line 577,col 9)-(line 581,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 584,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 586,col 9)-(line 587,col 55)",
        "(line 588,col 9)-(line 589,col 53)",
        "(line 590,col 9)-(line 592,col 55)",
        "(line 593,col 9)-(line 594,col 53)",
        "(line 596,col 9)-(line 597,col 74)",
        "(line 598,col 9)-(line 599,col 74)",
        "(line 601,col 9)-(line 601,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, long, long)",
      "begin_line": 604,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 607,col 9)-(line 609,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 612,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 78)",
        "(line 614,col 9)-(line 614,col 97)",
        "(line 615,col 9)-(line 617,col 47)",
        "(line 618,col 9)-(line 618,col 79)",
        "(line 619,col 9)-(line 619,col 70)",
        "(line 620,col 9)-(line 621,col 45)",
        "(line 622,col 9)-(line 623,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long)",
      "begin_line": 626,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumberWithPosixMessage(java.lang.String, long, long)",
      "begin_line": 630,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long, java.lang.String)",
      "begin_line": 634,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 639,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.handleLongName(org.apache.commons.compress.archivers.tar.TarArchiveEntry, java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, byte, java.lang.String)",
      "begin_line": 664,
      "end_line": 693,
      "comment": "\n     * Handles long file or link names according to the longFileMode setting.\n     *\n     * \u003cp\u003eI.e. if the given name is too long to be written to a plain\n     * tar header then\n     * \u003cul\u003e\n     *   \u003cli\u003eit creates a pax header who\u0027s name is given by the\n     *   paxHeaderName parameter if longFileMode is POSIX\u003c/li\u003e\n     *   \u003cli\u003eit creates a GNU longlink entry who\u0027s type is given by\n     *   the linkType parameter if longFileMode is GNU\u003c/li\u003e\n     *   \u003cli\u003eit throws an exception if longFileMode is ERROR\u003c/li\u003e\n     *   \u003cli\u003eit truncates the name if longFileMode is TRUNCATE\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param entry entry the name belongs to\n     * @param name the name to write\n     * @param paxHeaders current map of pax headers\n     * @param paxHeaderName name of the pax header to write\n     * @param linkType type of the GNU entry to write\n     * @param fieldName the name of the field\n     * @return whether a pax header has been written.\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 64)",
        "(line 669,col 9)-(line 669,col 69)",
        "(line 670,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 695,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 45)",
        "(line 697,col 9)-(line 697,col 69)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 35)"
      ]
    }
  ]
}