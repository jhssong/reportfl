{
  "filepath": "/tmp/Compress-15b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java",
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
      "end_line": 488,
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
      "end_line": 123,
      "comment": "\n     * Closes the CPIO input stream.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.closeEntry()",
      "begin_line": 133,
      "end_line": 140,
      "comment": "\n     * Closes the current CPIO entry and positions the stream for reading the\n     * next entry.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 21)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.ensureOpen()",
      "begin_line": 148,
      "end_line": 152,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry()",
      "begin_line": 163,
      "end_line": 202,
      "comment": "\n     * Reads the next CPIO file entry and positions stream at the beginning of\n     * the entry data.\n     * \n     * @return the CPIOArchiveEntry just read\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 21)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 35)",
        "(line 169,col 9)-(line 169,col 42)",
        "(line 170,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 32)",
        "(line 194,col 9)-(line 194,col 30)",
        "(line 195,col 9)-(line 195,col 21)",
        "(line 197,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(int)",
      "begin_line": 204,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 40)",
        "(line 206,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(byte[], int, int)",
      "begin_line": 227,
      "end_line": 265,
      "comment": "\n     * Reads from the current CPIO entry into an array of bytes. Blocks until\n     * some input is available.\n     * \n     * @param b\n     *            the buffer into which the data is read\n     * @param off\n     *            the start offset of the data\n     * @param len\n     *            the maximum number of bytes read\n     * @return the actual number of bytes read, or -1 if the end of the entry is\n     *         reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 21)",
        "(line 231,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 251,col 39)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 51)",
        "(line 257,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 39)",
        "(line 264,col 9)-(line 264,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(byte[], int, int)",
      "begin_line": 267,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 18)",
        "(line 273,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(int, boolean)",
      "begin_line": 284,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 38)",
        "(line 287,col 9)-(line 287,col 38)",
        "(line 288,col 9)-(line 288,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(int, int)",
      "begin_line": 291,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 44)",
        "(line 294,col 9)-(line 294,col 50)",
        "(line 295,col 9)-(line 295,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(boolean)",
      "begin_line": 298,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 29)",
        "(line 301,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 43)",
        "(line 308,col 9)-(line 308,col 41)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 41)",
        "(line 313,col 9)-(line 313,col 41)",
        "(line 314,col 9)-(line 314,col 51)",
        "(line 315,col 9)-(line 315,col 42)",
        "(line 316,col 9)-(line 316,col 42)",
        "(line 317,col 9)-(line 317,col 47)",
        "(line 318,col 9)-(line 318,col 47)",
        "(line 319,col 9)-(line 319,col 53)",
        "(line 320,col 9)-(line 320,col 53)",
        "(line 321,col 9)-(line 321,col 45)",
        "(line 322,col 9)-(line 322,col 44)",
        "(line 323,col 9)-(line 323,col 50)",
        "(line 324,col 9)-(line 324,col 26)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 38)",
        "(line 330,col 9)-(line 330,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry()",
      "begin_line": 333,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 70)",
        "(line 336,col 9)-(line 336,col 43)",
        "(line 337,col 9)-(line 337,col 42)",
        "(line 338,col 9)-(line 338,col 46)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 40)",
        "(line 343,col 9)-(line 343,col 40)",
        "(line 344,col 9)-(line 344,col 50)",
        "(line 345,col 9)-(line 345,col 49)",
        "(line 346,col 9)-(line 346,col 42)",
        "(line 347,col 9)-(line 347,col 44)",
        "(line 348,col 9)-(line 348,col 42)",
        "(line 349,col 9)-(line 349,col 56)",
        "(line 350,col 9)-(line 350,col 26)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 355,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(boolean)",
      "begin_line": 358,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 71)",
        "(line 362,col 9)-(line 362,col 55)",
        "(line 363,col 9)-(line 363,col 54)",
        "(line 364,col 9)-(line 364,col 58)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 52)",
        "(line 369,col 9)-(line 369,col 52)",
        "(line 370,col 9)-(line 370,col 62)",
        "(line 371,col 9)-(line 371,col 61)",
        "(line 372,col 9)-(line 372,col 53)",
        "(line 373,col 9)-(line 373,col 56)",
        "(line 374,col 9)-(line 374,col 53)",
        "(line 375,col 9)-(line 375,col 56)",
        "(line 376,col 9)-(line 376,col 26)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 38)",
        "(line 382,col 9)-(line 382,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(int)",
      "begin_line": 385,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 44)",
        "(line 387,col 9)-(line 387,col 50)",
        "(line 388,col 9)-(line 388,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(long)",
      "begin_line": 402,
      "end_line": 424,
      "comment": "\n     * Skips specified number of bytes in the current CPIO entry.\n     * \n     * @param n\n     *            the number of bytes to skip\n     * @return the actual number of bytes skipped\n     * @throws IOException\n     *             if an I/O error has occurred\n     * @throws IllegalArgumentException\n     *             if n \u003c 0\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 21)",
        "(line 408,col 9)-(line 408,col 55)",
        "(line 409,col 9)-(line 409,col 22)",
        "(line 411,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry()",
      "begin_line": 427,
      "end_line": 430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byte[], int)",
      "begin_line": 445,
      "end_line": 487,
      "comment": "\n     * Checks if the signature matches one of the following magic values:\n     * \n     * Strings:\n     *\n     * \"070701\" - MAGIC_NEW\n     * \"070702\" - MAGIC_NEW_CRC\n     * \"070707\" - MAGIC_OLD_ASCII\n     * \n     * Octal Binary value:\n     * \n     * 070707 - MAGIC_OLD_BINARY (held as a short) \u003d 0x71C7 or 0xC771\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 486,col 21)"
      ]
    }
  ]
}