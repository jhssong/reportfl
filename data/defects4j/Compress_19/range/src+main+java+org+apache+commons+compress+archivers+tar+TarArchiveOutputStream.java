{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 42,
      "end_line": 582,
      "comment": "\n * The TarOutputStream writes a UNIX tar archive as an OutputStream.\n * Methods are provided to put entries, and then write their contents\n * by writing to this stream using write().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_ERROR"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Fail if a long file name is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_TRUNCATE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Long paths will be truncated in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_GNU"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " GNU tar extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_POSIX"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " POSIX/PAX extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_ERROR"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Fail if a big number (e.g. size \u0026gt; 8GiB) is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_STAR"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " star/GNU tar/BSD tar extensions are used to store big number in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_POSIX"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " POSIX/PAX extensions are used to store big numbers in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "currSize"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currName"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBytes"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordBuf"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemLen"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemBuf"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
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
        "closed"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Indicates if putArchiveEntry has been called without closeArchiveEntry "
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addPaxHeadersForNonAsciiNames"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII"
      ],
      "begin_line": 87,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, java.lang.String)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int, java.lang.String)",
      "begin_line": 147,
      "end_line": 156,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 43)",
        "(line 150,col 9)-(line 150,col 67)",
        "(line 152,col 9)-(line 152,col 64)",
        "(line 153,col 9)-(line 153,col 26)",
        "(line 154,col 9)-(line 154,col 45)",
        "(line 155,col 9)-(line 155,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Set the long file mode.\n     * This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or LONGFILE_GNU(2).\n     * This specifies the treatment of long file names (names \u003e\u003d TarConstants.NAMELEN).\n     * Default is LONGFILE_ERROR.\n     * @param longFileMode the mode to use\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setBigNumberMode(int)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Set the big number mode.\n     * This can be BIGNUMBER_ERROR(0), BIGNUMBER_POSIX(1) or BIGNUMBER_STAR(2).\n     * This specifies the treatment of big files (sizes \u0026gt; TarConstants.MAXSIZE) and other numeric values to big to fit into a traditional tar header.\n     * Default is BIGNUMBER_ERROR.\n     * @param bigNumberMode the mode to use\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setAddPaxHeadersForNonAsciiNames(boolean)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Whether to add a PAX extension header for non-ASCII file names.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getCount()",
      "begin_line": 189,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten()",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish()",
      "begin_line": 209,
      "end_line": 222,
      "comment": "\n     * Ends the TAR archive without closing the underlying OutputStream.\n     * \n     * An archive consists of a series of file entries terminated by an\n     * end-of-archive entry, which consists of two 512 blocks of zero bytes. \n     * POSIX.1 requires two EOF records, like some other implementations.\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 25)",
        "(line 219,col 9)-(line 219,col 25)",
        "(line 220,col 9)-(line 220,col 28)",
        "(line 221,col 9)-(line 221,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close()",
      "begin_line": 228,
      "end_line": 239,
      "comment": "\n     * Closes the underlying OutputStream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 263,
      "end_line": 331,
      "comment": "\n     * Put an entry on the output stream. This writes the entry\u0027s\n     * header record and positions the output stream for writing\n     * the contents of the entry. Once this method is called, the\n     * stream is ready for calls to write() to write the entry\u0027s\n     * contents. Once the contents are written, closeArchiveEntry()\n     * \u003cB\u003eMUST\u003c/B\u003e be called to ensure that all buffered data\n     * is completely written to the output stream.\n     *\n     * @param archiveEntry The TarEntry to be written to the archive.\n     * @throws IOException on error\n     * @throws ClassCastException if archiveEntry is not an instance of TarArchiveEntry\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 63)",
        "(line 269,col 9)-(line 269,col 71)",
        "(line 270,col 9)-(line 270,col 49)",
        "(line 271,col 9)-(line 271,col 66)",
        "(line 272,col 9)-(line 272,col 73)",
        "(line 273,col 9)-(line 273,col 46)",
        "(line 274,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 319,col 64)",
        "(line 320,col 9)-(line 320,col 38)",
        "(line 322,col 9)-(line 322,col 22)",
        "(line 324,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 29)",
        "(line 330,col 9)-(line 330,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 343,
      "end_line": 369,
      "comment": "\n     * Close an entry. This method MUST be called for all file\n     * entries that contain data. The reason is that we must\n     * buffer data written to the stream in order to satisfy\n     * the buffer\u0027s record based writes. Thus, there may be\n     * data fragments still being assembled that must be written\n     * to the output stream before this entry is closed and the\n     * next entry written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 360,col 9)",
        "(line 362,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 385,
      "end_line": 449,
      "comment": "\n     * Writes bytes to the current tar archive entry. This method\n     * is aware of the current entry and will throw an exception if\n     * you attempt to write bytes past the length specified for the\n     * current entry. The method is also (painfully) aware of the\n     * record buffering required by TarBuffer, and manages buffers\n     * that are not a multiple of recordsize in length, including\n     * assembling records from small buffers.\n     *\n     * @param wBuf The buffer to write to the archive.\n     * @param wOffset The offset in the buffer from which to get bytes.\n     * @param numToWrite The number of bytes to write.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 400,col 9)",
        "(line 402,col 9)-(line 424,col 9)",
        "(line 431,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 455,
      "end_line": 495,
      "comment": "\n     * Writes a PAX extended header with the given map as contents.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 66)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 467,col 90)",
        "(line 469,col 9)-(line 469,col 44)",
        "(line 470,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 64)",
        "(line 491,col 9)-(line 491,col 33)",
        "(line 492,col 9)-(line 492,col 29)",
        "(line 493,col 9)-(line 493,col 20)",
        "(line 494,col 9)-(line 494,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(java.lang.String)",
      "begin_line": 497,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 41)",
        "(line 499,col 9)-(line 499,col 55)",
        "(line 500,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 33)"
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
        "(line 515,col 9)-(line 515,col 38)"
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
      "begin_line": 524,
      "end_line": 531,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 533,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 535,col 9)-(line 536,col 55)",
        "(line 537,col 9)-(line 538,col 53)",
        "(line 539,col 9)-(line 541,col 55)",
        "(line 542,col 9)-(line 543,col 53)",
        "(line 545,col 9)-(line 546,col 74)",
        "(line 547,col 9)-(line 548,col 74)",
        "(line 550,col 9)-(line 550,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, long, long)",
      "begin_line": 553,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 558,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 561,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 78)",
        "(line 563,col 9)-(line 563,col 77)",
        "(line 564,col 9)-(line 566,col 47)",
        "(line 567,col 9)-(line 567,col 75)",
        "(line 568,col 9)-(line 568,col 70)",
        "(line 569,col 9)-(line 570,col 45)",
        "(line 571,col 9)-(line 572,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long)",
      "begin_line": 575,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 580,col 9)"
      ]
    }
  ]
}