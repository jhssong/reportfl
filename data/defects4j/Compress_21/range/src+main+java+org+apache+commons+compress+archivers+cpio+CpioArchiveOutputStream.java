{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream",
        "org.apache.commons.compress.archivers.cpio.CpioConstants"
      ],
      "begin_line": 65,
      "end_line": 557,
      "comment": "\n * CPIOArchiveOutputStream is a stream for writing CPIO streams. All formats of\n * CPIO are supported (old ASCII, old binary, new portable format and the new\n * portable format with CRC).\n * \u003cp/\u003e\n * \u003cp/\u003e\n * An entry can be written by creating an instance of CpioArchiveEntry and fill\n * it with the necessary values and put it into the CPIO stream. Afterwards\n * write the contents of the file into the CPIO stream. Either close the stream\n * by calling finish() or put a next entry into the cpio stream.\n * \u003cp/\u003e\n * \u003ccode\u003e\u003cpre\u003e\n * CpioArchiveOutputStream out \u003d new CpioArchiveOutputStream(\n *         new FileOutputStream(new File(\"test.cpio\")));\n * CpioArchiveEntry entry \u003d new CpioArchiveEntry();\n * entry.setName(\"testfile\");\n * String contents \u003d \u0026quot;12345\u0026quot;;\n * entry.setFileSize(contents.length());\n * entry.setMode(CpioConstants.C_ISREG); // regular file\n * ... set other attributes, e.g. time, number of links\n * out.putArchiveEntry(entry);\n * out.write(testContents.getBytes());\n * out.close();\n * \u003c/pre\u003e\u003c/code\u003e\n * \u003cp/\u003e\n * Note: This implementation should be compatible to cpio 2.5\n * \n * This class uses mutable fields and is not considered threadsafe.\n * \n * based on code from the jRPM project (jrpm.sourceforge.net)\n "
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
        "closed"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "field",
      "varNames": [
        "entryFormat"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * See {@link CpioArchiveEntry#setFormat(short)} for possible values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 80,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
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
        "nextArtificalDeviceAndInode"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * The encoding to use for filenames and labels.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Construct the cpio output stream with a specified format, a\n     * blocksize of {@link CpioConstants#BLOCK_SIZE BLOCK_SIZE} and\n     * using ASCII as the file name encoding.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short, int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * Construct the cpio output stream with a specified format using\n     * ASCII as the file name encoding.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     * @param blockSize\n     *            The block size of the archive.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short, int, java.lang.String)",
      "begin_line": 146,
      "end_line": 162,
      "comment": "\n     * Construct the cpio output stream with a specified format using\n     * ASCII as the file name encoding.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     * @param blockSize\n     *            The block size of the archive.\n     * @param encoding\n     *            The encoding of file names to write - use null for\n     *            the platform\u0027s default.\n     * \n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 23)",
        "(line 149,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 34)",
        "(line 160,col 9)-(line 160,col 35)",
        "(line 161,col 9)-(line 161,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format using ASCII encoding for file names\n     * \n     * @param out\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format.\n     * \n     * @param out\n     *            The cpio stream\n     * @param encoding\n     *            The encoding of file names to write - use null for\n     *            the platform\u0027s default.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen()",
      "begin_line": 196,
      "end_line": 200,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 216,
      "end_line": 243,
      "comment": "\n     * Begins writing a new CPIO file entry and positions the stream to the\n     * start of the entry data. Closes the current entry if still active. The\n     * current time will be used if the entry has no set modification time and\n     * the default header format will be used if no other format is specified in\n     * the entry.\n     * \n     * @param entry\n     *            the CPIO cpioEntry to be written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     * @throws ClassCastException if entry is not an instance of CpioArchiveEntry\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 222,col 54)",
        "(line 223,col 9)-(line 223,col 21)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 43)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 23)",
        "(line 241,col 9)-(line 241,col 23)",
        "(line 242,col 9)-(line 242,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 245,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 267,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 270,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 38)",
        "(line 272,col 9)-(line 272,col 43)",
        "(line 273,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 37)",
        "(line 287,col 9)-(line 287,col 47)",
        "(line 288,col 9)-(line 288,col 46)",
        "(line 289,col 9)-(line 289,col 46)",
        "(line 290,col 9)-(line 290,col 56)",
        "(line 291,col 9)-(line 291,col 47)",
        "(line 292,col 9)-(line 292,col 47)",
        "(line 293,col 9)-(line 293,col 52)",
        "(line 294,col 9)-(line 294,col 38)",
        "(line 295,col 9)-(line 295,col 58)",
        "(line 296,col 9)-(line 296,col 58)",
        "(line 297,col 9)-(line 297,col 60)",
        "(line 298,col 9)-(line 298,col 49)",
        "(line 299,col 9)-(line 299,col 38)",
        "(line 300,col 9)-(line 300,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 303,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 38)",
        "(line 306,col 9)-(line 306,col 40)",
        "(line 307,col 9)-(line 318,col 9)",
        "(line 320,col 9)-(line 320,col 37)",
        "(line 321,col 9)-(line 321,col 36)",
        "(line 322,col 9)-(line 322,col 46)",
        "(line 323,col 9)-(line 323,col 45)",
        "(line 324,col 9)-(line 324,col 45)",
        "(line 325,col 9)-(line 325,col 55)",
        "(line 326,col 9)-(line 326,col 54)",
        "(line 327,col 9)-(line 327,col 47)",
        "(line 328,col 9)-(line 328,col 59)",
        "(line 329,col 9)-(line 329,col 47)",
        "(line 330,col 9)-(line 330,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)",
      "begin_line": 333,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 38)",
        "(line 336,col 9)-(line 336,col 40)",
        "(line 337,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 350,col 49)",
        "(line 351,col 9)-(line 351,col 48)",
        "(line 352,col 9)-(line 352,col 58)",
        "(line 353,col 9)-(line 353,col 57)",
        "(line 354,col 9)-(line 354,col 57)",
        "(line 355,col 9)-(line 355,col 67)",
        "(line 356,col 9)-(line 356,col 66)",
        "(line 357,col 9)-(line 357,col 58)",
        "(line 358,col 9)-(line 358,col 71)",
        "(line 359,col 9)-(line 359,col 58)",
        "(line 360,col 9)-(line 360,col 38)",
        "(line 361,col 9)-(line 361,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 370,
      "end_line": 395,
      "comment": "(non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#closeArchiveEntry\n     * ()\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 21)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 42)",
        "(line 388,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 26)",
        "(line 393,col 9)-(line 393,col 21)",
        "(line 394,col 9)-(line 394,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 411,
      "end_line": 435,
      "comment": "\n     * Writes an array of bytes to the current CPIO entry data. This method will\n     * block until all the bytes are written.\n     * \n     * @param b\n     *            the data to be written\n     * @param off\n     *            the start offset in the data\n     * @param len\n     *            the number of bytes that are written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 21)",
        "(line 415,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 31)",
        "(line 428,col 9)-(line 428,col 28)",
        "(line 429,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish()",
      "begin_line": 446,
      "end_line": 468,
      "comment": "\n     * Finishes writing the contents of the CPIO output stream without closing\n     * the underlying stream. Use this method when applying multiple filters in\n     * succession to the same output stream.\n     * \n     * @throws IOException\n     *             if an I/O exception has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 21)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 60)",
        "(line 457,col 9)-(line 457,col 41)",
        "(line 458,col 9)-(line 458,col 39)",
        "(line 459,col 9)-(line 459,col 32)",
        "(line 460,col 9)-(line 460,col 28)",
        "(line 462,col 9)-(line 462,col 70)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 467,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close()",
      "begin_line": 477,
      "end_line": 487,
      "comment": "\n     * Closes the CPIO output stream as well as the stream being filtered.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(int)",
      "begin_line": 489,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 490,col 9)-(line 494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(long, int, boolean)",
      "begin_line": 497,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 75)",
        "(line 500,col 9)-(line 500,col 23)",
        "(line 501,col 9)-(line 501,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(long, int, int)",
      "begin_line": 504,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 48)",
        "(line 507,col 9)-(line 507,col 22)",
        "(line 508,col 9)-(line 514,col 9)",
        "(line 516,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 53)",
        "(line 526,col 9)-(line 526,col 21)",
        "(line 527,col 9)-(line 527,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(java.lang.String)",
      "begin_line": 535,
      "end_line": 541,
      "comment": "\n     * Writes an ASCII string to the stream followed by \\0\n     * @param str the String to write\n     * @throws IOException if the string couldn\u0027t be written\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 46)",
        "(line 537,col 9)-(line 537,col 53)",
        "(line 538,col 9)-(line 538,col 55)",
        "(line 539,col 9)-(line 539,col 24)",
        "(line 540,col 9)-(line 540,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 548,
      "end_line": 555,
      "comment": "\n     * Creates a new ArchiveEntry. The entryName must be an ASCII encoded string.\n     * \n     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#createArchiveEntry(java.io.File, java.lang.String)\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 58)"
      ]
    }
  ]
}