{
  "filepath": "/tmp/Compress-7b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java",
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
      "end_line": 502,
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
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextArtificalDeviceAndInode"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Construct the cpio output stream with a specified format and a\n     * blocksize of {@link CpioConstants#BLOCK_SIZE BLOCK_SIZE}.\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short, int)",
      "begin_line": 113,
      "end_line": 128,
      "comment": "\n     * Construct the cpio output stream with a specified format\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     * @param blockSize\n     *            The block size of the archive.\n     *            \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 23)",
        "(line 116,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 34)",
        "(line 127,col 9)-(line 127,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format\n     * \n     * @param out\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen()",
      "begin_line": 147,
      "end_line": 151,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 167,
      "end_line": 193,
      "comment": "\n     * Begins writing a new CPIO file entry and positions the stream to the\n     * start of the entry data. Closes the current entry if still active. The\n     * current time will be used if the entry has no set modification time and\n     * the default header format will be used if no other format is specified in\n     * the entry.\n     * \n     * @param entry\n     *            the CPIO cpioEntry to be written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     * @throws ClassCastException if entry is not an instance of CpioArchiveEntry\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 54)",
        "(line 173,col 9)-(line 173,col 21)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 43)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 23)",
        "(line 191,col 9)-(line 191,col 23)",
        "(line 192,col 9)-(line 192,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 195,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 220,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 222,col 43)",
        "(line 223,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 37)",
        "(line 237,col 9)-(line 237,col 47)",
        "(line 238,col 9)-(line 238,col 46)",
        "(line 239,col 9)-(line 239,col 46)",
        "(line 240,col 9)-(line 240,col 56)",
        "(line 241,col 9)-(line 241,col 47)",
        "(line 242,col 9)-(line 242,col 47)",
        "(line 243,col 9)-(line 243,col 52)",
        "(line 244,col 9)-(line 244,col 38)",
        "(line 245,col 9)-(line 245,col 58)",
        "(line 246,col 9)-(line 246,col 58)",
        "(line 247,col 9)-(line 247,col 60)",
        "(line 248,col 9)-(line 248,col 49)",
        "(line 249,col 9)-(line 249,col 38)",
        "(line 250,col 9)-(line 250,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 253,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 38)",
        "(line 256,col 9)-(line 256,col 40)",
        "(line 257,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 270,col 37)",
        "(line 271,col 9)-(line 271,col 36)",
        "(line 272,col 9)-(line 272,col 46)",
        "(line 273,col 9)-(line 273,col 45)",
        "(line 274,col 9)-(line 274,col 45)",
        "(line 275,col 9)-(line 275,col 55)",
        "(line 276,col 9)-(line 276,col 54)",
        "(line 277,col 9)-(line 277,col 47)",
        "(line 278,col 9)-(line 278,col 59)",
        "(line 279,col 9)-(line 279,col 47)",
        "(line 280,col 9)-(line 280,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)",
      "begin_line": 283,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 38)",
        "(line 286,col 9)-(line 286,col 40)",
        "(line 287,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 49)",
        "(line 301,col 9)-(line 301,col 48)",
        "(line 302,col 9)-(line 302,col 58)",
        "(line 303,col 9)-(line 303,col 57)",
        "(line 304,col 9)-(line 304,col 57)",
        "(line 305,col 9)-(line 305,col 67)",
        "(line 306,col 9)-(line 306,col 66)",
        "(line 307,col 9)-(line 307,col 58)",
        "(line 308,col 9)-(line 308,col 71)",
        "(line 309,col 9)-(line 309,col 58)",
        "(line 310,col 9)-(line 310,col 38)",
        "(line 311,col 9)-(line 311,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 320,
      "end_line": 345,
      "comment": "(non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#closeArchiveEntry\n     * ()\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 21)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 42)",
        "(line 337,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 26)",
        "(line 343,col 9)-(line 343,col 21)",
        "(line 344,col 9)-(line 344,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 361,
      "end_line": 384,
      "comment": "\n     * Writes an array of bytes to the current CPIO entry data. This method will\n     * block until all the bytes are written.\n     * \n     * @param b\n     *            the data to be written\n     * @param off\n     *            the start offset in the data\n     * @param len\n     *            the number of bytes that are written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 21)",
        "(line 364,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 31)",
        "(line 377,col 9)-(line 377,col 28)",
        "(line 378,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish()",
      "begin_line": 395,
      "end_line": 416,
      "comment": "\n     * Finishes writing the contents of the CPIO output stream without closing\n     * the underlying stream. Use this method when applying multiple filters in\n     * succession to the same output stream.\n     * \n     * @throws IOException\n     *             if an I/O exception has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 21)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 60)",
        "(line 405,col 9)-(line 405,col 41)",
        "(line 406,col 9)-(line 406,col 39)",
        "(line 407,col 9)-(line 407,col 32)",
        "(line 408,col 9)-(line 408,col 28)",
        "(line 410,col 9)-(line 410,col 70)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 415,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close()",
      "begin_line": 425,
      "end_line": 434,
      "comment": "\n     * Closes the CPIO output stream as well as the stream being filtered.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 428,col 9)",
        "(line 430,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(int)",
      "begin_line": 436,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 437,col 9)-(line 441,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(long, int, boolean)",
      "begin_line": 444,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 75)",
        "(line 447,col 9)-(line 447,col 23)",
        "(line 448,col 9)-(line 448,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(long, int, int)",
      "begin_line": 451,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 46)",
        "(line 454,col 9)-(line 454,col 22)",
        "(line 455,col 9)-(line 461,col 9)",
        "(line 463,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 53)",
        "(line 473,col 9)-(line 473,col 21)",
        "(line 474,col 9)-(line 474,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(java.lang.String)",
      "begin_line": 482,
      "end_line": 487,
      "comment": "\n     * Writes an ASCII string to the stream followed by \\0\n     * @param str the String to write\n     * @throws IOException if the string couldn\u0027t be written\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 50)",
        "(line 484,col 9)-(line 484,col 21)",
        "(line 485,col 9)-(line 485,col 24)",
        "(line 486,col 9)-(line 486,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 494,
      "end_line": 500,
      "comment": "\n     * Creates a new ArchiveEntry. The entryName must be an ASCII encoded string.\n     * \n     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#createArchiveEntry(java.io.File, java.lang.String)\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 58)"
      ]
    }
  ]
}