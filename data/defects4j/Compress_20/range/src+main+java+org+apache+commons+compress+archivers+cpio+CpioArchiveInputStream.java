{
  "filepath": "/tmp/Compress-20b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream",
        "org.apache.commons.compress.archivers.cpio.CpioConstants"
      ],
      "begin_line": 63,
      "end_line": 525,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryBytesRead"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryEOF"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tmpbuf"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_BYTES_BUF"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_BYTES_BUF"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIX_BYTES_BUF"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link\n     * CpioConstants#BLOCK_SIZE BLOCK_SIZE}.\n     * \n     * @param in\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Construct the cpio input stream with a blocksize of {@link CpioConstants#BLOCK_SIZE BLOCK_SIZE}.\n     * Construct the cpio input stream.\n     * \n     * @param in\n     *            The cpio stream\n     * @param blockSize\n     *            The block size of the archive.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 21)",
        "(line 110,col 9)-(line 110,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.available()",
      "begin_line": 125,
      "end_line": 132,
      "comment": "\n     * Returns 0 after EOF has reached for the current entry data, otherwise\n     * always return 1.\n     * \u003cp/\u003e\n     * Programs should not count on this method to return the actual number of\n     * bytes that could be read without blocking.\n     * \n     * @return 1 before EOF and 0 after EOF has reached for current entry.\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 21)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.close()",
      "begin_line": 140,
      "end_line": 146,
      "comment": "\n     * Closes the CPIO input stream.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry()",
      "begin_line": 156,
      "end_line": 163,
      "comment": "\n     * Closes the current CPIO entry and positions the stream for reading the\n     * next entry.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 21)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.ensureOpen()",
      "begin_line": 171,
      "end_line": 175,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry()",
      "begin_line": 186,
      "end_line": 224,
      "comment": "\n     * Reads the next CPIO file entry and positions stream at the beginning of\n     * the entry data.\n     * \n     * @return the CPIOArchiveEntry just read\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 21)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 58)",
        "(line 192,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 32)",
        "(line 215,col 9)-(line 215,col 30)",
        "(line 216,col 9)-(line 216,col 21)",
        "(line 218,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(int)",
      "begin_line": 226,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(byte[], int, int)",
      "begin_line": 249,
      "end_line": 287,
      "comment": "\n     * Reads from the current CPIO entry into an array of bytes. Blocks until\n     * some input is available.\n     * \n     * @param b\n     *            the buffer into which the data is read\n     * @param off\n     *            the start offset of the data\n     * @param len\n     *            the maximum number of bytes read\n     * @return the actual number of bytes read, or -1 if the end of the entry is\n     *         reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 21)",
        "(line 253,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 273,col 39)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 51)",
        "(line 279,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 39)",
        "(line 286,col 9)-(line 286,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(byte[], int, int)",
      "begin_line": 289,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 18)",
        "(line 295,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(int, boolean)",
      "begin_line": 306,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 38)",
        "(line 309,col 9)-(line 309,col 38)",
        "(line 310,col 9)-(line 310,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(int, int)",
      "begin_line": 313,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 44)",
        "(line 316,col 9)-(line 316,col 50)",
        "(line 317,col 9)-(line 317,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(boolean)",
      "begin_line": 320,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 29)",
        "(line 323,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 43)",
        "(line 330,col 9)-(line 330,col 41)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 41)",
        "(line 335,col 9)-(line 335,col 41)",
        "(line 336,col 9)-(line 336,col 51)",
        "(line 337,col 9)-(line 337,col 42)",
        "(line 338,col 9)-(line 338,col 42)",
        "(line 339,col 9)-(line 339,col 47)",
        "(line 340,col 9)-(line 340,col 47)",
        "(line 341,col 9)-(line 341,col 53)",
        "(line 342,col 9)-(line 342,col 53)",
        "(line 343,col 9)-(line 343,col 45)",
        "(line 344,col 9)-(line 344,col 44)",
        "(line 345,col 9)-(line 345,col 50)",
        "(line 346,col 9)-(line 346,col 26)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 38)",
        "(line 352,col 9)-(line 352,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry()",
      "begin_line": 355,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 70)",
        "(line 358,col 9)-(line 358,col 43)",
        "(line 359,col 9)-(line 359,col 42)",
        "(line 360,col 9)-(line 360,col 46)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 40)",
        "(line 365,col 9)-(line 365,col 40)",
        "(line 366,col 9)-(line 366,col 50)",
        "(line 367,col 9)-(line 367,col 49)",
        "(line 368,col 9)-(line 368,col 42)",
        "(line 369,col 9)-(line 369,col 44)",
        "(line 370,col 9)-(line 370,col 42)",
        "(line 371,col 9)-(line 371,col 56)",
        "(line 372,col 9)-(line 372,col 26)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 377,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(boolean)",
      "begin_line": 380,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 71)",
        "(line 384,col 9)-(line 384,col 55)",
        "(line 385,col 9)-(line 385,col 54)",
        "(line 386,col 9)-(line 386,col 58)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 52)",
        "(line 391,col 9)-(line 391,col 52)",
        "(line 392,col 9)-(line 392,col 62)",
        "(line 393,col 9)-(line 393,col 61)",
        "(line 394,col 9)-(line 394,col 53)",
        "(line 395,col 9)-(line 395,col 56)",
        "(line 396,col 9)-(line 396,col 53)",
        "(line 397,col 9)-(line 397,col 56)",
        "(line 398,col 9)-(line 398,col 26)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 38)",
        "(line 404,col 9)-(line 404,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(int)",
      "begin_line": 407,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 44)",
        "(line 409,col 9)-(line 409,col 50)",
        "(line 410,col 9)-(line 410,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(long)",
      "begin_line": 424,
      "end_line": 446,
      "comment": "\n     * Skips specified number of bytes in the current CPIO entry.\n     * \n     * @param n\n     *            the number of bytes to skip\n     * @return the actual number of bytes skipped\n     * @throws IOException\n     *             if an I/O error has occurred\n     * @throws IllegalArgumentException\n     *             if n \u003c 0\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 21)",
        "(line 430,col 9)-(line 430,col 55)",
        "(line 431,col 9)-(line 431,col 22)",
        "(line 433,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry()",
      "begin_line": 448,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skipRemainderOfLastBlock()",
      "begin_line": 456,
      "end_line": 467,
      "comment": "\n     * Skips the padding zeros written after the TRAILER!!! entry.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 60)",
        "(line 458,col 9)-(line 459,col 44)",
        "(line 460,col 9)-(line 466,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byte[], int)",
      "begin_line": 482,
      "end_line": 524,
      "comment": "\n     * Checks if the signature matches one of the following magic values:\n     * \n     * Strings:\n     *\n     * \"070701\" - MAGIC_NEW\n     * \"070702\" - MAGIC_NEW_CRC\n     * \"070707\" - MAGIC_OLD_ASCII\n     * \n     * Octal Binary value:\n     * \n     * 070707 - MAGIC_OLD_BINARY (held as a short) \u003d 0x71C7 or 0xC771\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 485,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 521,col 9)",
        "(line 523,col 9)-(line 523,col 21)"
      ]
    }
  ]
}