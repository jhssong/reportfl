{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 32,
      "end_line": 373,
      "comment": "\n * The TarOutputStream writes a UNIX tar archive as an OutputStream.\n * Methods are provided to put entries, and then write their contents\n * by writing to this stream using write().\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_ERROR"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Fail if a long file name is required in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_TRUNCATE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Long paths will be truncated in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "LONGFILE_GNU"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " GNU tar extensions are used to store long file names in the archive. "
    },
    {
      "type": "field",
      "varNames": [
        "debug"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " NOT READ"
    },
    {
      "type": "field",
      "varNames": [
        "currSize"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currName"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currBytes"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneBuf"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordBuf"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemLen"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assemBuf"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longFileMode"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.TarArchiveOutputStream(java.io.OutputStream, int, int)",
      "begin_line": 80,
      "end_line": 89,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param os the output stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 17)",
        "(line 83,col 9)-(line 83,col 63)",
        "(line 84,col 9)-(line 84,col 27)",
        "(line 85,col 9)-(line 85,col 26)",
        "(line 86,col 9)-(line 86,col 45)",
        "(line 87,col 9)-(line 87,col 46)",
        "(line 88,col 9)-(line 88,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setLongFileMode(int)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Set the long file mode.\n     * This can be LONGFILE_ERROR(0), LONGFILE_TRUNCATE(1) or LONGFILE_GNU(2).\n     * This specifies the treatment of long file names (names \u003e\u003d TarConstants.NAMELEN).\n     * Default is LONGFILE_ERROR.\n     * @param longFileMode the mode to use\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setDebug(boolean)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Sets the debugging flag.\n     *\n     * @param debugF True to turn on debugging.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.setBufferDebug(boolean)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Sets the debugging flag in this stream\u0027s TarBuffer.\n     *\n     * @param debug True to turn on debugging.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.finish()",
      "begin_line": 126,
      "end_line": 131,
      "comment": "\n     * Ends the TAR archive without closing the underlying OutputStream.\n     * The result is that the two EOF records of nulls are written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 25)",
        "(line 130,col 9)-(line 130,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.close()",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n     * Ends the TAR archive and closes the underlying OutputStream.\n     * This means that finish() is called followed by calling the\n     * TarBuffer\u0027s close().\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getRecordSize()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putNextEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 169,
      "end_line": 201,
      "comment": "\n     * Put an entry on the output stream. This writes the entry\u0027s\n     * header record and positions the output stream for writing\n     * the contents of the entry. Once this method is called, the\n     * stream is ready for calls to write() to write the entry\u0027s\n     * contents. Once the contents are written, closeEntry()\n     * \u003cB\u003eMUST\u003c/B\u003e be called to ensure that all buffered data\n     * is completely written to the output stream.\n     *\n     * @param entry The TarEntry to be written to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 42)",
        "(line 191,col 9)-(line 191,col 38)",
        "(line 193,col 9)-(line 193,col 22)",
        "(line 195,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeEntry()",
      "begin_line": 213,
      "end_line": 231,
      "comment": "\n     * Close an entry. This method MUST be called for all file\n     * entries that contain data. The reason is that we must\n     * buffer data written to the stream in order to satisfy\n     * the buffer\u0027s record based writes. Thus, there may be\n     * data fragments still being assembled that must be written\n     * to the output stream before this entry is closed and the\n     * next entry written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(int)",
      "begin_line": 241,
      "end_line": 245,
      "comment": "\n     * Writes a byte to the current tar archive entry.\n     *\n     * This method simply calls read( byte[], int, int ).\n     *\n     * @param b The byte written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 29)",
        "(line 244,col 9)-(line 244,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(byte[])",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Writes bytes to the current tar archive entry.\n     *\n     * This method simply calls write( byte[], int, int ).\n     *\n     * @param wBuf The buffer to write to the archive.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 273,
      "end_line": 336,
      "comment": "\n     * Writes bytes to the current tar archive entry. This method\n     * is aware of the current entry and will throw an exception if\n     * you attempt to write bytes past the length specified for the\n     * current entry. The method is also (painfully) aware of the\n     * record buffering required by TarBuffer, and manages buffers\n     * that are not a multiple of recordsize in length, including\n     * assembling records from small buffers.\n     *\n     * @param wBuf The buffer to write to the archive.\n     * @param wOffset The offset in the buffer from which to get bytes.\n     * @param numToWrite The number of bytes to write.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 311,col 9)",
        "(line 318,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.writeEOFRecord()",
      "begin_line": 342,
      "end_line": 348,
      "comment": "\n     * Write an EOF (end of archive) record to the tar archive.\n     * An EOF record consists of a record of all zeros.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 347,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.flush()",
      "begin_line": 351,
      "end_line": 353,
      "comment": " used to be implemented via FilterOutputStream",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getDefaultFileExtension()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.getName()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 21)"
      ]
    }
  ]
}