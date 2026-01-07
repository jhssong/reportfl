{
  "filepath": "/tmp/Compress-18b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 41,
      "end_line": 581,
      "comment": "\n * The TarOutputStream writes a UNIX tar archive as an OutputStream.\n * Methods are provided to put entries, and then write their contents\n * by writing to this stream using write().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_ERROR"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Fail if a long file name is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_TRUNCATE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Long paths will be truncated in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_GNU"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " GNU tar extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_POSIX"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " POSIX/PAX extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_ERROR"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Fail if a big number (e.g. size \u0026gt; 8GiB) is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_STAR"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " star/GNU tar/BSD tar extensions are used to store big number in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "BIGNUMBER_POSIX"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " POSIX/PAX extensions are used to store big numbers in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "currSize"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currName"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBytes"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordBuf"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemLen"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemBuf"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longFileMode"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bigNumberMode"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Indicates if putArchiveEntry has been called without closeArchiveEntry "
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addPaxHeadersForNonAsciiNames"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII"
      ],
      "begin_line": 86,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, java.lang.String)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int, java.lang.String)",
      "begin_line": 146,
      "end_line": 155,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 149,col 67)",
        "(line 151,col 9)-(line 151,col 64)",
        "(line 152,col 9)-(line 152,col 26)",
        "(line 153,col 9)-(line 153,col 45)",
        "(line 154,col 9)-(line 154,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Set the long file mode.\n     * This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or LONGFILE_GNU(2).\n     * This specifies the treatment of long file names (names \u003e\u003d TarConstants.NAMELEN).\n     * Default is LONGFILE_ERROR.\n     * @param longFileMode the mode to use\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setBigNumberMode(int)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Set the big number mode.\n     * This can be BIGNUMBER_ERROR(0), BIGNUMBER_POSIX(1) or BIGNUMBER_STAR(2).\n     * This specifies the treatment of big files (sizes \u0026gt; TarConstants.MAXSIZE) and other numeric values to big to fit into a traditional tar header.\n     * Default is BIGNUMBER_ERROR.\n     * @param bigNumberMode the mode to use\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setAddPaxHeadersForNonAsciiNames(boolean)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Whether to add a PAX extension header for non-ASCII file names.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getCount()",
      "begin_line": 188,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getBytesWritten()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish()",
      "begin_line": 208,
      "end_line": 221,
      "comment": "\n     * Ends the TAR archive without closing the underlying OutputStream.\n     * \n     * An archive consists of a series of file entries terminated by an\n     * end-of-archive entry, which consists of two 512 blocks of zero bytes. \n     * POSIX.1 requires two EOF records, like some other implementations.\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 25)",
        "(line 218,col 9)-(line 218,col 25)",
        "(line 219,col 9)-(line 219,col 28)",
        "(line 220,col 9)-(line 220,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close()",
      "begin_line": 227,
      "end_line": 238,
      "comment": "\n     * Closes the underlying OutputStream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 262,
      "end_line": 330,
      "comment": "\n     * Put an entry on the output stream. This writes the entry\u0027s\n     * header record and positions the output stream for writing\n     * the contents of the entry. Once this method is called, the\n     * stream is ready for calls to write() to write the entry\u0027s\n     * contents. Once the contents are written, closeArchiveEntry()\n     * \u003cB\u003eMUST\u003c/B\u003e be called to ensure that all buffered data\n     * is completely written to the output stream.\n     *\n     * @param archiveEntry The TarEntry to be written to the archive.\n     * @throws IOException on error\n     * @throws ClassCastException if archiveEntry is not an instance of TarArchiveEntry\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 63)",
        "(line 268,col 9)-(line 268,col 71)",
        "(line 269,col 9)-(line 269,col 49)",
        "(line 270,col 9)-(line 270,col 66)",
        "(line 271,col 9)-(line 271,col 73)",
        "(line 272,col 9)-(line 272,col 46)",
        "(line 273,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 318,col 64)",
        "(line 319,col 9)-(line 319,col 38)",
        "(line 321,col 9)-(line 321,col 22)",
        "(line 323,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 29)",
        "(line 329,col 9)-(line 329,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 342,
      "end_line": 368,
      "comment": "\n     * Close an entry. This method MUST be called for all file\n     * entries that contain data. The reason is that we must\n     * buffer data written to the stream in order to satisfy\n     * the buffer\u0027s record based writes. Thus, there may be\n     * data fragments still being assembled that must be written\n     * to the output stream before this entry is closed and the\n     * next entry written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 384,
      "end_line": 448,
      "comment": "\n     * Writes bytes to the current tar archive entry. This method\n     * is aware of the current entry and will throw an exception if\n     * you attempt to write bytes past the length specified for the\n     * current entry. The method is also (painfully) aware of the\n     * record buffering required by TarBuffer, and manages buffers\n     * that are not a multiple of recordsize in length, including\n     * assembling records from small buffers.\n     *\n     * @param wBuf The buffer to write to the archive.\n     * @param wOffset The offset in the buffer from which to get bytes.\n     * @param numToWrite The number of bytes to write.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 423,col 9)",
        "(line 430,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writePaxHeaders(java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 454,
      "end_line": 491,
      "comment": "\n     * Writes a PAX extended header with the given map as contents.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 66)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 463,col 90)",
        "(line 465,col 9)-(line 465,col 44)",
        "(line 466,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 64)",
        "(line 487,col 9)-(line 487,col 33)",
        "(line 488,col 9)-(line 488,col 29)",
        "(line 489,col 9)-(line 489,col 20)",
        "(line 490,col 9)-(line 490,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.stripTo7Bits(java.lang.String)",
      "begin_line": 493,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 41)",
        "(line 495,col 9)-(line 495,col 55)",
        "(line 496,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord()",
      "begin_line": 509,
      "end_line": 515,
      "comment": "\n     * Write an EOF (end of archive) record to the tar archive.\n     * An EOF record consists of a record of all zeros.\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 512,col 9)",
        "(line 514,col 9)-(line 514,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush()",
      "begin_line": 517,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 523,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeadersForBigNumbers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 532,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 534,col 9)-(line 535,col 55)",
        "(line 536,col 9)-(line 537,col 53)",
        "(line 538,col 9)-(line 540,col 55)",
        "(line 541,col 9)-(line 542,col 53)",
        "(line 544,col 9)-(line 545,col 74)",
        "(line 546,col 9)-(line 547,col 74)",
        "(line 549,col 9)-(line 549,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.addPaxHeaderForBigNumber(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, long, long)",
      "begin_line": 552,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 560,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 78)",
        "(line 562,col 9)-(line 562,col 77)",
        "(line 563,col 9)-(line 565,col 47)",
        "(line 566,col 9)-(line 566,col 75)",
        "(line 567,col 9)-(line 567,col 70)",
        "(line 568,col 9)-(line 569,col 45)",
        "(line 570,col 9)-(line 571,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.failForBigNumber(java.lang.String, long, long)",
      "begin_line": 574,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 575,col 9)-(line 579,col 9)"
      ]
    }
  ]
}