{
  "filepath": "/tmp/Compress-5b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java",
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
      "end_line": 421,
      "comment": "\n * CPIOArchiveOutputStream is a stream for writing CPIO streams. All formats of\n * CPIO are supported (old ASCII, old binary, new portable format and the new\n * portable format with CRC).\n * \u003cp/\u003e\n * \u003cp/\u003e\n * An entry can be written by creating an instance of CpioArchiveEntry and fill\n * it with the necessary values and put it into the CPIO stream. Afterwards\n * write the contents of the file into the CPIO stream. Either close the stream\n * by calling finish() or put a next entry into the cpio stream.\n * \u003cp/\u003e\n * \u003ccode\u003e\u003cpre\u003e\n * CpioArchiveOutputStream out \u003d new CpioArchiveOutputStream(\n *         new FileOutputStream(new File(\"test.cpio\")));\n * CpioArchiveEntry entry \u003d new CpioArchiveEntry();\n * entry.setName(\"testfile\");\n * String contents \u003d \u0026quot;12345\u0026quot;;\n * entry.setFileSize(contents.length());\n * entry.setMode(CpioConstants.C_ISREG); // regular file\n * ... set other attributes, e.g. time, number of links\n * out.putArchiveEntry(entry);\n * out.write(testContents.getBytes());\n * out.close();\n * \u003c/pre\u003e\u003c/code\u003e\n * \u003cp/\u003e\n * Note: This implementation should be compatible to cpio 2.5\n * \n * This class uses mutable fields and is not considered threadsafe.\n * \n * based on code from the jRPM project (jrpm.sourceforge.net)\n "
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
      "begin_line": 70,
      "end_line": 70,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "field",
      "varNames": [
        "entryFormat"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * See {@link CpioArchiveEntry#setFormat(short)} for possible values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 77,
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
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short)",
      "begin_line": 93,
      "end_line": 106,
      "comment": "\n     * Construct the cpio output stream with a specified format\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 47)",
        "(line 95,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format\n     * \n     * @param out\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen()",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 145,
      "end_line": 171,
      "comment": "\n     * Begins writing a new CPIO file entry and positions the stream to the\n     * start of the entry data. Closes the current entry if still active. The\n     * current time will be used if the entry has no set modification time and\n     * the default header format will be used if no other format is specified in\n     * the entry.\n     * \n     * @param entry\n     *            the CPIO cpioEntry to be written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     * @throws ClassCastException if entry is not an instance of CpioArchiveEntry\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 54)",
        "(line 151,col 9)-(line 151,col 21)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 43)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 23)",
        "(line 169,col 9)-(line 169,col 23)",
        "(line 170,col 9)-(line 170,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 173,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 195,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 48)",
        "(line 197,col 9)-(line 197,col 47)",
        "(line 198,col 9)-(line 198,col 46)",
        "(line 199,col 9)-(line 199,col 46)",
        "(line 200,col 9)-(line 200,col 56)",
        "(line 201,col 9)-(line 201,col 47)",
        "(line 202,col 9)-(line 202,col 47)",
        "(line 203,col 9)-(line 203,col 52)",
        "(line 204,col 9)-(line 204,col 52)",
        "(line 205,col 9)-(line 205,col 58)",
        "(line 206,col 9)-(line 206,col 58)",
        "(line 207,col 9)-(line 207,col 60)",
        "(line 208,col 9)-(line 208,col 49)",
        "(line 209,col 9)-(line 209,col 38)",
        "(line 210,col 9)-(line 210,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 213,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 48)",
        "(line 216,col 9)-(line 216,col 47)",
        "(line 217,col 9)-(line 217,col 46)",
        "(line 218,col 9)-(line 218,col 45)",
        "(line 219,col 9)-(line 219,col 45)",
        "(line 220,col 9)-(line 220,col 55)",
        "(line 221,col 9)-(line 221,col 54)",
        "(line 222,col 9)-(line 222,col 47)",
        "(line 223,col 9)-(line 223,col 59)",
        "(line 224,col 9)-(line 224,col 47)",
        "(line 225,col 9)-(line 225,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)",
      "begin_line": 228,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 60)",
        "(line 231,col 9)-(line 231,col 59)",
        "(line 232,col 9)-(line 232,col 58)",
        "(line 233,col 9)-(line 233,col 57)",
        "(line 234,col 9)-(line 234,col 57)",
        "(line 235,col 9)-(line 235,col 67)",
        "(line 236,col 9)-(line 236,col 66)",
        "(line 237,col 9)-(line 237,col 58)",
        "(line 238,col 9)-(line 238,col 71)",
        "(line 239,col 9)-(line 239,col 58)",
        "(line 240,col 9)-(line 240,col 38)",
        "(line 241,col 9)-(line 241,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 250,
      "end_line": 275,
      "comment": "(non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#closeArchiveEntry\n     * ()\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 21)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 42)",
        "(line 267,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 26)",
        "(line 273,col 9)-(line 273,col 21)",
        "(line 274,col 9)-(line 274,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 291,
      "end_line": 314,
      "comment": "\n     * Writes an array of bytes to the current CPIO entry data. This method will\n     * block until all the bytes are written.\n     * \n     * @param b\n     *            the data to be written\n     * @param off\n     *            the start offset in the data\n     * @param len\n     *            the number of bytes that are written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 21)",
        "(line 294,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 31)",
        "(line 307,col 9)-(line 307,col 28)",
        "(line 308,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish()",
      "begin_line": 325,
      "end_line": 341,
      "comment": "\n     * Finishes writing the contents of the CPIO output stream without closing\n     * the underlying stream. Use this method when applying multiple filters in\n     * succession to the same output stream.\n     * \n     * @throws IOException\n     *             if an I/O exception has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 21)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 60)",
        "(line 335,col 9)-(line 335,col 41)",
        "(line 336,col 9)-(line 336,col 39)",
        "(line 337,col 9)-(line 337,col 32)",
        "(line 338,col 9)-(line 338,col 28)",
        "(line 340,col 9)-(line 340,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close()",
      "begin_line": 350,
      "end_line": 359,
      "comment": "\n     * Closes the CPIO output stream as well as the stream being filtered.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(int)",
      "begin_line": 361,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(long, int, boolean)",
      "begin_line": 368,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 75)",
        "(line 371,col 9)-(line 371,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(long, int, int)",
      "begin_line": 374,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 46)",
        "(line 377,col 9)-(line 377,col 22)",
        "(line 378,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(java.lang.String)",
      "begin_line": 403,
      "end_line": 406,
      "comment": "\n     * Writes an ASCII string to the stream followed by \\0\n     * @param str the String to write\n     * @throws IOException if the string couldn\u0027t be written\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 50)",
        "(line 405,col 9)-(line 405,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 413,
      "end_line": 419,
      "comment": "\n     * Creates a new ArchiveEntry. The entryName must be an ASCII encoded string.\n     * \n     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#createArchiveEntry(java.io.File, java.lang.String)\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 58)"
      ]
    }
  ]
}