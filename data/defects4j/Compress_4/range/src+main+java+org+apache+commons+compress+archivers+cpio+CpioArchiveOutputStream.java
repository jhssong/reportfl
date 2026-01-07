{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream",
        "org.apache.commons.compress.archivers.cpio.CpioConstants"
      ],
      "begin_line": 62,
      "end_line": 389,
      "comment": "\n * CPIOArchiveOutputStream is a stream for writing CPIO streams. All formats of\n * CPIO are supported (old ASCII, old binary, new portable format and the new\n * portable format with CRC).\n * \u003cp/\u003e\n * \u003cp/\u003e\n * An entry can be written by creating an instance of CpioArchiveEntry and fill\n * it with the necessary values and put it into the CPIO stream. Afterwards\n * write the contents of the file into the CPIO stream. Either close the stream\n * by calling finish() or put a next entry into the cpio stream.\n * \u003cp/\u003e\n * \u003ccode\u003e\u003cpre\u003e\n * CpioArchiveOutputStream out \u003d new CpioArchiveOutputStream(\n *         new FileOutputStream(new File(\"test.cpio\")));\n * CpioArchiveEntry entry \u003d new CpioArchiveEntry();\n * entry.setName(\"testfile\");\n * String contents \u003d \u0026quot;12345\u0026quot;;\n * entry.setFileSize(contents.length());\n * entry.setMode(CpioConstants.C_ISREG); // regular file\n * ... set other attributes, e.g. time, number of links\n * out.putNextEntry(entry);\n * out.write(testContents.getBytes());\n * out.close();\n * \u003c/pre\u003e\u003c/code\u003e\n * \u003cp/\u003e\n * Note: This implementation should be compatible to cpio 2.5\n * \n * This class uses mutable fields and is not considered threadsafe.\n * \n * based on code from the jRPM project (jrpm.sourceforge.net)\n "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
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
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short)",
      "begin_line": 92,
      "end_line": 105,
      "comment": "\n     * Construct the cpio output stream with a specified format\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 47)",
        "(line 94,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format\n     * \n     * @param out\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen()",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 144,
      "end_line": 166,
      "comment": "\n     * Begins writing a new CPIO file entry and positions the stream to the\n     * start of the entry data. Closes the current entry if still active. The\n     * current time will be used if the entry has no set modification time and\n     * the default header format will be used if no other format is specified in\n     * the entry.\n     * \n     * @param entry\n     *            the CPIO cpioEntry to be written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     * @throws ClassCastException if entry is not an instance of CpioArchiveEntry\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 54)",
        "(line 146,col 9)-(line 146,col 21)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 43)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 23)",
        "(line 164,col 9)-(line 164,col 23)",
        "(line 165,col 9)-(line 165,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 168,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 190,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 48)",
        "(line 192,col 9)-(line 192,col 47)",
        "(line 193,col 9)-(line 193,col 46)",
        "(line 194,col 9)-(line 194,col 46)",
        "(line 195,col 9)-(line 195,col 56)",
        "(line 196,col 9)-(line 196,col 47)",
        "(line 197,col 9)-(line 197,col 47)",
        "(line 198,col 9)-(line 198,col 52)",
        "(line 199,col 9)-(line 199,col 52)",
        "(line 200,col 9)-(line 200,col 58)",
        "(line 201,col 9)-(line 201,col 58)",
        "(line 202,col 9)-(line 202,col 60)",
        "(line 203,col 9)-(line 203,col 49)",
        "(line 204,col 9)-(line 204,col 38)",
        "(line 205,col 9)-(line 205,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 208,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 48)",
        "(line 211,col 9)-(line 211,col 47)",
        "(line 212,col 9)-(line 212,col 46)",
        "(line 213,col 9)-(line 213,col 45)",
        "(line 214,col 9)-(line 214,col 45)",
        "(line 215,col 9)-(line 215,col 55)",
        "(line 216,col 9)-(line 216,col 54)",
        "(line 217,col 9)-(line 217,col 47)",
        "(line 218,col 9)-(line 218,col 59)",
        "(line 219,col 9)-(line 219,col 47)",
        "(line 220,col 9)-(line 220,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)",
      "begin_line": 223,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 60)",
        "(line 226,col 9)-(line 226,col 59)",
        "(line 227,col 9)-(line 227,col 58)",
        "(line 228,col 9)-(line 228,col 57)",
        "(line 229,col 9)-(line 229,col 57)",
        "(line 230,col 9)-(line 230,col 67)",
        "(line 231,col 9)-(line 231,col 66)",
        "(line 232,col 9)-(line 232,col 58)",
        "(line 233,col 9)-(line 233,col 71)",
        "(line 234,col 9)-(line 234,col 58)",
        "(line 235,col 9)-(line 235,col 38)",
        "(line 236,col 9)-(line 236,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 245,
      "end_line": 262,
      "comment": "(non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#closeArchiveEntry\n     * ()\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 21)",
        "(line 248,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 42)",
        "(line 254,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 26)",
        "(line 260,col 9)-(line 260,col 21)",
        "(line 261,col 9)-(line 261,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 278,
      "end_line": 300,
      "comment": "\n     * Writes an array of bytes to the current CPIO entry data. This method will\n     * block until all the bytes are written.\n     * \n     * @param b\n     *            the data to be written\n     * @param off\n     *            the start offset in the data\n     * @param len\n     *            the number of bytes that are written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 21)",
        "(line 281,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 31)",
        "(line 294,col 9)-(line 294,col 28)",
        "(line 295,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish()",
      "begin_line": 311,
      "end_line": 325,
      "comment": "\n     * Finishes writing the contents of the CPIO output stream without closing\n     * the underlying stream. Use this method when applying multiple filters in\n     * succession to the same output stream.\n     * \n     * @throws IOException\n     *             if an I/O exception has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 21)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 60)",
        "(line 321,col 9)-(line 321,col 41)",
        "(line 322,col 9)-(line 322,col 39)",
        "(line 323,col 9)-(line 323,col 32)",
        "(line 324,col 9)-(line 324,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close()",
      "begin_line": 334,
      "end_line": 340,
      "comment": "\n     * Closes the CPIO output stream as well as the stream being filtered.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(int)",
      "begin_line": 342,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(long, int, boolean)",
      "begin_line": 349,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 75)",
        "(line 352,col 9)-(line 352,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(long, int, int)",
      "begin_line": 355,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 46)",
        "(line 358,col 9)-(line 358,col 22)",
        "(line 359,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(java.lang.String)",
      "begin_line": 379,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 34)",
        "(line 381,col 9)-(line 381,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 58)"
      ]
    }
  ]
}