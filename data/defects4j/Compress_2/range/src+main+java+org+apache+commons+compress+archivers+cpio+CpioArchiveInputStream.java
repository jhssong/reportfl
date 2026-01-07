{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream",
        "org.apache.commons.compress.archivers.cpio.CpioConstants"
      ],
      "begin_line": 62,
      "end_line": 500,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryBytesRead"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryEOF"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleByteBuf"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tmpbuf"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Construct the cpio input stream\n     * \n     * @param in\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.available()",
      "begin_line": 103,
      "end_line": 109,
      "comment": "\n     * Returns 0 after EOF has reached for the current entry data, otherwise\n     * always return 1.\n     * \u003cp/\u003e\n     * Programs should not count on this method to return the actual number of\n     * bytes that could be read without blocking.\n     * \n     * @return 1 before EOF and 0 after EOF has reached for current entry.\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 21)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.close()",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\n     * Closes the CPIO input stream.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry()",
      "begin_line": 132,
      "end_line": 139,
      "comment": "\n     * Closes the current CPIO entry and positions the stream for reading the\n     * next entry.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 21)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.ensureOpen()",
      "begin_line": 147,
      "end_line": 151,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry()",
      "begin_line": 162,
      "end_line": 201,
      "comment": "\n     * Reads the next CPIO file entry and positions stream at the beginning of\n     * the entry data.\n     * \n     * @return the CPIOArchiveEntry just read\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 21)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 35)",
        "(line 168,col 9)-(line 168,col 42)",
        "(line 169,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 32)",
        "(line 193,col 9)-(line 193,col 30)",
        "(line 194,col 9)-(line 194,col 21)",
        "(line 196,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(int)",
      "begin_line": 203,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 40)",
        "(line 205,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read()",
      "begin_line": 219,
      "end_line": 222,
      "comment": "\n     * Reads a byte of data. This method will block until enough input is\n     * available.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 221,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(byte[], int, int)",
      "begin_line": 240,
      "end_line": 278,
      "comment": "\n     * Reads from the current CPIO entry into an array of bytes. Blocks until\n     * some input is available.\n     * \n     * @param b\n     *            the buffer into which the data is read\n     * @param off\n     *            the start offset of the data\n     * @param len\n     *            the maximum number of bytes read\n     * @return the actual number of bytes read, or -1 if the end of the entry is\n     *         reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 21)",
        "(line 243,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 263,col 39)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 268,col 54)",
        "(line 270,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 39)",
        "(line 277,col 9)-(line 277,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(byte[], int, int)",
      "begin_line": 280,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 18)",
        "(line 286,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(int, boolean)",
      "begin_line": 296,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 38)",
        "(line 299,col 9)-(line 299,col 38)",
        "(line 300,col 9)-(line 300,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(int, int)",
      "begin_line": 303,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 44)",
        "(line 306,col 9)-(line 306,col 50)",
        "(line 307,col 9)-(line 307,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(boolean)",
      "begin_line": 310,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 29)",
        "(line 313,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 319,col 43)",
        "(line 320,col 9)-(line 320,col 41)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 41)",
        "(line 325,col 9)-(line 325,col 41)",
        "(line 326,col 9)-(line 326,col 51)",
        "(line 327,col 9)-(line 327,col 42)",
        "(line 328,col 9)-(line 328,col 42)",
        "(line 329,col 9)-(line 329,col 47)",
        "(line 330,col 9)-(line 330,col 47)",
        "(line 331,col 9)-(line 331,col 53)",
        "(line 332,col 9)-(line 332,col 53)",
        "(line 333,col 9)-(line 333,col 45)",
        "(line 334,col 9)-(line 334,col 44)",
        "(line 335,col 9)-(line 335,col 50)",
        "(line 336,col 9)-(line 336,col 26)",
        "(line 337,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 38)",
        "(line 343,col 9)-(line 343,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry()",
      "begin_line": 346,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 70)",
        "(line 349,col 9)-(line 349,col 43)",
        "(line 350,col 9)-(line 350,col 42)",
        "(line 351,col 9)-(line 351,col 46)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 40)",
        "(line 356,col 9)-(line 356,col 40)",
        "(line 357,col 9)-(line 357,col 50)",
        "(line 358,col 9)-(line 358,col 49)",
        "(line 359,col 9)-(line 359,col 42)",
        "(line 360,col 9)-(line 360,col 44)",
        "(line 361,col 9)-(line 361,col 42)",
        "(line 362,col 9)-(line 362,col 56)",
        "(line 363,col 9)-(line 363,col 26)",
        "(line 364,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 369,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(boolean)",
      "begin_line": 372,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 71)",
        "(line 376,col 9)-(line 376,col 55)",
        "(line 377,col 9)-(line 377,col 54)",
        "(line 378,col 9)-(line 378,col 58)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 52)",
        "(line 383,col 9)-(line 383,col 52)",
        "(line 384,col 9)-(line 384,col 62)",
        "(line 385,col 9)-(line 385,col 61)",
        "(line 386,col 9)-(line 386,col 53)",
        "(line 387,col 9)-(line 387,col 56)",
        "(line 388,col 9)-(line 388,col 53)",
        "(line 389,col 9)-(line 389,col 56)",
        "(line 390,col 9)-(line 390,col 26)",
        "(line 391,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 38)",
        "(line 397,col 9)-(line 397,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(int)",
      "begin_line": 400,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 44)",
        "(line 402,col 9)-(line 402,col 50)",
        "(line 403,col 9)-(line 403,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(long)",
      "begin_line": 417,
      "end_line": 438,
      "comment": "\n     * Skips specified number of bytes in the current CPIO entry.\n     * \n     * @param n\n     *            the number of bytes to skip\n     * @return the actual number of bytes skipped\n     * @throws IOException\n     *             if an I/O error has occurred\n     * @throws IllegalArgumentException\n     *             if n \u003c 0\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 21)",
        "(line 422,col 9)-(line 422,col 55)",
        "(line 423,col 9)-(line 423,col 22)",
        "(line 425,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry()",
      "begin_line": 440,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byte[], int)",
      "begin_line": 457,
      "end_line": 499,
      "comment": "\n     * Checks if the signature matches one of the following magic values:\n     * \n     * Strings:\n     *  \n     * \"070701\" - MAGIC_NEW\n     * \"070702\" - MAGIC_NEW_CRC\n     * \"070707\" - MAGIC_OLD_ASCII\n     * \n     * Octal Binary value:\n     * \n     * 070707 - MAGIC_OLD_BINARY (held as a short) \u003d 0x71C7 or 0xC771\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 460,col 9)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 498,col 9)-(line 498,col 21)"
      ]
    }
  ]
}