{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 46,
      "end_line": 451,
      "comment": "\n * The TarInputStream reads a UNIX tar archive as an InputStream.\n * methods are provided to position at each successive entry in\n * the archive, and the read each entry as a normal input stream\n * using read().\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_BUFFER_SIZE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BUFFER_SIZE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasHitEOF"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySize"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBuf"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currEntry"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.TarArchiveInputStream(java.io.InputStream, int, int)",
      "begin_line": 80,
      "end_line": 84,
      "comment": "\n     * Constructor for TarInputStream.\n     * @param is the input stream to use\n     * @param blockSize the block size to use\n     * @param recordSize the record size to use\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 63)",
        "(line 82,col 9)-(line 82,col 28)",
        "(line 83,col 9)-(line 83,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.close()",
      "begin_line": 90,
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
      "end_line": 120,
      "comment": "\n     * Get the available data that can be read from the current\n     * entry in the archive. This does not indicate how much data\n     * is left in the entire archive, only in the current entry.\n     * This value is determined from the entry\u0027s size header field\n     * and the amount of data already read from the current entry.\n     * Integer.MAX_VALUE is returen in case more than Integer.MAX_VALUE\n     * bytes are left in the current entry in the archive.\n     *\n     * @return The number of available bytes for the current entry.\n     * @throws IOException for signature\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.skip(long)",
      "begin_line": 132,
      "end_line": 148,
      "comment": "\n     * Skip bytes in the input buffer. This skips bytes in the\n     * current entry\u0027s data, not the entire archive, and will\n     * stop at the end of the current entry\u0027s data if the number\n     * to skip extends beyond that point.\n     *\n     * @param numToSkip The number of bytes to skip.\n     * @return the number actually skipped\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 47)",
        "(line 138,col 9)-(line 138,col 30)",
        "(line 139,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.reset()",
      "begin_line": 153,
      "end_line": 154,
      "comment": "\n     * Since we do not support marking just yet, we do nothing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextTarEntry()",
      "begin_line": 169,
      "end_line": 231,
      "comment": "\n     * Get the next entry in this tar archive. This will skip\n     * over any remaining data in the current entry, if there\n     * is one, and place the input stream at the header of the\n     * next entry, and read the header and instantiate a new\n     * TarEntry from the header bytes and return that entry.\n     * If there are no more entries in the archive, null will\n     * be returned to indicate that the end of the archive has\n     * been reached.\n     *\n     * @return The next TarEntry in the archive, or null.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 47)",
        "(line 190,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.paxHeaders()",
      "begin_line": 233,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 85)",
        "(line 235,col 9)-(line 235,col 36)",
        "(line 237,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 23)",
        "(line 281,col 9)-(line 281,col 54)",
        "(line 282,col 9)-(line 301,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getNextEntry()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.read(byte[], int, int)",
      "begin_line": 321,
      "end_line": 386,
      "comment": "\n     * Reads bytes from the current tar archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param offset The offset at which to place bytes read.\n     * @param numToRead The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 26)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 381,col 9)",
        "(line 383,col 9)-(line 383,col 33)",
        "(line 385,col 9)-(line 385,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.getCurrentEntry()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.isAtEOF()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.setAtEOF(boolean)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byte[], int)",
      "begin_line": 413,
      "end_line": 449,
      "comment": "\n     * Checks if the signature matches what is expected for a tar file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a tar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 21)"
      ]
    }
  ]
}