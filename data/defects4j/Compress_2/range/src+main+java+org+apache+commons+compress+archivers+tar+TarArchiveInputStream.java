{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 39,
      "end_line": 440,
      "comment": "\n * The TarInputStream reads a UNIX tar archive as an InputStream.\n * methods are provided to position at each successive entry in\n * the archive, and the read each entry as a normal input stream\n * using read().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_BUFFER_SIZE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BUFFER_SIZE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LARGE_BUFFER_SIZE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "debug"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasHitEOF"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySize"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBuf"
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
        "currEntry"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneBuf"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * This contents of this array is not used at all in this class,\n     * it is only here to avoid repeated object creation during calls\n     * to the no-arg read method.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 63)",
        "(line 85,col 9)-(line 85,col 28)",
        "(line 86,col 9)-(line 86,col 34)",
        "(line 87,col 9)-(line 87,col 27)",
        "(line 88,col 9)-(line 88,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setDebug(boolean)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Sets the debugging flag.\n     *\n     * @param debug True to turn on debugging.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 27)",
        "(line 98,col 9)-(line 98,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Closes this stream. Calls the TarBuffer\u0027s close() method.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available()",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * Get the available data that can be read from the current\n     * entry in the archive. This does not indicate how much data\n     * is left in the entire archive, only in the current entry.\n     * This value is determined from the entry\u0027s size header field\n     * and the amount of data already read from the current entry.\n     * Integer.MAX_VALUE is returen in case more than Integer.MAX_VALUE\n     * bytes are left in the current entry in the archive.\n     *\n     * @return The number of available bytes for the current entry.\n     * @throws IOException for signature\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(long)",
      "begin_line": 147,
      "end_line": 163,
      "comment": "\n     * Skip bytes in the input buffer. This skips bytes in the\n     * current entry\u0027s data, not the entire archive, and will\n     * stop at the end of the current entry\u0027s data if the number\n     * to skip extends beyond that point.\n     *\n     * @param numToSkip The number of bytes to skip.\n     * @return the number actually skipped\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 47)",
        "(line 153,col 9)-(line 153,col 30)",
        "(line 154,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.reset()",
      "begin_line": 168,
      "end_line": 169,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry()",
      "begin_line": 184,
      "end_line": 266,
      "comment": "\n     * Get the next entry in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry, and read the header and instantiate a new\n     * TarEntry from the header bytes and return that entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next TarEntry in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 47)",
        "(line 214,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read()",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * Reads a byte from the current tar archive entry.\n     *\n     * This method simply calls read( byte[], int, int ).\n     *\n     * @return The byte read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 37)",
        "(line 282,col 9)-(line 282,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(byte[], int, int)",
      "begin_line": 298,
      "end_line": 363,
      "comment": "\n     * Reads bytes from the current tar archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param offset The offset at which to place bytes read.\n     * @param numToRead The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 26)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 358,col 9)",
        "(line 360,col 9)-(line 360,col 33)",
        "(line 362,col 9)-(line 362,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.copyEntryContents(java.io.OutputStream)",
      "begin_line": 372,
      "end_line": 384,
      "comment": "\n     * Copies the contents of the current tar archive entry directly into\n     * an output stream.\n     *\n     * @param out The OutputStream into which to write the entry\u0027s data.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 49)",
        "(line 375,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getCurrentEntry()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isAtEOF()",
      "begin_line": 394,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setAtEOF(boolean)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byte[], int)",
      "begin_line": 404,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 437,col 20)"
      ]
    }
  ]
}