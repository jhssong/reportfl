{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java",
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
      "end_line": 569,
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
      "end_line": 270,
      "comment": "\n     * Reads the next CPIO file entry and positions stream at the beginning of\n     * the entry data.\n     * \n     * @return the CPIOArchiveEntry just read\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 21)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 58)",
        "(line 238,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 260,col 32)",
        "(line 261,col 9)-(line 261,col 30)",
        "(line 262,col 9)-(line 262,col 21)",
        "(line 264,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(int)",
      "begin_line": 272,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(byte[], int, int)",
      "begin_line": 295,
      "end_line": 333,
      "comment": "\n     * Reads from the current CPIO entry into an array of bytes. Blocks until\n     * some input is available.\n     * \n     * @param b\n     *            the buffer into which the data is read\n     * @param off\n     *            the start offset of the data\n     * @param len\n     *            the maximum number of bytes read\n     * @return the actual number of bytes read, or -1 if the end of the entry is\n     *         reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 21)",
        "(line 299,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 319,col 39)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 51)",
        "(line 325,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 39)",
        "(line 332,col 9)-(line 332,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(byte[], int, int)",
      "begin_line": 335,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 55)",
        "(line 338,col 9)-(line 338,col 21)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(int, boolean)",
      "begin_line": 345,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 38)",
        "(line 348,col 9)-(line 348,col 38)",
        "(line 349,col 9)-(line 349,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(int, int)",
      "begin_line": 352,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 44)",
        "(line 355,col 9)-(line 355,col 50)",
        "(line 356,col 9)-(line 356,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(boolean)",
      "begin_line": 359,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 29)",
        "(line 362,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 368,col 43)",
        "(line 369,col 9)-(line 369,col 41)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 41)",
        "(line 374,col 9)-(line 374,col 41)",
        "(line 375,col 9)-(line 375,col 51)",
        "(line 376,col 9)-(line 376,col 42)",
        "(line 377,col 9)-(line 377,col 42)",
        "(line 378,col 9)-(line 378,col 47)",
        "(line 379,col 9)-(line 379,col 47)",
        "(line 380,col 9)-(line 380,col 53)",
        "(line 381,col 9)-(line 381,col 53)",
        "(line 382,col 9)-(line 382,col 45)",
        "(line 383,col 9)-(line 383,col 44)",
        "(line 384,col 9)-(line 384,col 50)",
        "(line 385,col 9)-(line 385,col 26)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 38)",
        "(line 391,col 9)-(line 391,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry()",
      "begin_line": 394,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 70)",
        "(line 397,col 9)-(line 397,col 43)",
        "(line 398,col 9)-(line 398,col 42)",
        "(line 399,col 9)-(line 399,col 46)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 40)",
        "(line 404,col 9)-(line 404,col 40)",
        "(line 405,col 9)-(line 405,col 50)",
        "(line 406,col 9)-(line 406,col 49)",
        "(line 407,col 9)-(line 407,col 42)",
        "(line 408,col 9)-(line 408,col 44)",
        "(line 409,col 9)-(line 409,col 42)",
        "(line 410,col 9)-(line 410,col 56)",
        "(line 411,col 9)-(line 411,col 26)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 416,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(boolean)",
      "begin_line": 419,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 71)",
        "(line 423,col 9)-(line 423,col 55)",
        "(line 424,col 9)-(line 424,col 54)",
        "(line 425,col 9)-(line 425,col 58)",
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 52)",
        "(line 430,col 9)-(line 430,col 52)",
        "(line 431,col 9)-(line 431,col 62)",
        "(line 432,col 9)-(line 432,col 61)",
        "(line 433,col 9)-(line 433,col 53)",
        "(line 434,col 9)-(line 434,col 56)",
        "(line 435,col 9)-(line 435,col 53)",
        "(line 436,col 9)-(line 436,col 56)",
        "(line 437,col 9)-(line 437,col 26)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 38)",
        "(line 443,col 9)-(line 443,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(int)",
      "begin_line": 446,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 48)",
        "(line 449,col 9)-(line 449,col 50)",
        "(line 450,col 9)-(line 450,col 23)",
        "(line 451,col 9)-(line 451,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(long)",
      "begin_line": 465,
      "end_line": 487,
      "comment": "\n     * Skips specified number of bytes in the current CPIO entry.\n     * \n     * @param n\n     *            the number of bytes to skip\n     * @return the actual number of bytes skipped\n     * @throws IOException\n     *             if an I/O error has occurred\n     * @throws IllegalArgumentException\n     *             if n \u0026lt; 0\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 21)",
        "(line 471,col 9)-(line 471,col 55)",
        "(line 472,col 9)-(line 472,col 22)",
        "(line 474,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry()",
      "begin_line": 489,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skipRemainderOfLastBlock()",
      "begin_line": 497,
      "end_line": 508,
      "comment": "\n     * Skips the padding zeros written after the TRAILER!!! entry.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 60)",
        "(line 499,col 9)-(line 500,col 44)",
        "(line 501,col 9)-(line 507,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byte[], int)",
      "begin_line": 526,
      "end_line": 568,
      "comment": "\n     * Checks if the signature matches one of the following magic values:\n     * \n     * Strings:\n     *\n     * \"070701\" - MAGIC_NEW\n     * \"070702\" - MAGIC_NEW_CRC\n     * \"070707\" - MAGIC_OLD_ASCII\n     * \n     * Octal Binary value:\n     * \n     * 070707 - MAGIC_OLD_BINARY (held as a short) \u003d 0x71C7 or 0xC771\n     * @param signature data to match\n     * @param length length of data\n     * @return whether the buffer seems to contain CPIO data\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 537,col 9)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 567,col 9)-(line 567,col 21)"
      ]
    }
  ]
}