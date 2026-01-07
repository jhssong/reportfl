{
  "filepath": "/tmp/Compress-26b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java",
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
      "end_line": 562,
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
        "encoding"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * The encoding to use for filenames and labels.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link\n     * CpioConstants#BLOCK_SIZE BLOCK_SIZE} and expecting ASCII file\n     * names.\n     * \n     * @param in\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link\n     * CpioConstants#BLOCK_SIZE BLOCK_SIZE}.\n     * \n     * @param in\n     *            The cpio stream\n     * @param encoding\n     *            The encoding of file names to expect - use null for\n     *            the platform\u0027s default.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link\n     * CpioConstants#BLOCK_SIZE BLOCK_SIZE} expecting ASCII file\n     * names.\n     * \n     * @param in\n     *            The cpio stream\n     * @param blockSize\n     *            The block size of the archive.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream, int, java.lang.String)",
      "begin_line": 150,
      "end_line": 154,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link CpioConstants#BLOCK_SIZE BLOCK_SIZE}.\n     * \n     * @param in\n     *            The cpio stream\n     * @param blockSize\n     *            The block size of the archive.\n     * @param encoding\n     *            The encoding of file names to expect - use null for\n     *            the platform\u0027s default.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 21)",
        "(line 152,col 9)-(line 152,col 35)",
        "(line 153,col 9)-(line 153,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.available()",
      "begin_line": 168,
      "end_line": 175,
      "comment": "\n     * Returns 0 after EOF has reached for the current entry data, otherwise\n     * always return 1.\n     * \u003cp\u003e\n     * Programs should not count on this method to return the actual number of\n     * bytes that could be read without blocking.\n     * \n     * @return 1 before EOF and 0 after EOF has reached for current entry.\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 21)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.close()",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\n     * Closes the CPIO input stream.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry()",
      "begin_line": 199,
      "end_line": 205,
      "comment": "\n     * Closes the current CPIO entry and positions the stream for reading the\n     * next entry.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.ensureOpen()",
      "begin_line": 213,
      "end_line": 217,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry()",
      "begin_line": 228,
      "end_line": 266,
      "comment": "\n     * Reads the next CPIO file entry and positions stream at the beginning of\n     * the entry data.\n     * \n     * @return the CPIOArchiveEntry just read\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 21)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 58)",
        "(line 234,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 32)",
        "(line 257,col 9)-(line 257,col 30)",
        "(line 258,col 9)-(line 258,col 21)",
        "(line 260,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(int)",
      "begin_line": 268,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(byte[], int, int)",
      "begin_line": 291,
      "end_line": 329,
      "comment": "\n     * Reads from the current CPIO entry into an array of bytes. Blocks until\n     * some input is available.\n     * \n     * @param b\n     *            the buffer into which the data is read\n     * @param off\n     *            the start offset of the data\n     * @param len\n     *            the maximum number of bytes read\n     * @return the actual number of bytes read, or -1 if the end of the entry is\n     *         reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 21)",
        "(line 295,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 315,col 39)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 320,col 9)-(line 320,col 51)",
        "(line 321,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 39)",
        "(line 328,col 9)-(line 328,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(byte[], int, int)",
      "begin_line": 331,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 55)",
        "(line 334,col 9)-(line 334,col 21)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(int, boolean)",
      "begin_line": 341,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 38)",
        "(line 344,col 9)-(line 344,col 38)",
        "(line 345,col 9)-(line 345,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(int, int)",
      "begin_line": 348,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 44)",
        "(line 351,col 9)-(line 351,col 50)",
        "(line 352,col 9)-(line 352,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(boolean)",
      "begin_line": 355,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 29)",
        "(line 358,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 43)",
        "(line 365,col 9)-(line 365,col 41)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 41)",
        "(line 370,col 9)-(line 370,col 41)",
        "(line 371,col 9)-(line 371,col 51)",
        "(line 372,col 9)-(line 372,col 42)",
        "(line 373,col 9)-(line 373,col 42)",
        "(line 374,col 9)-(line 374,col 47)",
        "(line 375,col 9)-(line 375,col 47)",
        "(line 376,col 9)-(line 376,col 53)",
        "(line 377,col 9)-(line 377,col 53)",
        "(line 378,col 9)-(line 378,col 45)",
        "(line 379,col 9)-(line 379,col 44)",
        "(line 380,col 9)-(line 380,col 50)",
        "(line 381,col 9)-(line 381,col 26)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 38)",
        "(line 387,col 9)-(line 387,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry()",
      "begin_line": 390,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 70)",
        "(line 393,col 9)-(line 393,col 43)",
        "(line 394,col 9)-(line 394,col 42)",
        "(line 395,col 9)-(line 395,col 46)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 40)",
        "(line 400,col 9)-(line 400,col 40)",
        "(line 401,col 9)-(line 401,col 50)",
        "(line 402,col 9)-(line 402,col 49)",
        "(line 403,col 9)-(line 403,col 42)",
        "(line 404,col 9)-(line 404,col 44)",
        "(line 405,col 9)-(line 405,col 42)",
        "(line 406,col 9)-(line 406,col 56)",
        "(line 407,col 9)-(line 407,col 26)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 412,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(boolean)",
      "begin_line": 415,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 71)",
        "(line 419,col 9)-(line 419,col 55)",
        "(line 420,col 9)-(line 420,col 54)",
        "(line 421,col 9)-(line 421,col 58)",
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 52)",
        "(line 426,col 9)-(line 426,col 52)",
        "(line 427,col 9)-(line 427,col 62)",
        "(line 428,col 9)-(line 428,col 61)",
        "(line 429,col 9)-(line 429,col 53)",
        "(line 430,col 9)-(line 430,col 56)",
        "(line 431,col 9)-(line 431,col 53)",
        "(line 432,col 9)-(line 432,col 56)",
        "(line 433,col 9)-(line 433,col 26)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 38)",
        "(line 439,col 9)-(line 439,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(int)",
      "begin_line": 442,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 48)",
        "(line 445,col 9)-(line 445,col 50)",
        "(line 446,col 9)-(line 446,col 23)",
        "(line 447,col 9)-(line 447,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(long)",
      "begin_line": 461,
      "end_line": 483,
      "comment": "\n     * Skips specified number of bytes in the current CPIO entry.\n     * \n     * @param n\n     *            the number of bytes to skip\n     * @return the actual number of bytes skipped\n     * @throws IOException\n     *             if an I/O error has occurred\n     * @throws IllegalArgumentException\n     *             if n \u0026lt; 0\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 21)",
        "(line 467,col 9)-(line 467,col 55)",
        "(line 468,col 9)-(line 468,col 22)",
        "(line 470,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry()",
      "begin_line": 485,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skipRemainderOfLastBlock()",
      "begin_line": 493,
      "end_line": 504,
      "comment": "\n     * Skips the padding zeros written after the TRAILER!!! entry.\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 60)",
        "(line 495,col 9)-(line 496,col 44)",
        "(line 497,col 9)-(line 503,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byte[], int)",
      "begin_line": 519,
      "end_line": 561,
      "comment": "\n     * Checks if the signature matches one of the following magic values:\n     * \n     * Strings:\n     *\n     * \"070701\" - MAGIC_NEW\n     * \"070702\" - MAGIC_NEW_CRC\n     * \"070707\" - MAGIC_OLD_ASCII\n     * \n     * Octal Binary value:\n     * \n     * 070707 - MAGIC_OLD_BINARY (held as a short) \u003d 0x71C7 or 0xC771\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 530,col 9)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 548,col 9)",
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 560,col 9)-(line 560,col 21)"
      ]
    }
  ]
}