{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpioArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream",
        "org.apache.commons.compress.archivers.cpio.CpioConstants"
      ],
      "begin_line": 58,
      "end_line": 413,
      "comment": "\n * CPIOArchiveOutputStream is a stream for writing CPIO streams. All formats of\n * CPIO are supported (old ASCII, old binary, new portable format and the new\n * portable format with CRC).\n * \u003cp/\u003e\n * \u003cp/\u003e\n * An entry can be written by creating an instance of CpioArchiveEntry and fill\n * it with the necessary values and put it into the CPIO stream. Afterwards\n * write the contents of the file into the CPIO stream. Either close the stream\n * by calling finish() or put a next entry into the cpio stream.\n * \u003cp/\u003e\n * \u003ccode\u003e\u003cpre\u003e\n * CpioArchiveOutputStream out \u003d new CpioArchiveOutputStream(\n *         new FileOutputStream(new File(\"test.cpio\")));\n * CpioArchiveEntry entry \u003d new CpioArchiveEntry();\n * entry.setName(\u0026quot;testfile\u0026quot;);\n * String contents \u003d \u0026quot;12345\u0026quot;;\n * entry.setFileSize(contents.length());\n * out.putNextEntry(entry);\n * out.write(testContents.getBytes());\n * out.close();\n * \u003c/pre\u003e\u003c/code\u003e\n * \u003cp/\u003e\n * Note: This implementation should be compatible to cpio 2.5\n * \n * This class uses mutable fields and is not considered threadsafe.\n * \n * based on code from the jRPM project (jrpm.sourceforge.net)\n "
    },
    {
      "type": "field",
      "varNames": [
        "cpioEntry"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryFormat"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream, short)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Construct the cpio output stream with a specified format\n     * \n     * @param out\n     *            The cpio stream\n     * @param format\n     *            The format of the stream\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 47)",
        "(line 87,col 9)-(line 87,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.CpioArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Construct the cpio output stream. The format for this CPIO stream is the\n     * \"new\" format\n     * \n     * @param out\n     *            The cpio stream\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.ensureOpen()",
      "begin_line": 107,
      "end_line": 111,
      "comment": "\n     * Check to make sure that this stream has not been closed\n     * \n     * @throws IOException\n     *             if the stream is already closed\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.setFormat(short)",
      "begin_line": 120,
      "end_line": 134,
      "comment": "\n     * Set a default header format. This will be used if no format is defined in\n     * the cpioEntry given to putNextEntry().\n     * \n     * @param format\n     *            A CPIO format\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putNextEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry)",
      "begin_line": 149,
      "end_line": 171,
      "comment": "\n     * Begins writing a new CPIO file entry and positions the stream to the\n     * start of the entry data. Closes the current entry if still active. The\n     * current time will be used if the entry has no set modification time and\n     * the default header format will be used if no other format is specified in\n     * the entry.\n     * \n     * @param e\n     *            the CPIO cpioEntry to be written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 21)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 23)",
        "(line 169,col 9)-(line 169,col 27)",
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
        "(line 210,col 9)-(line 210,col 69)"
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
        "(line 241,col 9)-(line 241,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 250,
      "end_line": 271,
      "comment": "(non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#closeArchiveEntry\n     * ()\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 21)",
        "(line 253,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 30)",
        "(line 269,col 9)-(line 269,col 21)",
        "(line 270,col 9)-(line 270,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 287,
      "end_line": 309,
      "comment": "\n     * Writes an array of bytes to the current CPIO entry data. This method will\n     * block until all the bytes are written.\n     * \n     * @param b\n     *            the data to be written\n     * @param off\n     *            the start offset in the data\n     * @param len\n     *            the number of bytes that are written\n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 21)",
        "(line 290,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 31)",
        "(line 303,col 9)-(line 303,col 28)",
        "(line 304,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.finish()",
      "begin_line": 320,
      "end_line": 335,
      "comment": "\n     * Finishes writing the contents of the CPIO output stream without closing\n     * the underlying stream. Use this method when applying multiple filters in\n     * succession to the same output stream.\n     * \n     * @throws IOException\n     *             if an I/O exception has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 21)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 64)",
        "(line 330,col 9)-(line 330,col 34)",
        "(line 331,col 9)-(line 331,col 45)",
        "(line 332,col 9)-(line 332,col 43)",
        "(line 333,col 9)-(line 333,col 36)",
        "(line 334,col 9)-(line 334,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.close()",
      "begin_line": 344,
      "end_line": 349,
      "comment": "\n     * Closes the CPIO output stream as well as the stream being filtered.\n     * \n     * @throws IOException\n     *             if an I/O error has occurred or if a CPIO file error has\n     *             occurred\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 348,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.pad(long, int)",
      "begin_line": 351,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 35)",
        "(line 353,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeBinaryLong(long, int, boolean)",
      "begin_line": 359,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 75)",
        "(line 362,col 9)-(line 362,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeAsciiLong(long, int, int)",
      "begin_line": 365,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 46)",
        "(line 368,col 9)-(line 368,col 22)",
        "(line 369,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.writeCString(java.lang.String)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 34)",
        "(line 391,col 9)-(line 391,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveOutputStream#putArchiveEntry\n     * (org.apache.commons.compress.archivers.ArchiveEntry)\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream.write(int)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.OutputStream#write(int)\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 21)"
      ]
    }
  ]
}