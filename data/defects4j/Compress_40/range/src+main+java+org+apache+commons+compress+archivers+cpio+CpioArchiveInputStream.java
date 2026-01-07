{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java",
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
      "end_line": 579,
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
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link\n     * CpioConstants#BLOCK_SIZE BLOCK_SIZE} and expecting ASCII file\n     * names.\n     * \n     * @param in\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link\n     * CpioConstants#BLOCK_SIZE BLOCK_SIZE}.\n     * \n     * @param in\n     *            The cpio stream\n     * @param encoding\n     *            The encoding of file names to expect - use null for\n     *            the platform\u0027s default.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link\n     * CpioConstants#BLOCK_SIZE BLOCK_SIZE} expecting ASCII file\n     * names.\n     * \n     * @param in\n     *            The cpio stream\n     * @param blockSize\n     *            The block size of the archive.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream, int, java.lang.String)",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link CpioConstants#BLOCK_SIZE BLOCK_SIZE}.\n     * \n     * @param in\n     *            The cpio stream\n     * @param blockSize\n     *            The block size of the archive.\n     * @param encoding\n     *            The encoding of file names to expect - use null for\n     *            the platform\u0027s default.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 21)",
        "(line 155,col 9)-(line 155,col 35)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 157,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.available()",
      "begin_line": 172,
      "end_line": 179,
      "comment": "\n     * Returns 0 after EOF has reached for the current entry data, otherwise\n     * always return 1.\n     * \u003cp\u003e\n     * Programs should not count on this method to return the actual number of\n     * bytes that could be read without blocking.\n     * \n     * @return 1 before EOF and 0 after EOF has reached for current entry.\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 21)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.close()",
      "begin_line": 187,
      "end_line": 193,
      "comment": "\n     * Closes the CPIO input stream.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry()",
      "begin_line": 203,
      "end_line": 209,
      "comment": "\n     * Closes the current CPIO entry and positions the stream for reading the\n     * next entry.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.ensureOpen()",
      "begin_line": 217,
      "end_line": 221,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry()",
      "begin_line": 232,
      "end_line": 274,
      "comment": "\n     * Reads the next CPIO file entry and positions stream at the beginning of\n     * the entry data.\n     * \n     * @return the CPIOArchiveEntry just read\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 21)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 58)",
        "(line 238,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 32)",
        "(line 265,col 9)-(line 265,col 30)",
        "(line 266,col 9)-(line 266,col 21)",
        "(line 268,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(int)",
      "begin_line": 276,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(byte[], int, int)",
      "begin_line": 299,
      "end_line": 337,
      "comment": "\n     * Reads from the current CPIO entry into an array of bytes. Blocks until\n     * some input is available.\n     * \n     * @param b\n     *            the buffer into which the data is read\n     * @param off\n     *            the start offset of the data\n     * @param len\n     *            the maximum number of bytes read\n     * @return the actual number of bytes read, or -1 if the end of the entry is\n     *         reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 21)",
        "(line 303,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 323,col 39)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 57)",
        "(line 329,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 39)",
        "(line 336,col 9)-(line 336,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(byte[], int, int)",
      "begin_line": 339,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 61)",
        "(line 342,col 9)-(line 342,col 21)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(int, boolean)",
      "begin_line": 349,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 44)",
        "(line 352,col 9)-(line 352,col 38)",
        "(line 353,col 9)-(line 353,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(int, int)",
      "begin_line": 356,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 50)",
        "(line 359,col 9)-(line 359,col 50)",
        "(line 360,col 9)-(line 360,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(boolean)",
      "begin_line": 363,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 29)",
        "(line 366,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 43)",
        "(line 373,col 9)-(line 373,col 47)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 41)",
        "(line 378,col 9)-(line 378,col 41)",
        "(line 379,col 9)-(line 379,col 51)",
        "(line 380,col 9)-(line 380,col 42)",
        "(line 381,col 9)-(line 381,col 42)",
        "(line 382,col 9)-(line 382,col 47)",
        "(line 383,col 9)-(line 383,col 47)",
        "(line 384,col 9)-(line 384,col 53)",
        "(line 385,col 9)-(line 385,col 53)",
        "(line 386,col 9)-(line 386,col 51)",
        "(line 387,col 9)-(line 387,col 44)",
        "(line 388,col 9)-(line 388,col 56)",
        "(line 389,col 9)-(line 389,col 26)",
        "(line 390,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 38)",
        "(line 397,col 9)-(line 397,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry()",
      "begin_line": 400,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 76)",
        "(line 403,col 9)-(line 403,col 43)",
        "(line 404,col 9)-(line 404,col 42)",
        "(line 405,col 9)-(line 405,col 46)",
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 40)",
        "(line 410,col 9)-(line 410,col 40)",
        "(line 411,col 9)-(line 411,col 50)",
        "(line 412,col 9)-(line 412,col 49)",
        "(line 413,col 9)-(line 413,col 42)",
        "(line 414,col 9)-(line 414,col 50)",
        "(line 415,col 9)-(line 415,col 42)",
        "(line 416,col 9)-(line 416,col 56)",
        "(line 417,col 9)-(line 417,col 26)",
        "(line 418,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 424,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(boolean)",
      "begin_line": 427,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 77)",
        "(line 431,col 9)-(line 431,col 55)",
        "(line 432,col 9)-(line 432,col 54)",
        "(line 433,col 9)-(line 433,col 58)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 52)",
        "(line 438,col 9)-(line 438,col 52)",
        "(line 439,col 9)-(line 439,col 62)",
        "(line 440,col 9)-(line 440,col 61)",
        "(line 441,col 9)-(line 441,col 53)",
        "(line 442,col 9)-(line 442,col 62)",
        "(line 443,col 9)-(line 443,col 53)",
        "(line 444,col 9)-(line 444,col 56)",
        "(line 445,col 9)-(line 445,col 26)",
        "(line 446,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 38)",
        "(line 453,col 9)-(line 453,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(int)",
      "begin_line": 456,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 54)",
        "(line 459,col 9)-(line 459,col 50)",
        "(line 460,col 9)-(line 460,col 23)",
        "(line 461,col 9)-(line 461,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(long)",
      "begin_line": 475,
      "end_line": 497,
      "comment": "\n     * Skips specified number of bytes in the current CPIO entry.\n     * \n     * @param n\n     *            the number of bytes to skip\n     * @return the actual number of bytes skipped\n     * @throws IOException\n     *             if an I/O error has occurred\n     * @throws IllegalArgumentException\n     *             if n \u0026lt; 0\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 21)",
        "(line 481,col 9)-(line 481,col 61)",
        "(line 482,col 9)-(line 482,col 22)",
        "(line 484,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry()",
      "begin_line": 499,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skipRemainderOfLastBlock()",
      "begin_line": 507,
      "end_line": 518,
      "comment": "\n     * Skips the padding zeros written after the TRAILER!!! entry.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 66)",
        "(line 509,col 9)-(line 510,col 44)",
        "(line 511,col 9)-(line 517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byte[], int)",
      "begin_line": 536,
      "end_line": 578,
      "comment": "\n     * Checks if the signature matches one of the following magic values:\n     * \n     * Strings:\n     *\n     * \"070701\" - MAGIC_NEW\n     * \"070702\" - MAGIC_NEW_CRC\n     * \"070707\" - MAGIC_OLD_ASCII\n     * \n     * Octal Binary value:\n     * \n     * 070707 - MAGIC_OLD_BINARY (held as a short) \u003d 0x71C7 or 0xC771\n     * @param signature data to match\n     * @param length length of data\n     * @return whether the buffer seems to contain CPIO data\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 539,col 9)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 575,col 9)",
        "(line 577,col 9)-(line 577,col 21)"
      ]
    }
  ]
}