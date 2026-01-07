{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 45,
      "end_line": 541,
      "comment": "\n * The TarInputStream reads a UNIX tar archive as an InputStream.\n * methods are provided to position at each successive entry in\n * the archive, and the read each entry as a normal input stream\n * using read().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_BUFFER_SIZE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BUFFER_SIZE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasHitEOF"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySize"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBuf"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currEntry"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 63)",
        "(line 81,col 9)-(line 81,col 28)",
        "(line 82,col 9)-(line 82,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Closes this stream. Calls the TarBuffer\u0027s close() method.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecordSize()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Get the record size being used by this stream\u0027s TarBuffer.\n     *\n     * @return The TarBuffer record size.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.available()",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\n     * Get the available data that can be read from the current\n     * entry in the archive. This does not indicate how much data\n     * is left in the entire archive, only in the current entry.\n     * This value is determined from the entry\u0027s size header field\n     * and the amount of data already read from the current entry.\n     * Integer.MAX_VALUE is returen in case more than Integer.MAX_VALUE\n     * bytes are left in the current entry in the archive.\n     *\n     * @return The number of available bytes for the current entry.\n     * @throws IOException for signature\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(long)",
      "begin_line": 133,
      "end_line": 150,
      "comment": "\n     * Skip bytes in the input buffer. This skips bytes in the\n     * current entry\u0027s data, not the entire archive, and will\n     * stop at the end of the current entry\u0027s data if the number\n     * to skip extends beyond that point.\n     *\n     * @param numToSkip The number of bytes to skip.\n     * @return the number actually skipped\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 47)",
        "(line 140,col 9)-(line 140,col 30)",
        "(line 141,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.reset()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry()",
      "begin_line": 172,
      "end_line": 233,
      "comment": "\n     * Get the next entry in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry, and read the header and instantiate a new\n     * TarEntry from the header bytes and return that entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next TarEntry in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 39)",
        "(line 193,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 51)",
        "(line 199,col 9)-(line 199,col 24)",
        "(line 200,col 9)-(line 200,col 40)",
        "(line 202,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getRecord()",
      "begin_line": 247,
      "end_line": 261,
      "comment": "\n     * Get the next record in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next header in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 47)",
        "(line 254,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 260,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders()",
      "begin_line": 263,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 269,col 14)",
        "(line 270,col 9)-(line 270,col 68)",
        "(line 272,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 318,col 23)",
        "(line 328,col 9)-(line 346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.Anonymous-37685388-f1db-419f-a5ca-d96da6c66f22.close()",
      "begin_line": 265,
      "end_line": 268,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.readGNUSparse()",
      "begin_line": 357,
      "end_line": 376,
      "comment": "\n     * Adds the sparse chunks from the current entry to the sparse chunks,\n     * including any additional sparse entries following the current entry.\n     * \n     * @throws IOException on error \n     * \n     * @todo Sparse files get not yet really processed. \n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry()",
      "begin_line": 378,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(byte[], int, int)",
      "begin_line": 396,
      "end_line": 462,
      "comment": "\n     * Reads bytes from the current tar archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param offset The offset at which to place bytes read.\n     * @param numToRead The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 26)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 428,col 9)",
        "(line 430,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 33)",
        "(line 461,col 9)-(line 461,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 469,
      "end_line": 476,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if the current entry is a sparse file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getCurrentEntry()",
      "begin_line": 478,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 482,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isAtEOF()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setAtEOF(boolean)",
      "begin_line": 490,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byte[], int)",
      "begin_line": 503,
      "end_line": 539,
      "comment": "\n     * Checks if the signature matches what is expected for a tar file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a tar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 9)",
        "(line 508,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 528,col 9)",
        "(line 530,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 21)"
      ]
    }
  ]
}