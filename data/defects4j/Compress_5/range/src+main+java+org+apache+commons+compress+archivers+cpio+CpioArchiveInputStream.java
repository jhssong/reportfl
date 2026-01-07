{
  "filepath": "/tmp/Compress-5b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java",
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
      "end_line": 482,
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
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.CpioArchiveInputStream(java.io.InputStream)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Construct the cpio input stream\n     * \n     * @param in\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.available()",
      "begin_line": 102,
      "end_line": 108,
      "comment": "\n     * Returns 0 after EOF has reached for the current entry data, otherwise\n     * always return 1.\n     * \u003cp/\u003e\n     * Programs should not count on this method to return the actual number of\n     * bytes that could be read without blocking.\n     * \n     * @return 1 before EOF and 0 after EOF has reached for current entry.\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 21)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.close()",
      "begin_line": 116,
      "end_line": 121,
      "comment": "\n     * Closes the CPIO input stream.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry()",
      "begin_line": 131,
      "end_line": 138,
      "comment": "\n     * Closes the current CPIO entry and positions the stream for reading the\n     * next entry.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 21)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.ensureOpen()",
      "begin_line": 146,
      "end_line": 150,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry()",
      "begin_line": 161,
      "end_line": 200,
      "comment": "\n     * Reads the next CPIO file entry and positions stream at the beginning of\n     * the entry data.\n     * \n     * @return the CPIOArchiveEntry just read\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 21)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 35)",
        "(line 167,col 9)-(line 167,col 42)",
        "(line 168,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 32)",
        "(line 192,col 9)-(line 192,col 30)",
        "(line 193,col 9)-(line 193,col 21)",
        "(line 195,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(int)",
      "begin_line": 202,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 40)",
        "(line 204,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(byte[], int, int)",
      "begin_line": 225,
      "end_line": 262,
      "comment": "\n     * Reads from the current CPIO entry into an array of bytes. Blocks until\n     * some input is available.\n     * \n     * @param b\n     *            the buffer into which the data is read\n     * @param off\n     *            the start offset of the data\n     * @param len\n     *            the maximum number of bytes read\n     * @return the actual number of bytes read, or -1 if the end of the entry is\n     *         reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 21)",
        "(line 228,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 248,col 39)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 51)",
        "(line 254,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 39)",
        "(line 261,col 9)-(line 261,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(byte[], int, int)",
      "begin_line": 264,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 18)",
        "(line 270,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(int, boolean)",
      "begin_line": 281,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 38)",
        "(line 284,col 9)-(line 284,col 38)",
        "(line 285,col 9)-(line 285,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(int, int)",
      "begin_line": 288,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 44)",
        "(line 291,col 9)-(line 291,col 50)",
        "(line 292,col 9)-(line 292,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(boolean)",
      "begin_line": 295,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 29)",
        "(line 298,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 43)",
        "(line 305,col 9)-(line 305,col 41)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 41)",
        "(line 310,col 9)-(line 310,col 41)",
        "(line 311,col 9)-(line 311,col 51)",
        "(line 312,col 9)-(line 312,col 42)",
        "(line 313,col 9)-(line 313,col 42)",
        "(line 314,col 9)-(line 314,col 47)",
        "(line 315,col 9)-(line 315,col 47)",
        "(line 316,col 9)-(line 316,col 53)",
        "(line 317,col 9)-(line 317,col 53)",
        "(line 318,col 9)-(line 318,col 45)",
        "(line 319,col 9)-(line 319,col 44)",
        "(line 320,col 9)-(line 320,col 50)",
        "(line 321,col 9)-(line 321,col 26)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 38)",
        "(line 327,col 9)-(line 327,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry()",
      "begin_line": 330,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 70)",
        "(line 333,col 9)-(line 333,col 43)",
        "(line 334,col 9)-(line 334,col 42)",
        "(line 335,col 9)-(line 335,col 46)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 40)",
        "(line 340,col 9)-(line 340,col 40)",
        "(line 341,col 9)-(line 341,col 50)",
        "(line 342,col 9)-(line 342,col 49)",
        "(line 343,col 9)-(line 343,col 42)",
        "(line 344,col 9)-(line 344,col 44)",
        "(line 345,col 9)-(line 345,col 42)",
        "(line 346,col 9)-(line 346,col 56)",
        "(line 347,col 9)-(line 347,col 26)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 352,col 9)-(line 352,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(boolean)",
      "begin_line": 355,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 71)",
        "(line 359,col 9)-(line 359,col 55)",
        "(line 360,col 9)-(line 360,col 54)",
        "(line 361,col 9)-(line 361,col 58)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 52)",
        "(line 366,col 9)-(line 366,col 52)",
        "(line 367,col 9)-(line 367,col 62)",
        "(line 368,col 9)-(line 368,col 61)",
        "(line 369,col 9)-(line 369,col 53)",
        "(line 370,col 9)-(line 370,col 56)",
        "(line 371,col 9)-(line 371,col 53)",
        "(line 372,col 9)-(line 372,col 56)",
        "(line 373,col 9)-(line 373,col 26)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 38)",
        "(line 379,col 9)-(line 379,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(int)",
      "begin_line": 382,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 44)",
        "(line 384,col 9)-(line 384,col 50)",
        "(line 385,col 9)-(line 385,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(long)",
      "begin_line": 399,
      "end_line": 420,
      "comment": "\n     * Skips specified number of bytes in the current CPIO entry.\n     * \n     * @param n\n     *            the number of bytes to skip\n     * @return the actual number of bytes skipped\n     * @throws IOException\n     *             if an I/O error has occurred\n     * @throws IllegalArgumentException\n     *             if n \u003c 0\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 21)",
        "(line 404,col 9)-(line 404,col 55)",
        "(line 405,col 9)-(line 405,col 22)",
        "(line 407,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byte[], int)",
      "begin_line": 439,
      "end_line": 481,
      "comment": "\n     * Checks if the signature matches one of the following magic values:\n     * \n     * Strings:\n     *  \n     * \"070701\" - MAGIC_NEW\n     * \"070702\" - MAGIC_NEW_CRC\n     * \"070707\" - MAGIC_OLD_ASCII\n     * \n     * Octal Binary value:\n     * \n     * 070707 - MAGIC_OLD_BINARY (held as a short) \u003d 0x71C7 or 0xC771\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 442,col 9)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 480,col 21)"
      ]
    }
  ]
}