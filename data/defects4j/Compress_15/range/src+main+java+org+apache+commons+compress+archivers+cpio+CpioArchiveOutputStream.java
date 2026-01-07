{
  "filepath": "/tmp/Compress-15b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream",
        "org.apache.commons.compress.archivers.cpio.CpioConstants"
      ],
      "begin_line": 61,
      "end_line": 508,
      "comment": "\n * CPIOArchiveOutputStream is a stream for writing CPIO streams. All formats of\n * CPIO are supported (old ASCII, old binary, new portable format and the new\n * portable format with CRC).\n * \u003cp/\u003e\n * \u003cp/\u003e\n * An entry can be written by creating an instance of CpioArchiveEntry and fill\n * it with the necessary values and put it into the CPIO stream. Afterwards\n * write the contents of the file into the CPIO stream. Either close the stream\n * by calling finish() or put a next entry into the cpio stream.\n * \u003cp/\u003e\n * \u003ccode\u003e\u003cpre\u003e\n * CpioArchiveOutputStream out \u003d new CpioArchiveOutputStream(\n *         new FileOutputStream(new File(\"test.cpio\")));\n * CpioArchiveEntry entry \u003d new CpioArchiveEntry();\n * entry.setName(\"testfile\");\n * String contents \u003d \u0026quot;12345\u0026quot;;\n * entry.setFileSize(contents.length());\n * entry.setMode(CpioConstants.C_ISREG); // regular file\n * ... set other attributes, e.g. time, number of links\n * out.putArchiveEntry(entry);\n * out.write(testContents.getBytes());\n * out.close();\n * \u003c/pre\u003e\u003c/code\u003e\n * \u003cp/\u003e\n * Note: This implementation should be compatible to cpio 2.5\n * \n * This class uses mutable fields and is not considered threadsafe.\n * \n * based on code from the jRPM project (jrpm.sourceforge.net)\n "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 64,
      "end_line": 64,
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
        "finished"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "field",
      "varNames": [
        "entryFormat"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * See {@link CpioArchiveEntry#setFormat(short)} for possible values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 76,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
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
      "type": "field",
      "varNames": [
        "nextArtificalDeviceAndInode"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Construct the cpio output stream with a specified format and a\n     * blocksize of {@link CpioConstants#BLOCK_SIZE BLOCK_SIZE}.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short, int)",
      "begin_line": 114,
      "end_line": 129,
      "comment": "\n     * Construct the cpio output stream with a specified format\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     * @param blockSize\n     *            The block size of the archive.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 23)",
        "(line 117,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 34)",
        "(line 128,col 9)-(line 128,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format\n     * \n     * @param out\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen()",
      "begin_line": 148,
      "end_line": 152,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 168,
      "end_line": 195,
      "comment": "\n     * Begins writing a new CPIO file entry and positions the stream to the\n     * start of the entry data. Closes the current entry if still active. The\n     * current time will be used if the entry has no set modification time and\n     * the default header format will be used if no other format is specified in\n     * the entry.\n     * \n     * @param entry\n     *            the CPIO cpioEntry to be written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     * @throws ClassCastException if entry is not an instance of CpioArchiveEntry\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 54)",
        "(line 175,col 9)-(line 175,col 21)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 43)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 23)",
        "(line 193,col 9)-(line 193,col 23)",
        "(line 194,col 9)-(line 194,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 197,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 222,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 38)",
        "(line 224,col 9)-(line 224,col 43)",
        "(line 225,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 37)",
        "(line 239,col 9)-(line 239,col 47)",
        "(line 240,col 9)-(line 240,col 46)",
        "(line 241,col 9)-(line 241,col 46)",
        "(line 242,col 9)-(line 242,col 56)",
        "(line 243,col 9)-(line 243,col 47)",
        "(line 244,col 9)-(line 244,col 47)",
        "(line 245,col 9)-(line 245,col 52)",
        "(line 246,col 9)-(line 246,col 38)",
        "(line 247,col 9)-(line 247,col 58)",
        "(line 248,col 9)-(line 248,col 58)",
        "(line 249,col 9)-(line 249,col 60)",
        "(line 250,col 9)-(line 250,col 49)",
        "(line 251,col 9)-(line 251,col 38)",
        "(line 252,col 9)-(line 252,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 255,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 38)",
        "(line 258,col 9)-(line 258,col 40)",
        "(line 259,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 37)",
        "(line 273,col 9)-(line 273,col 36)",
        "(line 274,col 9)-(line 274,col 46)",
        "(line 275,col 9)-(line 275,col 45)",
        "(line 276,col 9)-(line 276,col 45)",
        "(line 277,col 9)-(line 277,col 55)",
        "(line 278,col 9)-(line 278,col 54)",
        "(line 279,col 9)-(line 279,col 47)",
        "(line 280,col 9)-(line 280,col 59)",
        "(line 281,col 9)-(line 281,col 47)",
        "(line 282,col 9)-(line 282,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)",
      "begin_line": 285,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 38)",
        "(line 288,col 9)-(line 288,col 40)",
        "(line 289,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 49)",
        "(line 303,col 9)-(line 303,col 48)",
        "(line 304,col 9)-(line 304,col 58)",
        "(line 305,col 9)-(line 305,col 57)",
        "(line 306,col 9)-(line 306,col 57)",
        "(line 307,col 9)-(line 307,col 67)",
        "(line 308,col 9)-(line 308,col 66)",
        "(line 309,col 9)-(line 309,col 58)",
        "(line 310,col 9)-(line 310,col 71)",
        "(line 311,col 9)-(line 311,col 58)",
        "(line 312,col 9)-(line 312,col 38)",
        "(line 313,col 9)-(line 313,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 322,
      "end_line": 347,
      "comment": "(non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#closeArchiveEntry\n     * ()\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 21)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 42)",
        "(line 340,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 26)",
        "(line 345,col 9)-(line 345,col 21)",
        "(line 346,col 9)-(line 346,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 363,
      "end_line": 387,
      "comment": "\n     * Writes an array of bytes to the current CPIO entry data. This method will\n     * block until all the bytes are written.\n     * \n     * @param b\n     *            the data to be written\n     * @param off\n     *            the start offset in the data\n     * @param len\n     *            the number of bytes that are written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 21)",
        "(line 367,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 31)",
        "(line 380,col 9)-(line 380,col 28)",
        "(line 381,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish()",
      "begin_line": 398,
      "end_line": 420,
      "comment": "\n     * Finishes writing the contents of the CPIO output stream without closing\n     * the underlying stream. Use this method when applying multiple filters in\n     * succession to the same output stream.\n     * \n     * @throws IOException\n     *             if an I/O exception has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 21)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 60)",
        "(line 409,col 9)-(line 409,col 41)",
        "(line 410,col 9)-(line 410,col 39)",
        "(line 411,col 9)-(line 411,col 32)",
        "(line 412,col 9)-(line 412,col 28)",
        "(line 414,col 9)-(line 414,col 70)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 419,col 9)-(line 419,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close()",
      "begin_line": 429,
      "end_line": 439,
      "comment": "\n     * Closes the CPIO output stream as well as the stream being filtered.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 438,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(int)",
      "begin_line": 441,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 446,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(long, int, boolean)",
      "begin_line": 449,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 75)",
        "(line 452,col 9)-(line 452,col 23)",
        "(line 453,col 9)-(line 453,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(long, int, int)",
      "begin_line": 456,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 46)",
        "(line 459,col 9)-(line 459,col 22)",
        "(line 460,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 53)",
        "(line 478,col 9)-(line 478,col 21)",
        "(line 479,col 9)-(line 479,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(java.lang.String)",
      "begin_line": 487,
      "end_line": 492,
      "comment": "\n     * Writes an ASCII string to the stream followed by \\0\n     * @param str the String to write\n     * @throws IOException if the string couldn\u0027t be written\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 50)",
        "(line 489,col 9)-(line 489,col 21)",
        "(line 490,col 9)-(line 490,col 24)",
        "(line 491,col 9)-(line 491,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 499,
      "end_line": 506,
      "comment": "\n     * Creates a new ArchiveEntry. The entryName must be an ASCII encoded string.\n     * \n     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#createArchiveEntry(java.io.File, java.lang.String)\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 58)"
      ]
    }
  ]
}