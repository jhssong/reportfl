{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java",
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
      "end_line": 563,
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
      "comment": "\n     * Returns 0 after EOF has reached for the current entry data, otherwise\n     * always return 1.\n     * \u003cp/\u003e\n     * Programs should not count on this method to return the actual number of\n     * bytes that could be read without blocking.\n     * \n     * @return 1 before EOF and 0 after EOF has reached for current entry.\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
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
      "end_line": 206,
      "comment": "\n     * Closes the current CPIO entry and positions the stream for reading the\n     * next entry.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 21)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.ensureOpen()",
      "begin_line": 214,
      "end_line": 218,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry()",
      "begin_line": 229,
      "end_line": 267,
      "comment": "\n     * Reads the next CPIO file entry and positions stream at the beginning of\n     * the entry data.\n     * \n     * @return the CPIOArchiveEntry just read\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 21)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 58)",
        "(line 235,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 32)",
        "(line 258,col 9)-(line 258,col 30)",
        "(line 259,col 9)-(line 259,col 21)",
        "(line 261,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(int)",
      "begin_line": 269,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(byte[], int, int)",
      "begin_line": 292,
      "end_line": 330,
      "comment": "\n     * Reads from the current CPIO entry into an array of bytes. Blocks until\n     * some input is available.\n     * \n     * @param b\n     *            the buffer into which the data is read\n     * @param off\n     *            the start offset of the data\n     * @param len\n     *            the maximum number of bytes read\n     * @return the actual number of bytes read, or -1 if the end of the entry is\n     *         reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 21)",
        "(line 296,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 316,col 39)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 51)",
        "(line 322,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 39)",
        "(line 329,col 9)-(line 329,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(byte[], int, int)",
      "begin_line": 332,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 55)",
        "(line 335,col 9)-(line 335,col 21)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(int, boolean)",
      "begin_line": 342,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 38)",
        "(line 345,col 9)-(line 345,col 38)",
        "(line 346,col 9)-(line 346,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(int, int)",
      "begin_line": 349,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 44)",
        "(line 352,col 9)-(line 352,col 50)",
        "(line 353,col 9)-(line 353,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(boolean)",
      "begin_line": 356,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 29)",
        "(line 359,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 43)",
        "(line 366,col 9)-(line 366,col 41)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 41)",
        "(line 371,col 9)-(line 371,col 41)",
        "(line 372,col 9)-(line 372,col 51)",
        "(line 373,col 9)-(line 373,col 42)",
        "(line 374,col 9)-(line 374,col 42)",
        "(line 375,col 9)-(line 375,col 47)",
        "(line 376,col 9)-(line 376,col 47)",
        "(line 377,col 9)-(line 377,col 53)",
        "(line 378,col 9)-(line 378,col 53)",
        "(line 379,col 9)-(line 379,col 45)",
        "(line 380,col 9)-(line 380,col 44)",
        "(line 381,col 9)-(line 381,col 50)",
        "(line 382,col 9)-(line 382,col 26)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 38)",
        "(line 388,col 9)-(line 388,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry()",
      "begin_line": 391,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 70)",
        "(line 394,col 9)-(line 394,col 43)",
        "(line 395,col 9)-(line 395,col 42)",
        "(line 396,col 9)-(line 396,col 46)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 40)",
        "(line 401,col 9)-(line 401,col 40)",
        "(line 402,col 9)-(line 402,col 50)",
        "(line 403,col 9)-(line 403,col 49)",
        "(line 404,col 9)-(line 404,col 42)",
        "(line 405,col 9)-(line 405,col 44)",
        "(line 406,col 9)-(line 406,col 42)",
        "(line 407,col 9)-(line 407,col 56)",
        "(line 408,col 9)-(line 408,col 26)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 413,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(boolean)",
      "begin_line": 416,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 71)",
        "(line 420,col 9)-(line 420,col 55)",
        "(line 421,col 9)-(line 421,col 54)",
        "(line 422,col 9)-(line 422,col 58)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 52)",
        "(line 427,col 9)-(line 427,col 52)",
        "(line 428,col 9)-(line 428,col 62)",
        "(line 429,col 9)-(line 429,col 61)",
        "(line 430,col 9)-(line 430,col 53)",
        "(line 431,col 9)-(line 431,col 56)",
        "(line 432,col 9)-(line 432,col 53)",
        "(line 433,col 9)-(line 433,col 56)",
        "(line 434,col 9)-(line 434,col 26)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 38)",
        "(line 440,col 9)-(line 440,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(int)",
      "begin_line": 443,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 48)",
        "(line 446,col 9)-(line 446,col 50)",
        "(line 447,col 9)-(line 447,col 23)",
        "(line 448,col 9)-(line 448,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(long)",
      "begin_line": 462,
      "end_line": 484,
      "comment": "\n     * Skips specified number of bytes in the current CPIO entry.\n     * \n     * @param n\n     *            the number of bytes to skip\n     * @return the actual number of bytes skipped\n     * @throws IOException\n     *             if an I/O error has occurred\n     * @throws IllegalArgumentException\n     *             if n \u003c 0\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 21)",
        "(line 468,col 9)-(line 468,col 55)",
        "(line 469,col 9)-(line 469,col 22)",
        "(line 471,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry()",
      "begin_line": 486,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skipRemainderOfLastBlock()",
      "begin_line": 494,
      "end_line": 505,
      "comment": "\n     * Skips the padding zeros written after the TRAILER!!! entry.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 60)",
        "(line 496,col 9)-(line 497,col 44)",
        "(line 498,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byte[], int)",
      "begin_line": 520,
      "end_line": 562,
      "comment": "\n     * Checks if the signature matches one of the following magic values:\n     * \n     * Strings:\n     *\n     * \"070701\" - MAGIC_NEW\n     * \"070702\" - MAGIC_NEW_CRC\n     * \"070707\" - MAGIC_OLD_ASCII\n     * \n     * Octal Binary value:\n     * \n     * 070707 - MAGIC_OLD_BINARY (held as a short) \u003d 0x71C7 or 0xC771\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 523,col 9)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 561,col 9)-(line 561,col 21)"
      ]
    }
  ]
}