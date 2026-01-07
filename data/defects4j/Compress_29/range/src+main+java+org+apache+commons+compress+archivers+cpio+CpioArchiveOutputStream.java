{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java",
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
      "end_line": 560,
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
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Construct the cpio output stream with a specified format, a\n     * blocksize of {@link CpioConstants#BLOCK_SIZE BLOCK_SIZE} and\n     * using ASCII as the file name encoding.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short, int)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\n     * Construct the cpio output stream with a specified format using\n     * ASCII as the file name encoding.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     * @param blockSize\n     *            The block size of the archive.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short, int, java.lang.String)",
      "begin_line": 147,
      "end_line": 163,
      "comment": "\n     * Construct the cpio output stream with a specified format using\n     * ASCII as the file name encoding.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     * @param blockSize\n     *            The block size of the archive.\n     * @param encoding\n     *            The encoding of file names to write - use null for\n     *            the platform\u0027s default.\n     * \n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 23)",
        "(line 150,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 34)",
        "(line 161,col 9)-(line 161,col 35)",
        "(line 162,col 9)-(line 162,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format using ASCII encoding for file names\n     * \n     * @param out\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format.\n     * \n     * @param out\n     *            The cpio stream\n     * @param encoding\n     *            The encoding of file names to write - use null for\n     *            the platform\u0027s default.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen()",
      "begin_line": 197,
      "end_line": 201,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 217,
      "end_line": 244,
      "comment": "\n     * Begins writing a new CPIO file entry and positions the stream to the\n     * start of the entry data. Closes the current entry if still active. The\n     * current time will be used if the entry has no set modification time and\n     * the default header format will be used if no other format is specified in\n     * the entry.\n     * \n     * @param entry\n     *            the CPIO cpioEntry to be written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     * @throws ClassCastException if entry is not an instance of CpioArchiveEntry\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 54)",
        "(line 224,col 9)-(line 224,col 21)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 43)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 23)",
        "(line 242,col 9)-(line 242,col 23)",
        "(line 243,col 9)-(line 243,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 246,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 273,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 38)",
        "(line 275,col 9)-(line 275,col 43)",
        "(line 276,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 37)",
        "(line 290,col 9)-(line 290,col 47)",
        "(line 291,col 9)-(line 291,col 46)",
        "(line 292,col 9)-(line 292,col 46)",
        "(line 293,col 9)-(line 293,col 56)",
        "(line 294,col 9)-(line 294,col 47)",
        "(line 295,col 9)-(line 295,col 47)",
        "(line 296,col 9)-(line 296,col 52)",
        "(line 297,col 9)-(line 297,col 38)",
        "(line 298,col 9)-(line 298,col 58)",
        "(line 299,col 9)-(line 299,col 58)",
        "(line 300,col 9)-(line 300,col 60)",
        "(line 301,col 9)-(line 301,col 49)",
        "(line 302,col 9)-(line 302,col 38)",
        "(line 303,col 9)-(line 303,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 306,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 38)",
        "(line 309,col 9)-(line 309,col 40)",
        "(line 310,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 323,col 37)",
        "(line 324,col 9)-(line 324,col 36)",
        "(line 325,col 9)-(line 325,col 46)",
        "(line 326,col 9)-(line 326,col 45)",
        "(line 327,col 9)-(line 327,col 45)",
        "(line 328,col 9)-(line 328,col 55)",
        "(line 329,col 9)-(line 329,col 54)",
        "(line 330,col 9)-(line 330,col 47)",
        "(line 331,col 9)-(line 331,col 59)",
        "(line 332,col 9)-(line 332,col 47)",
        "(line 333,col 9)-(line 333,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)",
      "begin_line": 336,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 38)",
        "(line 339,col 9)-(line 339,col 40)",
        "(line 340,col 9)-(line 351,col 9)",
        "(line 353,col 9)-(line 353,col 49)",
        "(line 354,col 9)-(line 354,col 48)",
        "(line 355,col 9)-(line 355,col 58)",
        "(line 356,col 9)-(line 356,col 57)",
        "(line 357,col 9)-(line 357,col 57)",
        "(line 358,col 9)-(line 358,col 67)",
        "(line 359,col 9)-(line 359,col 66)",
        "(line 360,col 9)-(line 360,col 58)",
        "(line 361,col 9)-(line 361,col 71)",
        "(line 362,col 9)-(line 362,col 58)",
        "(line 363,col 9)-(line 363,col 38)",
        "(line 364,col 9)-(line 364,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 373,
      "end_line": 398,
      "comment": "(non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#closeArchiveEntry\n     * ()\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 379,col 21)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 42)",
        "(line 391,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 26)",
        "(line 396,col 9)-(line 396,col 21)",
        "(line 397,col 9)-(line 397,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 414,
      "end_line": 438,
      "comment": "\n     * Writes an array of bytes to the current CPIO entry data. This method will\n     * block until all the bytes are written.\n     * \n     * @param b\n     *            the data to be written\n     * @param off\n     *            the start offset in the data\n     * @param len\n     *            the number of bytes that are written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 21)",
        "(line 418,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 31)",
        "(line 431,col 9)-(line 431,col 28)",
        "(line 432,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish()",
      "begin_line": 449,
      "end_line": 471,
      "comment": "\n     * Finishes writing the contents of the CPIO output stream without closing\n     * the underlying stream. Use this method when applying multiple filters in\n     * succession to the same output stream.\n     * \n     * @throws IOException\n     *             if an I/O exception has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 21)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 60)",
        "(line 460,col 9)-(line 460,col 41)",
        "(line 461,col 9)-(line 461,col 39)",
        "(line 462,col 9)-(line 462,col 32)",
        "(line 463,col 9)-(line 463,col 28)",
        "(line 465,col 9)-(line 465,col 70)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 470,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close()",
      "begin_line": 480,
      "end_line": 490,
      "comment": "\n     * Closes the CPIO output stream as well as the stream being filtered.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(int)",
      "begin_line": 492,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 497,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(long, int, boolean)",
      "begin_line": 500,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 75)",
        "(line 503,col 9)-(line 503,col 23)",
        "(line 504,col 9)-(line 504,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(long, int, int)",
      "begin_line": 507,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 48)",
        "(line 510,col 9)-(line 510,col 22)",
        "(line 511,col 9)-(line 517,col 9)",
        "(line 519,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 53)",
        "(line 529,col 9)-(line 529,col 21)",
        "(line 530,col 9)-(line 530,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(java.lang.String)",
      "begin_line": 538,
      "end_line": 544,
      "comment": "\n     * Writes an ASCII string to the stream followed by \\0\n     * @param str the String to write\n     * @throws IOException if the string couldn\u0027t be written\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 49)",
        "(line 540,col 9)-(line 540,col 53)",
        "(line 541,col 9)-(line 541,col 55)",
        "(line 542,col 9)-(line 542,col 24)",
        "(line 543,col 9)-(line 543,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 551,
      "end_line": 558,
      "comment": "\n     * Creates a new ArchiveEntry. The entryName must be an ASCII encoded string.\n     * \n     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#createArchiveEntry(java.io.File, java.lang.String)\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 58)"
      ]
    }
  ]
}