{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream",
        "org.apache.commons.compress.archivers.cpio.CpioConstants"
      ],
      "begin_line": 67,
      "end_line": 564,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryBytesRead"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryEOF"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tmpbuf"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_BYTES_BUF"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_BYTES_BUF"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIX_BYTES_BUF"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * The encoding to use for filenames and labels.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link\n     * CpioConstants#BLOCK_SIZE BLOCK_SIZE} and expecting ASCII file\n     * names.\n     * \n     * @param in\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link\n     * CpioConstants#BLOCK_SIZE BLOCK_SIZE}.\n     * \n     * @param in\n     *            The cpio stream\n     * @param encoding\n     *            The encoding of file names to expect - use null for\n     *            the platform\u0027s default.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link\n     * CpioConstants#BLOCK_SIZE BLOCK_SIZE} expecting ASCII file\n     * names.\n     * \n     * @param in\n     *            The cpio stream\n     * @param blockSize\n     *            The block size of the archive.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream, int, java.lang.String)",
      "begin_line": 152,
      "end_line": 156,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link CpioConstants#BLOCK_SIZE BLOCK_SIZE}.\n     * \n     * @param in\n     *            The cpio stream\n     * @param blockSize\n     *            The block size of the archive.\n     * @param encoding\n     *            The encoding of file names to expect - use null for\n     *            the platform\u0027s default.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 21)",
        "(line 154,col 9)-(line 154,col 35)",
        "(line 155,col 9)-(line 155,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.available()",
      "begin_line": 170,
      "end_line": 177,
      "comment": "\n     * Returns 0 after EOF has reached for the current entry data, otherwise\n     * always return 1.\n     * \u003cp\u003e\n     * Programs should not count on this method to return the actual number of\n     * bytes that could be read without blocking.\n     * \n     * @return 1 before EOF and 0 after EOF has reached for current entry.\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 21)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.close()",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n     * Closes the CPIO input stream.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry()",
      "begin_line": 201,
      "end_line": 207,
      "comment": "\n     * Closes the current CPIO entry and positions the stream for reading the\n     * next entry.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.ensureOpen()",
      "begin_line": 215,
      "end_line": 219,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry()",
      "begin_line": 230,
      "end_line": 268,
      "comment": "\n     * Reads the next CPIO file entry and positions stream at the beginning of\n     * the entry data.\n     * \n     * @return the CPIOArchiveEntry just read\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 21)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 58)",
        "(line 236,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 32)",
        "(line 259,col 9)-(line 259,col 30)",
        "(line 260,col 9)-(line 260,col 21)",
        "(line 262,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(int)",
      "begin_line": 270,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(byte[], int, int)",
      "begin_line": 293,
      "end_line": 331,
      "comment": "\n     * Reads from the current CPIO entry into an array of bytes. Blocks until\n     * some input is available.\n     * \n     * @param b\n     *            the buffer into which the data is read\n     * @param off\n     *            the start offset of the data\n     * @param len\n     *            the maximum number of bytes read\n     * @return the actual number of bytes read, or -1 if the end of the entry is\n     *         reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 21)",
        "(line 297,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 317,col 39)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 322,col 51)",
        "(line 323,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 39)",
        "(line 330,col 9)-(line 330,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(byte[], int, int)",
      "begin_line": 333,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 55)",
        "(line 336,col 9)-(line 336,col 21)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(int, boolean)",
      "begin_line": 343,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 38)",
        "(line 346,col 9)-(line 346,col 38)",
        "(line 347,col 9)-(line 347,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(int, int)",
      "begin_line": 350,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 44)",
        "(line 353,col 9)-(line 353,col 50)",
        "(line 354,col 9)-(line 354,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(boolean)",
      "begin_line": 357,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 29)",
        "(line 360,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 43)",
        "(line 367,col 9)-(line 367,col 41)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 41)",
        "(line 372,col 9)-(line 372,col 41)",
        "(line 373,col 9)-(line 373,col 51)",
        "(line 374,col 9)-(line 374,col 42)",
        "(line 375,col 9)-(line 375,col 42)",
        "(line 376,col 9)-(line 376,col 47)",
        "(line 377,col 9)-(line 377,col 47)",
        "(line 378,col 9)-(line 378,col 53)",
        "(line 379,col 9)-(line 379,col 53)",
        "(line 380,col 9)-(line 380,col 45)",
        "(line 381,col 9)-(line 381,col 44)",
        "(line 382,col 9)-(line 382,col 50)",
        "(line 383,col 9)-(line 383,col 26)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 38)",
        "(line 389,col 9)-(line 389,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry()",
      "begin_line": 392,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 70)",
        "(line 395,col 9)-(line 395,col 43)",
        "(line 396,col 9)-(line 396,col 42)",
        "(line 397,col 9)-(line 397,col 46)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 40)",
        "(line 402,col 9)-(line 402,col 40)",
        "(line 403,col 9)-(line 403,col 50)",
        "(line 404,col 9)-(line 404,col 49)",
        "(line 405,col 9)-(line 405,col 42)",
        "(line 406,col 9)-(line 406,col 44)",
        "(line 407,col 9)-(line 407,col 42)",
        "(line 408,col 9)-(line 408,col 56)",
        "(line 409,col 9)-(line 409,col 26)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(boolean)",
      "begin_line": 417,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 71)",
        "(line 421,col 9)-(line 421,col 55)",
        "(line 422,col 9)-(line 422,col 54)",
        "(line 423,col 9)-(line 423,col 58)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 52)",
        "(line 428,col 9)-(line 428,col 52)",
        "(line 429,col 9)-(line 429,col 62)",
        "(line 430,col 9)-(line 430,col 61)",
        "(line 431,col 9)-(line 431,col 53)",
        "(line 432,col 9)-(line 432,col 56)",
        "(line 433,col 9)-(line 433,col 53)",
        "(line 434,col 9)-(line 434,col 56)",
        "(line 435,col 9)-(line 435,col 26)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 38)",
        "(line 441,col 9)-(line 441,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(int)",
      "begin_line": 444,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 48)",
        "(line 447,col 9)-(line 447,col 50)",
        "(line 448,col 9)-(line 448,col 23)",
        "(line 449,col 9)-(line 449,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(long)",
      "begin_line": 463,
      "end_line": 485,
      "comment": "\n     * Skips specified number of bytes in the current CPIO entry.\n     * \n     * @param n\n     *            the number of bytes to skip\n     * @return the actual number of bytes skipped\n     * @throws IOException\n     *             if an I/O error has occurred\n     * @throws IllegalArgumentException\n     *             if n \u0026lt; 0\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 21)",
        "(line 469,col 9)-(line 469,col 55)",
        "(line 470,col 9)-(line 470,col 22)",
        "(line 472,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry()",
      "begin_line": 487,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skipRemainderOfLastBlock()",
      "begin_line": 495,
      "end_line": 506,
      "comment": "\n     * Skips the padding zeros written after the TRAILER!!! entry.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 60)",
        "(line 497,col 9)-(line 498,col 44)",
        "(line 499,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byte[], int)",
      "begin_line": 521,
      "end_line": 563,
      "comment": "\n     * Checks if the signature matches one of the following magic values:\n     * \n     * Strings:\n     *\n     * \"070701\" - MAGIC_NEW\n     * \"070702\" - MAGIC_NEW_CRC\n     * \"070707\" - MAGIC_OLD_ASCII\n     * \n     * Octal Binary value:\n     * \n     * 070707 - MAGIC_OLD_BINARY (held as a short) \u003d 0x71C7 or 0xC771\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 532,col 9)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 562,col 21)"
      ]
    }
  ]
}