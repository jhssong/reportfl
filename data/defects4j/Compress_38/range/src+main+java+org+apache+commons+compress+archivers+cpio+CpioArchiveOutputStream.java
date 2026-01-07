{
  "filepath": "/tmp/Compress-38b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream",
        "org.apache.commons.compress.archivers.cpio.CpioConstants"
      ],
      "begin_line": 64,
      "end_line": 562,
      "comment": "\n * CPIOArchiveOutputStream is a stream for writing CPIO streams. All formats of\n * CPIO are supported (old ASCII, old binary, new portable format and the new\n * portable format with CRC).\n *\n * \u003cp\u003eAn entry can be written by creating an instance of CpioArchiveEntry and fill\n * it with the necessary values and put it into the CPIO stream. Afterwards\n * write the contents of the file into the CPIO stream. Either close the stream\n * by calling finish() or put a next entry into the cpio stream.\u003c/p\u003e\n *\n * \u003cpre\u003e\n * CpioArchiveOutputStream out \u003d new CpioArchiveOutputStream(\n *         new FileOutputStream(new File(\"test.cpio\")));\n * CpioArchiveEntry entry \u003d new CpioArchiveEntry();\n * entry.setName(\"testfile\");\n * String contents \u003d \u0026quot;12345\u0026quot;;\n * entry.setFileSize(contents.length());\n * entry.setMode(CpioConstants.C_ISREG); // regular file\n * ... set other attributes, e.g. time, number of links\n * out.putArchiveEntry(entry);\n * out.write(testContents.getBytes());\n * out.close();\n * \u003c/pre\u003e\n *\n * \u003cp\u003eNote: This implementation should be compatible to cpio 2.5\u003c/p\u003e\n * \n * \u003cp\u003eThis class uses mutable fields and is not considered threadsafe.\u003c/p\u003e\n * \n * \u003cp\u003ebased on code from the jRPM project (jrpm.sourceforge.net)\u003c/p\u003e\n "
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
        "closed"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "field",
      "varNames": [
        "entryFormat"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * See {@link CpioArchiveEntry#setFormat(short)} for possible values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 79,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextArtificalDeviceAndInode"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * The encoding to use for filenames and labels.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Construct the cpio output stream with a specified format, a\n     * blocksize of {@link CpioConstants#BLOCK_SIZE BLOCK_SIZE} and\n     * using ASCII as the file name encoding.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short, int)",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * Construct the cpio output stream with a specified format using\n     * ASCII as the file name encoding.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     * @param blockSize\n     *            The block size of the archive.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short, int, java.lang.String)",
      "begin_line": 148,
      "end_line": 165,
      "comment": "\n     * Construct the cpio output stream with a specified format using\n     * ASCII as the file name encoding.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     * @param blockSize\n     *            The block size of the archive.\n     * @param encoding\n     *            The encoding of file names to write - use null for\n     *            the platform\u0027s default.\n     * \n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 23)",
        "(line 151,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 34)",
        "(line 162,col 9)-(line 162,col 35)",
        "(line 163,col 9)-(line 163,col 33)",
        "(line 164,col 9)-(line 164,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format using ASCII encoding for file names\n     * \n     * @param out\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format.\n     * \n     * @param out\n     *            The cpio stream\n     * @param encoding\n     *            The encoding of file names to write - use null for\n     *            the platform\u0027s default.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen()",
      "begin_line": 199,
      "end_line": 203,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 219,
      "end_line": 246,
      "comment": "\n     * Begins writing a new CPIO file entry and positions the stream to the\n     * start of the entry data. Closes the current entry if still active. The\n     * current time will be used if the entry has no set modification time and\n     * the default header format will be used if no other format is specified in\n     * the entry.\n     * \n     * @param entry\n     *            the CPIO cpioEntry to be written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     * @throws ClassCastException if entry is not an instance of CpioArchiveEntry\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 60)",
        "(line 226,col 9)-(line 226,col 21)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 43)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 23)",
        "(line 244,col 9)-(line 244,col 23)",
        "(line 245,col 9)-(line 245,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 248,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 275,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 38)",
        "(line 277,col 9)-(line 277,col 43)",
        "(line 278,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 37)",
        "(line 292,col 9)-(line 292,col 47)",
        "(line 293,col 9)-(line 293,col 46)",
        "(line 294,col 9)-(line 294,col 46)",
        "(line 295,col 9)-(line 295,col 56)",
        "(line 296,col 9)-(line 296,col 47)",
        "(line 297,col 9)-(line 297,col 47)",
        "(line 298,col 9)-(line 298,col 52)",
        "(line 299,col 9)-(line 299,col 38)",
        "(line 300,col 9)-(line 300,col 58)",
        "(line 301,col 9)-(line 301,col 58)",
        "(line 302,col 9)-(line 302,col 60)",
        "(line 303,col 9)-(line 303,col 49)",
        "(line 304,col 9)-(line 304,col 38)",
        "(line 305,col 9)-(line 305,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 308,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 38)",
        "(line 311,col 9)-(line 311,col 40)",
        "(line 312,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 37)",
        "(line 326,col 9)-(line 326,col 36)",
        "(line 327,col 9)-(line 327,col 46)",
        "(line 328,col 9)-(line 328,col 45)",
        "(line 329,col 9)-(line 329,col 45)",
        "(line 330,col 9)-(line 330,col 55)",
        "(line 331,col 9)-(line 331,col 54)",
        "(line 332,col 9)-(line 332,col 47)",
        "(line 333,col 9)-(line 333,col 59)",
        "(line 334,col 9)-(line 334,col 47)",
        "(line 335,col 9)-(line 335,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)",
      "begin_line": 338,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 38)",
        "(line 341,col 9)-(line 341,col 40)",
        "(line 342,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 355,col 49)",
        "(line 356,col 9)-(line 356,col 48)",
        "(line 357,col 9)-(line 357,col 58)",
        "(line 358,col 9)-(line 358,col 57)",
        "(line 359,col 9)-(line 359,col 57)",
        "(line 360,col 9)-(line 360,col 67)",
        "(line 361,col 9)-(line 361,col 66)",
        "(line 362,col 9)-(line 362,col 58)",
        "(line 363,col 9)-(line 363,col 71)",
        "(line 364,col 9)-(line 364,col 58)",
        "(line 365,col 9)-(line 365,col 38)",
        "(line 366,col 9)-(line 366,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 375,
      "end_line": 400,
      "comment": "(non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#closeArchiveEntry\n     * ()\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 381,col 21)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 387,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 42)",
        "(line 393,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 26)",
        "(line 398,col 9)-(line 398,col 21)",
        "(line 399,col 9)-(line 399,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 416,
      "end_line": 440,
      "comment": "\n     * Writes an array of bytes to the current CPIO entry data. This method will\n     * block until all the bytes are written.\n     * \n     * @param b\n     *            the data to be written\n     * @param off\n     *            the start offset in the data\n     * @param len\n     *            the number of bytes that are written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 21)",
        "(line 420,col 9)-(line 424,col 9)",
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 31)",
        "(line 433,col 9)-(line 433,col 28)",
        "(line 434,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish()",
      "begin_line": 451,
      "end_line": 473,
      "comment": "\n     * Finishes writing the contents of the CPIO output stream without closing\n     * the underlying stream. Use this method when applying multiple filters in\n     * succession to the same output stream.\n     * \n     * @throws IOException\n     *             if an I/O exception has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 21)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 60)",
        "(line 462,col 9)-(line 462,col 41)",
        "(line 463,col 9)-(line 463,col 39)",
        "(line 464,col 9)-(line 464,col 32)",
        "(line 465,col 9)-(line 465,col 28)",
        "(line 467,col 9)-(line 467,col 76)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 472,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close()",
      "begin_line": 482,
      "end_line": 492,
      "comment": "\n     * Closes the CPIO output stream as well as the stream being filtered.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(int)",
      "begin_line": 494,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(long, int, boolean)",
      "begin_line": 502,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 81)",
        "(line 505,col 9)-(line 505,col 23)",
        "(line 506,col 9)-(line 506,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(long, int, int)",
      "begin_line": 509,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 54)",
        "(line 512,col 9)-(line 512,col 22)",
        "(line 513,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 59)",
        "(line 531,col 9)-(line 531,col 21)",
        "(line 532,col 9)-(line 532,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(java.lang.String)",
      "begin_line": 540,
      "end_line": 546,
      "comment": "\n     * Writes an ASCII string to the stream followed by \\0\n     * @param str the String to write\n     * @throws IOException if the string couldn\u0027t be written\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 55)",
        "(line 542,col 9)-(line 542,col 53)",
        "(line 543,col 9)-(line 543,col 55)",
        "(line 544,col 9)-(line 544,col 24)",
        "(line 545,col 9)-(line 545,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 553,
      "end_line": 560,
      "comment": "\n     * Creates a new ArchiveEntry. The entryName must be an ASCII encoded string.\n     * \n     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#createArchiveEntry(java.io.File, java.lang.String)\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 58)"
      ]
    }
  ]
}