{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java",
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
      "end_line": 448,
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
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.pad(long, int)",
      "begin_line": 203,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 35)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * Reads a byte of data. This method will block until enough input is\n     * available.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 222,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.read(byte[], int, int)",
      "begin_line": 241,
      "end_line": 282,
      "comment": "\n     * Reads from the current CPIO entry into an array of bytes. Blocks until\n     * some input is available.\n     * \n     * @param b\n     *            the buffer into which the data is read\n     * @param off\n     *            the start offset of the data\n     * @param len\n     *            the maximum number of bytes read\n     * @return the actual number of bytes read, or -1 if the end of the entry is\n     *         reached\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 21)",
        "(line 244,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 268,col 39)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 273,col 54)",
        "(line 274,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 39)",
        "(line 281,col 9)-(line 281,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readFully(byte[], int, int)",
      "begin_line": 284,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 18)",
        "(line 290,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readBinaryLong(int, boolean)",
      "begin_line": 300,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 38)",
        "(line 303,col 9)-(line 303,col 38)",
        "(line 304,col 9)-(line 304,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readAsciiLong(int, int)",
      "begin_line": 307,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 44)",
        "(line 310,col 9)-(line 310,col 50)",
        "(line 311,col 9)-(line 311,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readNewEntry(boolean)",
      "begin_line": 314,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 29)",
        "(line 317,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 324,col 42)",
        "(line 325,col 9)-(line 325,col 41)",
        "(line 326,col 9)-(line 326,col 41)",
        "(line 327,col 9)-(line 327,col 51)",
        "(line 328,col 9)-(line 328,col 42)",
        "(line 329,col 9)-(line 329,col 42)",
        "(line 330,col 9)-(line 330,col 47)",
        "(line 331,col 9)-(line 331,col 47)",
        "(line 332,col 9)-(line 332,col 53)",
        "(line 333,col 9)-(line 333,col 53)",
        "(line 334,col 9)-(line 334,col 45)",
        "(line 335,col 9)-(line 335,col 44)",
        "(line 336,col 9)-(line 336,col 49)",
        "(line 337,col 9)-(line 337,col 47)",
        "(line 339,col 9)-(line 339,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldAsciiEntry()",
      "begin_line": 342,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 70)",
        "(line 345,col 9)-(line 345,col 43)",
        "(line 346,col 9)-(line 346,col 42)",
        "(line 347,col 9)-(line 347,col 41)",
        "(line 348,col 9)-(line 348,col 40)",
        "(line 349,col 9)-(line 349,col 40)",
        "(line 350,col 9)-(line 350,col 50)",
        "(line 351,col 9)-(line 351,col 49)",
        "(line 352,col 9)-(line 352,col 42)",
        "(line 353,col 9)-(line 353,col 44)",
        "(line 354,col 9)-(line 354,col 42)",
        "(line 355,col 9)-(line 355,col 49)",
        "(line 357,col 9)-(line 357,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readOldBinaryEntry(boolean)",
      "begin_line": 360,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 71)",
        "(line 364,col 9)-(line 364,col 55)",
        "(line 365,col 9)-(line 365,col 54)",
        "(line 366,col 9)-(line 366,col 53)",
        "(line 367,col 9)-(line 367,col 52)",
        "(line 368,col 9)-(line 368,col 52)",
        "(line 369,col 9)-(line 369,col 62)",
        "(line 370,col 9)-(line 370,col 61)",
        "(line 371,col 9)-(line 371,col 53)",
        "(line 372,col 9)-(line 372,col 56)",
        "(line 373,col 9)-(line 373,col 53)",
        "(line 374,col 9)-(line 374,col 49)",
        "(line 375,col 9)-(line 375,col 47)",
        "(line 377,col 9)-(line 377,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.readCString(int)",
      "begin_line": 380,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 44)",
        "(line 382,col 9)-(line 382,col 50)",
        "(line 383,col 9)-(line 383,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.skip(long)",
      "begin_line": 397,
      "end_line": 418,
      "comment": "\n     * Skips specified number of bytes in the current CPIO entry.\n     * \n     * @param n\n     *            the number of bytes to skip\n     * @return the actual number of bytes skipped\n     * @throws IOException\n     *             if an I/O error has occurred\n     * @throws IllegalArgumentException\n     *             if n \u003c 0\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 21)",
        "(line 402,col 9)-(line 402,col 55)",
        "(line 403,col 9)-(line 403,col 22)",
        "(line 405,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextEntry()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byte[], int)",
      "begin_line": 424,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 446,col 20)"
      ]
    }
  ]
}