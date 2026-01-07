{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream",
        "org.apache.commons.compress.archivers.cpio.CpioConstants"
      ],
      "begin_line": 60,
      "end_line": 399,
      "comment": "\n * CPIOArchiveOutputStream is a stream for writing CPIO streams. All formats of\n * CPIO are supported (old ASCII, old binary, new portable format and the new\n * portable format with CRC).\n * \u003cp/\u003e\n * \u003cp/\u003e\n * An entry can be written by creating an instance of CpioArchiveEntry and fill\n * it with the necessary values and put it into the CPIO stream. Afterwards\n * write the contents of the file into the CPIO stream. Either close the stream\n * by calling finish() or put a next entry into the cpio stream.\n * \u003cp/\u003e\n * \u003ccode\u003e\u003cpre\u003e\n * CpioArchiveOutputStream out \u003d new CpioArchiveOutputStream(\n *         new FileOutputStream(new File(\"test.cpio\")));\n * CpioArchiveEntry entry \u003d new CpioArchiveEntry();\n * entry.setName(\"testfile\");\n * String contents \u003d \u0026quot;12345\u0026quot;;\n * entry.setFileSize(contents.length());\n * entry.setMode(CpioConstants.C_ISREG); // regular file\n * ... set other attributes, e.g. time, number of links\n * out.putNextEntry(entry);\n * out.write(testContents.getBytes());\n * out.close();\n * \u003c/pre\u003e\u003c/code\u003e\n * \u003cp/\u003e\n * Note: This implementation should be compatible to cpio 2.5\n * \n * This class uses mutable fields and is not considered threadsafe.\n * \n * based on code from the jRPM project (jrpm.sourceforge.net)\n "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 63,
      "end_line": 63,
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
        "finished"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryFormat"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * See {@link CpioArchiveEntry#setFormat(short)} for possible values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "names"
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
        "written"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short)",
      "begin_line": 90,
      "end_line": 103,
      "comment": "\n     * Construct the cpio output stream with a specified format\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 47)",
        "(line 92,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format\n     * \n     * @param out\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen()",
      "begin_line": 122,
      "end_line": 126,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 141,
      "end_line": 162,
      "comment": "\n     * Begins writing a new CPIO file entry and positions the stream to the\n     * start of the entry data. Closes the current entry if still active. The\n     * current time will be used if the entry has no set modification time and\n     * the default header format will be used if no other format is specified in\n     * the entry.\n     * \n     * @param e\n     *            the CPIO cpioEntry to be written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 21)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 43)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 23)",
        "(line 160,col 9)-(line 160,col 23)",
        "(line 161,col 9)-(line 161,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 164,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 186,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 48)",
        "(line 188,col 9)-(line 188,col 47)",
        "(line 189,col 9)-(line 189,col 46)",
        "(line 190,col 9)-(line 190,col 46)",
        "(line 191,col 9)-(line 191,col 56)",
        "(line 192,col 9)-(line 192,col 47)",
        "(line 193,col 9)-(line 193,col 47)",
        "(line 194,col 9)-(line 194,col 52)",
        "(line 195,col 9)-(line 195,col 52)",
        "(line 196,col 9)-(line 196,col 58)",
        "(line 197,col 9)-(line 197,col 58)",
        "(line 198,col 9)-(line 198,col 60)",
        "(line 199,col 9)-(line 199,col 49)",
        "(line 200,col 9)-(line 200,col 38)",
        "(line 201,col 9)-(line 201,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 204,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 48)",
        "(line 207,col 9)-(line 207,col 47)",
        "(line 208,col 9)-(line 208,col 46)",
        "(line 209,col 9)-(line 209,col 45)",
        "(line 210,col 9)-(line 210,col 45)",
        "(line 211,col 9)-(line 211,col 55)",
        "(line 212,col 9)-(line 212,col 54)",
        "(line 213,col 9)-(line 213,col 47)",
        "(line 214,col 9)-(line 214,col 59)",
        "(line 215,col 9)-(line 215,col 47)",
        "(line 216,col 9)-(line 216,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry, boolean)",
      "begin_line": 219,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 60)",
        "(line 222,col 9)-(line 222,col 59)",
        "(line 223,col 9)-(line 223,col 58)",
        "(line 224,col 9)-(line 224,col 57)",
        "(line 225,col 9)-(line 225,col 57)",
        "(line 226,col 9)-(line 226,col 67)",
        "(line 227,col 9)-(line 227,col 66)",
        "(line 228,col 9)-(line 228,col 58)",
        "(line 229,col 9)-(line 229,col 71)",
        "(line 230,col 9)-(line 230,col 58)",
        "(line 231,col 9)-(line 231,col 38)",
        "(line 232,col 9)-(line 232,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 241,
      "end_line": 258,
      "comment": "(non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#closeArchiveEntry\n     * ()\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 21)",
        "(line 244,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 42)",
        "(line 250,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 26)",
        "(line 256,col 9)-(line 256,col 21)",
        "(line 257,col 9)-(line 257,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 274,
      "end_line": 296,
      "comment": "\n     * Writes an array of bytes to the current CPIO entry data. This method will\n     * block until all the bytes are written.\n     * \n     * @param b\n     *            the data to be written\n     * @param off\n     *            the start offset in the data\n     * @param len\n     *            the number of bytes that are written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 21)",
        "(line 277,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 31)",
        "(line 290,col 9)-(line 290,col 28)",
        "(line 291,col 9)-(line 295,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish()",
      "begin_line": 307,
      "end_line": 321,
      "comment": "\n     * Finishes writing the contents of the CPIO output stream without closing\n     * the underlying stream. Use this method when applying multiple filters in\n     * succession to the same output stream.\n     * \n     * @throws IOException\n     *             if an I/O exception has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 21)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 60)",
        "(line 317,col 9)-(line 317,col 41)",
        "(line 318,col 9)-(line 318,col 39)",
        "(line 319,col 9)-(line 319,col 32)",
        "(line 320,col 9)-(line 320,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close()",
      "begin_line": 330,
      "end_line": 336,
      "comment": "\n     * Closes the CPIO output stream as well as the stream being filtered.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(int)",
      "begin_line": 338,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(long, int, boolean)",
      "begin_line": 345,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 75)",
        "(line 348,col 9)-(line 348,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(long, int, int)",
      "begin_line": 351,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 46)",
        "(line 354,col 9)-(line 354,col 22)",
        "(line 355,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(java.lang.String)",
      "begin_line": 375,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 34)",
        "(line 377,col 9)-(line 377,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#putArchiveEntry\n     * (org.apache.commons.compress.archivers.ArchiveEntry)\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(int)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.OutputStream#write(int)\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 21)"
      ]
    }
  ]
}