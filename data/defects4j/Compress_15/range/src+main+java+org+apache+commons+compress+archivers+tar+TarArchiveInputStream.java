{
  "filepath": "/tmp/Compress-15b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 47,
      "end_line": 596,
      "comment": "\n * The TarInputStream reads a UNIX tar archive as an InputStream.\n * methods are provided to position at each successive entry in\n * the archive, and the read each entry as a normal input stream\n * using read().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_BUFFER_SIZE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BUFFER_SIZE"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasHitEOF"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySize"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBuf"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currEntry"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, java.lang.String)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int, java.lang.String)",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 63)",
        "(line 119,col 9)-(line 119,col 28)",
        "(line 120,col 9)-(line 120,col 31)",
        "(line 121,col 9)-(line 121,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Closes this stream. Calls the TarBuffer\u0027s close() method.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available()",
      "begin_line": 154,
      "end_line": 160,
      "comment": "\n     * Get the available data that can be read from the current\n     * entry in the archive. This does not indicate how much data\n     * is left in the entire archive, only in the current entry.\n     * This value is determined from the entry\u0027s size header field\n     * and the amount of data already read from the current entry.\n     * Integer.MAX_VALUE is returen in case more than Integer.MAX_VALUE\n     * bytes are left in the current entry in the archive.\n     *\n     * @return The number of available bytes for the current entry.\n     * @throws IOException for signature\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(long)",
      "begin_line": 172,
      "end_line": 189,
      "comment": "\n     * Skip bytes in the input buffer. This skips bytes in the\n     * current entry\u0027s data, not the entire archive, and will\n     * stop at the end of the current entry\u0027s data if the number\n     * to skip extends beyond that point.\n     *\n     * @param numToSkip The number of bytes to skip.\n     * @return the number actually skipped\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 47)",
        "(line 179,col 9)-(line 179,col 30)",
        "(line 180,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.reset()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry()",
      "begin_line": 211,
      "end_line": 283,
      "comment": "\n     * Get the next entry in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry, and read the header and instantiate a new\n     * TarEntry from the header bytes and return that entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next TarEntry in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 39)",
        "(line 232,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 24)",
        "(line 245,col 9)-(line 245,col 40)",
        "(line 247,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 281,col 9)-(line 281,col 40)",
        "(line 282,col 9)-(line 282,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord()",
      "begin_line": 297,
      "end_line": 311,
      "comment": "\n     * Get the next record in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next header in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 47)",
        "(line 304,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 310,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders()",
      "begin_line": 313,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 60)",
        "(line 315,col 9)-(line 315,col 23)",
        "(line 316,col 9)-(line 316,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.parsePaxHeaders(java.io.InputStream)",
      "begin_line": 319,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 68)",
        "(line 322,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.applyPaxHeadersToCurrentEntry(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 365,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse()",
      "begin_line": 412,
      "end_line": 431,
      "comment": "\n     * Adds the sparse chunks from the current entry to the sparse chunks,\n     * including any additional sparse entries following the current entry.\n     * \n     * @throws IOException on error \n     * \n     * @todo Sparse files get not yet really processed. \n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 430,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry()",
      "begin_line": 433,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(byte[], int, int)",
      "begin_line": 451,
      "end_line": 517,
      "comment": "\n     * Reads bytes from the current tar archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param offset The offset at which to place bytes read.\n     * @param numToRead The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 26)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 463,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 512,col 9)",
        "(line 514,col 9)-(line 514,col 33)",
        "(line 516,col 9)-(line 516,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 524,
      "end_line": 531,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if the current entry is a sparse file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getCurrentEntry()",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isAtEOF()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setAtEOF(boolean)",
      "begin_line": 545,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byte[], int)",
      "begin_line": 558,
      "end_line": 594,
      "comment": "\n     * Checks if the signature matches what is expected for a tar file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a tar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 561,col 9)",
        "(line 563,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 583,col 9)",
        "(line 585,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 21)"
      ]
    }
  ]
}